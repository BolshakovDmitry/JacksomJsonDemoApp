<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 05.12.2019
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringRest HomePage</title>
</head>
<body>
<h3>Spring Rest Demo</h3>
<hr>
<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
<br><br>
<a href="${pageContext.request.contextPath}/api/students">Get list of students</a>
</body>
</html>
