<%-- 
    Document   : products
    Created on : Oct 15, 2016, 1:38:45 PM
    Author     : HP
--%>
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
