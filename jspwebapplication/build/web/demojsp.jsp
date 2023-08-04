<%-- 
    Document   : demojsp
    Created on : Apr 14, 2023, 9:10:55 AM
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
        <form method="GET">
            <input type="text" name="t1">value1
            <input type="text" name="t2">value2
            <button>submit</button>
        </form>
        <%
           int a=Integer.parseInt(request.getParameter("t1"));
        int b=Integer.parseInt(request.getParameter("t2"));
        
        int c=a+b;
        out.println("Ans is " + c);
            
        %>
    </body>
</html>
