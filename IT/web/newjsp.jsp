


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--<fmt:setLocale value="fr FR" />--%>
    <fmt:bundle basename="com.message">
        <fmt:message key="welcome.message"/><br/>

        <fmt:message key="exit.message"/><br/>
    </fmt:bundle>

</body>
</html>
