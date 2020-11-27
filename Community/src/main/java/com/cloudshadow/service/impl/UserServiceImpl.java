package com.cloudshadow.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudshadow.entity.User;
import com.cloudshadow.mapper.UserMapper;
import com.cloudshadow.service.UserService;
import com.cloudshadow.util.MyMD5Util;
import com.cloudshadow.util.R;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    /**
     * 用户注册
     *
     * @param user
     * @return  r
     */
    @Override
    public R registerUser(User user) {
        String encryptedPwd = null;
        if(this.count(
                new QueryWrapper<User>()
                 .eq("user_name",user.getUserName())
        ) > 0){
            return R.error("用户名重复");
        }
        if(this.count(
                new QueryWrapper<User>()
                .eq("name",user.getName())
        ) > 0){
            return R.error("昵称重复");
        }
        try {
            encryptedPwd = MyMD5Util.getEncryptedPwd(user.getUserPassword());
            user.setUserPassword(encryptedPwd);
            if(this.save(user)){
                user = this.getOne(
                        new QueryWrapper<User>()
                        .eq("user_name",user.getUserName())
                );
            }else {
                return R.error("存储错误");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return R.ok().put("user",user);
    }

    /**
     * 用户登录
     *
     * @param user
     * @return  r
     */
    @Override
    public R loginValid(User user) {
        if(this.count(
                new QueryWrapper<User>()
                .eq("user_name",user.getUserName())
        ) > 0){
            String passwd = user.getUserPassword();
            user = this.getOne(
                    new QueryWrapper<User>()
                            .eq("user_name",user.getUserName())
            );
            try {
                if(MyMD5Util.validPassword(passwd,user.getUserPassword())){
                    return R.ok().put("user",user);
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return R.error("用户名或密码错误");
    }
}
