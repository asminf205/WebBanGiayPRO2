
<%-- 
    Document   : index
    Created on : Oct 15, 2016, 1:11:49 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">
    <head>
    <title>N-Air a E-commerce category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
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
                        <div class="clearfix"></div>
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
                    <li><a href="${pageContext.request.contextPath}/">Home</a></li>
                    <li><a href="${pageContext.request.contextPath}/quanlysanpham">PRODUCTS</a></li>
                    <li><a href="${pageContext.request.contextPath}/quanlykhachhang">USERS</a></li>                </ol>
            </div>
        </div>
        <div class="sub-news">
            <div class="container">
        <form action="${pageContext.request.contextPath}/search">
          <h3>Sreach Products</h3>
                <input type="text" name="txtten" class="sub-email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
               <a class="btn btn-default subs-btn" role="button">SEARCH</a>
        </form>
        </div>
        </div>
        <!-- check-out -->
        <style type="text/css">
        /* = body
------------------------*/
.description{
  font-family: 'Vollkorn', serif;
  text-align:center;
  color:#ecf0f1;
  text-shadow:0 0.1em 0.2em #008c8d;
}
/* = Scroll body
------------------------*/
::-webkit-scrollbar{
  width:0.2em;
}
::-webkit-scrollbar-track{
  background-color:#bdc3c7;
}
::-webkit-scrollbar-thumb{
  background-color:#7f8c8d;
}
/* = table
------------------------*/
.box-table table{
  border-collapse:collapse;
  text-align:left;
  width:100%;
  margin:0;
  padding:0;
  background:#7f8c8d;
  animation: responsive 5s infinite ease-in-out;
}
.box-table{
  font:normal 12px/150% Arial, Helvetica, sans-serif;
  overflow:hidden;
  margin:0 auto;
  display:block;
  width:95%;
  padding:2.5%;
}
.box-table table thead th{
  background-color:#7f8c8d;
  color:#bdc3c7;
  text-align:center;
  padding: 0.75em;
  font-family: 'Vollkorn', serif;
  font-weight: bold;
  font-size: 1.5em;
  height: 1.5em;
  vertical-align: top;
  border-left:0.25em double #95a5a6;

}
.box-table table tbody td,
.box-table table tbody tr{
  font-family: 'Vollkorn', serif;
  font-size:1em;
  border:none;
  padding:1em;
}
.box-table table tbody tr:nth-child(odd){
  background:#ecf0f1;
  color:#95a5a6;
}
.box-table table tbody tr:nth-child(even){
  background:#bdc3c7;
  color:#7f8c8d;
}
.box-table table tbody tr a{
  text-decoration:none;
  color:#e67e22;
}
.box-table table tbody tr a:hover{
  color:#d35400;
}
.box-table .user-photo{
  background:#bdc3c7;
}
.box-table .user-tumb{
  width:6em;
  height:6em;
  padding:0;
  display:table-cell;
  text-align:center;
  margin:0 auto;
  -webkit-border-radius:100%;
  -moz-border-radius:100%;
  border-radius:100%;
}


/* = Responsive table
------------------------*/

/* http://elvery.net/demo/responsive-tables/  */
@media only screen and (max-width: 800px){
  .box-table table{
    width:100%;
    border-collapse:collapse;
    border-spacing:0;
  }
  .box-table th,
  .box-table td{
    margin:0;
    vertical-align:top;
  }
  .box-table th{
    text-align:left;
  }
  .box-table table{
    display:block;
    position:relative;
    width:100%;
  }
  .box-table thead{
    display:block;
    float:left;
  }
  .box-table tbody{
    display:block;
    width:auto;
    position:relative;
    overflow-x:auto;
    white-space:nowrap;
  }
  .box-table thead tr{
    display:block;
  }
  .box-table th{
    display:block;
    text-align:right;
  }
  .box-table tbody tr{
    display:inline-block;
    vertical-align:top;
  }
  .box-table td{
    display:block;
    min-height:1.25em;
    text-align:left;
  }
  .box-table th{
    border-bottom:0;
    border-left:0;
  }
  .box-table td{
    border-left:0;
    border-right:0;
    border-bottom:0;
  }
}
/* = Error
------------------------*/
.error_table {
  display: block;
  background: #E05E5E;
  color: #D1D1D1;
  font-family: 'Vollkorn', serif;
  text-align: center;
  font-size: 3em;
  width: 90%;
  padding: 5%;
}
/* = Loader
------------------------*/
.loading_table{
  background:#d35400;
  color:#ecf0f1;
  font-family: 'Vollkorn', serif;
  text-align: center;
  font-size: 1em;
  width: 0;
  display: block;
  overflow: hidden;
  height: 1em;
  padding:0.5em;
  animation: table_loader 10s infinite ease;
}
@keyframes table_loader{50%{width:100%}}
@-webkit-keyframes table_loader{50%{width:100%}}
@-moz-keyframes table_loader{50%{width:100%}}
@-ms-keyframes table_loader{50%{width:100%}}
@-o-keyframes table_loader{ 50%{width:100%}}
</style>
            <div class="box-table">
			<table>
			<tr>
			<td>HinhAnh</td>
			<td>MaSP</td>
			<td>TenSP</td>
			<td>Gia</td>
			<td>Mau</td>
			<td>Size</td>
			<td>Hang SX</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach var="rows" items="${list}">		
				<tr>
				<td><img src="${pageContext.request.contextPath}/resources/images/${rows.hinh}" width="150px" height="100px"/>
					<td>${rows.ma}</td>
					<td>${rows.ten}</td>
					<td>${rows.gia}</td>
					<td>${rows.mau}</td>
					<td>${rows.size}</td>
					<td>${rows.hangsx}</td>
					
					<td><a href="edit?ma=${rows.ma}">Edit</td>
					<td><a href="deleteSP?ma=${rows.ma}">Delete</td>
				</tr>		
		</c:forEach></table>    
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
    Document   : products
    Created on : Oct 15, 2016, 1:38:45 PM
    Author     : HP

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>
	<jsp:include page="menu.jsp"></jsp:include>

	<h1>Products</h1>
	<form action="search">
		nhap ten sp:<input type="text" name="txtTenSP" value="" /> <input
			type="submit" name="action" value="Search" />
	</form>
	<br />
	<table border="1">
		<tr>
			<td>MaSP</td>
			<td>TenSP</td>
			<td>Gia</td>
			<td>HinhAnh</td>
			<td>Mau</td>
			<td>Size</td>
			<td>Hang SX</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach var="rows" items="${list}">		
				<tr>
					<td>${rows.ma}</td>
					<td>${rows.ten}</td>
					<td>${rows.gia}</td>
					<td><img src="${pageContext.request.contextPath}/themes/images/products/${rows.hinh}" width="100%" height="100%"/>
					<td>${rows.mau}</td>
					<td>${rows.size}</td>
					<td>${rows.hangsx}</td>
					
					<td><a href="edit?ma=${rows.ma}">Edit</td>
					<td><input type="hidden" name="txtMa" value="${rows.ma}" />
						<input type="submit" name="action" value="Delete" /></td>
				</tr>		
		</c:forEach>
	</table>
	<br />

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
--%>