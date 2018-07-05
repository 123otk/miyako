
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<!-- <link rel="stylesheet" href="./css/createUser.css"> -->
<link
	href="http://www.flopdesign.com/freefont/utsukushi-mincho-font.html"
	rel="stylesheet" />
<title>ユーザー登録</title>
</head>
<body>

<div class="header-position">
	<jsp:include page="header.jsp" />
</div>


		<div class="content">
		<div class="page-title">ユーザ情報登録</div>
			<div class="bg-large">
				<p>以下の項目を入力してください。</p>

				<s:form action="CreateUserConfirmAction">

					<table class="vertical-list-table">
						<tr>
							<th scope="row"><s:label value="姓：" /></th>
							<td><s:textfield name="familyName"
									value="%{#session.familyName}" label="姓"
									placeholder="１文字以上１６文字以下の全角漢字ひらがな半角英字" class="input" /><br>
							<s:if test="!#session.familyNameErrorList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.familyNameErrorList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th><s:label value="名：" /></th>
							<td><s:textfield name="firstName"
									value="%{#session.firstName}" label="名"
									placeholder="１文字以上１６文字以下の全角漢字ひらがな半角英字" class="input" /><br>
							<s:if test="!#session.firstNameErrorList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.firstNameErrorList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th><s:label value="姓ふりがな：" /></th>
							<td><s:textfield name="familyNameKana"
									value="%{#session.familyNameKana}" label="姓ふりがな"
									placeholder="１文字以上１６文字以下の全角ひらがな" class="input" /><br>
							<s:if test="!#session.familyNameKanaErrorList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.familyNameKanaErrorList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						<tr>
							<th><s:label value="名ふりがな：" /></th>
							<td><s:textfield name="firstNameKana"
									value="%{#session.firstNameKana}" label="名ふりがな"
									placeholder="１文字以上１６文字以下の全角ひらがな" class="input" /><br>
							<s:if test="!#session.firstNameKanaErrorList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.firstNameKanaErrorList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>

							<th><s:label value="性別：" /></th>
							<td><s:radio name="sex" list="%{#session.sexList}"
									value="%{#session.sex}" placeholder="性別" /></td>

						</tr>
						<tr>
							<th><s:label value="メールアドレス：" /></th>
							<td><s:textfield name="email" value="%{#session.email}"
									label="メールアドレス" placeholder="18文字以上32文字以下の半角英数字 半角記号"
									class="input" /><br>
							<s:if test="!#session.emailErrorList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.emailErrorList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th><s:label value="ログインID：" /></th>
							<td><s:textfield name="loginId" value="%{#session.loginId}"
									label="ログインID" placeholder="1文字以上8文字以下の半角英数字" class="input"/><br>
							<s:if test="!#session.loginIdErrorList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.loginIdErrorList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
	                        <th><s:label value="パスワード：" /></th>
	                        <td><s:password name="password" value=""
			                        label="パスワード" placeholder="1文字以上8文字以下の半角英数字" class="input"/><br>
	                        <s:if test="!#session.passwordErrorList.isEmpty()">
	                        		<div class="error">
										<div class="error-message">
											<s:iterator value="#session.passwordErrorList">
												<s:property />
												<br>
											</s:iterator>
										 </div>
									</div>
								</s:if></td>
	                    </tr>

						<tr></table>


					<s:submit value="登録" class="big-button" />
				</s:form>
			</div>
			<div class="push"></div>
		</div>

<jsp:include page="footer.jsp"/>

</body>
</html>


