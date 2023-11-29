package ec.edu.epn.gr4mat1b23b;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class Gestor_Usuario {
    private Random rand;
    private Set<Integer> ids;
    private ArrayList<Usuario> usuarios;
    private  Gson gson;


    public Gestor_Usuario() {
        gson = new Gson();
        usuarios = new ArrayList<>();
        rand = new Random();
        ids = new HashSet<>();
        obtenerUsuariosRegistrados();
        obtenerIDs();
    }

    public void obtenerUsuariosRegistrados(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/Datos/usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Usuario usuario = gson.fromJson(linea, Usuario.class);
                this.usuarios.add(usuario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void obtenerIDs(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/Datos/ids.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Integer id = gson.fromJson(linea, Integer.class);
                this.ids.add(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirUsuario(Usuario usuarioAdd){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/Datos/usuarios.txt", true))) {
            String json = gson.toJson(usuarioAdd);
            bw.write(json);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirID(Integer id){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/Datos/ids.txt", true))) {
            String json = gson.toJson(id);
            bw.write(json);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int generarIdUnico() {
        int id;
        do {
            id = rand.nextInt(900) + 100;  // Genera un número aleatorio entre 100 y 999
        } while (!ids.add(id));  // Continúa generando hasta que se encuentre un ID único
        escribirID(id);
        return id;
    }

    public boolean agregarUsuario(String nombre, String direccion, String correo, String telefono) {
        int id = generarIdUnico();
        Usuario usuarioAdd=new Usuario(id,nombre,direccion,correo,telefono);
        escribirUsuario(usuarioAdd);
        return this.usuarios.add(usuarioAdd);
    }

}
