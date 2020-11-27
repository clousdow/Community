package com.cloudshadow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudshadow.entity.CollectedPost;
import com.cloudshadow.mapper.CollectedPostMapper;
import com.cloudshadow.service.CollectedPostService;
import org.springframework.stereotype.Service;

@Service
public class CollectedPostServiceImpl extends ServiceImpl<CollectedPostMapper, CollectedPost> implements CollectedPostService {
}
