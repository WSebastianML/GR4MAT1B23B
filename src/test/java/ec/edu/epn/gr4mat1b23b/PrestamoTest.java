package ec.edu.epn.gr4mat1b23b;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrestamoTest {

    @Test
    public void obtenerLibrosPrestados() {
        GestorLibro gestorLibro = new GestorLibro();
        gestorLibro.obtenerListaLibros();
        List<Libro> librosExpected = gestorLibro.getListaLibrosPrestados();

        List<Libro> librosActual = new ArrayList<>();
        Libro libro1 = new Libro("9781234567890", "SPIDERMAN", Estado.PRESTADO);
        Libro libro2 = new Libro("9781234567833", "X-MEN", Estado.PRESTADO);
        librosActual.add(libro1);
        librosActual.add(libro2);

        assertEquals(librosExpected, librosActual);
    }
}