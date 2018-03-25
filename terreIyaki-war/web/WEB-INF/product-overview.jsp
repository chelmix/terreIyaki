<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>TerreIyaki</title>
    </head>
    <body>
        <c:url value ="FrontController?section=include&action=navbar" var="urlNavbar"/> 
        <c:import url ="${urlNavbar}"/>
        <main>
            <h1>Fiche produit</h1>
            <p>
                ${product.name}<br />
                ${product.description}<br />
                Prix HT : ${product.price} - todo prix TTC<br />
            </p>
            <c:url value="FrontController?section=product-choice&product-id=${pro.id}" var="url04" />
            <a class="button" href="${url04}">Choisir</a><br /><br />
            <h2>
                Propriétés    
            </h2>
            <c:forEach var = "pty" items="${properties}">
                <p>
                    ${pty.name} : ${pty.value} ${pty.unit.abbreviation}
                </p><br />
            </c:forEach>
        </main>
    </body>
</html>
