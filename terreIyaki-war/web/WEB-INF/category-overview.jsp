<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Terryaki</title>
    </head>
    <body>
        <h1>${category.name}</h1>        
        <c:forEach var = "pro" items="${products}">
            <c:url value="FrontController?section=overview&productid=${pro.id}" var="url03" />
            <a href="${url03}">${pro.name}</a>
        </c:forEach>
</body>
</html>
