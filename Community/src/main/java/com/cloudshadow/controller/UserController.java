package com.cloudshadow.controller;

import com.cloudshadow.entity.User;
import com.cloudshadow.service.UserService;
import com.cloudshadow.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession session;

    /**
     * 用户注册
     *
     * @param
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public R register(@RequestParam("userName") String username,@RequestParam("userPassword") String userPassword,@RequestParam("name") String name,@RequestParam("birth") String birth,@RequestParam("sex") String sex) {
        User user = new User();
        System.out.println(birth);
        System.out.println(sex);
        user.setUserName(username);
        user.setUserPassword(userPassword);
        user.setName(name);
        DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dfm.parse(birth);
            user.setBirth(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (sex.equals("male")){
            user.setSex(1);
        }else {
            user.setSex(0);
        }
        System.out.println(user);
        R r = userService.registerUser(user);
        return r;
    }

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @PostMapping("/userLogin")
    @ResponseBody
    public R userLogin(User user){
        R r = userService.loginValid(user);
        user = (User)r.get("user");
        return r;
    }
}
