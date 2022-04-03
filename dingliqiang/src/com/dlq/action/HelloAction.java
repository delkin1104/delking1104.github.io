package com.dlq.action;

import com.dlq.moudel.UserInfoModel;
import com.dlq.vo.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

//±àÐ´Action³äµ±¿ØÖÆÆ÷
public class HelloAction extends ActionSupport {
	 private String userName;
	    private String password;
	    private String address;
	    
	    public  HelloAction(){
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

	public String execute() throws Exception {
		
		UserInfo userInfo=new UserInfo();
		
		userInfo.setUserName(userName);
		userInfo.setPassword(password);
		userInfo.setAddress(address);
		
		UserInfoModel pmodel=new UserInfoModel();
		boolean result=pmodel.insert(userInfo);
		if(result)
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
	
}