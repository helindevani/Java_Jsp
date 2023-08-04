<%-- 
    Document   : jspforward_backword
    Created on : Apr 21, 2023, 9:16:22 AM
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
        <h1>hello</h1>
        <jsp:forward page="newjsp.jsp">
            <jsp:param name="user" value="admin"/>
            </jsp:forward>
    </body>
</html>
