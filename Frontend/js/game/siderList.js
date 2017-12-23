var courseList_text = ['我的课程', '我的评论', '免费课程'];
var walletList_text = ['账户余额', '交易记录'];
var preferenceList_text = ['个人信息', '账户设置'];

var leftBar = document.getElementById('leftBar');
var senseiFlag = false;

if(window.location.href.match(/\/sensei\//)){
  preferenceList_text = ['个人信息','账户设置','课程定价','时间表'];
  senseiFlag = true;
}

function init() {
    leftBar.innerHTML = '<div id="siderList1" class="listInfo"></div><div id="siderList2" class="listInfo"></div><div id="siderList3" class="listInfo"></div><p class="listClick" id="logOff">注销</p>'
    document.getElementById('logOff').onclick = function(){
      window.location.href = '../index.html';
    };
    var siderList1 = document.getElementById("siderList1");
    siderList1.innerHTML = '<div class="col-xs-12 sideTitle"><span class="fa fa-calendar fa-2x icon-color-profile col-xs-2 course-title"></span><h4 id="courseName" class="blueColor col-xs-10 course-title"></h4></div><ul id="courseList" class="siderList_text"><li class="listClick" id="calender"></li><li class="listClick" id="myReviews"></li><li class="listClick" id="getFreeLessons" style="display:block"></li></ul>';
    document.getElementById("courseName").innerHTML = '课程';
    document.getElementById("calender").onclick = function(){
      window.location.href = 'calender.html';
    };
    document.getElementById("myReviews").onclick = function(){
      window.location.href = 'myReviews.html';
    };
    document.getElementById("getFreeLessons").onclick = function(){
      window.location.href = 'getFreeLessons.html';
    };

    if(senseiFlag){
      document.getElementById("getFreeLessons").style.display = 'none';
    }

    var courseList_child = document.getElementById('courseList').children;
    for(var i = 0; i < courseList_child.length; i++){
      courseList_child[i].innerHTML = courseList_text[i];
    }

    var siderList2 = document.getElementById("siderList2");
    siderList2.innerHTML = '<div class="col-xs-12 sideTitle"><span class="fa fa-credit-card fa-2x icon-color-profile col-xs-2 course-title"></span><h4 id="walletName" class="blueColor col-xs-10 course-title"></h4></div><ul id="walletList" class="siderList_text"><li class="listClick" id="summary"></li><li class="listClick" id="history"></li></ul>';
    document.getElementById("walletName").innerHTML = '钱包';
    document.getElementById("summary").onclick = function(){
      window.location.href = 'summary.html';
    };
    document.getElementById("history").onclick = function(){
      window.location.href = 'history.html';
    };

    var walletList_child = document.getElementById('walletList').children;
    for(var i = 0; i < walletList_child.length; i++){
      walletList_child[i].innerHTML = walletList_text[i];
    }

    var siderList3 = document.getElementById("siderList3");
    siderList3.innerHTML = '<div class="col-xs-12 sideTitle"><span class="fa fa-cog fa-2x icon-color-profile col-xs-2 course-title"></span><h4 id="preferenceName" class="blueColor col-xs-10 course-title"></h4></div><ul id="preferenceList" class="siderList_text"><li class="listClick" id="profile"></li><li class="listClick" id="accountSetting"></li><li class="listClick" id="pricing" style="display:none"></li><li class="listClick" id="timeTable" style="display:none"></li></ul>';
    document.getElementById("preferenceName").innerHTML = '首选项';
    document.getElementById("profile").onclick = function(){
      window.location.href = 'profile.html';
    };
    document.getElementById("accountSetting").onclick = function(){
      window.location.href = 'accountSetting.html';
    };
    if(senseiFlag){
      document.getElementById("pricing").onclick = function(){
        window.location.href = 'pricing.html';
      };
      document.getElementById("pricing").style.display = 'block';
      document.getElementById("timeTable").onclick = function(){
        window.location.href = 'pricing.html';
      };
      document.getElementById("timeTable").style.display = 'block';
    }

    var preferenceList_child = document.getElementById('preferenceList').children;
    for(var i = 0; i < preferenceList_child.length; i++){
      preferenceList_child[i].innerHTML = preferenceList_text[i];
    }
}

init();
