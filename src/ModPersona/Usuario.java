/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModPersona;

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
    private  int ID;
    private  String url;
    private  String email;
    private  String contraseña; 

    public void setID(int ID) {
        this.ID = ID;
        this.email = "";
        setUrl();
    }

    public void setUrl() {
        this.url =System.getProperty("user.home")+"\\notas\\"+ID;
        Path path = Paths.get(url);
        File archivo = new File(url);
        archivo.mkdirs();
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
