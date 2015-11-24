<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 10/30/2015
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<>
<h2>Restaurant Search  <!--c:import url="/jsp/EmployeeSearchResultsFooter.jsp" /--></h2>
<!--<h3>{type} Results for: {term}</h3>-->

<table >
  <tr bgcolor="#f5f5f5">
    <td>ID</td>
    <td>&nbsp;&nbsp;</td>
    <td>Name</td>
    <td>&nbsp;&nbsp;</td>
    <td>Item</td>
    <td>&nbsp;&nbsp;</td>
    <td>Cost</td>
    <td>&nbsp;&nbsp;</td>
    <td>tip</td>
    <td>&nbsp;&nbsp;</td>
    <td>date#</td>
    <td>&nbsp;&nbsp;</td>
  </tr>
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


  <label for"FoodItem   ">FoodItem</label>
  <input type="radio" name="search" id="FoodItem" value="searchFoodItem" checked="checked" /><br>
  <label for"RestaurantName">Restaurant Name</label>
  <input type="radio" name="search" id= "RestaurantName" value="searchName" /><br>
  <label for"searchValue">search</label>
  <input type="text" name="searchValue" value="" autofocus/>
  <input type="submit" name="" value="Search" />

  </form>

  <form method="GET" action="RestaurantVisitAddResults" />


  <input type="text" name="name" value="" autofocus/>
  <input type="text" name="foodItem" value="" autofocus/>
  <input type="number" name="cost" value="" autofocus/>
  <input type="submit" name="" value="Add" />

  </form>

</body>
</html>
