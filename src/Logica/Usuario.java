/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.File;
import java.io.IOException;

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
        File archivo = new File(url);
        archivo.mkdir();
    }

    public String getUrl() {
        return url;
    }   
    
    
}
