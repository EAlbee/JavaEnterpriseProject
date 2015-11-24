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
    <td>Name</td>
    <td>&nbsp;&nbsp;</td>
    <td>item</td>
    <td>&nbsp;&nbsp;</td>
    <td>cost</td>
    <td>&nbsp;&nbsp;</td>
    <td>date</td>
    <td>&nbsp;&nbsp;</td>
    <td>tip</td>
    <td>&nbsp;&nbsp;</td>
    <td>Total</td>
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
</table>
</body>
</html>
