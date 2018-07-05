<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/header.css">
<link rel="stylesheet" href="./css/cart.css">
<link rel="stylesheet" href="./css/complete.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>カート</title>

<script type="text/javascript">
	function goDeleteCartAction() {
		document.getElementById("form").action = 'DeleteCartAction';
	}
</script>
<script>
$(function(){
	$(document).keydown(function(event){
		// クリックされたキーのコード
		var keyCode = event.keyCode;

		// ファンクションキーを制御する
		if(keyCode == 116 )// F5キーの制御
		{
			return false;
		}
	});
});
</script>

</head>
<body>

	<div class="header-position">
		<jsp:include page="header.jsp" />
	</div>

	<div class="content">

        <div class="cartlogo-box">
		<div class="page-title">カート</div>
        </div>

		<s:if test="#session.checkListErrorMessageList!=null">
			<div class="error">
				<div class="carterror-message">
					<s:iterator value="#session.checkListErrorMessageList">
						<s:property />
					</s:iterator>
				</div>
			</div>
		</s:if>
		<s:if test="#session.productStockZeroErrorList!=null">
		    <div class="error">
		         <div class="carterror-message">
		              <s:iterator value="#session.productStockZeroErrorList">
		                 <s:property />
		              </s:iterator>
		         </div>
		    </div>
		</s:if>
		<s:if test="#session.productStockMinusErrorList!=null">
		    <div class="error">
		         <div class="carterror-message">
		              <s:iterator value="#session.productStockMinusErrorList">
		                 <s:property />
		              </s:iterator>
		         </div>
		    </div>
		</s:if>

		<s:if test="#session.cartInfoDtoList.size()>0">
			<s:form id="form" action="BuyItemConfirmAction">
					<dl class="dl-list">
						<s:iterator value="#session.cartInfoDtoList">
							<dd class="dd-list">
				            <div class="cartbox">
								<div class="boxleft">
									<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="imagebox" />

								</div>
								<div class="boxright">
									<s:checkbox name="checkList" value="checked"
											fieldValue="%{productId}" />
									<span class="small_char">削除</span><br>
									<s:hidden name="productId" value="%{productId}" />



									<span class="small_char"><s:property value="productNameKana" /></span><br>
									<div class="bigchar"><s:property value="productName" /></div><br>



									<s:property value="releaseCompany" /><span>社</span><br>
									<s:property value="releaseDate" /><span>製</span><br>
									<span>価格:</span><s:property value="price" />円<br><br>
									<span>購入個数:</span><s:property value="productCount" />個<br><br>
									<div class="bigchar"><span>小計:</span><s:property value="subtotal" />
									円</div>
								</div>
								<s:hidden name="productName" value="%{productName}" />
								<s:hidden name="productNameKana" value="%{productNameKana}" />
								<s:hidden name="imageFilePath" value="%{imageFilePath}" />
								<s:hidden name="imageFileName" value="%{imageFileName}" />
								<s:hidden name="price" value="%{price}" />
								<s:hidden name="releaseCompany" value="%{releaseCompany}" />
								<s:hidden name="releaseDate" value="%{releaseDate}" />
								<s:hidden name="productCount" value="%{productCount}" />
								<s:hidden name="subtotal" value="%{subtotal}" />
				           </div>
							</dd>
						</s:iterator>
					</dl>
				<div class="cash-box">
				<div class="cash-content">

					<h2>
						<s:label value="カート合計金額 :" />
						<s:property value="#session.totalPrice" />
						円
					</h2>

					<div class="cart_btn_box">
						<div id="cart-btn-set">
							<s:submit value="決済" class="cart_submit_btn" />
						</div>
					</div>

					<div class="cart_btn_box">
						<div class="cart-btn-set">
							<s:submit value="削除" class="cart_submit_btn"
								onclick="this.form.action='DeleteCartAction';" />
						</div>
					</div>
				<div class="cart-warning">
				※カートから商品を削除する場合は削除したい商品にチェックを入れてください。
				</div>
				</div>
				</div>

			</s:form>
		</s:if>

		<s:else>
		<div class="main">
			<div class="content2"><h2>カート情報はありません。</h2></div>
		</div>
		</s:else>
		<div class="space"></div>
		<div class="push"></div>
	</div>

<jsp:include page="footer.jsp"/>

</body>
</html>