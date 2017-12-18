var eyeIcon = document.getElementById('eyeIcon');
var userPwd = document.getElementById('userPwd');
var getVerifyCode = document.getElementById('getVerifyCode');
eyeIcon.style.color = '#e3e3e4';
var flag = false;
var intervalFlag;
var count = 60;
eyeIcon.onclick = function () {
    if (flag) {
        userPwd.type = 'password';
        flag = false;
        eyeIcon.style.color = '#e3e3e4';
    } else {
        userPwd.type = 'text';
        flag = true;
        eyeIcon.style.color = '#9d9d9d';
    }
};

getVerifyCode.onclick = function () {
    if(!checkUserInfo()){
      return;
    }
    getVerifyCode.value = count;
    intervalFlag = setInterval(function () {
        $("#getVerifyCode").attr("disabled", "true");
        count--;
        getVerifyCode.value = count;
        if (count === 0) {
            clearInterval(intervalFlag);
            getVerifyCode.value = '获取验证码';
            count = 60;
            $("#getVerifyCode").attr("disabled", "false");
        }
    }, 1000);
}

function checkUserInfo(){
    var userText = document.getElementById("userName").value;
    var nickName = document.getElementById("nickName").value;
    var userPwd = document.getElementById("userPwd").value;
    if(userText === "" || nickName === "" || userPwd === ""){
      alert("请输入正确个人信息");
      return false;
    }else{
      return true;
    }
}

/*verify user id*/
function checkUserId() {
    var userText = document.getElementById("userName").value;
    if (userText === "") {
        alert("请输入邮箱或者手机号");
        return false;
    }
    $.ajax({
        //提交数据的类型 POST GET
        type: "POST",
        //提交的网址
        url: "/identify/sendCode",
        //提交的数据
        data: {username: userText},
        //返回数据的格式
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success: function (data) {

        },
        //调用出错执行的函数
        error: function () {
            //请求出错处理
        }
    });

}
