<%-- 
    Document   : editproduct
    Created on : Oct 15, 2016, 1:41:04 PM
    Author     : HP
--%>

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
             <input type="hidden" name="txtMa" value="${SP.ma}" />    
            Tên sản phẩm: <input type="text" name="txtTen" value="${SP.ten}"/> <br/>
            Gía: <input type="text" name="txtGia" value="${SP.gia}"/> <br/>                      
            Hinh:<input type="file" name="txtHinh" value="${SP.hinh}"> <br/>         
            Số lượng: <input type="text" name="txtSoluong" value="${SP.soluong}"/> <br/>
            Màu: <input type="text" name="txtMau" value="${SP.mau}"/> <br/>
            Size: <input type="text" name="txtSize" value="${SP.size}"/> <br/>
            Hãng SX: <input type="text" name="txtHang" value="${SP.hangsx}"/> <br/>           
            <input type="submit" name="action" value="Edit"/>

        </form>
       
  <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
