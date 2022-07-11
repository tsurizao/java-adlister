<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Justin's Pies</title>
</head>
<body>
<ul>
    <c:forEach var="pie" items="${pies}">
        <li>${pie}</li>
    </c:forEach>
</ul>
</body>
</html>
