<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>パスワード再設定確認</title>
</head>
<body>
		<div class="header-position">
			<jsp:include page="header.jsp" />
		</div>
		<div class="content">
		<div class="page-title">パスワード再設定確認</div>
			<div class="bg-large">
				<s:form action="ResetPasswordCompleteAction">
					<table class="vertical-list-table">
						<tr>
							<th>ログインID：</th>
							<td><s:property value="#session.loginId" /></td>
						</tr>
						<tr>
							<td style="height: 1.5em"></td>
						</tr>
						<tr>
							<th>新しいパスワード：</th>
							<td><s:property value="#session.concealedPassword" /></td>
						</tr>
					</table>
					<br>
					<s:submit value="再設定" class="big-button" />


				</s:form>
			</div>
			<div class="space"></div>
			<div class="push"></div>
		</div>

<jsp:include page="footer.jsp"/>
</body>
</html>