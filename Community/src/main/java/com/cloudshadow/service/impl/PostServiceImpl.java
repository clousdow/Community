package com.cloudshadow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudshadow.entity.Post;
import com.cloudshadow.mapper.PostMapper;
import com.cloudshadow.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {
}
