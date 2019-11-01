<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Calculate</title>
</head>
<body>
<c:forEach var="err" items="${errors}">
    <p><c:out value="${err}"></c:out></p>
</c:forEach>
<form action="SaveCalculator" method="post">
    <input type="text" name="add1" size="2" value="${calculator.add1}" />+
    <input type="text" name="add2" size="2" value="${calculator.add2}" />=
    <input type="text" name="sum" size="2" value="${calculator.sum}" readonly /><br/>
    <input type="text" name="mult1" size="2" value="${calculator.mult1}" />*
    <input type="text" name="mult2" size="2" value="${calculator.mult2}" />=
    <input type="text" name="product" size="2" value="${calculator.product}" readonly /><br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
