<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>home</title>
    </head>
    <body>

        <p>${message}</p>
        <c:if test="${user!=null}">
            <p>Bonjour ${user.firstName} ${user.lastName}</p>

            <c:forEach var="my" items="${myGrants}">
                <br/> Profil : ${my.name}
                <c:if test="${my.name=='client'}">
                    <br/>Bienvenue à la table n° ${user.myTable.tableNumber}   
                </c:if>
                <br /><br />
                <c:if test="${my.name=='client'||my.name=='serveur'}">
                    
                    <c:url value="FrontController?section=overview" var="url10" />
                    <a href="${url10}">Consulter la carte</a>
                    <br /><br />
                    <c:url value="FrontController?section=carteJeannory&action=produit" var="url02" />
                    A la carte  :  <a href="${url02}">  ici </a>     
                    <c:url value="FrontController?section=carteJeannory&action=formule" var="url03" />
                    <br/>vers les formules  :  <a href="${url03}">  ici </a>       

                    <c:url value="FrontController?section=combo&action=allCombo" var="url04" />
                    <br/>Formule V2  :  <a href="${url04}">  ici </a>  
                    
                </c:if>
                <c:if test="${my.name=='caissier'}">
                    <c:url value="FrontController?section=reglement" var="url33" />
                    <br/>Commande en attente de règlement : <a href="${url33}"  >Ici</a>
                </c:if>


            </c:forEach>


            <c:url value="FrontController?section=login&action=logout" var="url01" />
            <p>Se déconnecter :  <a href="${url01}">  ici </a> </p>
        </c:if>

    </body>
</html>
