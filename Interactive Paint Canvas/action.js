var color = "black";
var radius = 50;
// only paint if mouse is being dragged (moved while the button is press)
var isPainting = false;

function setWidth(value) {
    var paintcanvas = document.getElementById("canvas1");
    if (isNumeric(value)) {
        paintcanvas.width = value;
    }
}

function setHeight(value) {
    var paintcanvas = document.getElementById("canvas1");
    if (isNumeric(value)) {
        paintcanvas.height = value;
    }
}

// verify the given value is actually a number
function isNumeric(value) {
    // standard JavaScript function to determine whether a string is an illegal number (Not-a-Number)
    return !isNaN(value);
}

function paintCircle(x, y) {
    // make sure to start a new circ
    var paintcanvas = document.getElementById("canvas1");
    var context = paintcanvas.getContext("2d");
    context.beginPath();
    // draw circle using a complete (2*PI) arc around give point
    context.arc(x, y, radius, 0, Math.PI * 2, true);
    context.fillStyle = color;
    context.fill();
}

function startPaint() {
    isPainting = true;
}

function endPaint() {
    isPainting = false;
}

function doPaint(x, y) {
    if (isPainting) {
        paintCircle(x, y);
    }
}

function clearCanvas() {
    var paintcanvas = document.getElementById("canvas1");
    var context = paintcanvas.getContext("2d");
    context.clearRect(0, 0, paintcanvas.width, paintcanvas.height);
}

function changeColor(newColor) {
    color = newColor;
}

function resizeBrush(newSize) {
    radius = newSize;
    var output = document.getElementById("sizeOutput");
    output.innerHTML = newSize;
}


