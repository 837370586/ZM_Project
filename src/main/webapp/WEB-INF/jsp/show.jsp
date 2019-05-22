<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2019/5/14
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">

    <tr>
        <th>ID</th>
        <th>USER</th>
        <th>PASSWORD</th>
        <th>OPERATION</th>
    </tr>

    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.user}</td>
            <td>${user.password}</td>
            <td><a href="skip_alertUser">修改</a>或<a href="">删除</a></td>
        </tr>
    </c:forEach>
</table>
<a href="skip_addUser">添加用户</a>
</body>
</html>
