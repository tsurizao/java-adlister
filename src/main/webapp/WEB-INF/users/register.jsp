<%--
  Created by IntelliJ IDEA.
  User: chasemartinez
  Date: 7/19/22
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register an account"/>
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Register an account</h1>
    <form action="/register" method="post">
        <div>
            <label for="username">Username</label>
            <input id="username" name="username" type="text">
            <br>
            <label for="email">Email</label>
            <input id="email" name="email" type="text">
            <br>
            <label for="password">Password</label>
            <input id="password" name="password" type="password">
            <br>
        </div>
        <input type="submit">
    </form>
</div>
</body>
</html>
