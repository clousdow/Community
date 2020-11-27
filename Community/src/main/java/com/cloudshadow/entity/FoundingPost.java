package com.cloudshadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName("founding_post")
public class FoundingPost{

	/**
	 * 发布帖子列表包括属性：发布编号，用户编号，帖子编号
	 */

	@TableId(value = "fp_id", type = IdType.AUTO)
	private int fpId;
	private int userId;
	private int postId;
	public int getFpId() {
		return fpId;
	}
	public void setFpId(int fpId) {
		this.fpId = fpId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	@Override
	public String toString() {
		return "FoundingPost [fpId=" + fpId + ", userId=" + userId + ", postId=" + postId + "]";
	}
	
}
