var gameNameOptions=["王者荣耀","英雄联盟"];
var users=[{
  name:"qxy",
  pwd:"123456"
}]



/*check user name and user password in sign in*/
function checkUserInfo(){
    var userText=document.getElementById("userName").value;
    var pwdText=document.getElementById("userPwd").value;
    if(userText==='' || pwdText===''){
      alert('请输入您的用户名或密码');
      return;
    }
    for(var i=0; i<users.length; i++){
      if(users[i].name===userText){
          if(pwdText === users[i].pwd){
             alert('登录成功');
          }else{
             alert('用户名或密码错误');
          }
          return;
      }
    }

}

function signUpUser(){
    window.location.href='signup.html';
}
/*add optional games*/
function addOptionsForSelect(){
    var gameOptional=document.getElementById("gameOptional");
    if(!gameOptional){return;}
    for(var i=0; i< gameNameOptions.length; i++){
      var option=document.createElement("option");
      option.innerHTML=gameNameOptions[i];
      gameOptional.appendChild(option);
    }
}
addOptionsForSelect();
