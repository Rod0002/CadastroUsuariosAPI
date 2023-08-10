<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Usuários</title>
</head>
<body>
    <h1>Lista de Usuários</h1>
    <ul>
        <c:forEach var="user" items="${users}">
            <li>${user.username}</li>
        </c:forEach>
    </ul>
</body>
</html>
