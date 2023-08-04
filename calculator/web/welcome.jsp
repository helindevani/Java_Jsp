<%-- 
    Document   : welcome
    Created on : Apr 19, 2023, 10:08:57 AM
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
           out.println("welcome " + session.getAttribute("name") );
          
           Integer count=(Integer)session.getAttribute("count");
           if(count == null) 
           {
               count=new Integer(0);
               session.setAttribute("count",++count);
               out.println("count is "+count);
           }
           else
           {
             session.setAttribute("count",++count);
             out.println("count is "+count);  
           }
        %>
        <a href="logout.jsp">logout</a>
        
    </body>
</html>
