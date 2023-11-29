package ec.edu.epn.gr4mat1b23b;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class Gestor_UsuarioParametersTest {
    private Gestor_Usuario gestor_usuario=new Gestor_Usuario();
    private String[] parametrosRegistro;


    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new String[]{"Rabit","Carcelen","erick.cabezas@epn.edu.ec","0998729903"}});
        objects.add(new Object[]{new String[]{"Erick","Carcelen","erick.cabezas@epn.edu.ec","0998729903"}});
        objects.add(new Object[]{new String[]{"monica","Carcelen","erick.cabezas@epn.edu.ec","0998729903"}});
        return objects;
    }


    public Gestor_UsuarioParametersTest( String[] parametros ) {
        this.parametrosRegistro = parametros;
    }

    @Test(timeout = 50)
    public void given_parameters_when_agregarUsuario_then_timeout() {
        assertTrue(gestor_usuario.agregarUsuario(parametrosRegistro[0],parametrosRegistro[1],parametrosRegistro[2],parametrosRegistro[3]));
    }


}