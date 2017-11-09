<%-- 
    Document   : index
    Created on : Oct 15, 2016, 1:11:49 PM
    Author     : HP
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="s" value="0"></c:set>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Men Shoes Fantastic</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
<!--Less styles -->
   <!-- Other Less css file //different less files has different color scheam
	<link rel="stylesheet/less" type="text/css" href="themes/less/simplex.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/classified.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/amelia.less">  MOVE DOWN TO activate
	-->
	<!--<link rel="stylesheet/less" type="text/css" href="themes/less/bootshop.less">
	<script src="themes/js/less.js" type="text/javascript"></script> -->
	
<!-- Bootstrap style --> 
    <link id="callCss" rel="stylesheet" href="themes/bootshop/bootstrap.min.css" media="screen"/>
    <link href="themes/css/base.css" rel="stylesheet" media="screen"/>
<!-- Bootstrap style responsive -->	
	<link href="themes/css/bootstrap-responsive.min.css" rel="stylesheet"/>
	<link href="themes/css/font-awesome.css" rel="stylesheet" type="text/css">
<!-- Google-code-prettify -->	
	<link href="themes/js/google-code-prettify/prettify.css" rel="stylesheet"/>
<!-- fav and touch icons -->
    <link rel="shortcut icon" href="themes/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="themes/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="themes/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="themes/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="themes/images/ico/apple-touch-icon-57-precomposed.png">
	<style type="text/css" id="enject"></style>
	<link href="themes/css/style.css" rel="stylesheet" type="text/css"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Flat Cart Widget Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--google fonts-->
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="themes/js/jquery-1.11.0.min.js">
	</script>

<script>
function deleteRow(r) {
    var i = r.parentNode.parentNode.rowIndex;
    document.getElementById("myTable").deleteRow(i);
}
</script>
  </head>
<body>
  <jsp:include page="menu.jsp"></jsp:include>

<div class="cart">
   <div class="cart-top">
   	  <div class="cart-experience">
   	  	 <h4>Shopping Cart Experience</h4>
   	  </div> 	 
   	  	 <div class="clear"> </div>
   	  </div>
   	 <div class="clear"> </div>
   </div>
   <div class="cart-bottom">
   	 <div class="table">
   	 	<table id="myTable">
   	 		<tbody>
   	 	      <tr  class="main-heading">	  	      	
		 			<th>Images</th>
		 			<th class="long-txt">Product Description</th>
		 			<th>Quantity</th>
		 			<th>Price</th>
		 			<th>Remove</th>
   	 	     </tr>
   	 	     
   	 	     <c:set var="a" value="0"></c:set>
   	 	     <c:forEach var="rows" items="${listCart}">		
				<c:set var="s" value="${s + rows.gia}"></c:set>
   	 	     <tr class="cake-top">
   	 	     	<td class="cakes">	 	     	  
   	 	     		<div class="product-img">
   	 	     			<img src="${pageContext.request.contextPath}/themes/images/products/${rows.hinh}" width="50%" height="50%"/>
   	 	     		</div>
   	 	        </td>
   	 	        <td class="cake-text">
   	 	     		<div class="product-text">
   	 	     			<h3>${rows.ten}</h3>
   	 	     			<p>Màu : ${rows.mau}</p>
   	 	     			<p>Size giày: ${rows.size}</p>
   	 	     			<p>Hãng giày: ${rows.hangsx}</p>
   	 	     		</div>
 	     	    </td>
 	     	    <td class="quantity"> 	 	     	 
   	 	     	  <div class="product-right">
   	 	     	  	<input min="1" type="number" id="quantity" name="quantity" value="${rows.soluong}" >		  
   	 	     	  </div>
   	 	     	</td>
   	 	     	<td class="price">
   	 	     		<h4>$${rows.gia}</h4>	
   	 	     	</td>
   	 	     	<td class="top-remove">
				<input type="button" value="Remove" onclick="deleteRow(this)">				
   	 	     	</td>
   	 	     	
   	 	     	</c:forEach>  	 	     	  	 	     	  	 	     
   	 	   </tbody>  	 	   
   	 	</table>
   	 </div>
   	 
   	 	<div class="dis-total">
   	 		<h1>Total ${s}</h1>
   	 		<div class="tot-btn">
   	 			<a class="shop" href="${pageContext.request.contextPath}/">Back to Shop</a>
   	 			<form action="${pageContext.request.contextPath}/hoadon/moi" method="post">
   	 			<input type="submit" value="Continue to Checkout">
   	 		</form>
   	 		</div>
   	 	</div>
   	   <div class="clear"> </div>
   	 </div>

  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
