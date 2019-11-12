<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<p><a href="?language=en_US">English</a>|<a href="?language=zh_CN">Chinese</a></p>
<h1>Registration Form</h1><br />
<section class="container">
    <form:form modelAttribute="employee" class="form-horizontal" enctype="multipart/form-data">
        <form:errors path="*" cssClass="alert alert-danger" element="div"></form:errors>
        <fieldset>
            <legend><spring:message code="userform.title" text="Default Title" /> </legend>
            <div class="form-group">
                <label class="control-label col-lg-2" for="id">
                    Id
                </label>
                <div class="col-lg-10">
                    <form:input path="id" id="id" class="form:input-large" />
                    <form:errors path="id" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="firstName">
                    Fist Name
                </label>
                <div class="col-lg-10">
                    <form:input path="firstName" id="firstName" class="form:input-large" />
                    <form:errors path="firstName" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="lastName">
                    Last Name
                </label>
                <div class="col-lg-10">
                    <form:input path="lastName" id="lastName" class="form:input-large" />
                    <form:errors path="lastName" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="email">
                    Email
                </label>
                <div class="col-lg-10">
                    <form:input path="email" id="email" class="form:input-large" />
                    <form:errors path="email" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="gender">
                    Gender
                </label>
                <div class="col-lg-10">
                    <form:select path="gender" id="gender" class="form:input-large">
                        <form:option value="M">Male</form:option>
                        <form:option value="F">Female</form:option>
                    </form:select>
                    <form:errors path="gender" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="birthday">
                    Birthday
                </label>
                <div class="col-lg-10">
                    <form:input path="birthday" id="birthday" class="form:input-large" />
                    <form:errors path="birthday" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="area">
                    Phone
                </label>
                <div class="col-lg-10">
                    <form:input path="phone.area" id="area" class="form:input-large" />
                    <form:input path="phone.prefix" id="prefix" class="form:input-large" />
                    <form:input path="phone.number" id="number" class="form:input-large" />
                    <form:errors path="phone" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <div class="form-group">
                <%--@declare id="profileimage"--%><label class="control-label col-lg-2" for="profileImage">
                    Profile Image:
                </label>
                <div class="col-lg-10">
                    <form:input path="profileImage" type="file" />
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-10 col-lg-offset-2">
                    <input type="submit" id="btnAdd" class="btn btn-primary" value="Register"/>
                </div>
            </div>
        </fieldset>
    </form:form>
</section>
</body>
</html>