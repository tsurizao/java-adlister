<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Authors"/>
    </jsp:include>
</head>
<body>
<h2>Add an author to the database</h2>
<form action="authors" method="post">
    <label for="author_name"></label>
    <input id="author_name" type="text" name="author_name"/>
    <button type="Submit">Submit</button>
</form>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<c:forEach var="author" items="${authors}">
    <div>
        <p>
                ${author.author_name}
        </p>
    </div>
</c:forEach>
</body>
</html>
