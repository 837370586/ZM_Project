<%--
  Created by IntelliJ IDEA.
  User: 胡敏
  Date: 2019/5/28
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>

</head>
<body>
<table>
    <tr>
        <td>被保人身份证</td>
        <td>姓名</td>
        <td>手机号</td>
        <td>车牌号</td>


    </tr>
    <c:forEach items="${selectAll}" var="list">
    <tr>
        <td>${list.insurance_price}</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    </c:forEach>
</body>
</html>
