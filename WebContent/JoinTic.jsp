<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2016腾讯俱乐部招新报名</title>
<link rel="stylesheet" href="css/reset4login.css">
<link rel="stylesheet" href="css/supersized4login.css">
<link rel="stylesheet" href="css/style4login.css">
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
</head>
<body>
<div class="page-container">
<h1>报名</h1>
<form action="RegistControl" name=form method="post">
<input type="text" name="name" class="username" placeholder="姓名">
                <input type="text" name="number" class="username" placeholder="学号"/>
                <input type="text" name="ascription" class="username" placeholder="学院"/>
                <input type="text" name="major" class="username" placeholder="专业" />

                <div style="float: left;width: 60px;height: 42px;text-align:center;line-height:80px">男
                </div>
                <div style="float:left; width: 60px;height: 42px;"><input type="radio" name="sex" value="男" class="radioclass" ></div>
                <div style="float: left;width: 60px;height: 42px;text-align:center;line-height:80px">女
                </div>
                <div style="float:left; width: 60px;height: 42px;"><input type="radio" name="sex" value="女" class="radioclass"></div>
                
                
                <input type="text" name="phone" class="username" placeholder="电话" />
                <input type="text" name="email" class="username" placeholder="邮箱" />

                <div style="float: left;width: 135px;height: 42px;text-align:center;line-height:80px">综合技术部
                </div>
                <div style="float:left; clear:right;">
                <input type="checkbox" name="apartment" value="综合技术部" class="checkclass">
                </div>

                <div style="float:left;width: 135px;height: 42px;text-align:center;line-height:80px">媒体宣传部</div>
                <div style="float:left; clear:right;">
                <input type="checkbox" name="apartment" value="媒体宣传部" class="checkclass">
                </div>

                <div style="float:left;width: 135px;height: 42px;text-align:center;line-height:80px">策划运营部</div>
                <div style="float:left;clear:right;">
                <input type="checkbox" name="apartment" value="策划运营部" class="checkclass">
                </div>
                
                <input type="text" name="message" class="selfintroduction" placeholder="个人简介" />

                <button type="submit">提交</button>
                <div class="error"><span>+</span></div>

</form>
</div>

<script src="js/jquery-1.8.2.min.js"></script>
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<script src="js/scripts4login.js"></script>
</body>
</html>