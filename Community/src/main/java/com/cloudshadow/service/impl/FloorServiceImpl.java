package com.cloudshadow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudshadow.entity.Floor;
import com.cloudshadow.mapper.FloorMapper;
import com.cloudshadow.service.FloorService;
import org.springframework.stereotype.Service;

@Service
public class FloorServiceImpl extends ServiceImpl<FloorMapper, Floor> implements FloorService {
}
