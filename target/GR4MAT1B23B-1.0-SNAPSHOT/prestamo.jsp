<%@ page import="ec.edu.epn.gr4mat1b23b.Biblioteca" %>
<%@ page import="java.util.List" %>
<%@ page import="ec.edu.epn.gr4mat1b23b.Libro" %><%--
  Created by IntelliJ IDEA.
  User: Christopher
  Date: 29/11/2023
  Time: 10:28
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
                                        <h2>Prestamo de Libro</h2>
                                        <h3>Libros disponibles:</h3><br/>
                                        <%
                                            Biblioteca gestorLibro = new Biblioteca();
                                            gestorLibro.obtenerLibros();
                                            List<Libro> lista = gestorLibro.LibrosDisponibles();
                                        %>
                                        <table>
                                            <tr>
                                                <th>ISBN</th>
                                                <th>Titulo</th>
                                                <th>Estado</th>
                                                <th>Opcion</th>
                                            </tr>
                                            <%
                                                for (Libro libro : lista) {
                                            %>
                                            <tr>
                                                <td><%=libro.getISBN()%></td>
                                                <td><%=libro.getTitulo()%></td>
                                                <td><%=libro.getEstado()%></td>
                                                <td>
                                                <form action="PrestamoServlet" method="GET">
                                                    <input type="submit" value="Prestar">
                                                </form>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>

                                        </table>
                                        <form action="reciboPrestamo.jsp" method = "POST">
                                            <select style=" padding: 10px; padding-right: 126px; " name="libro" multiple required>
                                                <option value ="libro1">Titulo Libro1</option>
                                                <option value ="libro2">Titulo Libro2</option>
                                                <option value ="libro3">Titulo Libro3</option>
                                                <option value ="libro4">Titulo Libro4</option>
                                            </select><br/> <br/>
                                            <input type= submit value="Seleccionar">
                                        </form>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                        <a href="/GR4MAT1B23B_war_exploded/panelPrincipal.jsp">Volver</a>
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
