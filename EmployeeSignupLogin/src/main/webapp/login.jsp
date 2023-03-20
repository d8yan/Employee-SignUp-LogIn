<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Screen</title>
</head>
<body>
<div style="text-align: center">
    <h1>Employee Login</h1>
    <h2 style="color:slateblue">${loginMessage}</h2>
    <form action="<%= request.getContextPath()%>/login" method="post">
        <table style="width: 80%">
            <tr>
                <td>
                    Username:
                </td>
                <td>
                    <input type="text" name="username"/>
                </td>
            </tr>
            <tr>
               <td>
                   Password:
               </td>
                <td>
                    <input type="password" name="password"/>
                </td>
            </tr>

        </table>
        <input type="submit"value="Submit" />
    </form>
    <a href="signup.jsp">Please Sign Up here if you don't have account!</a>
    <br/>
    <br/>
    <p style="color:red">${signUpMessage}</p>
</div>
</body>
</html>