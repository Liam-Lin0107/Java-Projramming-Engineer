function upload() {
    var canvas = document.getElementById("canvas1");
    var img = document.getElementById("fileInput");
    var newImage = new SimpleImage(img);
    newImage.drawTo(canvas);
}