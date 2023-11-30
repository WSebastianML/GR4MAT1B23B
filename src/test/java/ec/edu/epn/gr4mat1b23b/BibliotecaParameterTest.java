package ec.edu.epn.gr4mat1b23b;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class BibliotecaParameterTest {
    private Biblioteca biblioteca=new Biblioteca();
    private String[] parametrosRegistro;


    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new String[]{"0198526636","El murcielago"}});
        objects.add(new Object[]{new String[]{"0198524436","Carcelen muerta"}});
        objects.add(new Object[]{new String[]{"0198525536","Caprichosa"}});
        return objects;
    }


    public BibliotecaParameterTest( String[] parametros ) {
        this.parametrosRegistro = parametros;
    }

    @Test(timeout = 50)
    public void given_parameters_when_agregarLibro_then_timeout() {
        assertTrue(biblioteca.agregarLibro(parametrosRegistro[0],parametrosRegistro[1]));
    }
}