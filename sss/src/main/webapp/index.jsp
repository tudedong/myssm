<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <style>
        div{
            padding:10px 10px 0 10px;
        }
    </style>
</head>
<body>

<div style="padding-left: 600px">
    <h2>欢迎使用~</h2>
    <form method="post" action="/login">
        用户名：<input type="text" name="username" value="admin"/><br/>
        密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" value="admin"/><br/>
        <p></p>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" value="登录"/>
    </form>
</div>

</body>
</html>
