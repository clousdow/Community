package com.cloudshadow.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cloudshadow.entity.Category;
import com.cloudshadow.service.CategoryService;
import com.cloudshadow.util.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class CategoryServiceImplTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void showCategory(){
        R r = categoryService.showCategory(1);
        Page<Category> page = (Page<Category>)r.get("page");
        System.out.println(page.getRecords());
    }
}
