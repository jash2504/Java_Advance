
<jsp:useBean id="ub" class="usebeans.StudentBean" scope="page">


    <jsp:setProperty name="ub" property="id" param="sid"  />
    <jsp:setProperty name="ub" property="name" param="sname"  />


</jsp:useBean>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Student Id:<jsp:getProperty name="ub" property="id"/><br><br>
        Student Name:<jsp:getProperty name="ub" property="name"/><br><br>
    </body>
</html>
