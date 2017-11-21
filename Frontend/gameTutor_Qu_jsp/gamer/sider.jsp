<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>游戏先生</title>
<link rel="stylesheet" href="../css/game.css" type="text/css" />
<link href="../css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
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
					<li><a href='signIn.html'>寻找先生</a></li>
					<li><a>个人中心</a></li>
				</ul>
			</div>
		</div>
		</nav>
		<div class="container-fluid bg-img">
			<div class="row">
				<div class="col-xs-2 index-left " id="leftBar">
					<span class="pull-right scaleButton" aria-hidden="true"
						id="toggleFlag"><</span>
					<div class="text-center m-t-30">
						<img id='userProfile' src='../images/anon.png' alt="profile"
							class="img-responsive center-block needToggle" />
					</div>
					<div class="listInfo">
						<a href="#"> <img src="../images/dashboard_nav_calendar.png"
							alt="course" class="img-responsive imageInline" />
						</a>
						<h4 id="courseName" class='needToggle blueColor'>课程</h4>
						<ul>
							<li class="listClick" id="unScheduled"><a
								href="unScheduled.html" class='needToggle needToChangeBack'>未预订时间表</a></li>
							<li class="listClick" id="calender"><a href="calender.html"
								class="needToggle">日程表</a></li>
							<li class="listClick" id="listView"><a href="listView.html"
								class='needToggle'>列表试图</a></li>
							<li class="listClick" id="myReviews"><a
								href="myReviews.html" class='needToggle'>我的评论</a></li>
							<li class="listClick" id="getFreeLessons"><a
								href="getFreeLessons.html" class='needToggle'>免费课程</a></li>
						</ul>
					</div>
					<div class="listInfo">
						<a href="#"> <img src="../images/dashboard_nav_wallet.png"
							alt="wallet" class="img-responsive imageInline" />
						</a>
						<h4 id="walletName" class='needToggle blueColor'>钱包</h4>
						<ul>
							<li class="listClick" id="summary"><a href="summary.html"
								class='needToggle'>概要</a></li>
							<li class="listClick" id="mySubscription"><a
								href="mySubscription.html" class="needToggle">我的预订</a></li>
							<li class="listClick" id="history"><a href="history.html"
								class='needToggle'>历史记录</a></li>
						</ul>
					</div>
					<div class="listInfo">
						<a href="#"> <img
							src="../images/dashboard_nav_preferences.png" alt="wallet"
							class="img-responsive imageInline" />
						</a>
						<h4 id="preferenceName" class='needToggle blueColor'>设置</h4>
						<ul>
							<li class="listClick" id="userProfile"><a
								href="userProfile.html" class='needToggle'>个人信息</a></li>
							<li class="listClick" id="accountSetting"><a
								href="accountSetting.html" class="needToggle">账户设置</a></li>
							<li class="listClick" id="paymentOptions">
								<a href="paymentOptions.html" class='needToggle'>支付方式</a></li>
						</ul>
					</div>
					<p class='needToggle listClick'>
						<a href="#">注销</a>
					</p>
				</div>
