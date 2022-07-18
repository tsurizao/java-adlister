<%--
  Created by IntelliJ IDEA.
  User: chasemartinez
  Date: 7/16/22
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Users" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="user" items="${users}">
        <div class="col-md-6">
            <h2>${user.username}</h2>
            <p>${user.email}</p>
        </div>
    </c:forEach>
</div>
</body>
</html>
