<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2016腾讯俱乐部招新报名</title>
</head>
<body>
<form action="RegistControl" name=form>
<table>
	<tr>
		<td>姓名</td>
		<td><input type="text" name="name" /></td>
	</tr>
	<tr>
		<td>学号</td>
		<td><input type="text" name="number" /></td>
	</tr>
	<tr>
		<td>学院</td>
		<td><input type="text" name="ascription" /></td>
	</tr>
	<tr>
		<td>专业</td>
		<td><input type="text" name="major" /></td>
	</tr>
	<tr>
		<td>性别</td>
		<td><input type="radio" name="sex" value="男">男
			<input type="radio" name="sex" value="女">女</td>
	</tr>
	<tr>
		<td>电话</td>
		<td><input type="text" name="phone" /></td>
	</tr>
	<tr>
		<td>邮箱</td>
		<td><input type="text" name="email" /></td>
	</tr>
	<tr>
		<td>参加部门</td>
		<td><input type="checkbox" name="apartment" value="综合技术部">综合技术部
			<input type="checkbox" name="apartment" value="媒体宣传部">媒体宣传部
			<input type="checkbox" name="apartment" value="策划运营部">策划运营部</td>
	</tr>
	<tr>
		<td>个人简介</td>
		<td><input type="text" name="message" /></td>
	</tr>	
</table>
<table>
<tr>
	<td><Input type="submit" name="submit" value="提交"></td>
</tr>
</table>
</form>
<form action="helpShowRegisters" method="post" name="form">
<table>
<tr>
	<td>显示所有用户</td>
	<td><Input type="hidden" value="1" name="showPageNum"></td>
	<td><Input type="submit" value="显示" name="submit"></td>
</tr>
</table>
</form>
</body>
</html>