var inputImg = null, canvas;

function loadImage() {
    inputImg = document.getElementById("inputImg").value;
    var img = new SimpleImage(inputImg);
    canvas = document.getElementById("can1");
    img.drawTo(canvas);
}