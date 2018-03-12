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
        
        Data Test :  <a href="${url01}">  ici </a> 
        

    </body>
</html>
