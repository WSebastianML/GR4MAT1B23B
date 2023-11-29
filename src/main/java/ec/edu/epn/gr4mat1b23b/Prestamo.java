package ec.edu.epn.gr4mat1b23b;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private List<Libro> librosPrestados;
    private Usuario usuario;

    private GestorLibro gestorLibro;

    public Prestamo(Usuario usuario) {
        this.librosPrestados = new ArrayList<>();
        this.usuario = usuario;
    }

    public List<Libro> obtenerLibrosPrestados(){
        List<Libro> librosPrestados = new ArrayList<>();
        for(Libro libro : gestorLibro.obtenerLibrosDisponibles()){
            if(libro.prestar().getEstado() == Estado.PRESTADO ){
                librosPrestados.add(libro);
            }
        }
        return librosPrestados;
    }

}
