<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/toppage.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="./js/ball.js" ></script>

<!-- ファビコン -->
	<link rel="shortcut icon" href="https://service.tree-web.net/icon_converter/icon/336427bb70e6cae75b73dc22babe6f14_l.ico"/>

<title>toppage</title>


</head>
<body>
<jsp:include page="sakura.jsp" />
<div class="serch">
	<h2></h2>
	<s:form id="form01" action="ProductSearchAction" name="form">
	<s:if test='#session.containsKey("categoryDtoList")'>
		<s:select name="categoryId" list="#session.categoryDtoList" listValue="categoryName" listKey="categoryId"/>
	</s:if>
		<s:textfield name="keywords" id="kensaku" size="15" placeholder="検索わぁど" />
		<s:submit value="押" id="button"/>
	</s:form>
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
  <a href="ProductInfoAction"><span></span></a>
  <a href="CartAction"><span></span></a>
  <s:if test="#session.logined==1">
    <a href="MyPageAction"><span></span></a>
  </s:if>
  <s:elseif test="#session.logined!=1">
    <a href="GoLoginAction"><span></span></a>
  </s:elseif>
  <a href="HomeAction"><span></span></a>

  <a href="ProductInfoAction"></a>
  <a href="CartAction"></a>
  <s:if test="#session.logined==1">
	<a href="MyPageAction" class="mypage"><span></span></a>
  </s:if>
  <s:elseif test="#session.logined!=1">
    <a href="GoLoginAction" class="login2"><span></span></a>
  </s:elseif>

  <div class="push"></div>

</div>

<jsp:include page="footer.jsp"/>

</body>
</html>
