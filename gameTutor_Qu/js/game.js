function checkUserInfo(){
    if(document.getElementById("userName").innerHTML==='' || document.getElementById("userPwd").innerHTML===''){
      alert('请输入您的用户名或密码');
    }
}
