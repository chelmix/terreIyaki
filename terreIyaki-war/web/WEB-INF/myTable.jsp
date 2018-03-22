 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : myTable
    Created on : 22 mars 2018, 15:55:03
    Author     : samira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Liste des tables et leurs statuts</h1>
         <c:forEach var="table" items="${myTables}"><p>
                <td> ${table.Status}</td>
                  </p>  </c:forEach>
                 
                 
    </body>
</html>
