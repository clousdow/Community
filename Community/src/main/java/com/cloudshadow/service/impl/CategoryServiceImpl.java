package com.cloudshadow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudshadow.entity.Category;
import com.cloudshadow.mapper.CategoryMapper;
import com.cloudshadow.service.CategoryService;
import com.cloudshadow.util.R;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Override
    public R showCategory(int pageNo) {
        IPage<Category> page = new Page<Category>(pageNo,20);
        this.page(page, new QueryWrapper<Category>().orderByAsc("category_id"));
        return R.ok().put("page",page);
    }
}
