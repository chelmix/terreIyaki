<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <c:url value="FrontController?section=home" var="url33" />
    <a class="button" href="${url33}">Retour � l'accueil</a>
    <c:url value="FrontController?section=login&action=logout" var="url01" />
    <a class="button" href="${url34}">Se d�connecter</a>
    <hr />
</nav>