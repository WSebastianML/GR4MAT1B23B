package ec.edu.epn.gr4mat1b23b;

import java.util.Objects;

public class Libro {

    private String ISBN;
    private String titulo;
    // el estado solo puede ser: prestado o disponible
    private String estado;


    public Libro(String ISBN, String titulo) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.estado="disponible";
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.equalsIgnoreCase("prestado")
                ||estado.equalsIgnoreCase("disponible")){
            this.estado = estado;
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

}
