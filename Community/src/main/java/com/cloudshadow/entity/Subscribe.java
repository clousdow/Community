package com.cloudshadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("subscribe")
public class Subscribe {

    @TableId(value = "subscribe_id", type = IdType.AUTO)
    private int subscribeId;
    private int subscribeUserId;
    private int fansId;

    public int getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(int subscribeId) {
        this.subscribeId = subscribeId;
    }

    public int getSubscribeUserId() {
        return subscribeUserId;
    }

    public void setSubscribeUserId(int subscribeUserId) {
        this.subscribeUserId = subscribeUserId;
    }

    public int getFansId() {
        return fansId;
    }

    public void setFansId(int fansId) {
        this.fansId = fansId;
    }

    @Override
    public String toString() {
        return "subscribe{" +
                "subscribeId=" + subscribeId +
                ", subscribeUserId=" + subscribeUserId +
                ", fansId=" + fansId +
                '}';
    }
}
