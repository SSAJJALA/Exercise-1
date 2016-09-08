<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="head.jsp"%>

<html><body>

<%--TODO Pretty up the results!--%>
<div class="container-fluid">
    <h2>Search Results: </h2>

    <c:choose>
        <c:when test="${empty users}">
            <h2>No employee found</h2>
        </c:when>
        <c:otherwise>
            <table>
                <tr>
                    <th>User ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.userid}</td>
                        <td>${user.firstName}</td>
                        <td>${user.lastName}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

</div>
<a href = "searchTerm">Back to search</a>
</body>
</html>
