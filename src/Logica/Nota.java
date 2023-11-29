package Logica;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
public class Nota implements Serializable{
    private String nombre;
    private String categoria;
    private String contenido;
    private String url_usuario;

    public Nota(String nombre, String categoria, String contenido, String url_usuario) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.categoria = categoria;
        this.url_usuario = url_usuario;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUsuario() {
        return url_usuario;
    }

    public void setUsuario(String usuario) {
        this.url_usuario = usuario;
    }

    
    

   
}

    
