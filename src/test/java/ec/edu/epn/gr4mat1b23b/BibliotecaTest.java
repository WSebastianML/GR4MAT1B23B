package ec.edu.epn.gr4mat1b23b;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BibliotecaTest {
private Biblioteca biblioteca;
    @Before
    public void setUp() throws Exception {
        biblioteca=new Biblioteca();
    }

    @Test
    public void facturar() {
        biblioteca.prestarLibro("0198526636");
        biblioteca.prestarLibro("0198525536");
        String expected= "Factura num:"+1
                +"| cliente:erick"
                +"| libros prestados:"+2;
        Factura factura=biblioteca.facturar(508);
        assertEquals(expected,factura.toString());
    }
}