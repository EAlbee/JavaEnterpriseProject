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
<body>
<h2>Restaurant Search  <!--c:import url="/jsp/EmployeeSearchResultsFooter.jsp" /--></h2>
<!--<h3>{type} Results for: {term}</h3>-->

<table >
  <tr bgcolor="green">
    <td>ID</td>
    <td>&nbsp;&nbsp;</td>
    <td>Last</td>
    <td>&nbsp;&nbsp;</td>
    <td>First</td>
    <td>&nbsp;&nbsp;</td>
    <td>SSN</td>
    <td>&nbsp;&nbsp;</td>
    <td>Dept</td>
    <td>&nbsp;&nbsp;</td>
    <td>Room#</td>
    <td>&nbsp;&nbsp;</td>
    <td>Phone#</td>
    <td>{term}</td>
  </tr>
  <c:forEach var="employee" items="${results}">
    <tr>

      <td>${employee.getId()}</td>
      <td>&nbsp;&nbsp;</td>
      <td>${employee.getVisitRestaurantName()}</td>
      <td>&nbsp;&nbsp;</td>


    </tr>
  </c:forEach>

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


</table>
</body>
</html>
