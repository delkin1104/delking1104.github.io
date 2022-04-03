package com.dlq.moudel;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dlq.db.DBCon;
import com.dlq.vo.UserInfo;



public class UserInfoModel {

	private UserInfo userInfo;
	private DBCon db;
	
	public UserInfoModel()
	{
	}
	
	public boolean  insert(UserInfo userInfo)
	{
		boolean result=false;
		try{
			
			db=new DBCon();
			Connection con=db.getConnection();
			//×ö²åÈë²Ù×÷
			String sql="insert into user values(id,?,?,?)";
			
	        PreparedStatement pstmt=con.prepareStatement(sql);	
			
			pstmt.setString(1, userInfo.getUserName());
			pstmt.setString(2, userInfo.getPassword());
			pstmt.setString(3, userInfo.getAddress());
			
			int i=pstmt.executeUpdate();
			
			if(i>0)
			{
				result=true;
			}	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
}
