<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<!-- <link rel="stylesheet" href="./css/resetPassword.css"> -->
<title>パスワード再設定</title>
</head>
<body>
	<div class="header-position">
		<jsp:include page="header.jsp" />
	</div>
	<div class="content">
		<div class="page-title">パスワード再設定</div>
		<div class="bg-large">

			<p>以下の項目を入力してください。</p>









			<s:form action="ResetPasswordConfirmAction">


				<table class="vertical-list-table">
					<tr>
						<th scope="row"><s:label value="ログインID：" /></th>
						<td><s:textfield name="loginId" placeholder="ログインID"
								class="input" /><br> <s:if
								test="!#session.loginIdErrorMessageList.isEmpty()">

								<div class="error-message">
									<s:iterator value="#session.loginIdErrorMessageList">
										<s:property />
										<br>
									</s:iterator>
								</div>

							</s:if></td>
					</tr>



					<tr>
						<th scope="row"><s:label value="現在のパスワード：" /></th>
						<td><s:password name="password" placeholder="現在のパスワード"
								class="input" /><br> <s:if
								test="!#session.passwordErrorMessageList.isEmpty()">

								<div class="error-message">
									<s:iterator value="#session.passwordErrorMessageList">
										<s:property />
										<br>
									</s:iterator>
								</div>

							</s:if> <s:if
								test="!#session.passwordIncorrectErrorMessageList.isEmpty()">

								<div class="error-message">
									<s:iterator value="#session.passwordIncorrectErrorMessageList">
										<s:property />
										<br>
									</s:iterator>
								</div>

							</s:if></td>
					</tr>



					<tr>
						<th scope="row"><s:label value="新しいパスワード：" /></th>
						<td><s:password name="newPassword" placeholder="新しいパスワード"
								class="input" /><br> <s:if
								test="!#session.newPasswordErrorMessageList.isEmpty()">

								<div class="error-message">
									<s:iterator value="#session.newPasswordErrorMessageList">
										<s:property />
										<br>
									</s:iterator>
								</div>

							</s:if> <s:if
								test="!#session.newPasswordIncorrectErrorMessageList.isEmpty()">

								<div class="error-message">
									<s:iterator
										value="#session.newPasswordIncorrectErrorMessageList">
										<s:property />
										<br>
									</s:iterator>
								</div>

							</s:if></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="（再確認用）：" /></th>
						<td><s:password name="confirmNewPassword"
								placeholder="新しいパスワード（再確認用）" class="input" /><br> <s:if
								test="!#session.confirmNewPasswordErrorMessageList.isEmpty()">

								<div class="error-message">
									<s:iterator value="#session.confirmNewPasswordErrorMessageList">
										<s:property />
										<br>
									</s:iterator>
								</div>

							</s:if></td>
					</tr>


				</table>
				<s:submit value="パスワード再設定" class="big-button2" />
			</s:form>
		</div>
		<div class="space"></div>
		<div class="push"></div>
	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>