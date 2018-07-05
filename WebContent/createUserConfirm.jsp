<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/addressRegister.css">
<link href="http://www.flopdesign.com/freefont/utsukushi-mincho-font.html" rel="stylesheet" />
<title>登録内容確認</title>
</head>
<body>

<div class="header-position">
	<jsp:include page="header.jsp"/>
</div>

<div class="content">

	<div class="bg-large">
		<div class="heading">
			<p>ユーザ情報登録</p>
		</div>
<h3>以下の通り登録してもよろしいでしょうか？</h3>
<s:form action="CreateUserCompleteAction">
<table class="vertical-list-table">
<tr>
	<th scope="row"><s:label value="姓：" class="items"/></th>
	<td><s:property value="familyName"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="名："/></th>
	<td><s:property value="firstName"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="姓(ふりがな)："/></th>
	<td><s:property value="familyNameKana"/></td>
</tr>
<tr>
<th scope="row"><s:label value="名(ふりがな)："/></th>
<td><s:property value="firstNameKana"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="性別："/></th>
	<td><s:property value="sex"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="メールアドレス："/></th>
	<td><s:property value="email"/></td>
</tr>
<tr>
	<th scope="row"><s:label value="ログインID："/>
	<td><s:property value="loginId"/>
</tr>
<tr>
	<th scope="row"><s:label value="パスワード："/>
	<td><s:property value="password"/>
</tr>
</table>
<div class="submit_btn_box">
<div id=".contents-btn-set">
<s:submit value="登録" class="big-button" />
</div>
</div>
<s:hidden name="loginId" value="%{loginId}"/>
<s:hidden name="password" value="%{password}"/>
<s:hidden name="familyName" value="%{familyName}"/>
<s:hidden name="firstName" value="%{firstName}"/>
<s:hidden name="familyNameKana" value="%{familyNameKana}"/>
<s:hidden name="firstNameKana" value="%{firstNameKana}"/>
<s:if test='sex.equals("男性")'>
<s:hidden name="sex" value="0"/>
</s:if>
<s:if test='sex.equals("女性")'>
<s:hidden name="sex" value="1"/>
</s:if>
<s:hidden name="email" value="%{email}"/>
</s:form>

</div>
<div class="push"></div>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>