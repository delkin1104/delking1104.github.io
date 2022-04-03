<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register.jsp</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() %>/css/default.css"/>
</head>
<body>
<form action="UserInfoControl">
	<table width="80%" class="default" align="center">
	<tr class="title">
		<td colspan="2">请填写注册信息 </td>
	</tr>
	<tr>
			<td width="30%" class="item">用户名:</td>
			<td width="70%"><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td width="30%" class="item">密码:</td>
			<td width="70%"><input type="password" name="password"></td>
		</tr>
		<tr>
			<td width="30%" class="item">地址:</td>
			<td width="70%"><input type="text" name="address"></td>
		</tr>
		
		
		
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="提交">
			    <input type="reset" value="重置">
			</td>
		</tr>
	</table>
</form>
</body>
</html>
