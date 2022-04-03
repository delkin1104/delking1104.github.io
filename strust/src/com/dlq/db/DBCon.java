package com.dlq.db;

import java.sql.Connection;
import java.sql.DriverManager;
//连接数据库
public class DBCon {
	private Connection con;
	
	public DBCon()
	{
	}
	
	public  Connection getConnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/strust?useUnicode=true&characterEncoding=UTF-8";
			con = DriverManager.getConnection( url ,"root","1234");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args){
		DBCon db=new DBCon();
		System.out.println("db="+db.getConnection());
	}

}

