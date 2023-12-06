
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="jakarta.servlet.http.*,jakarta.servlet.*" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="sql" uri="jakarta.tags.sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL INSERT Page</title>
    </head>
    <body>
        <sql:setDataSource var="con" driver="org.postgresql.Driver"
                           url="jdbc:postgresql://localhost:5432/postgres"
                           password="postgres" user="postgres"/>

        <sql:update dataSource="${con}" var="result" >
            delete from student where id='s555';
        </sql:update>

        <sql:query dataSource="${con}" var="result" >
            select * from student;
        </sql:query>


        <table border="1">
            <tr>
                <th>Student Id</th>
                <th>Student Name</th>
            </tr>

            <c:forEach var="row" items="${result.rows}">

                <tr>
                    <td><c:out value = "${row.id}"/></td>
                    <td><c:out value = "${row.name}"/></td>
                </tr>

            </c:forEach>
        </table>

        <c:redirect url="index.jsp"/>

    </body>
</html>
