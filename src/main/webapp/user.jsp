<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Пользователь</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/admin.css">
    <link rel="shortcut icon" href="/images/favicon.ico">
</head>
<body>
<h1>Профиль пользователя</h1>

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

<div class="user">
    <h2>Данные</h2>
    <p>Имя: <%=request.getAttribute("firstName")%>
    </p>
    <p>Фамилия: <%=request.getAttribute("lastName")%>
    </p>
    <p>Возраст: <%=request.getAttribute("age")%>
    </p>
    <p>Пол: <%=request.getAttribute("sex")%>
    </p>
    <p>Почта: <%=request.getAttribute("email")%>
    </p>
    <p>Пароль: <%=request.getAttribute("password")%>
    </p>

</div>

</body>
</html>