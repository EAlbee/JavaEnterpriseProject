<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 10/30/2015
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Search Restaurant</title>
</head>
<body>

<form method="GET" action="RestaurantVisitSearchResults" />

<%--<label for"lastName"></label>--%>
<%--<input type="text" name="lastName" value="" autofocus/>--%>
<%--<label for"ID">ID</label>--%>
<%--<input type="radio" name="search" id="ID" value="searchID" checked="checked" />--%>
<%--<label for"LastName">LastName</label>--%>
<%--<input type="radio" name="search" id= "LastName" value="searchName" />--%>
<%--<input type="submit" name="" value="Search" />--%>

<label for"searchValue">search</label>
<input type="text" name="searchValue" value="" autofocus/>
<label for"FoodItem">FoodItem</label>
<input type="radio" name="search" id="FoodItem" value="searchFoodItem" checked="checked" />
<label for"RestaurantName">Restaurant Name</label>
<input type="radio" name="search" id= "RestaurantName" value="searchName" />
<input type="submit" name="" value="Search" />

</form>


</body>
</html>
