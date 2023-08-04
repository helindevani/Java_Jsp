<%-- 
    Document   : newjsp
    Created on : Apr 14, 2023, 10:44:39 AM
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
        
         <form action="newjsp.jsp" method="get" target="_self">
        <label>Username : </label>
	<input type="text" name="usn1">
        <button>submit</button>
         </form>
        <% 
            // out.println(session.isNew());
            // int d=5/0;
             //out.println(application.getInitParameter("user"));
        String unm=request.getParameter("usn1");
        Cookie c=new Cookie("user",unm);
        response.addCookie(c);  
         %>
         <a href="read.jsp">read</a>
         <% out.println("welcome "+request.getParameter("user")); 
         %>
    </body>
</html>
