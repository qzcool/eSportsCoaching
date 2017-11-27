<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/jsp/common/side.jsp" %>
<form method="post" action="" enctype="multipart/form-data">
	<div class="col-xs-10 right-center">
		<ol class="dashboardLink">界面展示&gt;课程</ol>
		<div class="selectionInfo col-xs-10">
			<div class="selection-header">
				<h3>个人信息</h3>
			</div>
			<div class="selection-body col-xs-10">
			
				        
				<!-- <div class="cover-wrap" style="display:none;position:fixed;left:0;top:0;width:100%;height:100%;background: rgba(0, 0, 0, 0.4);z-index: 10000000;text-align:center;">	
					<div id="clipArea" style="margin: 10px;height: 520px;user-select: none;overflow: hidden;position: relative;"></div>
					<div class="" style="height:56px;line-height:36px;text-align: center;padding-top:8px;">
						<button id="clipBtn" style="width:120px;height: 36px;border-radius: 4px;background-color:#ff8a00;
						color: #FFFFFF;font-size: 14px;text-align: center;line-height: 36px;outline: none;">保存封面</button>
					</div>
				</div>
				<div id="view" style="width:214px;height:160.5px;background-color:#ff8a00;" title="请上传 428*321 的封面图片"></div>
				<div style="height:10px;"></div>
				<div class="" style="width:140px;height:32px;border-radius: 4px;background-color:#ff8a00;color: #FFFFFF;font-size: 14px;text-align:center;line-height:32px;outline:none;margin-left:37px;position:relative;">
					点击上传封面图
					<input type="file" id="changePorfileBut" style="cursor:pointer;opacity:0;filter:alpha(opacity=0);width:100%;height:100%;position:absolute;top:0;left:0;">
				</div> -->
			
			
				<div class="cover-wrap" style="display:none;position:fixed;left:0;top:0;width:100%;height:100%;background: rgba(0, 0, 0, 0.4);z-index: 10000000;text-align:center;">	
			<div class="col-xs-4 userProfileStyle" id="changeImg" style="margin-left:420px;position:fixed;left:0;top:0;">
					<div id="clipArea" style="margin: 10px;height: 520px;user-select: none;overflow: hidden;position: relative;"></div>
					<div class="" style="height:56px;line-height:36px;text-align: center;padding-top:8px;">
						<button  id="clipBtn" style="width:120px;height: 36px;border-radius: 4px;background-color:#ff8a00;
						color: #FFFFFF;font-size: 14px;text-align: center;line-height: 36px;outline: none;">保存封面</button>
					</div>
				</div>
			</div>
			<div class="col-xs-4 userProfileStyle" id="changeImg">
					<img src='../images/anon.png' alt="profile" class="img-responsive center-block profileStyle" id="view" /><!-- id="profileID" -->
					<div class="butChange">
						<button class="buttonRadis buttonTochangeFile" id="changePorfileID">更换头像</button>
						<input type="file" class="buttonRadis buttonTochangeFile" id="changePorfileBut"/>
						<input type="hidden" id="errorinfo" value="${uploadFileError}"/>
						<font color="red"></font>
					</div>
			</div>
			
			
			
				<%-- <div class="col-xs-4 userProfileStyle" id="changeImg">
					<img src='../images/anon.png' alt="profile" class="img-responsive center-block profileStyle" id="profileID" />
					<div class="butChange">
						<button class="buttonRadis buttonTochangeFile" id="changePorfileID">更换头像</button>
						<input type="file" class="buttonRadis buttonTochangeFile" id="changePorfileBut"/>
						<input type="hidden" id="errorinfo" value="${uploadFileError}"/>
						<font color="red"></font>
					</div>
				</div> --%>
				
				<div class="col-xs-8 formLeft">
					<div class="profile-input-box blockStyle">
						<label for="userNameI" class="blockStyle">姓名</label> 
						<input id="userNameI" class="profile-input" />
					</div>
					<div class="profile-input-box blockStyle">
						<label for="screenNameI" class="blockStyle">本地昵称</label> 
						<input id="screenNameI" class="profile-input" />
					</div>
					<div class="profile-input-box blockStyle">
						<label for="gameNameI" class="blockStyle">游戏名字</label>
						<select id="screenNameI" class="profile-input">
							<option>--请选择--</option>
							<option>王者荣耀</option>
							<option>英雄联盟</option>
							<option>魔兽</option>
							<option>地下城与勇士</option>
						</select>
					</div>
					<div class="profile-input-introduce-box blockStyle">
						<label for="userNameII" class="blockStyle">自我介绍</label> 
						<input id="userNameII" class="profile-input-introduce" />
					</div>
				</div>
			</div>
		</div>
	</div>
</form>
	</div>
	</div>
	
	
	<script language="JavaScript" src="../js/center.js"></script>
	</div>
</body>
</html>