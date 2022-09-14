var inputImg = null, canvas;

function loadImage() {
    inputImg = document.getElementById("inputImg");
    var img = new SimpleImage(inputImg);
    canvas = document.getElementById("can1");
    img.drawTo(canvas);
}