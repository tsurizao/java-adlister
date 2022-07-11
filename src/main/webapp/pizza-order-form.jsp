<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Build your own pizza!</h2>
<form action="" method="post">
    Choose your Crust
    <label for="crust"></label>
    <select name="crust" id="crust">
        <option value="thin">Thin Crust</option>
        <option value="regular">Regular Crust</option>
        <option value="stuffed">Stuffed Crust</option>
        <option value="pan">Pan Crust</option>
    </select>
    <br>
    <br>
    Choose your Toppings
    <br>
    <ul>
        <li><input type="checkbox" name="toppings" id="pepperoni" value="pepperoni"><label for="pepperoni">Pepperoni</label></li>
        <li><input type="checkbox" name="toppings" id="pineapple" value="pineapple"><label for="pineapple">Pineapple</label></li>
        <li><input type="checkbox" name="toppings" id="jalapeno" value="jalapeno"><label for="jalapeno">Jalapeno</label></li>
    </ul>
    <label for="address">Enter delivery address</label>
    <br>
    <textarea name="address" id="address" placeholder="Enter Address" rows="5" cols="50"></textarea>
    <br>
    <button>Submit</button>
</form>
</body>
</html>
