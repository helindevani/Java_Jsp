<%-- 
    Document   : logout
    Created on : Apr 19, 2023, 10:12:12 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            session.removeAttribute("name");
        %>
        <a href="welcome.jsp">welcome</a>
    </body>
</html>
