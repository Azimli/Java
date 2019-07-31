<%--
  Created by IntelliJ IDEA.
  User: shaki
  Date: 7/30/2019
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Qeydiyyat Formu</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<%
   /* if (session.getAttribute("email") == null){
        response.sendRedirect("index.jsp");
    }*/
%>
<div class="registration">
    <h1>Qeydiyyat Formu</h1>
    <form action="RegisterServlet" method="post">
        <input type="text" class="ad" placeholder="Ad" name="name">
        <input type="text" class="soyad" placeholder="Soyad" name="surname">
        <input type="text" class="atasinin_adi" placeholder="Atasinin adi" name="father_name">
        <input type="email" class="email" placeholder="email" name="email">
        <input type="text" class="telefon" placeholder="Telefon" name="phone">
        <input type="password" class="sifre" placeholder="Sifre" name="password1">
        <input type="password" class="sifre_2" placeholder="Test sifresi" name="password2">
        <div class="sekil"><label>Şəkil seç: </label><input type="file" name="photo" accept="image/*" required /></div>
       <%-- <p>Mən bütün </p><a href="#">şərtləri qəbul edirəm</a>--%>
        <input type="submit" class="register_btn" value="Qeydiyyatdan kec">
        <center>
            <p>Artıq bir hesabınız var</p>
            <a href="index.jsp">Ana səhifəyə geri dön</a>
        </center>
    </form>
</div>




<script src="js/main.js"></script>
</body>
</html>

