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
        <p> ${myTable}</p> 
        <form action="FrontController?section=table&action=valide">
        <c:forEach var="table" items="${myTable}"><p>
               <input type="checkbox" name="table" value="${table.tableNumber}"> <br> <td> ${table.status}</td>
                <p> test blabla </p>
                  </p>  </c:forEach>
                   <input type="submit" value="Submit">
                  </form>
                  
                 
                 
    </body>
</html>
