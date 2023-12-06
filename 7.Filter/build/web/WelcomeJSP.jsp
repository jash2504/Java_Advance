


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String user=(String)session.getAttribute("user");
        %>
        <h1>Hello <%= user %></h1>

        <h1>
            <a href="next.jsp">Next</a>
        </h1>




    </body>
</html>
