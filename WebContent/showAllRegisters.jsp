<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="register.info.showPage" %>
<jsp:useBean id="showpage" type="register.info.showPage" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看用户</title>
</head>
<body>
<center>
<p>显示用户信息
<br>每页最多显示<jsp:getProperty property="pageSize" name="showpage"/>
<br>当前显示第<jsp:getProperty property="showPageNum" name="showpage"/>页,共有<jsp:getProperty property="pageAllCount" name="showpage"/>页
<br>
<table>
<tr>
	<th>姓名</th><th>学号</th><th>性别</th><th>学院</th><th>专业</th><th>电话</th>
	<th>邮件</th><th>部门</th><th>个人信息</th>
</tr>
<jsp:getProperty property="presentPageResult" name="showpage" />
</table>
<br>点击“上一页”，“下一页”查看信息
<table>
<tr>
	<td><form action="helpShowRegisters" method="post">
		<Input type="hidden" name="showPageNum" value="<%=showpage.getShowPageNum()-1 %>">
		<Input type="submit" name="submit" value="上一页">
	</form></td>
	<td><form action="helpShowRegisters" method="post">
		<Input type="hidden" name="showPageNum" value="<%=showpage.getShowPageNum()+1 %>">
		<Input type="submit" name="submit" value="下一页">
	</form></td>
</table>
</center>
</body>
</html>