<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="3;URL=HomeAction">
<title>決済完了</title>
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/complete.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<script type="text/javascript">
	function goDeleteCartAction() {
		document.getElementById("form").action = 'DeleteCartAction';
	}
</script>
<script>
$(function(){
	$(document).keydown(function(event){
		// クリックされたキーのコード
		var keyCode = event.keyCode;

		// ファンクションキーを制御する
		if(keyCode == 116 )// F5キーの制御
		{
			return false;
		}
	});
});
</script>


</head>
<body>

<div class="header-position">
	<jsp:include page="header.jsp" />
</div>
<div class="content">
<div class="main">
	<div class="content2">
		<h1>決済が完了しました<br><br></h1>
		<p>3秒後に自動的にホーム画面へ遷移します。</p>
		<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
		<a href='<s:url action="HomeAction" />'>ホーム画面へ</a>
	</div>
</div>
<div class="push"></div>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>