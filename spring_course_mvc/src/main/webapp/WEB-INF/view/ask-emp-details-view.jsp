<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ask Detail</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h2 class="heading">Dear Employee, please enter your details</h2>
<br>
<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors class="error" path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors class="error" path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors class="error" path="salary"/>
    <br>
    Department
    <form:select path="department">
        <form:options items="${employee.departments}"/>
        <%--        <form:option value="Information Technology" label="IT"/>
                <form:option value="Human Resources" label="HR"/>
                <form:option value="Sales" label="Sales"/>--%>
    </form:select>
    <br>
    Which car do you want?
    BMW <form:radiobutton path="carBrand" value="BMW"/>
    Porsche <form:radiobutton path="carBrand" value="Porsche"/>
    Lada <form:radiobutton path="carBrand" value="Lada"/>
    <br>
    Foreign languages:
    English <form:checkbox path="languages" value="English"/>
    French <form:checkbox path="languages" value="French"/>
    Deutch <form:checkbox path="languages" value="Deutch"/>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors class="error" path="phoneNumber"/>
    <br>
    Email <form:input path="email"/>
    <form:errors class="error" path="email"/>
    <br>
    <input type="submit" value="OK">

</form:form>


<%--<form class="form" action="showDetails" method="get">
    <input class="form_input" type="text" name="employeeName" placeholder="Enter your name"/>

    <input class="form_submit" type="submit"/>
</form>--%>
</body>
</html>