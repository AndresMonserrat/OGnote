/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deavi
 */
public class Usuario {
    private   int ID;
    private  String url;


    public void setID(int ID) {
        this.ID = ID;
        setUrl();
    }

    public void setUrl() {
        this.url ="C:\\Users\\deavi\\Downloads\\OG_Note_ProFinal-Camilo\\src\\notas\\"+ID;
        Path path = Paths.get(url);
        File archivo = new File(url);
        archivo.mkdir();
        try{
            //Oculado
            Files.setAttribute(path, "dos:hidden", true);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUrl() {
        return url;
    }   
    
    
}
