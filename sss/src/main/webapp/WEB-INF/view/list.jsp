<%@ page import="com.tdd.edu.pojo.Resume" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<h2 align="center">简历列表页面</h2>
<table align="center" border="1">
    <tr>
        <th>ID&nbsp;&nbsp;</th>
        <th>用户名&nbsp;&nbsp;</th>
        <th>地址&nbsp;&nbsp;</th>
        <th>电话&nbsp;&nbsp;</th>
        <th><a href="/resume/add">添加简历</a></th>
    </tr>
    <%for (Resume u : (List<Resume>) request.getAttribute("list"))
    {%>
    <tr>
        <td><%=u.getId()%></td>
        <td><%=u.getName()%></td>
        <td><%=u.getAddress()%></td>
        <td><%=u.getPhone()%></td>
        <td>
            <a href="/resume/update?id=<%=u.getId()%>">修改简历</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/resume/delete?id=<%=u.getId()%>">删除简历</a>
        </td>
    </tr>
    <%}%>

</table>
</body>
</html>
