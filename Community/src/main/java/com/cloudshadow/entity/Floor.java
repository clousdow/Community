package com.cloudshadow.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.util.List;

@TableName("floor")
public class Floor{

	/**
	 * 楼层类实体包括属性：楼层编号，帖子编号，用户编号，楼层号，楼层内容，发布时间,用户名称，回复列表
	 */

	@TableId(value = "floor_id", type = IdType.AUTO)
	private int floorId;
	private int postId;
	private int userId;
	private int floorNum;
	private String floorText;
	private Date publicTime;
	@TableField(exist = false)
	private String userName;
	@TableField(exist = false)
	private List<Reply> replyList;
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}
	public String getFloorText() {
		return floorText;
	}
	public void setFloorText(String floorText) {
		this.floorText = floorText;
	}
	public Date getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(Date publicTime) {
		this.publicTime = publicTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Reply> getReplyList() {
		return replyList;
	}
	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}

	@Override
	public String toString() {
		return "Floor{" +
				"floorId=" + floorId +
				", postId=" + postId +
				", userId=" + userId +
				", floorNum=" + floorNum +
				", floorText='" + floorText + '\'' +
				", publicTime=" + publicTime +
				", userName='" + userName + '\'' +
				", replyList=" + replyList +
				'}';
	}
}
