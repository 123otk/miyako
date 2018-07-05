<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/master.css">
<title>master</title>
</head>
<body>

<div class="header-position">
<jsp:include page="header.jsp" />
</div>

<div class=content>

<div class="page-title">在庫管理</div>


	<s:iterator value="productInfoDtoList" status="st">
	<div class="bg-medium">
	<s:form action="MasterAction">

	<div class="boxLeft">
		<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'/>
	</div>

	<div class="boxRight">
		<p class="kana"><s:property value="productNameKana" /></p>
		<h3 class="productName">
			<b><s:property value="productName" /></b>
		</h3>

		<span>カテゴリー:</span>

		<s:if test="categoryId==1">
		<span>1</span>
		</s:if>

		<s:elseif test="categoryId==2">
		<span>2</span>
		</s:elseif>

		<s:elseif test="categoryId==3">
		<span>3</span>
		</s:elseif>

		<p class="product">
			<p><s:property  value="price" />円</p>
			<span>在庫数:</span>
			<s:if test="productStock==0">
			<span>品切れ</span>
			</s:if>

			<s:elseif test="productStock>0">
			<span><s:property value="productStock" /></span>
			<s:hidden name="productStock"   value="%{productStock}"/>
			</s:elseif>
			<br>

			<div class="select-box">
				<select name="stock" class="stock">
				<s:iterator status="st" begin="1" end="100">
				<option value='<s:property value="#st.count"/>' />
				<s:property value="#st.count" />
				</s:iterator>
				</select>
			</div>

			<!--productIdは非表示で在庫変更に必要なため取得  -->
			<s:hidden name="productId"   value="%{productId}"/>

			<div>
				<button class="small-button" type='submit' name='stockFlg' value="1">在庫追加</button>
			</div>
	</div>
	</s:form>
	</div>

	</s:iterator>
	<div class="space"></div>
	<div class="push"></div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>