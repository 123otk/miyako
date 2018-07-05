<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/header.css">
<link rel="stylesheet" href="./css/login.css">
<title>ログイン</title>
</head>
<body>

	<div class="header-position">
		<jsp:include page="header.jsp" />
	</div>

	<div class="content">
		<div class="page-title">ログイン</div>
		<div class="bg-large">

			<h2>以下の項目を入力してログインをお願いいたします。</h2>
			<s:form action="LoginAction">


				<table class="vertical-list-table">
					<tr>
						<th scope="row"><s:label value="ログインID：" /></th>
						<td><s:if test="#session.checkLogin==true">
								<s:textfield name="loginId" class="input" placeholder="ログインID"
									value='%{#session.savedLoginId}' autocomplete="off" />
							</s:if> <s:else>
								<s:textfield name="loginId" class="input" placeholder="ログインID"
									autocomplete="off" />
							</s:else> <br>
							<div class="error-message">
								<s:property value="idErrorMessage" />
							</div></td>
					</tr>
					<tr>
						<td></td>

					</tr>

					<tr>
						<th scope="row"><s:label value="パスワード：" /></th>
						<td><s:password name="password" class="input"
								placeholder="パスワード" autocomplete="off" /><br>
							<div class="error-message">
								<s:property value="passwordErrorMessage" />
								<s:property value="LoginpasswordErrorMessage"/>
							</div></td>
					</tr>

				</table>
				<br>

				<div class="box">
					<s:if test="#session.checkLogin == true">
						<s:checkbox name="checkLogin" checked="checked" />
					</s:if>
					<s:else>
						<s:checkbox name="checkLogin" />
					</s:else>
					<b><s:label value="ログインID保存" /></b> <br>
					<br>
				</div>


				<div class="submit_btn_box">
					<s:submit class="big-button" value="ログイン" />
				</div>
			</s:form>
			<br> <b><s:label value="新規ユーザー登録は" /> <a
				href='<s:url action="CreateUserAction" />'>こちら</a></b> <br> <br>


			<b><s:label value="パスワードの再設定は" /> <a
				href='<s:url action="ResetPasswordAction" />'>こちら</a></b>
		</div>
		<div class="space"></div>
		<div class="push"></div>
	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>