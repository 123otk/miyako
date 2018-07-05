function hoverItem(evt){
	var target=evt.target||window.event.srcElement;
	document.getElementById("evt").style.background="#FFFAFA";
}
function resetItem(evt){
	document.getElementById("evt").style.background="transparent";
}