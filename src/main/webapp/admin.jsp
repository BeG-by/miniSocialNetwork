<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Админ</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/admin.css">
    <link rel="shortcut icon" href="/images/favicon.ico">
</head>
<body>
<h1>Просмотр ползьзователей</h1>

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

<div class="user-list">

    <ul>
        <c:forEach items="${requestScope['users']}" var="string">
            <li>${string}
                <a href="/user?email=${string}">
                    <button type="button">Перейти к профилю</button>
                </a>
            </li>
        </c:forEach>
    </ul>

</div>

</body>
</html>
