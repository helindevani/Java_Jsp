

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
            <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/student_db" user="root" password=""/>
            <%--<sql:update dataSource="${db}" var="count">
           Insert into s_info values(103,"brijesh",'a');
            </sql:update>--%>
       
         
        <%--<c:set var="sid" value="103"/>
       <sql:update dataSource="${db}">
            Delete from s_info where id=?;
            <sql:param value="${sid}"/>
        </sql:update>--%>
            
        <%--<c:set var="sid1" value="103"/>
        <c:set var="sname" value="suresh"/>
        <c:set var="sd" value="c"/>
        <sql:update dataSource="${db}">
            Insert into s_info values(?,?,?);
            <sql:param value="${sid1}"/>
            <sql:param value="${sname}"/>
            <sql:param value="${sd}"/>
        </sql:update>--%>
        
        <%--<sql:transaction dataSource="${db}">
         <c:set var="sid2" value="104"/>
        <c:set var="sname1" value="haresh"/>
        <c:set var="sd1" value="c"/>
        <sql:update>
            Insert into s_info values(?,?,?);
            <sql:param value="${sid2}"/>
            <sql:param value="${sname1}"/>
            <sql:param value="${sd1}"/>
        </sql:update>
        <c:set var="sid3" value="11"/>
       <sql:update>
            Delete from s_info where id=?;
            <sql:param value="${sid3}"/>
        </sql:update>
        </sql:transaction>--%>
        
        <sql:query var="rs" dataSource="${db}">
            select * from s_info;
        </sql:query>
        <table border="1px">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>division</th>
            </tr>
        <c:forEach var="table" items="${rs.rows}">
            <tr>
                <td><c:out value="${table.id}"/></td>
                <td><c:out value="${table.name}"/></td>
                <td><c:out value="${table.division}"/></td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
