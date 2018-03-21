<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : combo
    Created on : 20 mars 2018, 14:02:24
    Author     : jeanno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>JSP Page</title>
    </head>
    <body>

        <p>${message}</p>
        <p>Voici nos menus :</p> 
        
        
        
    <c:forEach var="com" items="${combo}">
    <div id="conteneur">
<div class="element">
<img src="${com.urlImage}" height="100"/>
</div>
 <div class="element">

     <c:url value="FrontController?section=combo&action=monCombo&comboName=${com.name}" var="url01"/>
       <a href="${url01}">${com.name}
                 
        <br/>${com.description} - ${com.price} € </a>
 </div>
</div>     
        </c:forEach>
        
        <c:if test="${HashProduct!=null}">
        Détail menu ${comboName02}
        
  <c:forEach var="map" items="${HashProduct}">

<br/>${map.key}

${map.value.description} 
         
  </c:forEach>        
        
 
        </c:if>
            

            
         
            
    </body>
</html>
