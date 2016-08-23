<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="register.info.*" %>
<jsp:useBean id="register" type="register.info.Register" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册信息</title>
</head>
<body>
<center>
<br><jsp:getProperty name="register" property="backNews"/>
<table>
<tr>
	<td>姓名</td>
	<td><jsp:getProperty name="register" property="name"/></td>
</tr>
<tr>
	<td>学号</td>
	<td><jsp:getProperty property="number" name="register"/>
</tr>
<tr>
	<td>性别</td>
	<td><jsp:getProperty property="sex" name="register"/></td>
</tr>
<tr>
	<td>学院</td>
	<td><jsp:getProperty property="ascription" name="register"/></td>
</tr>
<tr>
	<td>专业</td>
	<td><jsp:getProperty property="major" name="register"/>
<tr>
	<td>电话</td>
	<td><jsp:getProperty property="phone" name="register"/></td>
<tr>
	<td>邮件</td>
	<td><jsp:getProperty property="email" name="register"/></td>
</tr>
<tr>
	<td>部门</td>
	<td><jsp:getProperty property="apartment" name="register"/></td>
</tr>
<tr>
	<td>个人信息</td>
	<td><jsp:getProperty property="message" name="register"/></td>
</tr>
</table>
</center>
</body>
</html>