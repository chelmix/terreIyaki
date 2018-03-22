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
        <div>
        <c:url value="FrontController?section=dataTestJeannory" var="url01" />
        
        
        Data Test :  <a href="${url01}">  ici </a><br />
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

    </body>
</html>
