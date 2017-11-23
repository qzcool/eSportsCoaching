$.ajax({
	url:"../testController/classFind",
	dataType:"json",
	async:true,
	success:function(data){
		for(var i=0; i<data.length; i++){
			$("#slt").append("<option value="+data[i]+">"+data[i]+"</option>");
		}
	}
})
$(document).ready(function(){
	$("#sbt").click(function(){
		var code = $("#code").val();
		var name = $("#name").val();
		var age = $("#age").val();
		var sex = $(".sex").val();
		var phone = $("#phone").val();
		var slt = $("#slt").val();
		var flag = false;
		switch(""){
		case code:
			alert("学号不能为空");
			break;
		case name:
			alert("姓名不能为空");
			break;
		case age:
			alert("年龄不能为空");
			break;
		case sex:
			alert("性别不能为空");
			break;
		case phone:
			alert("学号不能为空");
			break;
			default:flag = true; 
		}
		if(slt == "--请选择--"){
			flag = false;
			alert("请选择班级")
		}
		if(flag){
			$.ajax({
				url:"../testController/stdInsert",
				data:{code:code,name:name,age:age,sex:sex,phone:phone,slt:slt},
				dataType:"json",
				async:true,
				success:function(data){
					if(data == 1){
						alert("插入成功！");
						$("#code").val("")
						$("#name").val("")
						$("#age").val("")
						$("#sex").val("")
						$("#phone").val("")
					}else{
						alert("插入失败！")
					}
				}
			})
		}
	})
})