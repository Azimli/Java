<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: shaki
  Date: 7/30/2019
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Database</title>
</head>
<body>

<%

    Class.forName("com.mysql.jdbc.Driver");
    String url ="jdbc:mysql://localhost:3306/java";
    String username ="root";
    String password ="";
    Connection connection = DriverManager.getConnection(url,username,password);
    Statement st = connection.createStatement();
%>

</body>
</html>
