<%-- 
    Document   : update
    Created on : Oct 15, 2016, 1:41:59 PM
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
        
        <h1>Customers!</h1>
        <form action="ControllerCustomers">
            Username: ${kh.username}<br/><br/>
            Password: <input type="password" name="txtPassword" value="${kh.password}"/> <br/><br/>
            Name: <input type="text" name="txtName" value="${kh.name}"/> <br/><br/>
            Email: <input type="text" name="txtEmail" value="${kh.email}"/> <br/><br/>
            Gender: <input type="text" name="txtGender" value="${kh.gender}"/> <br/><br/>
            Role: <input type="text" name="txtRole" value="${kh.role}"/> <br/><br/>
            <input type="submit" name="action" value="Update"/>
        </form>        
  <jsp:include page="footer.jsp"></jsp:include>
</html>
