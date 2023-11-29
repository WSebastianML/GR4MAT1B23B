package ec.edu.epn.gr4mat1b23b;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private GestorLibro gestorLibro = new GestorLibro();
    private int id;
    private String nombre;
    private String direccion;
    private String correo;
    private String telefono;

    public Usuario(int id, String nombre, String direccion, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }


    public void solicitarPrestamo() {
        mostrarDisponibilidadDeLibros();


    }

    //TODO: VER COMO MANDAMOS LA LISTA DE LIBROS DISPONIBLES
    private String mostrarDisponibilidadDeLibros() {
        if (gestorLibro.obtenerLibrosDisponibles() == null) {
            return "No existen libros disponibles, inténtelo más tarde";
        } else {
            return "Los libros disponibles son:";
        }
    }


}
