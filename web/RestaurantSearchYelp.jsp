
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
<div lang="en">
  <head>
    <title>Select Restaurant</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <meta name = "viewport" content = "width = device-width, initial-scale = 1.0">
    <!-- Bootstrap -->
    <link href = "bootstrap/css/bootstrap.min.css" rel = "stylesheet">
    <!--datepicker-->
    <!-- Include Required Prerequisites -->
    <script type="text/javascript" src="//cdn.jsdelivr.net/jquery/1/jquery.min.js"></script>
    <script type="text/javascript" src="//cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
    <link href="bootstrap/css/jquery-ui.min.css" rel="stylesheet">
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <link href="bootstrap/css/Custom.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap/js/json2html.js"></script>

  </head>

  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <!--script src = "https://code.jquery.com/jquery.js"></script-->

  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src = "bootstrap/js/bootstrap.min.js"></script>

  <h2>Restaurant Search  <!--c:import url="/jsp/EmployeeSearchResultsFooter.jsp" /--></h2>
  <!--<h3>{type} Results for: {term}</h3>-->
  <body style="margin:4;padding:4">


  <!-- ************** -->
  <!--   SEARCH AREA  -->
  <!-- ************** -->
  <form method="GET" action="RestaurantAreaSearchResults" >
    <input type="text" name="term" value="food" autofocus/>
    <input type="text" name="location" value="Madison, WI" autofocus/>

    <input type="submit" name="" value="Search Area" />
  </form>
<br>

<a href="RestaurantVisitSearchAndResults.jsp"class="btn btn-info" role="button"><-- Search Visited Restaurants</a>


</body>
  </div>
</html>
