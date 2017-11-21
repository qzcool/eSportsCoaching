var gameDiv=document.getElementById("gameDiv");
var nav=document.createElement("nav");
nav.classList.add("navbar", "navbar-default", "navbar-fixed-top","m-b-n");
gameDiv.appendChild(nav);
var containerDiv=document.createElement("div");
containerDiv.classList.add("container-fluid");
gameDiv.appendChild(containerDiv);
var gameLogoDiv=document.createElement("div");
gameLogoDiv.classList.add("gameLogo");
containerDiv.appendChild(gameLogoDiv);
var navbar=document.createElement("div");
navbar.classList.add("navbar-right"," input-group");
var ul=document.create
