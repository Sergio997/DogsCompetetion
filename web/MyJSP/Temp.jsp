<%--
  Created by IntelliJ IDEA.
  User: Sergio
  Date: 29.12.2018
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="person" class="myjsp.Person"/>
    <jsp:setProperty name="person" property="name" value="Max"/>
    <jsp:getProperty name="person" property="name"/>
</body>
</html>
