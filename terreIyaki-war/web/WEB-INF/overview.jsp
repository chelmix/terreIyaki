<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Terryaki</title>
    </head>
    <body>
        <h1>Vue d'ensemble du menu</h1><br />
        <section>
            <h2>Formules</h2><br />
            <p>- to do -</p><br />
        </section>
        <h2>A la carte</h2><br />
        <c:forEach var = "cat" items="${categories}">
            <section>
                <c:url value="FrontController?section=overview&categoryid=${cat.id}" var="url03" />
                <a href="${url03}">${cat.name}</a>
            </section>
        </c:forEach>       
    </body>
</html>
