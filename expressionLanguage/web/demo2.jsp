<%-- 
    Document   : demo2
    Created on : Apr 28, 2023, 9:13:36 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${2*3} 
        <br>
        value of session:${sessionScope.user}
        <br>
        value of cookie:${cookie.name.value}
        <br>
        <%
            String[] st={"adv.java","dv"};
            pageContext.setAttribute("s",st);
          %>
          ${s[0]}
          ${s[1]}
    </body>
</html>
