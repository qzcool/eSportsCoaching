<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>游戏先生</title>
<link rel="stylesheet" href="css/game.css" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet">

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<div align="center">
		<nav class="navbar navbar-default navbar-fixed-top m-b-n">
		<div class="container-fluid">
			<div>
				<div class="gameLogo"></div>
			</div>
			<div class="navbar-right input-group">
				<ul id="menu">
					<li><a href=''>博客</a></li>
					<li><a href='signIn.jsp'>登录</a></li>
					<li><a>游客进入</a></li>
				</ul>
			</div>
		</div>
		</nav>
		<div class="col-xs-7 col-xs-offset-2 gameContent padding-index">
			<h1 id="applyToBe"></h1>
			<div class="selectionInfo">
				<div class="input-selection">
					<input type="email" class="input-index-user" placeholder="电子邮件地址" id="userName" required> 
					<input type="password" class="input-index-user" placeholder="密码" id="userPwd" required>
					<span class="forgotSecret">忘记密码</span>
				</div>
				<button class="button-signIn" onclick="checkUserInfo()">登录</button>
				<br>
			</div>
			<p class="signIn-p">
				你还没有帐号，申请成为<a href="signUp.jsp">学员</a><br>
				申请成为<a href="signUp.jsp">先生</a>
			</p>
		</div>
	</div>
	<script language="JavaScript" src="js/game.js"></script>
</body>
</html>