<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Show details</title>
</head>
<body>
<h2>Dear Employee, you are welcome!</h2>

<br>

<%--    <p>Your name: ${param.employeeName}</p>--%>

<%--get attribute from model--%>
<p>Your name: ${employee.name}</p>
<br>
<p>Your surname: ${employee.surname}</p>
<br>
<p>Your salary: ${employee.salary}</p>
<br>
<p>Your department: ${employee.department}</p>
<br>
<p>Your car: ${employee.carBrand}</p>
<br>
<p>Language(s):
<ul>

    <c:forEach var="lang" items="${employee.languages}">
    <li>${lang}</li>
    </c:forEach>

</ul>
</p>

</body>
</html>