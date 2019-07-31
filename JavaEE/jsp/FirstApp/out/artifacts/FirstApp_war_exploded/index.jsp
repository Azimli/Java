<%--
  Created by IntelliJ IDEA.
  User: shaki
  Date: 7/30/2019
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Login</title>
  <link rel="stylesheet" href="css/login.css" type="text/css" />
  <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
  <link rel="stylesheet" href="css/login_responsive.css" type="text/css" />
</head>
<body>



<div class="login">
  <img src="img/login.png">
  <form action="LoginServlet" method="post">
    <div class="form_input">
      <input type="email" name="email" class="login_email" placeholder="Email">
    </div>
    <div class="form_input2">
      <input type="password" name="password" placeholder="Sifre" class="login_sifre">
    </div>

    <p>Əgər qeydiyyatınız yoxdursa </p><a href="register.jsp"> qeydiyyatdan keçin</a>
    <input type="submit" class="login_btn" value="Daxil ol" onclick="formYoxla()">

  </form>



</div>

</body>
</html>

