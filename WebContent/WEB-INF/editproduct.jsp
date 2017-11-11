<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    <title>N-Air a E-commerce category Flat Bootstrap Responsive Website Template | Checkout :: w3layouts</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<meta charset utf="8">
		<!--fonts-->
		<link href='//fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>
		
		<!--fonts-->
		<!--bootstrap-->
			 <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
		<!--coustom css-->
			<link href="resources/css/style.css" rel="stylesheet" type="text/css"/>
        <!--shop-kart-js-->
        <script src="resources/js/simpleCart.min.js"></script>
		<!--default-js-->
			<script src="resources/js/jquery-2.1.4.min.js"></script>
		<!--bootstrap-js-->
			<script src="resources/js/bootstrap.min.js"></script>
		<!--script-->
         <!-- FlexSlider -->
            <script src="resources/js/imagezoom.js"></script>
              <script defer src="resources/js/jquery.flexslider.js"></script>
            <link rel="stylesheet" href="resources/css/flexslider.css" type="text/css" media="screen" />

            <script>
            // Can also be used with $(document).ready()
            $(window).load(function() {
              $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
              });
            });
            </script>
        <!-- //FlexSlider-->
    </head>
    <body>
        <div class="header">
            <div class="container">
                <div class="header-top">
                    <div class="logo">
                        <a href="${pageContext.request.contextPath}/">N-AIR</a>
                    </div>
                    <div class="login-bars">
                        <a class="btn btn-default log-bar" href="${pageContext.request.contextPath}/addUser" >Sign up</a>
                        <a class="btn btn-default log-bar" href="${pageContext.request.contextPath}/signup" >Login</a>
                        <div class="cart box_1">
                            <a href="checkout.html">
                            <h3>
                                <div class="total">
