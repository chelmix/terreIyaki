<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <h3>${cat.name}</h3>
                <c:forEach var = "pro" items="${cat.products}">
                    <c:url value="FrontController?section=overview&productid=" var="url03" />
                    <a href="#">${pro.name}</a>
                </c:forEach>
            </section>
        </c:forEach>       
    </body>
</html>
