<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="2;URL=ToppageAction">
<link rel="stylesheet" href="./css/toppage.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="./js/ball.js" ></script>

<!-- ファビコン -->
	<link rel="shortcut icon" href="https://service.tree-web.net/icon_converter/icon/336427bb70e6cae75b73dc22babe6f14_l.ico"/>

<title>pretoppage</title>
</head>
<body>
<jsp:include page="sakura.jsp" />
<div class="serch">
	<h2></h2>
	<form id="form01" action="ProductSearchAction">
	<input id="kensaku" type="text" placeholder="検索ワード" size="15"><input id="button" type="submit" value="検索">
	</form>
</div>
<div class="login">
	<s:if test="#session.logined==1">
		<h2></h2>
		<form id="form01" action="LogoutAction">
		<input id="button2" type="submit" value="ログアウト">
		</form>
	</s:if>
</div>

<div class="btn"></div>
<div class="wrap">
  <a href="ProductInfoAction"></a>
  <a href="CartAction"></a>
  <s:if test="#session.logined==1">
    <a href="LoginAction"></a>
  </s:if>
  <s:else>
    <a href="MyPageAction"></a>
  </s:else>
  <a href="HomeAction"></a>

  <a></a>
  <a></a>
  <s:if test="#session.logined==1">
	<a class="mypage"></a>
  </s:if>
  <s:else>
    <a class="login2"></a>
  </s:else>
  <div class="push"></div>
</div>

<jsp:include page="footer.jsp"/>

<div class="jsp">
<jsp:include page="fopen.jsp" />
</div>

</body>
</html>
