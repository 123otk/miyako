var ball = document.getElementById("ball")
,bh = ball.offsetHeight
,bw = ball.offsetWidth
,left = ( window.innerWidth / 2 ) - ( bw / 2 )
,top = -ball.offsetHeight
,ground = ( window.innerHeight / 2 ) - ( bh / 2 );
ball.style.left = left + "px";
ball.style.top = top + "px";
var y = top
,b = ground
,v = 0
,R = 0.48;
function gravity() {
	y+= ++v;
	if( y >= b ) {
	  	y = b;
	  	v*= -R;
	  	if ( !~~v ) {
	  		clearInterval(g)
	  	}
	}
	document.getElementById("ball").style.top = y + "px";
}
var g = setInterval(gravity, 10);
y+= ++v;
document.getElementById("ball").style.top = y + "px";
if( y >= b ) {
  	y = b;
  	v*= -R;
  	if ( !~~v ) {
  		clearInterval(g)
  	}
}