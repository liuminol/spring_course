<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ask Detail</title>
    <style type="text/css">
        body {
            background: #96C3EB;
        }
        
        .heading {
            font-size: 22px;
            text-align: center;
        }

        .form_input {
            background-color: #6ACCBC;
        }
        
        .form_submit {
            background-color: #158FAD;
            color: white;
            border-radius: 5px;
            border-color: cornflowerblue;
        }
    </style>
</head>
<body>
<h2 class="heading">Dear Employee, please enter your details</h2>
<br>
<form class="form" action="showDetails" method="get">
    <input class="form_input" type="text" name="employeeName" placeholder="Enter your name"/>

    <input class="form_submit" type="submit"/>
</form>
</body>
</html>