<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="Authors"/>
</jsp:include>
</head>
<body>
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
