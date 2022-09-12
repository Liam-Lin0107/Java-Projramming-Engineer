function doSomething() {
  // pop up a little window on the browser
  alert('clicked button with JS function, and call the doSomething function');
}

function doConfirm() {
  // similar to alter but user can choose whether to continue 
  confirm('clicked confirm!!!')
}

function changeBackground() {
  var dd1 = document.getElementById("d1");
  var dd2 = document.getElementById("d2");

  dd1.className = "blueBack";
  dd2.className = "yellowBack";
}
function changeText() {
  var dd1 = document.getElementById("d1");
  var dd2 = document.getElementById("d2");
  
  dd1.innerHTML = "Yo~~~~~";
  dd2.innerHTML = "See ya!!!";
}