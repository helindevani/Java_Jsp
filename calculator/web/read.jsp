<%-- 
    Document   : read
    Created on : Apr 19, 2023, 9:36:43 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
          Cookie c[]=request.getCookies();
          for(Cookie co:c){
            out.println("name "+co.getName());
            out.println("value"+co.getValue()); 
          }
         %>
         <a href="delete.jsp">delete</a>
    </body>
</html>
