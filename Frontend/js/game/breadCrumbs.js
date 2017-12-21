var bc = document.getElementById('breadCrumbs');
function init() {
    var bottomId = document.getElementById('bottom-id');
    var ul1 = document.createElement('ul');id="breadCrumbs"
    ul1.setAttribute('class', 'list-unstyled');
    ul1.setAttribute('id', 'menu');
    bottomId.appendChild(ul1);
    for (var i = 0; i < bottomText.length; i++) {
        var li = document.createElement('li');
        var a = document.createElement('a');
        li.innerHTML = bottomText[i];
        li.appendChild(a);
        ul1.appendChild(li);
     }
}

init();
