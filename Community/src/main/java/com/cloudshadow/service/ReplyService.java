package com.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudshadow.entity.Reply;
import com.cloudshadow.util.R;

public interface ReplyService extends IService<Reply> {
    public R saveReply(Reply reply);//通过楼层编号查找最大的回复号，并把最大回复号+1放入floor.floorNum,若没有或为0则设置为1
    public R showReplyPageByFloorId(int floorId);//通过楼层编号找到楼层中的所有回复,并以回复号排序，封装入每页20条数据的分页插件，放入R中返回
}
