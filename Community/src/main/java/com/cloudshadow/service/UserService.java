package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.User;
import com.cloudshadow.util.R;

public interface UserService extends IService<User> {
    public R registerUser(User user);
    public R loginValid(User user);
}
