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
        
        <c:url value ="FrontController?section=include&action=navbar" var="urlNavbar"/> 
        <c:import url ="${urlNavbar}"/>
        
<<<<<<< refs/remotes/origin/master
        <main>
        <p>${message}</p>
        <c:if test="${user!=null}">
            <p>Bonjour ${user.firstName} ${user.lastName}</p>

            <c:forEach var="my" items="${myGrants}">
                <p> Profil : ${my.name}</p>
                <c:if test="${my.name=='client'}">
                    <br/>Bienvenue à la table n° ${user.myTable.tableNumber}   
                </c:if>
                <c:if test="${my.name=='client'||my.name=='serveur'}">
                    
                    <c:url value="FrontController?section=overview" var="url10" />
                    <a class="button" href="${url10}">À la carte</a>
                    <c:url value="FrontController?section=combo&action=allCombo" var="url04" />
                    <a class="button" href="${url04}">Formules</a> 
                </c:if>
                <c:if test="${my.name=='caissier'}">
                    <c:url value="FrontController?section=payment&action=enCours" var="url33" />
                    <a class="button" href="${url33}"  >Commande en attente de règlement</a>
                </c:if>
            </c:forEach>

=======
        Data Test :  <a href="${url01}">  ici </a><br />
        </div>
        <hr />
        
        <div>
        <c:url value="FrontController?section=versLogin" var="url02" />
        
        Login :  <a href="${url02}">  ici </a> 
        
        </div>
        <div>
        <c:url value="FrontController?section=backoffice" var="url03" />
        Back office provisoire : <a href="${url03}">  ici </a>
        </div>
        
        
        <div>
        <c:url value="FrontController?section=table" var="url04" />
        Liste des tables : <a href="${url04}">  ici </a>
        </div>
>>>>>>> Auto stash before rebase of "origin/master"

            
        </c:if>
        </main>    
    </body>
</html>
