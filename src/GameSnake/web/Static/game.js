
//will parse the game state
var socket = io.connect({transports: ['websocket']});
socket.on('gameState', parseGameState);

var tileSize = 30;

var canvas = document.getElementById("canvas");
var context = canvas.getContext("2d");
context.globalCompositeOperation = 'source-over';

function gameState(event) {
    var state = JSON.parse(event)
    drawCanvas(state['gridSize'])

}
function drawCanvas(size) {

}
function drawCircle(x, y, size, color) {
    
}