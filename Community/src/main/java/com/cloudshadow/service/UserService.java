package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.User;
import com.cloudshadow.util.R;

import java.util.List;

public interface UserService extends IService<User> {
    public R registerUser(User user);//注册
    public R loginValid(User user);//登录
    public List<User> searchUser(String userName);//按照用户昵称模糊查询版块，按照粉丝数排列
}
