package com.cloudshadow.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloudshadow.entity.Post;

import java.util.List;
import java.util.Map;

public interface PostMapper extends BaseMapper<Post> {
    public List<Post> getPostForPage(Map<String,Object> map);
    public List<Post> getPostForPageByPlateId(Map<String,Object> map);
}
