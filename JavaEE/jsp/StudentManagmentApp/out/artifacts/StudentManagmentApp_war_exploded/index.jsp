<%--
  Created by IntelliJ IDEA.
  User: imac27inch
  Date: 2019-07-28
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="az">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Login</title>
  <link rel="stylesheet" href="css/login.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/login_responsive.css">
</head>
<body>
<%
  int a=5+6;
  out.print(a);
%>
<div class="login">
  <img src="img/login.png">
  <form action="" method="post">
    <div class="form_input">
      <input type="email" class="login_email" placeholder="Email">
    </div>
    <div class="form_input2">
      <input type="password" placeholder="Sifre" class="login_sifre">
    </div>

    <p>Əgər qeydiyyatınız yoxdursa </p><a href="register.jsp"> qeydiyyatdan keçin</a>
    <input type="button" class="login_btn" value="Daxil ol">



  </form>



</div>

</body>
</html>
