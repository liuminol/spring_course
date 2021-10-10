<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add employee</title>
</head>
<body>
<h1>Employee info</h1>

<form:form action="saveEmployee" modelAttribute="employee">
    <form:hidden path="id"/>
    Name <form:input path="name"/>
    Surname <form:input path="surname"/>
    Department <form:input path="department"/>
    Salary <form:input path="salary"/>
    <input type="submit" value="OK">
</form:form>
</body>
</html>