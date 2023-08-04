<%-- 
    Document   : delete
    Created on : Apr 19, 2023, 9:38:36 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% 
        Cookie c=new Cookie("user","");
        c.setMaxAge(0);
        response.addCookie(c);
        out.println("Cookie deleted");
         %>
         <a href="read.jsp">read</a>
    </body>
</html>
