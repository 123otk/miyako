<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/addressRegister.css">
<link
	href="http://www.flopdesign.com/freefont/utsukushi-mincho-font.html"
	rel="stylesheet" />

<title>addressRegister</title>

</head>
<body>

	<div class="header-position">
		<jsp:include page="header.jsp" />
	</div>

	<div class="content">
	<div class="page-title">宛先情報登録</div>
		<div class="bg-large">

			<p>以下の項目を入力してください。</p>

			<div>
				<s:form action="AddressRegiConfirmAction">
					<table class="vertical-list-table">
						<tr>
							<th scope="row"><s:label value="苗字：" /></th>
							<td><s:if test="familyName != null">
									<span><s:textfield name="familyName"
											value="%{#session.familyName}" placeholder="1文字以上16文字以下の全角漢字ひらがな半角英字で"
											class="input" size="35" /></span>
								</s:if> <s:else>
									<span><s:textfield name="familyName"
											value="%{#session.familyName}" placeholder="1文字以上16文字以下の全角漢字ひらがな半角英字で" class="input"
											size="35" /></span>
								</s:else><br>
							<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.familyNameErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th scope="row">名前：</th>
							<td><s:if test="firstName != null">
									<span><s:textfield name="firstName" value="%{#session.firstName}"
											placeholder="1文字以上16文字以下の全角漢字ひらがな半角英字で" class="input" size="35" /></span>
								</s:if> <s:else>
									<span><s:textfield name="firstName" value="%{#session.firstName}"
											placeholder="1文字以上16文字以下の全角漢字ひらがな半角英字で" class="input" size="35" /></span>
								</s:else><br>
							<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.firstNameErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th scope="row">苗字(ふりがな)：</th>
							<td><s:if test="familyNameKana != null">
									<span><s:textfield name="familyNameKana"
											value="%{#session.familyNameKana}" placeholder="1文字以上16文字以下の全角ひらがなで"
											class="input" size="35" /></span>
								</s:if> <s:else>
									<span><s:textfield name="familyNameKana"
											value="%{#session.familyNameKana}" placeholder="1文字以上16文字以下の全角ひらがなで"
											class="input" size="35" /></span>
								</s:else><br>
							<s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.familyNameKanaErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th scope="row">名前(ふりがな)：</th>
							<td><s:if test="firstNameKana != null">
									<span><s:textfield name="firstNameKana"
											value="%{#session.firstNameKana}" placeholder="1文字以上16文字以下の全角ひらがなで"
											class="input" size="35" /></span>
								</s:if> <s:else>
									<span><s:textfield name="firstNameKana"
											value="%{#session.firstNameKana}" placeholder="1文字以上16文字以下の全角ひらがなで"
											class="input" size="35" /></span>
								</s:else><br>
							<s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.firstNameKanaErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th scope="row">性別：</th>
							<td><input type="radio" name="sex" value="男性" checked>男性
								<input type="radio" name="sex" value="女性">女性</td>
						</tr>

						<tr>
							<th scope="row">住所：</th>
							<td><s:if test="address != null">
									<span><s:textfield name="address" value="%{#session.address}"
											placeholder="15文字以上50文字以下の全角漢字カタカナ半角英数字半角記号で" class="input" size="35" /></span>
								</s:if> <s:else>
									<span><s:textfield name="address" value="%{#session.address}"
											placeholder="15文字以上50文字以下の全角漢字カタカナ半角英数字半角記号で" class="input" size="35" /></span>
								</s:else><br>
							<s:if test="!#session.addressErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.addressErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th scope="row">電話番号：</th>
							<td><s:if test="phoneNumber != null">
									<span><s:textfield name="phoneNumber"
											value="%{#session.phoneNumber}" placeholder="10桁以上13桁以下の半角数字で" class="input"
											size="35" /></span>
								</s:if> <s:else>
									<span><s:textfield name="phoneNumber"
											value="%{#session.phoneNumber}" placeholder="10桁以上13桁以下の半角数字で" class="input"
											size="35" /></span>
								</s:else><br>
							<s:if test="!#session.phoneNumberErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.phoneNumberErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>

						<tr>
							<th scope="row">メールアドレス：</th>
							<td><s:if test="email != null">
									<span><s:textfield name="email" value="%{#session.email}"
											placeholder="18文字以上32文字以下の半角英数字半角記号で" class="input" size="35" /></span>
								</s:if> <s:else>
									<span><s:textfield name="email" value="%{#session.email}"
											placeholder="18文字以上32文字以下の半角英数字半角記号で" class="input" size="35" /></span>
								</s:else><br>
							<s:if test="!#session.emailErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.emailErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>




					</table>
					<s:submit value="登録内容確認" class="big-button" />
				</s:form>
			</div>
		</div>
		<div class="push"></div>
	</div>

<jsp:include page="footer.jsp"/>

</body>
</html>