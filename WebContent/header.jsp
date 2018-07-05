<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/header.css">

<title>header</title>
<script>
function GoLoginAction(){
	document.getElementById("form").action="GoLoginAction";
}
function MyPageAction(){
	document.getElementById("form").action="MyPageAction";
}
function CartAction(){
	document.getElementById("form").action="CartAction";
}
function ProductInfoAction(){
	document.getElementById("form").action="ProductInfoAction";
}
function LogoutAction(){
	document.getElementById("form").action="LogoutAction";
}
function ProductSearchAction(){
	document.getElementById("form").action="ProductSearchAction";
}
</script>

</head>
<body>

<div id="contents">

<div id="header-logo">
<s:if test="#session.logined==2">
<b><a><img src="image/headerlogofinal2.jpg" width="90%" height="auto"></a></b>
	<br><br>
</s:if>
<s:else>
    <b><a href="HomeAction"><img src="image/headerlogofinal2.jpg" width="90%" height="auto"></a></b>
	<br><br>
</s:else>
</div>

<div id="header-menu">

<s:form id="form" name="form">
<s:if test="#session.logined==2">
	<s:submit value=" " class="submit_btn2" onclick="LogoutAction();"/>
</s:if>
<s:else>

	<s:if test='#session.containsKey("categoryDtoList")'>
		<s:select name="categoryId" list="#session.categoryDtoList" listValue="categoryName" listKey="categoryId" class="cs-div" id="categoryId"/>

	</s:if>
		<s:textfield name="keywords" class="txt-keywords" placeholder="検索わぁど" />
		<s:submit value="押" class="submit_btn" onclick="ProductSearchAction();"/>


	<s:if test="#session.logined==1">
		<s:submit value=" " class="submit_btn2" onclick="LogoutAction();"/>
	</s:if>
	<s:else>
		<s:submit value=" " class="submit_btn1" onclick="GoLoginAction();"/>
	</s:else>


		<s:submit value=" " class="submit_btn3" onclick="CartAction();"/>
		<s:submit value=" " class="submit_btn4" onclick="ProductInfoAction();"/>


	<s:if test="#session.logined==1">
		<s:submit value=" " class="submit_btn5" onclick="MyPageAction();"/>
	</s:if>

</s:else>
</s:form>

</div>

</div>

</body>
</html>
