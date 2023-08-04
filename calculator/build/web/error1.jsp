<%-- 
    Document   : error1
    Created on : Apr 14, 2023, 10:34:11 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="True"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            // out.println(exception);
             out.println(config.getInitParameter("user"));                       
             
         %>
    </body>
</html>
