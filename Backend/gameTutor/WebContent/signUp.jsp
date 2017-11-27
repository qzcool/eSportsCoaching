<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>

<title>登陆游戏教头</title>

<link rel="stylesheet" href="css/game.css" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet">
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
			<div class="selectionInfo">
				<div class="form_control">
					用户角色：
					<select name="userRole" id="userRole" required>
						<option>--请选择--</option>
						<option value="2">教练注册</option>
						<option value="3">学员注册</option>
					</select>
				</div>
				<div class="input-selection">
					<input type="email" class="input-index-user" placeholder="电子邮件地址" id="userName" required> 
					<input type="password" class="input-index-user" placeholder="密码" id="userPwd" required>
					<input type="password" class="input-index-user" placeholder="确认密码" id="rUserPwd" required>
				</div>
				<button class="button-signIn" onclick="signUpUser()">注册</button>
				<p>
					已有账户，请<a href="signIn.jsp">登录</a>
				</p>
			</div>
			<p class="signIn-p">
				点击注册，您已同意游戏先生的相关条款和隐私协议</a>
			</p>
			<p class="signIn-p">
				想成为先生，来这里<a id="signUpToSensei" href="signUp.jsp">注册</a>
			</p>
		</div>
	</div>
	<script language="JavaScript" src="js/game.js"></script>
</body>
</html>