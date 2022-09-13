var canvas, img, newImg;
function upload() {
    canvas = document.getElementById("canvas1");
    img = document.getElementById("fileInput");
    newImg = new SimpleImage(img);
    newImg.drawTo(canvas);
} 

function makeGray() {
    for (pixel of newImg.values()) {
        var avg = (pixel.getRed() + pixel.getBlue() + pixel.getGreen()) / 3;
        pixel.setRed(avg);
        pixel.setBlue(avg);
        pixel.setGreen(avg);
    }
    var canvas = document.getElementById("canvas1");
    newImg.drawTo(canvas);    
}