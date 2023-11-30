package ec.edu.epn.gr4mat1b23b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    static int Facturanum;
    private ArrayList<Libro> librosPrestados;
    private Usuario usuario;
    private String fechaFactura;


    public Factura(Usuario usuario, ArrayList<Libro> librosPrestados) {
        this.fechaFactura=String.valueOf(LocalDate.now());
        Factura.Facturanum+=1;
        this.librosPrestados = librosPrestados;
        this.usuario = usuario;
    }

    public int totalLibrosPrestados(){
        int totalElementos = librosPrestados.size();
        return totalElementos;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    @Override
    public String toString() {
        return "Factura num:"+Factura.Facturanum
                +"| cliente:"+usuario.getNombre()
                +"| libros prestados:"+totalLibrosPrestados();
    }

}
