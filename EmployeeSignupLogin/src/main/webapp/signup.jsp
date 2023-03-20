<%--
  Created by IntelliJ IDEA.
  User: dyan
  Date: 2/5/2023
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up SCreen</title>
</head>
<body>
<div style="text-align: center">
    <h1>Employee Register Form</h1>
    <form action="<%= request.getContextPath()%>/register" method="post">
        <table style="width: 80%">
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" required/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" required/></td>
            </tr>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstname" required/></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastname" required/></td>
            </tr>

            <tr>
                <td>Email:</td>
                <td><input type="text" name="emailAddress" required/></td>
            </tr>
            <tr>
                <td>Hire Date:</td>
                <td><input type="date" name="hireDate" required/></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>
