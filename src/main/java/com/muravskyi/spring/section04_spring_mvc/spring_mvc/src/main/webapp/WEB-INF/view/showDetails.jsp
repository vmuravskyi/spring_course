<%--
  Created by IntelliJ IDEA.
  User: muravskyi
  Date: 14.10.22
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showDetails</title>
</head>
<body>

<h2>Dear Employee, you are WELCOME!</h2>

<br>

<%--Your name: ${param.employeeName}--%>
Employee's name: ${employee.name}
<br>
Employee's surname: ${employee.surname}
<br>
Employee's salary: ${employee.salary}
<br>

</body>
</html>
