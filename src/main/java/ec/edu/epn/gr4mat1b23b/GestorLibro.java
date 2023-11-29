package ec.edu.epn.gr4mat1b23b;

import java.util.ArrayList;
import java.util.List;

public class GestorLibro {
    private List<Libro> libros;


    public GestorLibro() {
        this.libros = new ArrayList<>();
        Libro libro1 = new Libro("9781234567890", "SPIDERMAN", Estado.PRESTADO);
        Libro libro2 = new Libro("9783456789012", "HULK", Estado.DISPONIBLE);
        Libro libro3 = new Libro("9781234567833", "X-MEN", Estado.PRESTADO);
        Libro libro4 = new Libro("9781234567846", "AVATAR", Estado.DISPONIBLE);
        Libro libro5 = new Libro("9781234567810", "SANGRE DE CAMPEON", Estado.DISPONIBLE);
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
    }

    public List<Libro> obtenerLibrosDisponibles() {
        List<Libro> listaLibrosDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getEstado() == Estado.DISPONIBLE) {
                listaLibrosDisponibles.add(libro);
            }
        }
        return listaLibrosDisponibles;
    }


}
