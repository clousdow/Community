package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.Plate;
import com.cloudshadow.util.R;

import java.util.List;

public interface PlateService extends IService<Plate> {
    public R showPlateList(R r);//通过所有分类Id得到所有分类中所有版块，r.page.recodes中有List<Category>,查到的版块前12个放入plateList，剩下的全部放入moreList
    public R recommendPlate();//获得前十个帖子数最多的版块，以list存储
    public List<Plate> searchPlate(String plateName);//按照版块名字模糊查询版块，按照帖子数排列
}
