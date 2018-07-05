 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta http-equiv="refresh" content="3;URL=HomeAction">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/addressRegister.css">
<link rel="stylesheet" href="./css/complete.css">
<link href="http://www.flopdesign.com/freefont/utsukushi-mincho-font.html" rel="stylesheet" />
<title>登録完了</title>
</head>
<body>

<div class="header-position">
	<jsp:include page="header.jsp" />
</div>

<div class="content">
<div class="main">
<div class="content2">
	<h1>登録完了画面</h1>
	<div class="success">
	ユーザー登録が完了しました。
	<p>3秒後に自動的にホーム画面へ遷移します。</p>
		<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
		<a href='<s:url action="HomeAction" />'>ホーム画面へ</a>
	</div>
</div>
</div>
<div class="push"></div>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>