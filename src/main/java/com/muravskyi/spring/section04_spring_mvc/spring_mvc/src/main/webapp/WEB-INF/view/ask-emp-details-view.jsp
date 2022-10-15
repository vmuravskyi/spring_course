<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: muravskyi
  Date: 14.10.22
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ask-emp-details-view</title>
</head>
<body>
<h2>Dear Employee, please enter your details</h2>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    Which car do you prefer?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    Foreign Language(s):
    <form:checkboxes path="languages" items="${employee.languagesContainer}"/>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
