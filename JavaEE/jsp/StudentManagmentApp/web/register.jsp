<%--
  Created by IntelliJ IDEA.
  User: imac27inch
  Date: 2019-07-28
  Time: 18:57
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
<div class="registration">
    <h1>Qeydiyyat Formu</h1>
    <form action="" method="post">
        <input type="text" class="ad" placeholder="Ad">
        <input type="text" class="soyad" placeholder="Soyad">
        <input type="text" class="atasinin_adi" placeholder="Atasinin adi">
        <input type="email" class="email" placeholder="email">
        <input type="text" class="telefon" placeholder="Telefon">
        <input type="password" class="sifre" placeholder="Sifre">
        <input type="password" class="sifre_2" placeholder="Test sifresi">
        <div class="sekil"><label>Şəkil seç: </label><input type="file" name="sekil" accept="image/*" required /></div>
        <p>Mən bütün </p><a href="#">şərtləri qəbul edirəm</a>
        <input type="button" class="register_btn" value="Qeydiyyatdan kec">
        <center>
            <p>Artıq bir hesabınız var</p>
            <a href="index.jsp">Ana səhifəyə geri dön</a>
        </center>
    </form>
</div>




<script src="js/main.js"></script>
</body>
</html>
