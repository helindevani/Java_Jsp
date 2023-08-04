<%--

    Document   : include
    Created on : Apr 14, 2023, 10:10:59 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error1.jsp"%>
<%-- <%@include file="claculator.jsp" %> --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>JSP Page</title>
    </head>
    <body>
        <%--

        <h1>Hello World!</h1>
        <h1> expression</h1>
        <label> time:    <%= java.util.Calendar.getInstance().getTime() %> </label>
        <h1> declaration</h1>
         <%! int a=5; %>
         <%= "value is" +a %>
         <br>
         <%= new Date() %>
         --%>
         <br>
         <% 
            // out.println(session.isNew());
             int d=5/0;
         %>
         
    </body>
</html>
