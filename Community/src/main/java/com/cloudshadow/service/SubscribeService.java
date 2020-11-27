package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.Subscribe;
import com.cloudshadow.util.R;

public interface SubscribeService extends IService<Subscribe> {
    public R findSubcribeByUserId(int userId);//通过用户编号获取他的关注
    public int findSubcribeCountByUserId(int userId);//通过用户编号获取他的关注数
    public R findFansByUserId(int userId);//通过用户编号获取他的粉丝
    public int findFansCountByUserId(int userId);//通过用户编号获取他的粉丝数
}
