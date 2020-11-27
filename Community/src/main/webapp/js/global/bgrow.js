function rowmouseover(row) {
	row.style.cursor = "hand";
	row.style.backgroundColor = '#fffddd';
}
function rowmouseout(row, tr) {
	row.style.cursor = "hand";
	if (tr == "tr1") {
		//row.style.backgroundColor = '#FDFEFE';#eff5ff
		row.style.backgroundColor = '#FDFEFE';
	} else {
		row.style.backgroundColor = '#eff5f5';
	}
}
// 打开进度条
function processing() {
	if(document.getElementById("mesWindow")==null){
		var mesW = document.createElement("div");
		mesW.id = "mesWindow";
		mesW.className = "mesWindow";
		mesW.innerHTML = "<div class='mesWindowContent' id='mesWindowContent'><img src='/resource/images/global/load.gif' width='80px' height='80px'></img></div>";
		styleStr = "position:absolute;left:43%;top:40%;width:600px;background:none;border:none";
		mesW.style.cssText = styleStr;
		document.body.appendChild(mesW);
	}else{
		$("#mesWindowContent").show();
	}
}
// 关闭进度条
function closeProcessing() {
	$("#mesWindowContent").hide();
}
