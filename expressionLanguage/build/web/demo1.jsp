<%-- 
    Document   : demo1
    Created on : Apr 28, 2023, 9:13:21 AM
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
            session.setAttribute("user","admin");
            Cookie c=new Cookie("name","helin");
            response.addCookie(c);
        %>
        <a href="demo2.jsp">visit</a>
    </body>
</html>
