<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<% response.setStatus(403); %>

<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>403 error</title>
</head>
<body>
<H2>${requestScope['javax.servlet.error.message']}</H2>
<p>
    <button type="button" onclick=window.location.href="<spring:url value='/'/>">Home</button>
</p>
</body>
</html>
