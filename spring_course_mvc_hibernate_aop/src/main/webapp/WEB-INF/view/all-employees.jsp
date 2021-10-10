<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All Employees</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            color: white;
            background-color: cadetblue;
        }

        .heading {
            padding-bottom: 20px;
            font-size: 42px;
            text-align: center;
        }

        .table {
            margin: 0 auto;
            padding: 20px;
        }

        .table th, .table td {
            padding: 7px;
            font-size: 20px;
        }

        .button {
            padding: 5px;
            font-weight: bold;
            color: white;
            border-style: none;
            background-color: dodgerblue;
            border-radius: 10px;
            cursor: pointer;
        }

        .button--add {
            display: block;
            margin: 0 auto;
            font-size: 25px;
        }
    </style>
</head>
<body>
<h1 class="heading">All Employees</h1>

<table class="table">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input class="button" type="button" value="Update" onclick="window.location.href='${updateButton}'">
            </td>
        </tr>

    </c:forEach>
</table>

<input class="button button--add" type="button" value="Add" onclick="window.location.href='addNewEmployee'"/>
</body>
</html>