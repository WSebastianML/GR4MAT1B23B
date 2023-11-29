<%--
  Created by IntelliJ IDEA.
  User: EDWIN
  Date: 29/11/2023
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Iniciar Sesión - Biblioteca</title>
    <link rel="stylesheet" href="Css/estiloLogin.css">
</head>
<body>
<div class="container">
  <div class="screen">
    <div class="screen__content">
      <form class="login" action="panelPrincipal.jsp">
        <div class="login__field">
          <i class="login__icon fas fa-user"></i>
          <input type="text" class="login__input" placeholder="Correo">
        </div>
        <div class="login__field">
          <i class="login__icon fas fa-lock"></i>
          <input type="password" class="login__input" placeholder="Contraseña">
        </div>
        <button class="button login__submit">
          <span class="button__text">Ingresar</span>
          <i class="button__icon fas fa-chevron-right"></i>
        </button>
      </form>
    </div>
    <div class="screen__background">
      <span class="screen__background__shape screen__background__shape4"></span>
      <span class="screen__background__shape screen__background__shape3"></span>
      <span class="screen__background__shape screen__background__shape2"></span>
      <span class="screen__background__shape screen__background__shape1"></span>
    </div>
  </div>
</div>
</body>
</html>
