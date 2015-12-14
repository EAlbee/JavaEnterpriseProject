
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
<html>
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
<body style="margin:3;padding:3">


<!-- ************** -->
<!--   SEARCH AREA  -->
<!-- ************** -->
<form method="GET" action="RestaurantAreaSearchResults" >
  <input type="text" name="term" value="food" autofocus/>
  <input type="text" name="location" value="Madison, WI" autofocus/>

  <input type="submit" name="" value="Search Area" />
</form>


<table class="table table-striped" >
  <thead>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>address</th>
    <th>concept</th>
    <th>rating</th>
  </tr>
  </thead>
</table>

<script>
  $(document).ready(function() {
    var json = ${businesses}

    var tr;
    for (var i = 0; i < json.length; i++) {

      tr = $('<tr/>');
      tr.append("<td>" + i + "</td>");
      tr.append("<td>" + json[i].name + "</td>");
      tr.append("<td>" + json[i].location.display_address + "</td>");
      tr.append("<td>" + json[i].categories + "</td>");

      tr.append("<td>" + json[i].rating + "</td>");

      $('table').append(tr);

    }

  });

</script>


<!--******-->
<!-- Load -->
<!--******-->
<form class="form-inline">
  <form>
    <input type="text" id="choice" values="" autofocus/>
    <a href="#" id="1" class="btn" onclick="populate()" data-product-name="Soap">select id</a>
  </form>

</form>
<br>


<script type="text/javascript">

  function populate()
  {
    choice = document.getElementById("choice").value;
    document.getElementById("name").value = json[choice].name;
    document.getElementById("city").value = json[choice].location.city;
    document.getElementById("state").value = json[choice].location.state_code;

  }

</script>


<!-- ****** -->
<!--   ADD  -->
<!-- ****** -->
<form method="GET" action="RestaurantVisitAddResults" >

  <div class="contain">

    <div class="form-inline">
      <label> name</label>
      <input type="text" name="name" id="name" value="" autofocus/>
      <label> city</label>
      <input type="text" name="city" id="city" value="" autofocus/>
      <label> state</label>
      <input type="text" name="state" id="state" value="" autofocus/>
      <label> food</label>
      <input type="text" name="foodItem" id="foodItem" value="" autofocus/>
      <label> cost</label>
      <input type="text" name="cost" id="cost" value="" autofocus/>
      <label for="dp"> date</label>
      <input type="Date" class="form-control" name="date" value="" id="dp" background-color=#ffg autofocus/>
    </div>
    <div class="col-md-3 text-center">

      <input type="submit" name="" value=" Add " />

    </div>

  </div>

</form>
<br><br>

<script>

  $( "#dp" ).datepicker({
    changeMonth: true,
    changeYear: true
  });


  $('input[name=sitebg]').val('000000');
  var json = ${businesses}
</script>


<a href="RestaurantVisitSearchAndResults.jsp"class="btn btn-info" role="button">Search Visited Restaurants</a>



</body>
  </div>
</html>
