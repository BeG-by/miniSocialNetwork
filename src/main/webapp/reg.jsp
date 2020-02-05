<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрации</title>
    <link rel="stylesheet" type="text/css" href="css/reg.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="shortcut icon" href="/images/favicon.ico">
</head>
<body>
<h1>Социальная сеть для бедных</h1>

<form action="/reg" method="post" class="reg-form">
    <h2>Форма регистрации</h2>

    <p>Имя</p>
    <input type="text" name="firstName" maxlength="12" placeholder="Имя" required>
    <p>Фамилия</p>
    <input type="text" name="lastName" maxlength="12" placeholder="Фамилия" required>
    <p>Возраст</p>
    <input type="text" name="age" maxlength="2" placeholder="Возраст" required>
    <p>Пол</p>
    <p class="rad">
        Мужчина<input type="radio" name="sex" value="men">
        Женщина<input type="radio" name="sex" value="women">
    </p>
    <p>Почта</p>
    <input type="email" name="email" maxlength="24" placeholder="user@gmail.com" required>
    <p>Пароль</p>
    <input type="password" name="password" placeholder="Пароль" maxlength="12" required>
    <p>
        <button type="submit">Регистрация</button>
    </p>
</form>

</body>
</html>
