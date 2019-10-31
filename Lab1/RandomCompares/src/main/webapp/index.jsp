<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello World!</h2>
<c:choose>
    <c:when test="${first < control}">
        And the result are:
        The number ${first} is less than ${control}
    </c:when>
    <c:when test="${second > control}">
        And the result are:
        The number ${second} is greater than ${control}
    </c:when>
    <c:when test="${third == control}">
        And the result are:
        The number ${third} is equal to ${control}
    </c:when>

    <c:otherwise>
        And the results are<br>
        The number ${control}<br>
        is Not greater than ${first}<br>
        is Not less than ${second}<br>
        is Not equal to ${third}
    </c:otherwise>
</c:choose>
</body>
</html>
