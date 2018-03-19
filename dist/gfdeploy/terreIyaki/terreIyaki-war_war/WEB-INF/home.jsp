<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home</title>
    </head>
    <body>
        
        <c:url value="FrontController?section=dataTestJeannory" var="url01" />
        <c:url value="FrontController?section=backoffice" var="url02" />
        
        Data Test :  <a href="${url01}">  ici </a><br />
        <hr />
        
        Back office provisoire : <a href="${url02}">  ici </a>
        

    </body>
</html>
