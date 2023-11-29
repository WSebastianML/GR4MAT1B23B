package ec.edu.epn.gr4mat1b23b;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private List<Libro> librosPrestados;
    private Usuario usuario;

    private GestorLibro gestorLibro;

    private String historial;

    public Prestamo(Usuario usuario) {
        this.librosPrestados = new ArrayList<>();
        this.usuario = usuario;
        this.historial = "";
    }

    public void actualizarHistorial(){
        List<Libro> librosPrestados = gestorLibro.getListaLibrosPrestados();
        this.historial += gestorLibro.imprimirLista(librosPrestados);
    }

}
