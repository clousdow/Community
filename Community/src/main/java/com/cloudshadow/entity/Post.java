package com.cloudshadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("post")
public class Post{

	/**
	 * 帖子实体类包括属性：帖子编号，楼主编号，版块编号，帖子名称，镇楼图，帖子内容，回复数，发布时间，版块名称，楼主名称
	 */

	@TableId(value = "post_id", type = IdType.AUTO)
	private int postId;
	private int userId;
	private int plateId;
	private String postName;
	private String postImg;
	private String postText;
	private int replyNum;
	private Date publicTime;
	@TableField(exist = false)
	private String plateName;
	@TableField(exist = false)
	private String userName;

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
	public int getPlateId() {
		return plateId;
	}
	public void setPlateId(int plateId) {
		this.plateId = plateId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostImg() {
		return postImg;
	}
	public void setPostImg(String postImg) {
		this.postImg = postImg;
	}
	public String getPostText() {
		return postText;
	}
	public void setPostText(String postText) {
		this.postText = postText;
	}
	public int getReplyNum() {
		return replyNum;
	}
	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}
	public Date getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(Date publicTime) {
		this.publicTime = publicTime;
	}
	public String getPlateName() {
		return plateName;
	}
	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Post{" +
				"postId=" + postId +
				", userId=" + userId +
				", plateId=" + plateId +
				", postName='" + postName + '\'' +
				", postImg='" + postImg + '\'' +
				", postText='" + postText + '\'' +
				", replyNum=" + replyNum +
				", publicTime=" + publicTime +
				", plateName='" + plateName + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}
