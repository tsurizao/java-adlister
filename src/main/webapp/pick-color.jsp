<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a color</title>
</head>
<body>
<form action="/pickcolor" method="post">
    <label for="color">Choose a color</label>
    <input type="color" name="color" id="color">
    <button>Submit</button>
</form>
</body>
</html>
