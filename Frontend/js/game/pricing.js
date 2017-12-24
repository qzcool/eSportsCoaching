var inputP = document.getElementById('inputPricing');
var plusButton = document.getElementById('plusButton');
var minusButton = document.getElementById('minusButton');
var valueInput;

plusButton.onclick = function (){
  valueInput = Number(inputP.value)*100;
  valueInput += 100;
  var tmp = Math.round(valueInput)/100;
  inputP.value = tmp.toFixed(2);
};

minusButton.onclick = function(){
  valueInput = Number(inputP.value)*100;
  valueInput -= 100;
  var tmp = Math.round(valueInput)/100;
  if(tmp<=5){return;}
  inputP.value = tmp.toFixed(2);
};
