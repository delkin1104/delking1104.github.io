package com.dlq.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class UserInfoControl extends HttpServlet {

	/**
	 * 控制器，事件，得到数据库的内容
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.setContentType("text/html;charset=gb2312");
//		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
	
		
//		System.out.println(userName+","+password+","+address);
//		
//	    TransCode code=new TransCode();
//	    userName=code.transISO_GB(userName);
//	    password=code.transISO_GB(password);
//	    address=code.transISO_GB(address);
 
//	    System.out.println(userName+","+password+","+address);	
		
//		UserInfo userInfo=new UserInfo();
//		userInfo.setUserName(userName);
//		userInfo.setPassword(password);
//		userInfo.setAdddress(address);
		
//		UserInfoModel pmodel=new UserInfoModel();
		
//		boolean result=pmodel.insert(userInfo);
//		if(result)
//		{
//			request.getRequestDispatcher("/userInfoSuccess.jsp").forward(request,response);
//		}
//		else
//		{
//			request.getRequestDispatcher("/userInfoError.jsp").forward(request,response);
//		}
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
