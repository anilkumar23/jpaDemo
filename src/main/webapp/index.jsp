<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Form</title>
    <style>
        table, tr{
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h1 align="center">Registration Form</h1>
<form action="register" method="post">
    <table align="center">
        <tr>
            <th>Name :</th>
            <td><input type="text" name="userName" size="20"/></td>
        </tr>

        <tr>
            <th>Password :</th>
            <td><input type="password" name="password" size="20"/></td>
        </tr>

        <tr>
            <th>Email ID :</th>
            <td><input type="text" name="email" size="20"/></td>
        </tr>
    </table>
    <p align="center"/>
    <input type="submit" value="register" align="center" />
</form>
<form action="userList" method="get">

</form>
</body>
