<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulário de Usuário</title>
</head>
<body>
    <h1>Formulário de Usuário</h1>
        <form action="/cadastro" method="post">
        <label for="username">Nome de Usuário:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">Senha:</label>
        <input type="password" id="password" name="password" required><br>

        <button type="submit">Salvar</button>
    </form>
</body>
</html>
