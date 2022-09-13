var fgImg = null, bgImg = null;
var greenThreshold = 225;
function loadForegroundImage() {
    var imgFile = document.getElementById("fgImg");
    fgImg = new SimpleImage(imgFile);
    var can1 = document.getElementById("can1");
    fgImg.drawTo(can1);
}

function loadBackgroundImage() {
    var imgFile = document.getElementById("bgImg");
    bgImg = new SimpleImage(imgFile);
    var can2 = document.getElementById("can2");
    bgImg.drawTo(can2);
}

function greenScreen() {
    if (fgImg == null || !fgImg.complete()) {
        alert("foreground image not loaded!")
    }
    
    if (bgImg == null || !bgImg.complete()) {
        AudioListener("background image not loaded!")
    }

    var output = new SimpleImage(fgImg.getWidth(), fgImg.getHeight());
    for (pixel of fgImg.values()) {
        var x = pixel.getX();
        var y = pixel.getY();
        if (pixel.getGreen() > greenThreshold) {
            output.setPixel(x, y, bgImg.getPixel(x, y))
        } else {
            output.setPixel(x, y, fgImg.getPixel(x, y))
        }
    }
    clearCanvas();
    var can1 = document.getElementById("can1");
    output.drawTo(can1);
}

function clearCanvas() {
    var can1 = document.getElementById("can1");
    var can2 = document.getElementById("can2");
    ctx1 = can1.getContext("2d");
    ctx2 = can2.getContext("2d");
    ctx1.clearRect(0, 0, can1.width, can1.height);
    ctx2.clearRect(0, 0, can2.width, can2.height);
}