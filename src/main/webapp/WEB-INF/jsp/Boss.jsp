<%--
  Created by IntelliJ IDEA.
  User: 周小东
  Date: 2019/5/25
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <table border="1">
            <tr>
                <td>员工编号</td>
                <td>员工姓名</td>
                <td>员工性别</td>
                <td>员工电话</td>
                <td>员工职位</td>
                <td>权限等级</td>
                <td>权限内容</td>
            </tr>
            <c:forEach items="${list}" var="employee">
                <tr>
                   <td>${employee.employee_id}</td>
                    <td>${employee.employee_name}</td>
                    <td>${employee.employee_sex}</td>
                    <td>${employee.employee_tel}</td>
                    <td>${employee.role.roleName}</td>
                </tr>


            </c:forEach>


        </table>
</body>
</html>
