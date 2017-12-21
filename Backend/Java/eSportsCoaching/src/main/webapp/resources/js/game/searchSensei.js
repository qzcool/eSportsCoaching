var listView = document.getElementById('listSensei')﻿;
var largeView = document.getElementById('largeSensei');
var senseiListArea = document.getElementById('senseiListArea');
var class1='col-xs-3',class2='col-xs-12',class3='marginDesign-senseiList';
function createDiv(){
  var div1 = document.createElement('div');
  addClass(div1,class1);
  addClass(div1,class3);
  senseiListArea.appendChild(div1);
  var img1 = document.createElement('img');
  addClass(img1,'img-responsive');
  img1.src= "/resources/images/game0.png";
  img1.id='sensei';
  div1.appendChild(img1);
  listView.onclick = function(){
    changeClass(div1, class1, class2);
  };
  largeView.onclick = function(){
    changeClass(div1, class2, class1);
  };
  img1.onclick = function(){
      window.location.href='/account/sensei/senseiDetail.html';
  };
}

/*add class cls to obj*/
function addClass(obj, cls){
    var obj_class = obj.className,
    blank = (obj_class != '') ? ' ' : '';
    added = obj_class + blank + cls;
    obj.className = added;
}
/*remove class cls to obj*/
function removeClass(obj, cls){
    var obj_class = ' '+obj.className+' ';
    obj_class = obj_class.replace(/(\s+)/gi, ' '),
    removed = obj_class.replace(' '+cls+' ', ' ');
    removed = removed.replace(/(^\s+)|(\s+$)/g, '');
    obj.className = removed;
}

/*change class cls to target*/
function changeClass(obj, cls, target){
  removeClass(obj,cls);
  addClass(obj,target);
}

createDiv();
