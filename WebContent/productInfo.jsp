

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/complete.css">
<link rel="stylesheet" href="./css/header.css">
<link rel="stylesheet" href="./css/login.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>商品一覧</title>

</head>

<body>

<div class="header-position">
<jsp:include page="header.jsp" />
</div>


<div class="content">
<s:if test="#session.logined == 2">
	<div class="main">
		<div class="content2">
			<h2>管理者でログインしてるため、商品を買うことはできません。</h2><br>
<%-- 			<a href="<s:url action="LoginAction"/><s:param name='loginId' value='admin'/><s:param name='password' value='admin'/>">戻る</a> --%>
			<s:form action="LoginAction">
				<s:hidden name='loginId' value='admin'></s:hidden>
				<s:hidden name='password' value='admin'></s:hidden>
				<div class="small-buttom">
				<s:submit value="戻る" />
				</div>
			</s:form>

		</div>

	</div>
</s:if>
<s:else>
<s:if test="productInfoDtoList==null">

<div class="main">
	<div class="content2"><h3>検索結果がありません</h3></div>
</div>
</s:if>

<s:else>

<div class="page-title">商品一覧</div>

<div id="product-list">
<s:iterator value="#session.productInfoDtoList">
<s:form action="ProductDetailsAction" name="form1">
<s:param name="productId" value="%{productId}"/>

<div class="product-list-box" >

	<a href='<s:url action="ProductDetailsAction">
	<s:param name="productId" value="%{productId}"/></s:url>'>
	<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-200"/></a><br>
	<div class="proNameKana"><s:property value="productNameKana"/></div><br>
	<div class="proName"><s:property value="productName"/></div><br>
	<div class="proPrice"><span class="pri"><s:property value="price" /></span>円</div><br>
	<div class="toDetails"><a href='<s:url action="ProductDetailsAction">
	<s:param name="productId" value="%{productId}" />
	</s:url>'>詳細</a></div><br>

</div>
</s:form>
</s:iterator>
</div>
<div class="pager">

<s:iterator begin="1" end="#session.totalPageSize" status="pageNo">
	<s:if test="#session.currentPageNo == #pageNo.count">
		<s:property value="%{#pageNo.count}"/>
	</s:if>

	<s:elseif test="categoryId == null">
	<a href="<s:url action='ProductSearchAction'><s:param name='pageNo' value='%{#pageNo.count}'/><s:param name='categoryId' value='1'/></s:url> ">	<s:property value="%{#pageNo.count}"/></a>
</s:elseif>
	<s:else>

		<a href="<s:url action='ProductSearchAction'><s:param name='pageNo' value='%{#pageNo.count}'/><s:param name='categoryId' value='%{categoryId}'/></s:url> ">	<s:property value="%{#pageNo.count}"/></a>

	</s:else>
</s:iterator>
</div>
</s:else>
</s:else>
<div class="space"></div>
<div class="push"></div>
</div>

<footer>
<jsp:include page="footer.jsp"/>
</footer>


<script type="text/javascript">
for(var i=0; i<document.getElementsByClassName('pri').length;i++){
var befPrice = document.getElementsByClassName('pri')[i].textContent;
var aftPrice = parseInt(befPrice).toLocaleString();
document.getElementsByClassName('pri')[i].innerHTML = aftPrice;
}
for(var j=0;j<document.getElementsByClassName('product-list-box').length;j++){
var productListBox = document.getElementsByClassName('product-list-box')[j];

productListBox.addEventListener('click', function(){
	console.log();
	if(j=5){
		j=0;
	}
});
}


</script>


</body>
</html>