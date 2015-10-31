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
    <title>Search</title>
</head>
<body>

<form method="GET" action="SearchResults" />

<label for"lastName"></label>
<input type="text" name="lastName" value="" autofocus/>
<label for"ID">ID</label>
<input type="radio" name="search" id="ID" value="searchID" checked="checked" />
<label for"LastName">LastName</label>
<input type="radio" name="search" id= "LastName" value="searchName" />
<input type="submit" name="" value="Search" />

</form>


</body>
</html>
