package com.cloudshadow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudshadow.entity.Plate;
import com.cloudshadow.mapper.PlateMapper;
import com.cloudshadow.service.PlateService;
import org.springframework.stereotype.Service;

@Service
public class PlateServiceImpl extends ServiceImpl<PlateMapper, Plate> implements PlateService {
}
