<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/5/20
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <a href="addStu.jsp">新增</a>
    <form action="selectByNames" method="post" role="form" class="row btn">
        <input type="text" name="name" placeholder="请输入姓名" class="form-control col-md-4">
        <input type="submit" class="btn">
    </form>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>入学时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="row" items="${list}">
            <tr>
                <td>${row.id}</td>
                <td>${row.name}</td>
                <td>${row.sex}</td>
                <td>${row.time}</td>
                <td>
                    <a href="dels?id=${row.id}">删除</a>
                    <a href="selectByIds?id=${row.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
