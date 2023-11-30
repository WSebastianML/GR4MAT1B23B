package servlets;

import ec.edu.epn.gr4mat1b23b.Gestor_Usuario;
import ec.edu.epn.gr4mat1b23b.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registroServlet", value = "/RegistroServlet")
public class RegistroServlet extends HttpServlet {
    private String message;
    public static Gestor_Usuario gestor_usuario = new Gestor_Usuario();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest solicitud, HttpServletResponse respuesta) throws ServletException, IOException {
        HttpSession misesion = solicitud.getSession();
        misesion.setAttribute("registro", RegistrarUsuario(solicitud));
        respuesta.sendRedirect("registro.jsp");
    }

    public String RegistrarUsuario(HttpServletRequest solicitud) {
        String nombre = solicitud.getParameter("nombre");
        String direccion = solicitud.getParameter("direccion");
        String correo = solicitud.getParameter("correo");
        String telefono = solicitud.getParameter("telf");
        if (gestor_usuario.agregarUsuario(nombre, direccion, correo, telefono)) {
            Usuario usuarioagregado = gestor_usuario.getUsuariotem();
            return "usuario agregado con su ID: " + usuarioagregado.getId();
        }else{
            return "usuario no agregado";
        }
    }

    public void destroy() {
    }
}
