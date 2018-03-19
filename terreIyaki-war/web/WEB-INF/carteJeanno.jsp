<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : carteJeanno
    Created on : 19 mars 2018, 10:29:51
    Author     : jeanno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        Voici nos produits :     
            
        <c:forEach var="prod" items="${product}"><p>
                ${prod.name} - ${prod.price}€ - ${prod.description} - Ajouter <a href="FrontController">ici</a>
        </p>  </c:forEach>
        
        Voici nos menus
        
        <c:forEach var="com" items="${combo}"><p>
                ${com.name} - ${com.price}€ - ${com.description} - Ajouter <a href="FrontController">ici</a>
        </p>  </c:forEach>        
            
        </div>
    </body>
</html>
