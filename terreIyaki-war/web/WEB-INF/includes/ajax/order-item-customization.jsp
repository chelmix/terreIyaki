<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${options != null}">
    <p>Options :</p>
    <c:forEach var = "opt" items="${options}">
        ${opt.name}
    </c:forEach>
</c:if>
<br />

<c:if test="${ingredients != null}">
    <p>Ingr�dients � retirer :</p>
    <c:forEach var = "ing" items="${ingredients}">
        ${ing.name}
    </c:forEach>
</c:if>