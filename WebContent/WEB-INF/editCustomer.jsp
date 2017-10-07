<%-- 
    Document   : editCustomer
    Created on : Oct 18, 2016, 1:33:18 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
  </head>
<body>
  <jsp:include page="menu.jsp"></jsp:include>
 <table border="1">
                <h2>Edit Customers</h2>
                
        <form action="ControllerCustomers">
            <tr>
                <td>Username: </td> <td><input type="text" name="txtUsername" value="${kh.username}"/></td>
            </tr>
            <tr>
                <td>Password: </td> <td><input type="password" name="txtPassword" value="${kh.password}"/> </td>
            </tr>
            <tr>
                <td>Name: </td> <td><input type="text" name="txtName" value="${kh.name}"/> </td>
            </tr>
            <tr>   
                <td> Email: </td> <td><input type="text" name="txtEmail" value="${kh.email}"/> </td>
            </tr>
            <tr>   
                <td>Gender: </td> <td><input type="text" name="txtGender" value="${kh.gender}"/> </td>
            </tr>
            <tr>   
                <td> Role: </td> <td><input type="text" name="txtRole" value="${kh.role}"/> </td>
            </tr>
            <tr> 
                <td> </td> <td><input type="submit" name="action" value="Update"/>
            </tr>   
            </form>
        </table>
    
  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
