package ec.edu.epn.gr4mat1b23b;

import org.junit.Test;


public class UsuarioTest {


    Usuario usuario = new Usuario(1, "Johan",
            "Jardin del valle", "johan.mantilla01@epn.edu.ec", "0983706479");
    GestorLibro gestorLibro = new GestorLibro();


    @Test
    public void given_AnUser_when_requestLoan_then_ok() {
        usuario.solicitarPrestamo();
    }


}