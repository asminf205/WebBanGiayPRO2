<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
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
            </style>
            <script type="text/javascript">
        var arrGT = ["Nam", "Nu"];
        var arrTB = [];//rong
        
        function xoaTB() {
            //xoa mang thong bao:
            arrTB.length = 0;
            var ul = document.getElementById('ulTB');
            //xoa cac li trong ul:
            while (ul.childNodes.length > 0) {
                ul.removeChild(ul.childNodes[0]);
            }
        }
        function hienThiTB() {
            //dua ra thong bao:
            var ul = document.getElementById('ulTB');
            for (var i = 0; i < arrTB.length; i++) {
                var li = document.createElement('li');
                li.innerText = arrTB[i];
                ul.appendChild(li);
            }
        }
        function kiemTraHopLe() {
            var hopLe = true;
            xoaTB();
            //kiem tra ho ten:
            if (document.getElementById('hoten').value.length == 0) {
                //them thong bao loi vao arrTB:
                var kt = arrTB.length++;
                arrTB[kt] = "* Tên không được để trống";
                hopLe = false;
            }
            if (document.getElementById('diachi').value.length == 0) {
                //them thong bao loi vao arrTB:
                var kt = arrTB.length++;
                arrTB[kt] = "* Địa chỉ không được để trống";
                hopLe = false;
            }
            
            if (document.getElementById('username').value.length == 0) {
                //them thong bao loi vao arrTB:
                var kt = arrTB.length++;
                arrTB[kt] = "* Username không được để trống";
                hopLe = false;
            }
            if (document.getElementById('password').value.length == 0) {
                //them thong bao loi vao arrTB:
                var kt = arrTB.length++;
                arrTB[kt] = "* Password không được để trống";
                hopLe = false;
            }
            //kiem tra email bang RegEx:
            var rgE = /^\w+([\.-]?\w+)*@[A-Za-z0-9.-]+\.\w{2,3}$/;
            if (!document.getElementById('email').value.match(rgE)) {
                //them thong bao loi vao arrTB:
                var kt = arrTB.length++;
                arrTB[kt] = "* Email không hợp lệ";
                hopLe = false;
            }
            //kiem tra dien thoai:
            //if (document.getElementById('txtDT').value.length < 8) {
            //    //them thong bao loi vao arrTB:
            //    var kt = arrTB.length++;
            //    arrTB[kt] = "So dien thoai khong hop le";
            //    hopLe = false;
            //}
            //kiem tra dien thoai bang RegEx:
            var reg = /^\d{8,12}$/;
            if (!document.getElementById('sdt').value.match(reg)) {
                //them thong bao loi vao arrTB:
                var kt = arrTB.length++;
                arrTB[kt] = "* Số điện thoại không hợp lệ";
                hopLe = false;
            }
            hienThiTB();
            return hopLe;
        }
        window.onload = function () {
            var dk = document.getElementById('btnDK');
            dk.onclick = function () {
                return kiemTraHopLe();
            }
        }
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
				<h3>Register Now</h3>
				<p>Welcome, please enter the following details to continue.</p>
				<p>If you have previously registered with us, <a href="#">click here</a></p>
				 <form action="${pageContext.request.contextPath}/khachhang/moi" method="post">
					<table>
						<tr>
							<td><ul id="ulTB">
								<a></ul></td></a>
						</tr>
					</table>
					<ul>
						<li class="text-info">Name: </li>
						<li><input id="hoten" type="text" value="" name="hoten"></li>
					</ul>
					<ul>
						<li class="text-info">User name: </li>
						<li><input id="username" type="text" value="" name="username"></li>
					 </ul>	
					 <ul>
						<li class="text-info">Password: </li>
						<li><input id="password" type="password" value="" name="password"></li>
					</ul>			 
					<ul>
						<li class="text-info">Email: </li>
						<li><input id="email" type="text" value="" name="email"></li>
					</ul>
					<ul>
						<li class="text-info">Address:</li>
						<li><input id="diachi" type="text" value="" name="diachi"></li>
					</ul>
					<ul>
							<li class="text-info">Mobile Number:</li>
						<li><input id="sdt" type="text" value="" name="sdt"></li>
					</ul>
					
					<input id="btnDK" type="submit" value="Register Now">
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