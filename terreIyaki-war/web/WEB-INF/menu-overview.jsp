<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TerreIyaki</title>
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body>
        <c:url value ="FrontController?section=include&action=navbar" var="urlNavbar"/> 
        <c:import url ="${urlNavbar}"/>
        <main>
            <h1>Vue d'ensemble du menu</h1><br />
            <section>
                <h2>Formules</h2><br />
                <p>- to do -</p><br />
            </section>
            <section>
                <h2>A la carte</h2><br />
                <c:forEach var = "cat" items="${categories}">
                    <article>
                        <c:url value="FrontController?section=overview&category-id=${cat.id}" var="url03" />
                        <a class="button" href="${url03}">${cat.name}</a>
                    </article>
                </c:forEach>
            </section>
        </main>
    </body>
</html>
