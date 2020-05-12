<%--
  Created by IntelliJ IDEA.
  User: 12243
  Date: 2020/5/12
  Time: 0:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<h2 align="center">简历添加页面</h2>
<form action="/resume/add" method="post">
    <table align="center" border="1">
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>地址:</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>手机:</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
        <tr>
            <td><input type="submit" value="添加" name="add"></td>
        </tr>
    </table>
</form>
</body>
</html>
