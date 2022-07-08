<%--
  Created by IntelliJ IDEA.
  User: chasemartinez
  Date: 7/8/22
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login to your profile</h2>
<form method='POST'>
    <label>
        <input name='username' type='text' placeholder='Username'>
    </label>
    <br>
    <label>
        <input name='password' type='password' placeholder='Password'>
    </label>
    <br>
    <button>Submit</button>
</form>
</body>
</html>
