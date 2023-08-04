<%-- 
    Document   : actiontagdeno
    Created on : Apr 21, 2023, 9:36:09 AM
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
        <h1>Hello World!</h1>
        <jsp:useBean class="package1.actiontagdemo" id="b1"/>
         <jsp:setProperty property="id" value="1" name="b1"/>
          <jsp:setProperty property="name" value="hjd" name="b1"/>
           <jsp:getProperty property="id" name="b1"/>
          <jsp:getProperty property="name" name="b1"/>
          <% 
            int a=b1.cube(3);
            out.println("cube is:"+a);
          %>
        
    </body>
</html>
