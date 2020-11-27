package com.cloudshadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;



@TableName("plate")
public class Plate{
	/**
	 * 版块实体类包含属性：编号，版主编号，版块名称，版块图像路径，版块简介
	 */

	@TableId(value = "plate_id", type = IdType.AUTO)
	private int plateId;
	private int categoryId;
	private int userId;
	private String plateName;
	private String plateImg;
	private String plateIntroduction;
	@TableField(exist = false)
	private String userName;

	public int getPlateId() {
		return plateId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public void setPlateId(int plateId) {
		this.plateId = plateId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPlateName() {
		return plateName;
	}
	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}
	public String getPlateImg() {
		return plateImg;
	}
	public void setPlateImg(String plateImg) {
		this.plateImg = plateImg;
	}
	public String getPlateIntroduction() {
		return plateIntroduction;
	}
	public void setPlateIntroduction(String plateIntroduction) {
		this.plateIntroduction = plateIntroduction;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Plate{" +
				"plateId=" + plateId +
				", categoryId=" + categoryId +
				", userId=" + userId +
				", plateName='" + plateName + '\'' +
				", plateImg='" + plateImg + '\'' +
				", plateIntroduction='" + plateIntroduction + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}
