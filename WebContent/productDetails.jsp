<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Style-Type" content="text/css" />
        <meta http-equiv="Content-Script-Type" content="text/javascript" />
        <meta http-equiv="imagetoolbar" content="no" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
<link rel="stylesheet"  href="./css/style.css">
<title>商品詳細</title>
<style type="text/css">
.content{
margin-bottom:100px;
}
.item-image-box-320{
width:240px;
height:290px;
background-color:rgba(255, 255, 255, 0.7);
/* border:1px solid black; */
border-radius:20px;
position:absolute;
top:10px;
left:35px;
}
#choiced{
width:50%;
margin:5% 20%;
height:500px;
background-color:rgba(255, 255, 255, 0.7);
border-radius:20px;
border:solid #86473F;
border-width:4px 9px 7px 4px;
}
.left{
width:50%;
height:300px;
float:left;
text-align:center;
position:relative;
}
.right{
width:50%;
height:300px;
float:right;
text-align:center;
}
.bottomArea{
clear:both;
width:100%;
height:200px;
}
.name{
font-weight:bold;
font-size:25px;
}
.nameWrap{
margin-top:15px;
}
.companyWrap{
width:80%;
margin:0 auto;
height:80px;
position:relative;
}
.releaseCompanyName , .releaseDate{
position:absolute;
top:10px;
left:10px;
}
.releaseCompany {
position:absolute;
top:28px;
left:80px;
font-size:25px;
}
.releaseDateWrap{
width:80%;
margin:0 auto;
height:80px;
position:relative;
}
.releaseDay{
position:absolute;
top:28px;
left:72px;
font-size:23px;
}
.priceArea{
font-size:20px;
}
.detailsArea{
width:80%;
margin:0 auto;
height:50%;
line-height:100px;
text-align:center;
}
.addArea{
width:60%;
margin:0 auto;
height:50%;
position:relative;
}
.selectArea{
width:50%;
height:50%;
position:absolute;
top:10px;
}
.selectArea .selectTab{
position:absolute;
top:0;
right:38px;
}
#err{
position:absolute;
top:35px;
left:5px;
}
.addCart{
width:50%;
height:50%;
position:absolute;
top:10px;
left:235px;
}
#zaikoArea{
font-size:18px;
margin-top:10px;
}
#zaiko{
display:inline;
}
.submit{
text-align:center;
width:80%;
height:auto;
margin:0 auto;
padding:2%;
border-radius:15px;
cursor:pointer;
border:none;
color:white;
font-size:1.3vw;
background-color:#F17C67;
border-bottom:3px solid #86473F;
border-right:4px solid #86473F;
}
.kotiraosusume{
claer:both;
float:left;
width:30%;
height:auto;
margin:0 66% 3% 2%;
background-color:rgba(255, 255, 255, 0.7);
border-radius:20px;
/* border:1px solid black; */
border:solid #86473F;
border-width:4px 9px 7px 4px;
}
.kotiraosusume{
font-size:13px;
text-align:center;
}
.product-details-recommend-box{
clear:both;
width:100%;
/* float:right; */
margin:2%;
}
.item-image-box-100{
width:150px;
height:200px;
background:rgba(255,250,240,0.64);
margin-top:5px;
border-radius:15px;
}
.recommend-box{
float:left;
width:27%;
height:300px;
margin:0 2%;
text-align:center;
background-color:rgba(255, 255, 255, 0.7);
border-radius:20px;
border:solid #86473F;
border-width:4px 9px 7px 4px;
margin-left:2%;
}
.recommend-box:hover{
background-color:rgba(255, 255, 255, 0.7);
}
.reco{
position:relative;
}
.recoNameKana{
font-size:15px;
position:absolute;
top:3px;
right:0;
left:0;
}
.recoName{
font-size:20px;
position:absolute;
top:20px;
left:0;
right:0;
font-weight:bold;
}
.recoPrice{
position:absolute;
top:45px;
left:0;
right:0;
}
.recoDetails{
margin:0 auto;
position:absolute;
top:70px;
left:0%;
right:0;
width:100px;
background-color:#F17C67;
border-bottom:3px solid #86473F;
border-right:4px solid #86473F;
color:white;
}
.recoDetails a{
text-decoration:none;
color:white;
}
</style>
</head>
<body>
<div class="header-position">
<jsp:include page="header.jsp" />
</div>
<div class="content">
    <div id ="choiced">
        <s:form action="AddCartAction" name="form1">
        <div class="box">
            <div class="2column-container">
            <div class="left">
                <img src='<s:property value="%{#session.imageFilePath}" />/<s:property value="%{#session.imageFileName}"/>' class="item-image-box-320"/><br>
            </div>
            <div class="right">
            <div class="nameWrap"><div class="kana"><s:property value="%{#session.productNameKana}"/></div>
            <div class="name"><s:property value="%{#session.productName}"/></div>
            </div>
            <div class="companyWrap">   <div class="releaseCompanyName"><s:label value="発売会社名"/></div>
            <div class="releaseCompany"><s:property value="%{#session.releaseCompany}"/></div>
            </div>
            <div class="releaseDateWrap"><div class="releaseDate"><s:label value="発売年月日"/></div>
            <div class="releaseDay"><s:property value="%{#session.releaseDate}"/></div>
            </div>
            <div class="priceArea"><s:label value="値段" />&nbsp;&nbsp;&nbsp;<s:property value="%{#session.price}" />円<br>
            <div id="zaikoArea"><s:label value="在庫数"/>&nbsp;<div id="zaiko"><s:property value="%{#session.productStock}"/>個</div></div>
            </div>
            </div>
        </div>
        </div>
    <div class="bottomArea">
    <div class="detailsArea"><s:property value="%{#session.productDescription}"/>
    </div>
    <s:hidden name="productId" value="%{#session.productId}"/>
    <s:hidden name="productName" value="%{#session.productName}"/>
    <s:hidden name="productNameKana" value="%{#session.productNameKana}"/>
    <s:hidden name="imageFilePath" value="%{#session.imageFilePath}"/>
    <s:hidden name="imageFileName" value="%{#session.imageFileName}"/>
    <s:hidden name="price" value="%{#session.price}"/>
    <s:hidden name="productStock" value="%{#session.productStock}"/>
    <s:hidden name="releaseCompany" value="%{#session.releaseCompany}"/>
    <s:hidden name="releaseDate" value="%{#session.releaseDate}"/>
    <s:hidden name="productDescription" value="%{#session.productDescription}"/>
    <div class="addArea">
    <div class="selectArea">
    <div class="selectTab"><s:select name="productCount" list="%{#session.productCountList}" id="kosuu" style="width:50px; height:30px; font-size:20px; "/>個</div><br><span id="err"></span></div>
    <div class="addCart"><div class="submit_btn_box">
    <s:submit value="カートに追加" class="submit"/></div>
    </div>
    </div>
    </div>
    <s:token />
    </s:form>
    </div>
    <div class="kotiraosusume"><h1>こちらもおすすめ</h1></div>
    <div class="product-details-recommend-box">
    <s:iterator value="#session.productInfoDtoList">
