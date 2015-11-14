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
</table>
</body>
</html>
