var gameNameI = document.getElementById('gameNameI');
var gameList = document.getElementById('gameList');
var disable = false;
gameList.style.display = 'none';
function showOrHide() {
    if (disable) {
        gameList.style.display = 'none';
        disable = false;
    } else {
        gameList.style.display = 'block';
        disable = true;
    }
} 