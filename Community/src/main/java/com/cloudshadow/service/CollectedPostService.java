package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.CollectedPost;
import com.cloudshadow.util.R;

public interface CollectedPostService extends IService<CollectedPost> {
    public R findPostByUserId(int userId);//通过用户编号获取他收藏的帖子
}
