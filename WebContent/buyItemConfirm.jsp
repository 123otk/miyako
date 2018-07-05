<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>決済確認</title>
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/buyItem.css">
<link rel="stylesheet" href="./css/complete.css">
</head>
<body>

	<div class="header-position">
		<jsp:include page="header.jsp" />
	</div>
	<div class="content">

		<div class="page-title">
			宛先選択
		</div>
		<div class="all">
		<s:if test="#session.destinationInfoDtoList.size()>0">
			<div class="rback">
			<s:iterator value="#session.destinationInfoDtoList" status="st">
			<s:if test="#st.count%2!=0">
			<div class="left">
			<table class="addresslist-table">

					<tr>
					<td>
						<s:property value="familyName"/><span> </span><s:property value="firstName"/><br>
					</td>
					<td>
						<s:property value="familyNamekana"/><span> </span><s:property value="firstNameKana"/><br>
					</td>
					<td>
						<s:property value="userAddress"/>
					</td>
					<td>
						<s:property value="phoneNumber"/>
					</td>
					<td>
						<s:property value="email"/>
					</td>
					<td>
						<s:if test="#st.index==0">
						<input type="radio" name="id" checked="checked" value="<s:property value='id'/>"/>
						</s:if><s:else>
						<input type="radio" name="id" value="<s:property value='id'/>"/>
						</s:else>
					</td>
					</tr>
			</table>
			</div>
			</s:if>
			</s:iterator>
			</div>

			<div class="lback">
			<s:iterator value="#session.destinationInfoDtoList" status="st">
			<s:if test="#st.count%2==0">
			<div class="right">
			<table class="addresslist-table">

					<tr>
					<td>
						<s:property value="familyName"/><span> </span><s:property value="firstName"/><br>
					</td>
					<td>
						<s:property value="familyNamekana"/><span> </span><s:property value="firstNameKana"/><br>
					</td>
					<td>
						<s:property value="userAddress"/>
					</td>
					<td>
						<s:property value="phoneNumber"/>
					</td>
					<td>
						<s:property value="email"/>
					</td>
					<td>
						<s:if test="#st.index==0">
						<input type="radio" name="id" checked="checked" value="<s:property value='id'/>"/>
						</s:if><s:else>
						<input type="radio" name="id" value="<s:property value='id'/>"/>
						</s:else>
					</td>
					</tr>

			</table>
			</div>
			</s:if>
			</s:iterator>
			</div>
		</s:if>
		<s:else>
			<div class="all">
				<div class="content2"><h3>宛先情報が登録されていません。</h3></div>
			</div>
		</s:else>
		</div>

		<div class="bg-large">
			<s:form action="BuyItemCompleteAction">
				<s:submit value="決済" class="big-button"/>
			</s:form>
            <h3>宛先情報の新規登録は
            <a href='<s:url action="AddressRegisterAction"/>'>こちら</a>。</h3>
		</div>
		<div class="space"></div>
		<div class="push"></div>
	</div>

<jsp:include page="footer.jsp"/>

</body>
</html>