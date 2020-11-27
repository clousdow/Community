package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.Category;
import com.cloudshadow.util.R;

public interface CategoryService extends IService<Category> {
    public R showCategory(int pageNo);//获取所有的分类放入分页控件中，pageNo是页码
}
