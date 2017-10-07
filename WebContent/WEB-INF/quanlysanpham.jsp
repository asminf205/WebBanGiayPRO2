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
	<form action="quanlysanpham.htm">
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
			<td>SoLuong</td>
			<td>Mau</td>
			<td>Size</td>
			<td>Hang SX</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach var="rows" items="${listSP}">		
				<tr>
					<td>${rows.ma}</td>
					<td>${rows.ten}</td>
					<td>${rows.gia}</td>
					<td><img src="${pageContext.request.contextPath}/themes/images/products/${rows.hinh}" width="20%" height="20%"/>
					<td>${rows.soluong}</td>
					<td>${rows.mau}</td>
					<td>${rows.size}</td>
					<td>${rows.hangsx}</td>
					<c:url var="del" value="ControllerProducts">
						<c:param name="action" value="Edit" />
						<c:param name="txtCode" value="${rows.ma}" />
						<c:param name="txtName" value="${rows.ten}" />
						<c:param name="txtPrice" value="${rows.gia}" />
						<c:param name="txtCode" value="${rows.hinh}" />
						<c:param name="txtName" value="${rows.soluong}" />
						<c:param name="txtPrice" value="${rows.mau}" />
						<c:param name="txtCode" value="${rows.size}" />
						<c:param name="txtName" value="${rows.hangsx}" />

					</c:url>
					<td><a href="${del}">Edit</td>
					<td><input type="hidden" name="txtCode" value="${rows.ma}" />
						<input type="submit" name="action" value="Delete" /></td>
				</tr>
			
		</c:forEach>
	</table>
	<br />

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
