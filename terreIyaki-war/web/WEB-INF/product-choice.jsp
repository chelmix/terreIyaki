<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1>Votre choix</h1>
            <br />
            ${product}
            <br />
            <form action="FrontController" method="POST" accept-charset="UTF-8">
                <input type="hidden" name="section" value="" />
                <input type="hidden" name="action" value="" />
                <br />
                <label>choix de l'accompagnement</label><br />
                <select name="oi-sides" multiple>
                    <c:forEach var = "sid" items="${sides}">
                        <option value="${sid.id}">${sid}</option>
                    </c:forEach>
                </select><br /><br />
                <label>options souhaitées</label><br />
                <select name="oi-options" multiple>
                    <c:forEach var = "opt" items="${options}">
                        <option value="${opt.id}">${opt}</option>
                    </c:forEach>
                </select><br /><br />
                <label>ingredients à retirer</label><br />
                <select name="oi-ingredients" multiple>
                    <c:forEach var = "ing" items="${ingredients}">
                        <option value="${ing.id}">${ing}</option>
                    </c:forEach>
                </select><br /><br />
                <input class="button" type="submit" value="valider votre choix">
            </form>
        </main>
    </body>
</html>
