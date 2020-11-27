package com.cloudshadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


import java.util.Date;

@TableName("user")
public class User{

	/**
	 * 用户实体类包含属性：编号，用户名，密码，昵称，性别，生日，简介，权限，头像路径
	 */

	@TableId(value = "user_id", type = IdType.AUTO)
	private int userId;
	private String userName;
	private String userPassword;
	private String name;
	private int sex;
	private Date birth;
	private String introduction;
	private int userPermissions;
	private String userimg;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getUserPermissions() {
		return userPermissions;
	}
	public void setUserPermissions(int userPermissions) {
		this.userPermissions = userPermissions;
	}
	public String getUserimg() {
		return userimg;
	}
	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				", name='" + name + '\'' +
				", sex=" + sex +
				", birth=" + birth +
				", introduction='" + introduction + '\'' +
				", userPermissions=" + userPermissions +
				", userimg='" + userimg + '\'' +
				'}';
	}
}
