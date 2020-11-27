package com.cloudshadow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudshadow.entity.Subscribe;
import com.cloudshadow.mapper.SubscribeMapper;
import com.cloudshadow.service.SubscribeService;
import org.springframework.stereotype.Service;

@Service
public class SubscribeServiceImpl extends ServiceImpl<SubscribeMapper, Subscribe> implements SubscribeService {
}
