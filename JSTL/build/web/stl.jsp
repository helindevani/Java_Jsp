<%-- 
    Document   : stl
    Created on : Apr 21, 2023, 10:15:38 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>out:to display on browser</h1>
        <c:out value="hello i am helin"/>
        <c:out value="${param.t1}"/>
        <br/>
        <h1>set</h1>
        <c:set var="a" value="${param.t2}"/>
        <c:out value="you selected:${a}"/>
        <br/>
        <h1>if</h1>
        <c:if test="${a=='Ajava'}">
         <c:out value="semester is 6"/>
        </c:if>
        <br/>
         <h1>choose,when,otherwise</h1>
         <c:set var="a" value="5"/>
         <c:choose>
            
            <c:when test="${a==0}">
              <c:out value="${a} is even"/>
            </c:when>
             <c:otherwise>
                 <c:out value="${a} is odd"/>  
             </c:otherwise>
        </c:choose>
        
    </body>
</html>
