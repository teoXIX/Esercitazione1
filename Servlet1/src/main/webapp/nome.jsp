<%--
  Created by IntelliJ IDEA.
  User: marco
  Date: 21/12/2022
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pagina Nome</title>
</head>
<body>
    nome da visualizzare: ${VariabileNome}
    <%= session.getAttribute("nome") %>
    <br>
    cognome da visualizzare: <%= session.getAttribute("cognome") %>
    <br>
    email da visualizzare: <%= session.getAttribute("email") %>
    <br>
    password da visualizzare: <%= session.getAttribute("password") %>
</body>
</html>
