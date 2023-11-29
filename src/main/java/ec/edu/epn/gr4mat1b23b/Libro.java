package ec.edu.epn.gr4mat1b23b;

public class Libro {

    private String ISBN;
    private String titulo;
    private Estado estado;


    public Libro(String ISBN, String titulo, Estado estado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.estado = estado;
    }


    public Estado getEstado() {
        return estado;
    }

}