<span class="simpleCart_total"></span>(<span id="simpleCart_quantity" class="simpleCart_quantity"></span>)</div></h3>
                            </a>
                            <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                            <div class="clearfix"> </div>
                        </div>	
                    </div>
        <div class="clearfix"></div>
                </div>
                <!---menu-----bar--->
                <div class="header-botom">
                    <div class="content white">
                    <nav class="navbar navbar-default nav-menu" role="navigation">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <!--/.navbar-header-->

                        <div class="collapse navbar-collapse collapse-pdng" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav nav-font">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Shop<b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="products.html">Shoes</a></li>
                                        <li><a href="products.html">Tees</a></li>
                                        <li><a href="products.html">Tops</a></li>
                                        <li class="divider"></li>
                                        <li><a href="products.html">Tracks</a></li>
                                        <li class="divider"></li>
                                        <li><a href="products.html">Gear</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Men<b class="caret"></b></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <div class="row">
                                            <div class="col-sm-4 menu-img-pad">
                                                <ul class="multi-column-dropdown">
                                                    <li><a href="products.html">Joggers</a></li>
                                                    <li><a href="products.html">Foot Ball</a></li>
                                                    <li><a href="products.html">Cricket</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="products.html">Tennis</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="products.html">Casual</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-4 menu-img-pad">
                        <a href="#"><img src="images/menu1.jpg" alt="/" class="img-rsponsive men-img-wid" /></a>
                                            </div>
                                            <div class="col-sm-4 menu-img-pad">
                        <a href="#"><img src="images/menu2.jpg" alt="/" class="img-rsponsive men-img-wid" /></a>
                                            </div>
                                        </div>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Women<b class="caret"></b></a>
                                    <ul class="dropdown-menu multi-column columns-2">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <ul class="multi-column-dropdown">
                                                    <li><a href="products.html">Tops</a></li>
                                                    <li><a href="products.html">Bottoms</a></li>
                                                    <li><a href="products.html">Yoga Pants</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="products.html">Sports</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="products.html">Gym</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-6">
                        <a href="#"><img src="images/menu3.jpg" alt="/" class="img-rsponsive men-img-wid" /></a>
                                            </div>
                                        </div>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">kids<b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="products.html">Tees</a></li>
                                        <li><a href="products.html">Shorts</a></li>
                                        <li><a href="products.html">Gear</a></li>
                                        <li class="divider"></li>
                                        <li><a href="products.html">Watches</a></li>
                                        <li class="divider"></li>
                                        <li><a href="products.html">Shoes</a></li>
                                    </ul>
                                </li>
                                <li><a href="contact.html">Catch</a></li>
                                <div class="clearfix"></div>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <!--/.navbar-collapse-->
                        <div class="clearfix"></div>
                    </nav>
                    <!--/.navbar-->   
                        <div class="clearfix"></div>
                    </div>
                    <!--/.content--->
                </div>
                    <!--header-bottom-->
            </div>
        </div>
        <div class="head-bread">
            <div class="container">
                <ol class="breadcrumb">
                    <li><a href="index.html">Home</a></li>
                    <li><a href="register.html">LOGIN</a></li>
                    <li class="active">REGISTER</li>
                </ol>
            </div>
        </div>
        <!-- reg-form -->
	<div class="reg-form">
		<div class="container">
			<div class="reg">
				<h3>Edit Product</h3>
				<p>Welcome, please enter the following details to continue.</p>
				<p>If you have previously registered with us, <a href="#">click here</a></p>
				<form action="${pageContext.request.contextPath}/suasanpham">
            		 <ul>
						<li class="text-info">Mã Sản Phẩm: </li>
						<li><input type="hidden" value="${SP.ma}" name="ma"></li>
					</ul>
					<ul>
						<li class="text-info">Tên sản phẩm:: </li>
						<li><input type="text" value="${SP.ten}" name="ten"></li>
					</ul>
					<ul>
						<li class="text-info">Gía: </li>
						<li><input type="text" value="${SP.gia}" name="gia"></li>
					 </ul>	
					 <ul>
						<li class="text-info">Hinh: </li>
						<li><input type="file" value="${SP.hinh}" name="hinh"></li>
					</ul>			 
					<ul>
						<li class="text-info">Màu: </li>
						<li><input type="text" value="${SP.mau}" name="mau"></li>
					</ul>
					<ul>
						<li class="text-info">Size:</li>
						<li><input type="text" value="${SP.size}" name="size"></li>
					</ul>
					<ul>
						<li class="text-info">Hãng:</li>
						<li><input type="text" value="${SP.hangsx}" name="hangsx"></li>
					</ul>						
					<input type="submit" value="Edit Now">
				</form>
			</div>
		</div>
	</div>
        <div class="footer-grid">
            <div class="container">
                <div class="col-md-2 re-ft-grd">
                    <h3>Categories</h3>
                    <ul class="categories">
                        <li><a href="#">Men</a></li>
                        <li><a href="#">Women</a></li>
                        <li><a href="#">Kids</a></li>
                        <li><a href="#">Formal</a></li>
                        <li><a href="#">Casuals</a></li>
                        <li><a href="#">Sports</a></li>
                    </ul>
                </div>
                <div class="col-md-2 re-ft-grd">
                    <h3>Short links</h3>
                    <ul class="shot-links">
                        <li><a href="#">Contact us</a></li>
                        <li><a href="#">Support</a></li>
                        <li><a href="#">Delivery</a></li>
                        <li><a href="#">Return Policy</a></li>
                        <li><a href="#">Terms & conditions</a></li>
                        <li><a href="contact.html">Sitemap</a></li>
                    </ul>
                </div>
                <div class="col-md-6 re-ft-grd">
                    <h3>Social</h3>
                    <ul class="social">
                        <li><a href="#" class="fb">facebook</a></li>
                        <li><a href="#" class="twt">twitter</a></li>
                        <li><a href="#" class="gpls">g+ plus</a></li>
                        <div class="clearfix"></div>
                    </ul>
                </div>
                <div class="col-md-2 re-ft-grd">
                    <div class="bt-logo">
                        <div class="logo">
                            <a href="${pageContext.request.contextPath}/" class="ft-log">N-AIR</a>
                        </div>
                    </div>
                </div>
        <div class="clearfix"></div>
            </div>
            <div class="copy-rt">
                <div class="container">
            <p>&copy;   2015 N-AIR All Rights Reserved. Design by <a href="http://www.w3layouts.com">w3layouts</a></p>
                </div>
            </div>
        </div>
    </body>
</html>






<%-- 
    Document   : editproduct
    Created on : Oct 15, 2016, 1:41:04 PM
    Author     : HP


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <body>
        <jsp:include page="menu.jsp"></jsp:include>
        
            <h1>Edit Product!</h1>
            <form action="${pageContext.request.contextPath}/suasanpham">
            Mã sản phẩm: ${SP.ma}<br/>
             <input type="hidden" name="ma" value="${SP.ma}" />    
            Tên sản phẩm: <input type="text" name="ten" value="${SP.ten}"/> <br/>
            Gía: <input type="text" name="gia" value="${SP.gia}"/> <br/>                      
            Hinh:<input type="file" name="hinh" value="${SP.hinh}"> <br/>         
            Màu: <input type="text" name="mau" value="${SP.mau}"/> <br/>
            Size: <input type="text" name="size" value="${SP.size}"/> <br/>
            Hãng SX: <input type="text" name="hangsx" value="${SP.hangsx}"/> <br/>           
            <input type="submit" value="Edit"/>

        </form>
       
  <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
--%>