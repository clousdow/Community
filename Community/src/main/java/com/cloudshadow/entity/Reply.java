package com.cloudshadow.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("reply")
public class Reply{

	/**
	 * 回复实体类包括属性：回复编号，用户编号，楼层编号，回复号，回复内容，发布时间，回复用户编号，用户名称，回复用户名称
	 */

	@TableId(value = "reply_id", type = IdType.AUTO)
	private int replyId;
	private int userId;
	private int floorId;
	private int replyNum;
	private String replyText;
	private String publicTime;
	private int replyUserId;
	@TableField(exist = false)
	private String userName;
	@TableField(exist = false)
	private String userimg;
	@TableField(exist = false)
	private String repleyUserName;
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public int getReplyNum() {
		return replyNum;
	}
	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}
	public String getReplyText() {
		return replyText;
	}
	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}
	public String getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(String publicTime) {
		this.publicTime = publicTime;
	}
	public int getReplyUserId() {
		return replyUserId;
	}
	public void setReplyUserId(int replyUserId) {
		this.replyUserId = replyUserId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserimg() {
		return userimg;
	}
	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}
	public String getRepleyUserName() {
		return repleyUserName;
	}
	public void setRepleyUserName(String repleyUserName) {
		this.repleyUserName = repleyUserName;
	}

	@Override
	public String toString() {
		return "Reply{" +
				"replyId=" + replyId +
				", userId=" + userId +
				", floorId=" + floorId +
				", replyNum=" + replyNum +
				", replyText='" + replyText + '\'' +
				", publicTime='" + publicTime + '\'' +
				", replyUserId=" + replyUserId +
				", userName='" + userName + '\'' +
				", userimg='" + userimg + '\'' +
				", repleyUserName='" + repleyUserName + '\'' +
				'}';
	}
}
