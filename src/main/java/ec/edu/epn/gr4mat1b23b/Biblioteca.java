package ec.edu.epn.gr4mat1b23b;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Libro> librosDisponobles;
    private Gestor_Usuario gestor_usuario;
    private  Gson gson;

    private ArrayList<Libro> librosprestados;


    public Biblioteca() {
        gson = new Gson();
        this.libros = new ArrayList<>();
        this.librosDisponobles = new ArrayList<>();
        this.gestor_usuario=new Gestor_Usuario();
        this.librosprestados=new ArrayList<>();
        obtenerLibros();
    }

    public void obtenerLibros(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/Datos/libros.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Libro libro = gson.fromJson(linea, Libro.class);
                this.libros.add(libro);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirLibro(Libro libroAdd){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/Datos/libros.txt", true))) {
            String json = gson.toJson(libroAdd);
            bw.write(json);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sobrescribirLibros(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/Datos/libros.txt", false)); // false para sobrescribir
            for (Libro libro : libros) {
                String json = gson.toJson(libro);
                writer.write(json);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void registrarTransaccion(String transaccion){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/Datos/transacciones.txt", true))) {
            bw.write(transaccion);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al registrar la transacción: " + e.getMessage());
        }
    }

    public String leerTransacciones(){
        StringBuilder content = new StringBuilder();
        String resultadoDetransaccion;
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/Datos/transacciones.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
            resultadoDetransaccion= content.toString();
            return resultadoDetransaccion;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean agregarLibro(String ISBN, String titulo) {
        Libro libroAdd=new Libro(ISBN, titulo);
        escribirLibro(libroAdd);
        return this.libros.add(libroAdd);
    }

    public ArrayList<Libro> LibrosDisponobles() {
        for (Libro libro : libros) {
            if (libro.getEstado().equals("disponible")) {
                this.librosDisponobles.add(libro);
            }
        }
        return this.librosDisponobles;
    }

    public Libro buscarLibro(String ISBN){
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(String ISBN){
        Libro libro= buscarLibro(ISBN);
        libro.setEstado("prestado");
        sobrescribirLibros();
        librosprestados.add(libro);
    }

    public Factura facturar(int idUsuario){
        Usuario usuario=gestor_usuario.buscarUsuario(idUsuario);
        Factura factura=new Factura(usuario, librosprestados);
        this.librosprestados=new ArrayList<>();
        registrarTransaccion(factura.toString());
        return factura;
    }

}
