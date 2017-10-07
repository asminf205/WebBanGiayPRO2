<%-- 
    Document   : login
    Created on : Oct 15, 2016, 1:42:35 PM
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
        <h1>Login</h1>
        <form action="ControllerCustomers">
            UserName: <input type="text" name="txtUser" value=""></br>
            Password: <input type="password" name="txtPass" value=""></br>
            <input type="submit" name="action" value="Login"/>
            <input type="reset" name="action" value="Reset"/>
        </form>
  <jsp:include page="footer.jsp"></jsp:include>
</html>
    </body>
</html>
