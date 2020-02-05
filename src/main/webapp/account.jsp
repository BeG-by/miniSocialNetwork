<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Аккаунт</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/account.css">
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

    <c:if test="${sessionScope['flag']}">
        <a href="/clear">
            <button type="button">Очистить чат</button>
        </a>
        <a href="/admin">
            <button type="button">Просмотр пользователей</button>
        </a>
    </c:if>
</nav>



<div class="account">
    <h2>Ваш профиль</h2>
    <p>Имя: <%=session.getAttribute("firstName")%>
    </p>
    <p>Фамилия: <%=session.getAttribute("lastName")%>
    </p>
    <p>Возраст: <%=session.getAttribute("age")%>
    </p>
    <p>Пол: <%=session.getAttribute("sex")%>
    </p>
    <p>Почта: <%=session.getAttribute("email")%>
    </p>
</div>

<div class="chat">
    <h2>Общий чат</h2>

    <%--    не трогать тег <textarea> ! в чат добавляются пробелы --%>
    <textarea name="chat-text" cols="100" rows="20" disabled="disabled"><c:forEach items="${applicationScope['chat']}" var="string">
${string}</c:forEach></textarea>

    <form action="/acc" method="post">
        <textarea name="message" class="message" cols="50" rows="3" placeholder="Введите сообщение"></textarea>
        <button type="submit">Опубликовать сообщение</button>
    </form>
</div>

</body>
</html>
