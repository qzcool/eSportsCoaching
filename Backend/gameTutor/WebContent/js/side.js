// 注销
function logout() {
	var msg = confirm("是否退出!");
	if (msg == true) {
		$.ajax({
			url : "/gameTutor/log/logout",
			type : "post",
			async : true,
			success:function(){
				location.href = "../signIn.jsp";
			},
			error : function() {
				alert("error！")
			}
		})

	}
}