<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 10/30/2015
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="_css/datepicker.css">
  <link rel="stylesheet" href="_css/bootstrap.css">
  <link rel="stylesheet" href="_css/bootstrap-responsive.css">
  <script type="text/javascript" src="datepicker/bootstrap-datepicker.js"></script>
  <meta name = "viewport" content = "width = device-width, initial-scale = 1.0">
  <!-- Bootstrap -->
  <link href = "bootstrap/css/bootstrap.min.css" rel = "stylesheet">
</head>
<>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src = "https://code.jquery.com/jquery.js"></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src = "bootstrap/js/bootstrap.min.js"></script>

<h2>Restaurant Search  <!--c:import url="/jsp/EmployeeSearchResultsFooter.jsp" /--></h2>
<!--<h3>{type} Results for: {term}</h3>-->
<body>
<table class = "table table-striped">
  <thead>
  <tr bgcolor="#6495ED">
    <th>ID</th>
    <th>&nbsp;&nbsp;</th>
    <th>Name</th>
    <th>&nbsp;&nbsp;</th>
    <th>Item</th>
    <th>&nbsp;&nbsp;</th>
    <th>Cost</th>
    <th>&nbsp;&nbsp;</th>
    <th>tip</th>
    <th>&nbsp;&nbsp;</th>
    <th>date#</th>
    <th>&nbsp;&nbsp;</th>
  </tr>
  </thead>
  <c:forEach var="restaurant" items="${results}">
    <tr>

      <td>${restaurant.getId()}</td>
      <td>&nbsp;&nbsp;</td>
      <td>${restaurant.getVisitRestaurantName()}</td>
      <td>&nbsp;&nbsp;</td>
      <td>${restaurant.getVisitItem()}</td>
      <td>&nbsp;&nbsp;</td>
      <td>${restaurant.getVisitTotalCost()}</td>
      <td>&nbsp;&nbsp;</td>

    </tr>
  </c:forEach>
</table>
<form method="GET" action="RestaurantVisitSearchResults" />

<div class = "form-group">

  <label for"searchValue">  search for</label>
  <input type="text" name="searchValue" value="" autofocus/>

  <div class = "checkbox-inline">
    <!--label for"FoodItem   ">FoodItem</label-->
    <input type="radio" name="search" id="FoodItem" value="searchFoodItem" checked="checked" /> FoodItem
  </div>
  <div class = "checkbox-inline">
    <!--label for"RestaurantName">Restaurant Name</label-->
    <input type="radio" name="search" id= "RestaurantName" value="searchName" /> RestaurantName
  </div>

  <div class = "checkbox-inline">
    <button type = "submit" class = "btn btn-default" value="Search">Search</button>
  </div>

</div>

<!--input type="submit" name="" value="Search" /-->


</form>

<form method="GET" action="RestaurantVisitAddResults" />


<input type="text" name="name" value="" autofocus/>
<input type="text" name="foodItem" value="" autofocus/>
<input type="text" name="cost" value="" autofocus/>

<input type="submit" name="" value="Add" />

</form>

</body>
</html>
