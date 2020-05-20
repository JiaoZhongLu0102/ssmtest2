<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/5/20
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <form action="./inserts" method="post" class="btn">
        <input type="hidden" name="sid" value="${stu.id}">
        <input type="text" name="name" value="${stu.name}"  placeholder="姓名"><br>
        <input type="text" name="sex" value="${stu.sex}" placeholder="性别"><br>
        <input type="text" name="time" value="${stu.time}" placeholder="入学时间"><br>
        <input type="submit"  value="提交"  class="btn">
    </form>
</body>
</html>
