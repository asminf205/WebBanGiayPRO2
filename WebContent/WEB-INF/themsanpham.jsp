<%-- 
    Document   : newProducts
    Created on : Oct 15, 2016, 1:43:32 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<base href="${pageContext.request.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
       <jsp:include page="menu.jsp"></jsp:include>
       
            <h1>New Product!</h1>
            <form action="newProduct.htm" method="post" enctype="multipart/form-data">       
            Tên sản phẩm: <input type="text" name="txtTen" /> <br/>
            Gía: <input type="text" name="txtGia" /> <br/>                      
            Hinh:<input type="file" name="txtHinh"> <br/>         
            Số lượng: <input type="text" name="txtSoluong" /> <br/>
            Màu: <input type="text" name="txtMau" /> <br/>
            Size: <input type="text" name="txtSize" /> <br/>
            Hãng SX: <input type="text" name="txtHang" /> <br/>
            
            
            <input type="submit" name="action" value="Insert"/>

        </form>
  <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
