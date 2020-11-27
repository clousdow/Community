package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.Post;
import com.cloudshadow.util.R;

import java.util.List;

public interface PostService extends IService<Post> {
    public R showPostPageByPlateId();//获取所有帖子,并以最新的楼层回复时间排序(最好把postText中的内容里所有<>和里面的内容去掉)，封装入每页20条数据的分页插件，放入R中返回
    public R showPostPageByPlateId(int plateId);//通过版块编号找到版块中的所有帖子,并以最新的楼层回复时间排序(最好把postText中的内容里所有<>和里面的内容去掉)，封装入每页20条数据的分页插件，放入R中返回
    public R recommendPost();//获取前十个回复数最多的帖子，以list存储
    public R recommendPost(int plateId);//通过版块编号获取前十个回复数最多的帖子，以list存储
    public List<Post> searchPost(String postName);//按照帖子名字模糊查询帖子，按照回复数排列
    public int findPostCountByPlateId(int plateId);//通过版块编号拿到帖子数
    public int findPostCountByUserId(int userId);//通过用户编号拿到帖子数
}
