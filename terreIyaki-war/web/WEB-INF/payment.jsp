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
        <c:url value ="FrontController?section=include&action=navbar" var="urlNavbar"/> 
        <c:import url ="${urlNavbar}"/>
        <main>
  
        ${message}
        <c:if test="${commandeToPayHash!=null}" >
            <br/>Commande en attente de règlement :<br/><br/>
           <%--     <c:forEach var="com" items="${commandeToPay}">
            <br/>Commande n° ${com.id} - date : ${com.orderDate}
        </c:forEach>    --%>
         
            
            
        <c:forEach var="com" items="${commandeToPayHash}">
            <br/>Commande n° ${com.key} - Ht : ${com.value.montantHT}€ - TTC : ${com.value.montantTTC}€
            Payer : <a href="FrontController?section=payment&action=versPayer&id=${com.key}">Ici</a>
        </c:forEach>
            
         
            
            
       
    </c:if>
            
            
            
            <c:if test="${price!=null}" >
             <c:forEach var="pri" items="${price}">
                 <br/>Montant total : ${pri.value.montantHT}€ HT 
           <br/>Net à payer ${pri.value.montantTTC}€ TTC 
            <br/><br/>
            </c:forEach>
            </c:if>
            
            
            <c:if test="${listItem!=null}" >
                <br/>Produits de la commande :<br/>
            <c:forEach var="list" items="${listItem}">
               <c:if test="${list.product.name!=null}" >
                <br/>Qté : 1 - prix : ${list.product.price}€ HT - taux tva : ${list.product.vat.rate}% : ${list.product.name}
   </c:if> 
            </c:forEach>
            
            
           </c:if> 
            
            
        </main>
    </body>
</html>
