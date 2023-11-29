package ec.edu.epn.gr4mat1b23b;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Gestor_UsuarioTest {
Gestor_Usuario gestor_usuario;
    @Before
    public void setUp() throws Exception {
        gestor_usuario=new Gestor_Usuario();
    }

    @Test
    public void given_Usuario_when_agregarUsuario_then_ok() {
        assertTrue(gestor_usuario.agregarUsuario("rabit","Carcelen","erick.cabezas@epn.edu.ec","0998729903"));

    }

}