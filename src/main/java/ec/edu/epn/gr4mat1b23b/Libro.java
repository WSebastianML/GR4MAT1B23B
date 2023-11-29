package ec.edu.epn.gr4mat1b23b;

import java.util.Objects;

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

    public Libro prestar(){
        this.estado = Estado.PRESTADO;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(ISBN, libro.ISBN) && estado == libro.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, estado);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
