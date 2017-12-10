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
    getVerifyCode.value = count;
    intervalFlag = setInterval(function () {
        count--;
        getVerifyCode.value = count;
        if (count === 0) {
            clearInterval(intervalFlag);
            getVerifyCode.value = '获取验证码';
            count = 60;
        }
    }, 1000);
}

$(function(){
  $("#getVerifyCode").click(function () {
    var userText = $("#userName").val();
      $.ajax({
        type:"GET",
        url:"/identify/sendCode?username="+userText,
        success:function(result){
          if(result=="Y"){
            alert("验证码已发送至邮箱");
          }else{
            alert("发送失败");
        }},
        error:function(){
            alert("错误");
        }
      });
  });
});
