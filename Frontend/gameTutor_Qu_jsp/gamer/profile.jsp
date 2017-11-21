<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/sider.jsp" %>

	<div class="col-xs-10 right-center">
		<ol class="dashboardLink">界面展示&gt;课程</ol>
		<div class="selectionInfo col-xs-10">
			<div class="selection-header">
				<h3>个人信息</h3>
			</div>
			<div class="selection-body col-xs-10">
				<div class="col-xs-4 userProfileStyle">
					<img src='../images/anon.png' alt="profile"
						class="img-responsive center-block profileStyle" id="profileID" />
					<button class="buttonRadis buttonTochangeFile" id="changePorfileID">更换头像</button>
				</div>
				<form class="col-xs-8 formLeft">
					<div class="profile-input-box blockStyle">
						<label for="userNameI" class="blockStyle">姓名</label> <input
							id="userNameI" class="profile-input" />
					</div>
					<div class="profile-input-box blockStyle">
						<label for="screenNameI" class="blockStyle">屏幕名字</label> <input
							id="screenNameI" class="profile-input" />
					</div>
					<div class="profile-input-box blockStyle">
						<label for="gameNameI" class="blockStyle">游戏名字</label> <input
							id="gameNameI" class="profile-input" />
					</div>
					<div class="profile-input-introduce-box blockStyle">
						<label for="userNameII" class="blockStyle">自我介绍</label> <input
							id="userNameII" class="profile-input-introduce" />
					</div>
				</form>
			</div>
		</div>
	</div>
	</div>
	</div>
	<script language="JavaScript" src="../js/game.js"></script>
	</div>
</body>
</html>