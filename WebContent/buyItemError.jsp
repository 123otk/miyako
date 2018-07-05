<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="3;URL=HomeAction">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/complete.css">
<title>決済確認エラー画面</title>
</head>
<body>

<div class="header-position">
	<jsp:include page="header.jsp" />
</div>

<div class="content">
<div class="main">
	<div class="content2">
		<h1>エラーが発生しました。</h1>
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