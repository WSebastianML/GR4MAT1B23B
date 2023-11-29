<%--
  Created by IntelliJ IDEA.
  User: Christopher Zambrano
  Date: 29/11/2023
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="Css/estiloRecibo.css">
</head>
<body>
<table class="body-wrap">
    <tbody><tr>
        <td></td>
        <td class="container" width="600">
            <div class="content">
                <table class="main" width="100%" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                        <td class="content-wrap aligncenter">
                            <table width="100%" cellpadding="0" cellspacing="0">
                                <tbody><tr>
                                    <td class="content-block">
                                        <h2>Prestamo Exitoso</h2>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                        <table class="invoice">
                                            <tbody><tr>
                                                <td>$Nombre $apellido<br>Recibo #$Nrecibo<br>$Fecha</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <table class="invoice-items" cellpadding="0" cellspacing="0">
                                                        <tbody><tr>
                                                            <td>Libro 1</td>
                                                            <td class="alignright"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Libro 2</td>
                                                            <td class="alignright"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Libro 3</td>
                                                            <td class="alignright"></td>
                                                        </tr>
                                                        <tr class="total">
                                                            <td class="alignright" width="80%">Total</td>
                                                            <td class="alignright">3 Libros</td>
                                                        </tr>
                                                        </tbody></table>
                                                </td>
                                            </tr>
                                            </tbody></table>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                        <a href="/GR4MAT1B23B_war_exploded/prestamo.jsp">Volver</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                        Biblioteca GR4. Quito, Ecuador
                                    </td>
                                </tr>
                                </tbody></table>
                        </td>
                    </tr>
                    </tbody></table>
                <div class="footer">
                    <table width="100%">
                        <tbody><tr>
                            <td class="aligncenter content-block">Escuela Politécnica Nacional</td>
                        </tr>
                        </tbody></table>
                </div></div>
        </td>
        <td></td>
    </tr>
    </tbody></table>
</body>
</html>
