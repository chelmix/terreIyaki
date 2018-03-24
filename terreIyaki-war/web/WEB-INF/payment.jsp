<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : payment
    Created on : 24 mars 2018, 18:26:22
    Author     : jeanno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>payment</title>
    </head>
    <body>
  
        ${message}
        <c:if test="${commandeToPayHash!=null}" >
            <br/>Commande en attente de règlement :
           <%--     <c:forEach var="com" items="${commandeToPay}">
            <br/>Commande n° ${com.id} - date : ${com.orderDate}
        </c:forEach>    --%>
         
            
            
        <c:forEach var="com" items="${commandeToPayHash}">
            <br/>Commande n° ${com.key} - Ht : ${com.value.montantHT}€ - TTC : ${com.value.montantTTC}€
            Payer : <a href="FrontController?section=payment&action=versPayer&id=${com.key}">Ici</a>
        </c:forEach>
            
         
            
            
       
    </c:if>
            <c:if test="${listItem!=null}" >
                <br/>Voici les produits de la commande :
            <c:forEach var="list" items="${listItem}">
                
                <br/>${list.product.name} - qté : 1 - ${list.product.price} € HT
                
            </c:forEach>
            
            
           </c:if> 
            
            
        
    </body>
</html>
