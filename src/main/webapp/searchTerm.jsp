<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 9/2/16
  Time: 6:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emp Search Term</title>
    <script type="text/javascript">
        function show() { document.getElementById('searchByName').style.display = 'block'; }
        function hide() { document.getElementById('searchByName').style.display = 'none'; }

    </script>
</head>
<body>
<div id="main">


    <form name="empSearchForm" action="/searchUser" method="GET">
        <div align="center">
            <h2><font color="black"><strong>Search Employee Page</strong></font></h2>


            <input type="radio" name="searchType" value="searchAll" onclick="hide();"> Search All<br>


            <input type="radio" name="searchType" value="searchByName" onclick="show();"> Search By Last Name
            <TEXTAREA id="searchByName" style="display: none;" name="lname" rows=1 cols=15></TEXTAREA><br />



            <INPUT TYPE=SUBMIT VALUE="submit">
        </div>
    </form>

</div>


<!-- javascript at the bottom for fast page loading -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/image_slide.js"></script>


</body>
</html>
