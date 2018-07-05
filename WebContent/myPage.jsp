<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/style.css">
		<link rel="stylesheet" href="./css/mypage.css">
		<title>マイページ</title>
</head>

<body>

<!--ヘッダー挿入  -->
<div class="header-position">
<jsp:include page="header.jsp" />
</div>


<!-- 独立型画面 -->
<div class="content">
<div class="page-title">マイページ</div>


	<s:form action="PurchaseHistoryAction">

	<!--大枠 -->
	<div class="bg-large">

		<div class="MypageName">
			<!--性  -->
			<s:property  value="#session.familyName" />
			<!--名  -->
			<s:property value="#session.firstName"/><br><br>
			<!--ふりがな-->
			<s:property value="#session.familyNameKana"/>
			<s:property value="#session.firstNameKana"/><br><br>
		</div>


		<table class="mypage-table">

			<tr>
				<th scope="row">性別：</th>
				<td><s:if test="#session.sex==0">男性</s:if>
						<s:if test="#session.sex==1">女性</s:if></td>
			</tr>

			<tr>
				<th scope="row"><span>メールアドレス：</span></th>
				<td><s:property value="#session.email"/></td>
			</tr>

		</table>


	</div><!--閉 大枠  -->

	<!--履歴ボタン -->
	<div class="button">
	<s:submit value="購入履歴" class="big-button"/>
	</div>

	</s:form>

	<div class="space"></div>
	<div class="push"></div>

	</div>

<jsp:include page="footer.jsp"/>

</body>

</html>