package com.cloudshadow.service.impl;

import com.cloudshadow.entity.User;
import com.cloudshadow.service.UserService;
import com.cloudshadow.util.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void registerUser() {
        User user = new User();
        user.setUserName("18819794531");
        user.setUserPassword("123456");
        user.setName("奇翼");
        user.setSex(1);
        DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dfm.parse("1998-08-08");
            user.setBirth(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        R r = userService.registerUser(user);
        System.out.println(r);
    }

    @Test
    public void login(){
        User user = new User();
        user.setUserName("lsss");
        user.setUserPassword("123");
        R r = userService.loginValid(user);
        System.out.println(r);
    }
}