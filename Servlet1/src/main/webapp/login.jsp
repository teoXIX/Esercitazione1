<%--
  Created by IntelliJ IDEA.
  User: marco
  Date: 22/12/2022
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
  <form id = "login" method = "POST" action = "nomeServlet" >
    <h1>INSERISCI I TUOI DATI</h1>
    <label>Nome</label>
    <input type = "text" name = "nome"/>
    <label>Cognome</label>
    <input type = "text" name = "cognome"/>
    <br>
    <input type = "submit" id = "Invia" value = "Login"/>
  </form>
</body>
</html>
