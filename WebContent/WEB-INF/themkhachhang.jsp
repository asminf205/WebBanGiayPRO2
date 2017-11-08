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
       
            <h1>New Khách Hàng!</h1>
            <form action="${pageContext.request.contextPath}/khachhang/moi"  method="post">                
            User name: <input type="text" name="username" /> <br/>                      
            Password: <input type="password" name="password" /> <br/>
            Tên Khách Hàng: <input type="text" name="hoten"/> <br/>
            Số điện thoại: <input type="text" name="sdt" /> <br/>
            Địa chỉ: <input type="text" name="diachi" /> <br/>
            Email: <input type="text" name="email" /> <br/>                        
            <input type="submit" value="Insert"/>
        </form>
      
  <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
