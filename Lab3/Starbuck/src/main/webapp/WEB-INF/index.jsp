<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Starbuck's</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "advice" method="get">
    <select name="roast" disabled="disabled" >
        <option value="-">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <br/><br/>
    <input type="submit" value = "Submit" disabled = "disabled" />
</form>
<div id='advice'>

</div>
<p />
Login:
<form action = "login" method = "post">
    <p><c:out value="${error}"></c:out></p>
    <p> Name: <input type = "text" name = "name" size = "9" /></p>
    <p> Password: <input type = "password" name = "password" size = "9" /></p>
    <br/>
    <input type="submit" value = "Log In"/>
</form>
</body>
</html>
