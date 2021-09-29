<%-- 
    Document   : authencode
    Created on : Sep 28, 2021, 11:59:54 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ProcessAuthenticationCode" method="POST">
            <input type="email" hidden value="${requestScope.email}" name="email">
            <p id="email"></p>
            <input type="text" name="code" value="">
            <input type="submit" value="Send">
        </form>
             

    </body>
</html>
