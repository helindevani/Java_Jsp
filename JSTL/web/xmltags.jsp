<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--<c:import var="s" url="demo.xml"/>--%>
        <%--<x:parse xml="${s}" var="output"/>--%>
        
        
        <%--<x:out select="$output/sale"/>--%>
        
        <%--<x:if select="$output/sale/sales/amount > 95000">
           good person is there
        </x:if>--%>
        
    <c:set var="s1">
    <sale>
	<sales>
		<region>north</region>
		<employees>150</employees>
		<amount>115000</amount>
	</sales>
	
	<sales>
		<region>south</region>
		<employees>125</employees>
		<amount> 95000</amount>
	</sales>
	
	<sales>
		<region>east</region>
		<employees>325</employees>
		<amount>265000</amount>
	</sales>
	
	<sales>
		<region>west</region>
		<employees>215</employees>
		<amount>30500</amount>
	</sales>
		
    </sale>
    </c:set>
    
    <x:parse xml="${s1}" var="output"/>
    <x:set var="data" select="$output/sale/sales[2]/region"/>
    <x:out select="$data"/>
    </br>
    <x:choose>
        <x:when select="$data='north'">
            this is north region
        </x:when>
        <x:otherwise>
            this is not north region
        </x:otherwise>
    </x:choose>
     <br>
     <table border="2px"> 
     <x:forEach select="$output/sale/sales" var="user">
         <tr>
             <td><x:out select="$user/region"/></td>
             <td><x:out select="$user/amount"/> </td>
         </tr>
     </x:forEach>
     </table>
            
    </body>
</html>
