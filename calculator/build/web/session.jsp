<%-- 
    Document   : session
    Created on : Apr 19, 2023, 10:03:01 AM
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
      <form action="session.jsp" method="get" target="_self">
        <label>Username : </label>
	<input type="text" name="usn">
        <label>password : </label>
        <input type="text" name="pwd">
        <button>submit</button>
      </form>
        
        <% 
           String unm=request.getParameter("usn");
           session.setAttribute("name",unm);
        %>
        <a href="welcome.jsp">welcome</a>
    </body>
</html>
