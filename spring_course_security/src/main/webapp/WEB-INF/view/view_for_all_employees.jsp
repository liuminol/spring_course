<%@ taglib prefix="secutiry" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Spring Secutiry</title>
</head>
<body>

    <h3>Information for all employees</h3>
    <br>

    <secutiry:authorize access="hasRole('HR')">
        <input type="button" value="salary" onclick="window.location.href='hr_info'">
        Only for HR staff
    </secutiry:authorize>

    <br>
    <br>

    <secutiry:authorize access="hasRole('MANAGER')">
        <input type="button" value="performance" onclick="window.location.href='manager_info'">
        Only for Managers
    </secutiry:authorize>

</body>
</html>
