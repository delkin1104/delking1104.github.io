package com.dlq.vo;
//定义对象，封装对象
public class UserInfo {
    private String userName;
    private String password;
    private String address;
    
    public UserInfo(){
    }
    
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	} 
}
