<%--
  Created by IntelliJ IDEA.
  User: muravskyi
  Date: 24.10.22
  Time: 00:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Employees</title>
</head>
<body>

<h3>Information for all employees</h3>
<br>

<input type="button" value="Salary"
       onclick="window.location.href = 'hr_info'">
Only for HR staff

<br>

<input type="button" value="Performance"
       onclick="window.location.href = 'manager_info'">
Only for Managers

</body>
</html>
