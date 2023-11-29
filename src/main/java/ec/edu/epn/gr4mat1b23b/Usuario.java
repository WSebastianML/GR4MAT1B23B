package ec.edu.epn.gr4mat1b23b;

public class Usuario {
    private int id;
    private String nombre;
    private String direccion;
    private String correo;
    private String telefono;

    public Usuario(int id, String nombre, String direccion, String correo, String telefono) {
        this.id=id;
        this.nombre = nombre;
        this.direccion=direccion;
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
}
