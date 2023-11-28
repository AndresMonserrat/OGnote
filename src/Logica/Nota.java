package Logica;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Nota {
    private int id;
    private String nombre;
    private String categoria;
    private String contenido;
    private String usuario;

    public Nota(String nombre, String categoria, String contenido, String usuario, int id) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.categoria = categoria;
        this.id = id;
        this.usuario = usuario;
        try {
            File archivo = new File(usuario + File.separator + nombre + ".txt");
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter bufferEscritura = new BufferedWriter(escritor);
            bufferEscritura.write(usuario + ";" +nombre + ";" + this.id + ";" + categoria + ";" + contenido);
            bufferEscritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String Get_name() {
        return this.nombre;
    }

    public String Get_contenido() {
        return this.contenido;
    }
    public String Get_categoria(){
        return this.categoria;
        
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.id);
        System.out.println("Categoría: " + this.categoria);
        System.out.println("Contenido: " + this.contenido);
    }
}

    
