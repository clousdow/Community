package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.Floor;
import com.cloudshadow.util.R;

public interface FloorService extends IService<Floor> {
    public R saveFloor(Floor floor);//通过帖子编号查找最大的楼层号，并把最大楼层号+1放入floor.floorNum,若没有或为0则设置为2
    public R showFloorPageByPostId(int postId);//通过帖子编号找到帖子中的所有楼层,并以楼层号排序，封装入每页20条数据的分页插件，放入R中返回
    public int findFloorNumByPostId(int postId);//通过帖子编号获得最大楼层号
}
