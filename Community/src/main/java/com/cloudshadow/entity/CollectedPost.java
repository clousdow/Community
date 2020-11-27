package com.cloudshadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("collected_post")
public class CollectedPost{

	/**
	 * 收藏帖子类包括属性，收藏编号，用户编号，帖子编号
	 */

	@TableId(value = "cp_id", type = IdType.AUTO)
	private int cpId;
	private int userId;
	private int PostId;
	public int getCpId() {
		return cpId;
	}
	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPostId() {
		return PostId;
	}
	public void setPostId(int postId) {
		PostId = postId;
	}
	@Override
	public String toString() {
		return "CollectedPost [cpId=" + cpId + ", userId=" + userId + ", PostId=" + PostId + "]";
	}
	
}
