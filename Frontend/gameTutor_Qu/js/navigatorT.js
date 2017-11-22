// var liLength=3;
// var aHref=["","signIn.html",""];
// var aText=["博客","寻找先生","个人中心"];
function navigatorLoad(aHref,aText,liLength){
  var gameDiv=document.getElementById("gameDiv");
  var nav=document.createElement("nav");
  nav.classList.add("navbar", "navbar-default", "navbar-fixed-top","m-b-n");
  if (gameDiv.children[0]) {
      gameDiv.insertBefore(nav, gameDiv.children[0]);
  } else {
      gameDiv.appendChild(nav);
  }
  var containerDiv=document.createElement("div");
  containerDiv.classList.add("container-fluid");
  gameDiv.appendChild(containerDiv);
  var gameLogoDiv=document.createElement("div");
  gameLogoDiv.classList.add("gameLogo");
  containerDiv.appendChild(gameLogoDiv);
  var navbar=document.createElement("div");
  navbar.classList.add("navbar-right","input-group");
  var ul=document.createElement('ul');
  ul.id="menu";
  navbar.appendChild(ul);
  for(var i=0; i<3;i++){
    var li=document.createElement("li");
    ul.appendChild(li);
    var aT=document.createElement("a");
    aT.href=aHref[i];
    aT.innerHTML = aText[i];
    li.appendChild(aT);
  }
}