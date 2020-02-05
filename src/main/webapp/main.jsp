<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная страница</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="shortcut icon" href="/images/favicon.ico">
</head>
<body>

<h1>Социальная сеть для бедных</h1>

<form class="login-form" action="/auth" method="post">
    <h2>Авторизация</h2>

    <input type="email" name="login" placeholder="user@gmail.com" required>
    <input type="password" name="password" placeholder="password" required>

    <button type="submit">Войти</button>

    <a href="/reg">
        <button type="button">Регистрация</button>
    </a>
</form>

</body>
</html>
