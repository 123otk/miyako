<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">

<title>addressRegiConfirm</title>

<style>

a{
text-decoration: none;
}

</style>

</head>
<body>
<div class="header-position">
<jsp:include page="header.jsp" />
</div>
<div class="content">
<s:form action="AddressRegiCompleteAction">
<div class="bg-large">

<p>以下の内容で登録してもよろしいでしょうか？</p>
<table class="vertical-list-table ">
	<tr>
		<th><s:label value="姓：" class="items" /></th>
		<td><s:property value="familyName" /></td>
	</tr>
	<tr>
		<th><s:label value="名：" /></th>
		<td><s:property value="firstName" /></td>
	</tr>
	<tr>
		<th><s:label value="姓(ふりがな)：" /></th>
		<td><s:property value="familyNameKana" /></td>
	</tr>
	<tr>
		<th><s:label value="名(ふりがな)：" /></th>
		<td><s:property value="firstNameKana" /></td>
	</tr>
	<tr>
		<th><s:label value="性別：" /></th>
		<td><s:property value="sex" /></td>
	</tr>
	<tr>
		<th><s:label value="住所：" /></th>
		<td><s:property value="address" /></td>
	</tr>
	<tr>
		<th><s:label value="電話番号：" /></th>
		<td><s:property value="phoneNumber" /></td>
	</tr>
	<tr>
		<th><s:label value="メールアドレス：" /></th>
		<td><s:property value="email" /></td>
	</tr>
</table>
<a href="<s:url action='AddressRegisterAction'/>" class="big-button" ><b>訂正</b></a>
<a href="<s:url action='AddressRegiCompleteAction'/>" class="big-button" ><b>登録</b></a>
</div>
</s:form>
<div class="push"></div>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>