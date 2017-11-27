var gameNameOptions=["王者荣耀","英雄联盟","绝地求生"];
var users = [{
    name: "qxy",
    pwd: "123456",
    type: "STU"
}, {
    name: "yaya",
    pwd: "123456",
    type: "SEN"
}];


/*check user name and user password in sign in*/
function checkUserInfo(){
    var userText=document.getElementById("userName").value;
    var pwdText=document.getElementById("userPwd").value;
    if(userText==="" || pwdText===""){
      alert("请输入您的用户名或密码");
      return;
    }
    for(var i=0; i<users.length; i++){
      if(users[i].name===userText){
          if(pwdText === users[i].pwd){
              alert("登录成功");
              if (users[i].type === "STU") {
                  window.location.href = "gamer/profile.html";
              } else if (users[i].type === "SEN") {
                  window.location.href = "sensei/profile.html";
              }
          }else{
             alert("用户名或密码错误");
          }
          return;
      }
    }
}



function createCanlenderTable(){
    var tbodyForAvailablity;
    var gameid = document.getElementById('table-gamer-calender');
    var senseiId = document.getElementById('table-body-calender');
    if (gameid) {
        tbodyForAvailablity = gameid;
    } else {
        tbodyForAvailablity = senseiId;
    }
    var today = new Date();
    var year = today.getFullYear();      
    var month = today.getMonth() + 1;    
    var day = today.getDate();           
    var startDay = new Date(year, month - 1, 1).getDay();
    var nDays = new Date(year, month, 0).getDate();

    var numRow = 0;  
    var i;      
    var html = '';
    var indexRow = 0;
    html += '<tr>';
    for (i = 0; i < startDay; i++) {
        html += '<td></td>';
        numRow++;
    }
    var extra = (startDay + nDays) % 7;
    for (var j = 1; j <= nDays; j++) {
        if (j == day) {
            html += '<td style="color:red">';
            html += j;    
        }
        else {
            html += '<td>';
            html += j;    
        }
        html += '</td>';
        numRow++;
        if (numRow == 7) { 
            numRow = 0;
            indexRow++;        
            html += '</tr><tr>';
        }
    }
    if (tbodyForAvailablity) {
        tbodyForAvailablity.innerHTML = html;
    }
}
createCanlenderTable();

/**
 * sensei can set their available state
 */
function createAvailablityTable(){
    var tbodyForAvailablity = document.getElementById('table-body-availablity');
    var tableArray = new Array(24);
    if (tbodyForAvailablity) {
        for (var i = 0; i < 24; i++) {
            tableArray[i] = new Array();
            for (var j = 0; j < 7; j++) {
                tableArray[i][j] = i + ":00";
            }
        }
        for (var i = 0; i < 24; i++) {
            tableArray[i] = document.createElement("tr");
            tbodyForAvailablity.appendChild(tableArray[i]);   
            for (var j = 0; j < 7; j++) {
                tableArray[i][j] = document.createElement("td");
                tableArray[i].appendChild(tableArray[i][j]);   
                tableArray[i][j].innerHTML = i + ":00";
            }         
        }    
        
    }
}
createAvailablityTable();

function signUpUser(){
    window.location.href="signUp.html";
}
/*add optional games*/
function addOptionsForSelect(){
    var gameOptional = document.getElementById("gameOptional");
    var gameShow = document.getElementById("gameShow");
    if (!gameOptional || !gameShow){return;}
    for(var i=0; i< gameNameOptions.length; i++){
        var option=document.createElement("option");
        option.innerHTML=gameNameOptions[i];
        gameOptional.appendChild(option);
        var gamesDiv = document.createElement("div");
        gamesDiv.classList.add("pDisplayInline", "img_index");
        gameShow.appendChild(gamesDiv);
        var img = document.createElement("img");   
        img.src = "images/game" + i + ".png";
        img.classList.add("img-responsive");
        gamesDiv.appendChild(img);    
    } 
}
addOptionsForSelect();

/*set changePorfile button width*/
function changeProfileBtnWidth(){
  var cbw=document.getElement.getElementById("selectI");
  if(!cbw) return;

}

$(function(){
    $("#toggleFlag").click(function(){
     if($("#toggleFlag").text() === "<"){
       var leftPosition=-$("#leftBar").width()*0.7;
        $("#toggleFlag").text(">");
        $("#leftBar").animate({left:leftPosition},500);
        $(".needToggle").hide();
        $(".imageInline").css("float","right");
     }else{
        $("#toggleFlag").text("<");
        $("#leftBar").animate({left:"0px"},500);
        $(".needToggle").show();
        $(".imageInline").css("float","left");
     }
  });
  /*init element background color when click event hanppen*/
  var initColor = function(){
    $(".listClick").css("background-color","");
    $(".listClick").mouseover(function(){
    });
  }
  $(".listClick").click(function(){
     initColor();
     $(this).css("background-color","#69A53C");
  });

  /*link to matched page*/
  var locationArray=["unScheduled","calender","listView","myReviews","getFreeLessons","summary","mySubscription","history","userProfile","accountSetting","paymentOptions"]
  $("#course1").click(function(){

  });
  $("#signUpToSensei").click(function(){
      window.location.href="signUp.html";
  });
  
  $("#listSensei").click(function () {
      $(".needtoToggle")
  });
  $("#searchSenseiIndex").click(function () {
      window.location.href = "gamer/searchSensei.html";
  });
});
