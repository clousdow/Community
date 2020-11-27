package com.cloudshadow.controller;

import com.cloudshadow.exception.BizException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 增强/通知
 * 对后端控制器进行异常处理的增强
 */
@ControllerAdvice
public class CommonExceptionHandler {

    Logger logger = LogManager.getLogger(CommonExceptionHandler.class);
    /**
     * 自定义业务异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BizException.class)
    public ModelAndView handlerBizException(BizException e, HttpServletRequest request) {
        logger.error("操作失败，请联系系统管理员", e);
        Map<String, Object> reponseData = new HashMap<>();
        reponseData.put("code", 1);
        reponseData.put("error", "操作失败，请联系系统管理员");
        reponseData.put("msg", e.getMessage());//错误的详细信息
        return modelAndView(request, reponseData);
    }
    /**
     * 处理其它未知异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler
    public ModelAndView handlerException(Throwable e, HttpServletRequest request) {
        logger.error("服务器内部错误", e);
        Map<String, Object> reponseData = new HashMap<>();
        reponseData.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());//500
        reponseData.put("error", "服务器内部错误");
        reponseData.put("msg", e.getMessage());//错误的详细信息
        return modelAndView(request, reponseData);
    }
    /**
     * 返回模型和视图对象
     *
     * @param request
     * @param responseData
     * @return
     */
    private ModelAndView modelAndView(HttpServletRequest request, 
                                      Map<String, Object> responseData) {
        ModelAndView mv = new ModelAndView();
        mv.addAllObjects(responseData);// 设置模型数据

        // 如果是ajax请求
        if (isAjaxRequest(request)) {
            mv.setView(new MappingJackson2JsonView()); //返回json数据
        } else {
            mv.setViewName("error"); // 跳转的error.jsp 页面  //WEB-INF/jsp/error.jsp
        }
        return mv;
    }

    /**
     * 判断请求是否是ajax请求
     */
    private static boolean isAjaxRequest(HttpServletRequest request) {
        String accept = request.getHeader("accept");
        if (accept != null && accept.indexOf("application/json") != -1) {
            return true;
        }
        String xRequestedWith = request.getHeader("X-Requested-With");
        if (xRequestedWith != null && xRequestedWith.indexOf("XMLHttpRequest") != -1) {
            return true;
        }
        return false;
    }
}