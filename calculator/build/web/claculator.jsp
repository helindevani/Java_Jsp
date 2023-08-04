<%-- 
    Document   : claculator
    Created on : Apr 14, 2023, 9:30:18 AM
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
           int a=Integer.parseInt(request.getParameter("t1"));
           int b=Integer.parseInt(request.getParameter("t2"));
           String s1=request.getParameter("t3");
            if(s1.equals("+"))
            {
              out.println(a+b);
            }
            else if(s1.equals("-"))
            {
              out.println(a-b);
            }
            else if(s1.equals("*"))
            {
              out.println(a*b);
            }
            else if(s1.equals("/"))
            {
              out.println(a/b);
            }
            else
            {
              out.println("enter a valid String");
            }           
        %>
    </body>
</html>
