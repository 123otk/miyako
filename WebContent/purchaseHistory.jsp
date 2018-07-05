<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/style.css">
	<link rel="stylesheet" href="./css/complete.css">
	<link rel="stylesheet" href="./css/purchaseHistory.css">
	<title>商品購入履歴</title>
</head>

<body>

<!-- ヘッダー挿入 -->
<div class="header-position">
<jsp:include page="header.jsp" />
</div>


<!-- 独立型画面 -->
<div class="content">

<div class="page-title">商品購入履歴</div>


<s:if test="#session.purchaseHistoryInfoDTOList.size()>0">


<s:iterator value="#session.purchaseHistoryInfoDTOList">

<div class="bg-medium">


<div class="boxLeft">
	<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'/>
</div>



<div class="boxRight">

	<p class="kana"><s:property value="kana"/></p>


	<h3 class="productName"><s:property value="productName"/></h3><br>

	<p><s:property value="companyName"/></p>

	<p><s:property value="buyDate"/></p><br>

	<p><s:property value="price"/>円</p>

</div>


</div>
</s:iterator>




<!-- <div class="submit_btn_box">
<div id=".contents-btn-set"> -->

<!-- 履歴削除処理 -->
<div class="space"></div>
<s:form action="DeletePurchaseHistoryAction">

<div class="db">
				<input type="hidden" name="deleteFlg" value="1">
				<s:submit value="全件削除" method="delete" class="big-button" />
</div>
</s:form>


</s:if>
<s:else>
<div class="main">
	<div class="content2"><h2>購入商品がありません。</h2></div>
</div>
</s:else>
<div class="space"></div>
<div class="push"></div>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>