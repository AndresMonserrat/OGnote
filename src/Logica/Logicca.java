package Logica;

import java.io.File;
import Logica.Excepciones;

public class Logicca {

    public Excepciones ex = new Excepciones();

    public void crear_carpetaUsuario(String id_usuario) {
        String crear = "C:\\Users\\camil\\OneDrive\\Documentos\\NetBeansProjects\\OG\\src\\NotasUsuarios\\" + id_usuario + "_Notas";
        File CrearCarpeta = new File(crear);
        if (CrearCarpeta.mkdirs()) {
            System.out.println("\nSe ha creado la carpeta para el usuario\n");
        } else {
            ex.ExcepcionCrearArchivoUsuario();
        }

    }
}
