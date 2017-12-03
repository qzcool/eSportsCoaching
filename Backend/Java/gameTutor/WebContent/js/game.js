var gameNameOptions = [ "王者荣耀", "英雄联盟" ];

/* check user name and user password in sign in */
function checkUserInfo() {
	var userName = $("#userName").val();
	var userPwd = $("#userPwd").val();
	if (userName === "" || userName == null || userPwd === ""
			|| userPwd == null) {
		alert("请输入您的用户名或密码");
		return;
	}
	$.ajax({
		url : "/gameTutor/log/selectUser",
		data : {
			userName : userName,
			userPwd : userPwd
		},
		type : "post",
		dataType : "json",
		async : false,
		success : function(data) {
			if (data == true) {
				window.location.href = "jsp/profile.jsp";
			} else {
				alert("用户名或密码错误");
			}
			return;
		},
		error : function(data) {
			alert("登陆失败！")
		}
	})
}

// 添加用户
function signUpUser() {
	var userName = $("#userName").val();
	var flag = false;
	// ajax后台验证--userName是否已存在
	$.ajax({
		url : "/gameTutor/signUp/userNameExist",
		data : {
			userName : userName
		},
		type : "post",
		dataType : "json",
		async : true,
		success : function(data) {
			if (data == "exist") {
				alert("用户名不能为空或已存在！")
			} else if (data == "notexist") {
				var userPwd = $("#userPwd").val();
				var rUserPwd = $("#rUserPwd").val();
				var role = $("#userRole option:selected").val();
				if (role == "2" || role == "3") {
					if (userPwd == rUserPwd) {
						$.ajax({
							url : "/gameTutor/signUp/addUser",
							data : {
								userName : userName,
								userPwd : userPwd,
								role : role
							},
							type : "post",
							dataType : "json",
							async : true,
							success : function(data) {
								if (data == 1) {
									alert("注册成功！")
									location.href = "index.jsp";
								} else {
									alert("注册失败！请重新注册")
								}
							}
						})
					} else {
						alert("密码输入不一致！")
					}
				} else {
					alert("请选择角色！")
				}
			}
		},
		error : function() {
			alert("error")
		}
	});
}



/* add optional games */
function addOptionsForSelect() {
	var gameOptional = document.getElementById("gameOptional");
	if (!gameOptional) {
		return;
	}
	for (var i = 0; i < gameNameOptions.length; i++) {
		var option = document.createElement("option");
		option.innerHTML = gameNameOptions[i];
		gameOptional.appendChild(option);
	}
}
addOptionsForSelect();

/* set changePorfile button width */
function changeProfileBtnWidth() {
	var cbw = document.getElement.getElementById("selectI");
	if (!cbw)
		return;

}

$(function() {
	$("span").click(function() {
		if ($("#toggleFlag").text() === "<") {
			var leftPosition = -$("#leftBar").width() * 0.7;
			$("#toggleFlag").text(">");
			$("#leftBar").animate({
				left : leftPosition
			}, 500);
			$(".needToggle").hide();
			$(".imageInline").css("float", "right");
		} else {
			$("#toggleFlag").text("<");
			$("#leftBar").animate({
				left : "0px"
			}, 500);
			$(".needToggle").show();
			$(".imageInline").css("float", "left");
		}
	});
	/* init element background color when click event hanppen */
	var initColor = function() {
		$(".listClick").css("background-color", "");
		$(".listClick").mouseover(function() {
		});
	}
	$(".listClick").click(function() {
		initColor();
		$(this).css("background-color", "#69A53C");
	});

	/* link to matched page */
	var locationArray = [ "unScheduled", "calender", "listView", "myReviews",
			"getFreeLessons", "summary", "mySubscription", "history",
			"userProfile", "accountSetting", "paymentOptions" ]
	$("#course1").click(function() {

	});
	$("#signUpToSensei").click(function() {
		window.location.href = "signUp.jsp";
	});

});
