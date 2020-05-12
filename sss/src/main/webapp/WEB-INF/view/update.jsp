<%--
  Created by IntelliJ IDEA.
  User: 12243
  Date: 2020/5/12
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
</head>
    <title>update</title>
<body>
<h2 align="center">简历修改页面</h2>
<form action="/resume/update" method="post">
    <table align="center" border="1">

        <input type="hidden" name="id" value="${resume.id}" >

        <tr>
            <td>用户名:</td>
            <td><input type="text" name="name" value="${resume.name}"></td>
        </tr>
        <tr>
            <td>地址:</td>
            <td><input type="text" name="address" value="${resume.address}"></td>
        </tr>
        <tr>
            <td>手机:</td>
            <td><input type="text" name="phone" value="${resume.phone}"></td>
        </tr>
        <tr>
        <tr>
            <td><input type="submit" value="修改" ></td>
        </tr>

    </table>
</form>
</body>
</html>
