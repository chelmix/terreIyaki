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
            <h1>Catégorie : ${category.name}</h1>   
            <c:forEach var = "pro" items="${products}">
                <p>${pro.name} : ${pro.description}<br />
                    Prix HT : ${pro.price} - todo prix ttc <br />
                </p>
                <c:url value="FrontController?section=overview&product-id=${pro.id}" var="url03" />
                <a class="button" href="${url03}">Détails</a><br>
                <c:url value="FrontController?section=product-choice&product-id=${pro.id}" var="url04" />
                <a class="button" href="${url04}">Choisir</a><br>
            </c:forEach>
        </main>
    </body>
</html>
