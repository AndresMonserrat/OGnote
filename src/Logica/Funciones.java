package Logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import Logica.Nota;

public class Funciones {
    public static int Num_Notas(String usuario){
        File notas = new File(usuario);
        File[] archivos = notas.listFiles();
        int cont=0;
        for (File nota : archivos){
            cont+=1;
        }
        return cont;
    }
    public static Nota[] Abrir_Notas(int cantidad, String usuario){
        File notas = new File(usuario);
        File[] archivos = notas.listFiles();
        Nota[] notas_previas = new Nota[cantidad];
        int i=0;
        for (File nota : archivos){
            try { 
                BufferedReader leer = new BufferedReader(new FileReader(nota));
                String line= null;
                while((line = leer.readLine()) != null){
                    String temp[] = line.split(";");
                    notas_previas[i]= new Nota(temp[1],temp[3],temp[4],temp[0],Integer.parseInt(temp[2]));  
                }
                i+=1;
            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
            }
        }
        return notas_previas;
    }   
    public static ListaDobleEnlazada FiltrarCategoria(ListaDobleEnlazada lista, String elemento) {
        ListaDobleEnlazada nuevaLista = new ListaDobleEnlazada();
        Nodo actual = lista.inicio;
        while (actual != null) {
            if (actual.dato.Get_categoria().equals(elemento)) {
                nuevaLista.agregar(actual.dato);
            }
            actual = actual.siguiente;
        }

        return nuevaLista;
    }
}

