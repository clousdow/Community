package com.cloudshadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName("category")
public class Category {

    /**
      *分类实体类包括属性：分类编号，分类名称，版块列表
     */

    @TableId(value = "category_id", type = IdType.AUTO)
    private int categoryId;
    private String categoryName;
    @TableField(exist = false)
    private List<Plate> plateList;
    @TableField(exist = false)
    private List<Plate> moreList;
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Plate> getPlateList() {
        return plateList;
    }

    public void setPlateList(List<Plate> plateList) {
        this.plateList = plateList;
    }

    public List<Plate> getMoreList() {
        return moreList;
    }

    public void setMoreList(List<Plate> moreList) {
        this.moreList = moreList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", plateList=" + plateList +
                ", moreList=" + moreList +
                '}';
    }
}
