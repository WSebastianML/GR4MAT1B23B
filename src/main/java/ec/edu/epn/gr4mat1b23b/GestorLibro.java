package ec.edu.epn.gr4mat1b23b;

import java.util.ArrayList;
import java.util.List;

public class GestorLibro {
    private List<Libro> libros;
    private final List<Libro> listaLibrosPrestados = new ArrayList<>();
    private final List<Libro> listaLibrosDisponibles = new ArrayList<>();


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

    public List<Libro> getListaLibrosPrestados() {
        return listaLibrosPrestados;
    }

    public List<Libro> getListaLibrosDisponibles() {
        return listaLibrosDisponibles;
    }

    public void obtenerListaLibros() {

        for (Libro libro : libros) {
            if (libro.getEstado() == Estado.DISPONIBLE) {
                this.listaLibrosDisponibles.add(libro);
            }else{
                this.listaLibrosPrestados.add(libro);
            }
        }
    }

    public String imprimirLista(List<Libro> lista){
        String retorno = "";
        for(Libro libro : lista){
            retorno += libro.toString();
        }
        return retorno;
    }
}
