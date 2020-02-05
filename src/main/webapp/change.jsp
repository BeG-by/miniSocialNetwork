<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Изменение</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/change.css">
    <link rel="shortcut icon" href="/images/favicon.ico">
</head>
<body>
<h1>Социальная сеть для бедных</h1>

<nav>
    <a href="/acc">
        <button type="button">Главная</button>
    </a>
    <a href="/news.jsp">
        <button type="button">Новости</button>
    </a>
    <a href="/change">
        <button type="button">Изменить профиль</button>
    </a>
    <a href="/logout">
        <button type="button">Выйти</button>
    </a>
</nav>

<div class="change-form">
    <h2>Изменение данных</h2>

    <form action="/change" method="post">
        <p>Профиль</p>
        <input type="text" name="firstName" maxlength="12" placeholder="Новое имя">
        <input type="text" name="lastName" maxlength="12" placeholder="Новая фамилия">
        <input type="text" name="age" maxlength="12" placeholder="Новый возраст">
        <p>Пароль</p>
        <input type="password" name="oldPassword" placeholder="Старый пароль" maxlength="12">
        <input type="password" name="newPassword" placeholder="Новый пароль" maxlength="12">
        <p>
            <button type="submit">Изменить данные</button>
        </p>
    </form>

</div>

</body>
</html>
