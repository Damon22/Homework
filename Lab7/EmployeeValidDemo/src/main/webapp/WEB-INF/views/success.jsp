<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>SUCCESS</title>
</head>
<body>

<h2>Employee Save successfully</h2>

<p>
    Employee Id: ${employee.id}<br>
    Employee FirstName: ${employee.firstName}<br>
    Employee LastName: ${employee.lastName}<br>
    Employee Email: ${employee.email}<br>
    Employee Phone: ${employee.phone.area}-${employee.phone.prefix}-${employee.phone.number}<br>
    Employee Profile: <img width="30%" height="30%" src="<spring:url value='/resources/images/${employee.profileImage.originalFilename}'/>" alt="" />

</p>
</body>
</html>