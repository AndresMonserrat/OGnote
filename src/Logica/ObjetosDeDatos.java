package Logica;

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import static Logica.Funciones.Abrir_Notas;
import static Logica.Funciones.FiltrarCategoria;
import static Logica.Funciones.Num_Notas;

public class ObjetosDeDatos {
    public static void main(String[] args) {
        ListaDobleEnlazada lista_notas = new ListaDobleEnlazada();
        String Cat;
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        String titulo,categoria, contenido, usuario, ruta;
        int id, numero_de_notas;
        System.out.println("Usuario");
        usuario = leer.nextLine();
        ruta="notas"+File.separator+usuario;
        File carpeta = new File(ruta);
        if (carpeta.exists() && carpeta.isDirectory()) {
        } else {
            carpeta.mkdirs();
        }
        numero_de_notas = Num_Notas(ruta);
        Nota[] notas_anteriores = new Nota[numero_de_notas];
        notas_anteriores = Abrir_Notas(numero_de_notas,ruta);
        for (int i = 0; i < numero_de_notas; i++) {
            lista_notas.agregar(notas_anteriores[i]);
        }
        System.out.println("Titulo");
        titulo = leer.nextLine();
        System.out.println("Contenido");
        contenido = leer.nextLine();
        System.out.println("Categoria");
        categoria = leer.nextLine();
        id=random.nextInt(99999);
        lista_notas.agregar(new Nota(titulo, categoria, contenido,ruta,id));
        //lista_notas.imprimir();
        ListaDobleEnlazada lista_filtrada = new ListaDobleEnlazada();
        System.out.println("Categoria que quiere ver");
        Cat = leer.nextLine();
        lista_filtrada= FiltrarCategoria(lista_notas, Cat);
        lista_filtrada.imprimir();
    }
    
}
