<%-- 
    Document   : customers
    Created on : Oct 15, 2016, 1:40:13 PM
    Author     : HP
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
         <h1>Khách Hàng</h1>
	<form action="search">
		nhập tên user:<input type="text" name="txtTenKH" value="" /> <input 
		type="submit" name="action" value="Search" />
	</form>
	<br />
	<table border="1">
		<tr>
			<td>MaKH</td>
			<td>username</td>
			<td>pass</td>
			<td>hoten</td>
			<td>sdt</td>
			<td>dia chi</td>
			<td>email</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach var="rows" items="${listKH}">		
				<tr>
					<td>${rows.ma}</td>
					<td>${rows.username}</td>
					<td>${rows.password}</td>
					<td>${rows.hoten}</td>
					<td>${rows.sdt}</td>
					<td>${rows.diachi}</td>
					<td>${rows.email}</td>				
					<td><a href="editKH?ma=${rows.ma}">Edit</td>
					<td><a href="deleteKH?ma=${rows.ma}">Delete</td>
				</tr>		
		</c:forEach>
	</table>
	<br />
         <jsp:include page="main.jsp"></jsp:include>
  <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
