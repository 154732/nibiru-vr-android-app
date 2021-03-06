package com.zskx.net.response.user;

import java.io.Serializable;

/**
 * 用户bean
 * 
 * @author demo
 * 
 */
public class User implements Serializable {
	


	private String loginName;

	private String userPwd;

	private String sessionId;

	private String userName;

	private String userSex;

	private String userAge;

	private String userCompany;

	private String moneyLevel;
	

	// private String remark;

	public String getUserName() {
		return userName;
	}



	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {

		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String LoginName) {
		this.loginName = LoginName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getSessionId() {
		return sessionId;
	}

	public String getMoneyLevel() {
		return moneyLevel;
	}

	public void setMoneyLevel(String moneyLevel) {
		this.moneyLevel = moneyLevel;
	}

	// public String getRemark() {
	// return remark;
	// }
	//
	// public void setRemark(String remark) {
	// this.remark = remark;
	// }

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", userPwd=" + userPwd
				+ ", sessionId=" + sessionId + ", userName=" + userName
				+ ", userSex=" + userSex + ", userAge=" + userAge

				+ "]";
	}

}