<!--     <div class="recommend-contents"> -->
        <div class="recommend-box">
            <a href='<s:url action="ProductDetailsAction">
            <s:param name="productId" value="%{productId}"/>
            </s:url>'><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-100"/></a><br>
        <div class="reco"><div class="recoNameKana"><s:property value="productNameKana"/></div><br>
        <div class="recoName"><s:property value="productName"/></div><br>
        <div class="recoPrice"><s:property value="price"/>円</div><br>
        <div class="recoDetails"><a href='<s:url action="ProductDetailsAction">
        <s:param name="productId" value="%{productId}"/>
        </s:url>' class="detailsBtn">詳細</a></div><br>
        </div>
        </div>
<!--     </div> -->
    </s:iterator>
    </div>
<br><br>
<div class="space"></div>
<div class="push"></div>
</div>
<s:include value="footer.jsp"/>
<!--     <form action="CartAction"> -->
<!--     <input type="submit" value="カートへ"></form> -->
<script type="text/javascript">
    var btn = document.getElementById('btn');
    var zaiko = parseInt(document.getElementById('zaiko').textContent);
    var select = document.querySelector("#kosuu");
    var options = document.querySelectorAll("#kosuu option");
    var err = document.getElementById('err');
    console.log(btn);
    console.log(zaiko);
    console.log(select);
    console.log(options);
    console.log(err);
    if(zaiko == 0){
        err.textContent = " 売り切れでございます";
        err.style.color = "red";
        btn.disabled = true;
        select.disabled = true;
    }
    select.addEventListener('change', function(){
        var index = this.selectedIndex;
        if(index + 1 > zaiko){
            err.textContent = " 在庫がありません";
            err.style.color = "red";
            btn.disabled = true;
        }else{
            if(err.textContent != null){
                err.textContent = "";
            }
            btn.disabled = "";
        }
    });
</script>
</body>
</html>