<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/complete.css">
<link rel="stylesheet" href="./css/resetPassword.css">
<!-- ホーム画面に3秒後遷移 content="秒数" -->
<meta http-equiv="refresh" content="3;URL=HomeAction">
<title>パスワード再設定完了</title>
</head>
<body>
		<div class="header-position">
			<jsp:include page="header.jsp" />
		</div>
		<div class="content">
			<div class="main">
				<div class="content2">
					<h1>パスワード再設定完了画面</h1>
					<p>パスワード再設定が完了しました。</p>
					<p>3秒後に自動的にホーム画面へ遷移します。</p>
					<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
					<a href='<s:url action="HomeAction" />'>ホーム画面へ</a>
				</div>
			</div>
			<div class="space"></div>
			<div class="push"></div>
		</div>

<jsp:include page="footer.jsp"/>

</body>
</html>
