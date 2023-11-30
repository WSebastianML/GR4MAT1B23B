<%--
  Created by IntelliJ IDEA.
  User: EDWIN
  Date: 29/11/2023
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTRO DE USUARIOS</title>
    <link rel="stylesheet" href="Css/stylesRegistro.css">
</head>
<body>
<div id="cuadro">
    <h1 id="titulo">Datos de registro</h1>
    <form action="RegistroServlet" method="POST">
        <div class="nombreUsuario"><p><label>Nombre:</label><input type="text" name="nombre"></p>
            <p><label>Direccion:</label><input type="text" name="direccion"></p>
            <p><label>Correo:</label><input type="text" name="correo"></p>
            <p><label>Telefono:</label><input type="text" name="telf"></p></div>
        <div class="btnRegistrarse">
            <button type="submit"> Registrarse</button>
        </div>
    </form>
    <br>
    <div class="txtAgregado">
        <%
            String agregado = ".....";
            agregado = (String) request.getSession().getAttribute("registro");
        %>
        <%
            if (agregado != null) {
        %>
        <p id="usuarioEsRegistrado"><%=agregado%></p>
        <%}%>
        <br>
    </div>
</div>
</body>
</html>