<%-- 
    Document   : customers
    Created on : Oct 15, 2016, 1:40:13 PM
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
        <jsp:include page="menu.jsp"></jsp:include>
         <h1>welcome, ${sessionScope.Username} </h1>
         <jsp:include page="main.jsp"></jsp:include>
  <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
