

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="java.util.*" %>
<%@page import="jakarta.servlet.http.*,jakarta.servlet.*" %>


<%@taglib uri="jakarta.tags.core" prefix="c" %>
<%@taglib uri="jakarta.tags.sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SQL DATABASE WITH JSTL</title>
    </head>
    <body>
        <sql:setDataSource var="con" driver="org.postgresql.Driver"
                           url="jdbc:postgresql://localhost:5432/postgres"
                           password="postgres" user="postgres"/>

        <sql:query  var="result" dataSource="${con}" >
            select * from student;
        </sql:query>

        <table border = "1" >
            <tr>
                <th>Student ID</th>
                <th>Student Name</th>
            </tr>

            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                    <td><c:out value = "${row.id}"/></td>
                    <td><c:out value = "${row.name}"/></td>

                </tr>
            </c:forEach>



        </table>

        <h3><a href="insert.jsp">Insert</a></h3>
        <h3><a href="update.jsp">Update</a></h3>
        <h3><a href="delete.jsp">Delete</a></h3>

    </body>
</html>
