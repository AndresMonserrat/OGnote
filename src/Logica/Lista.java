
package Logica;
class Nodo {
    Nota dato;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(Nota dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}

class ListaDobleEnlazada {
    Nodo inicio;

    public ListaDobleEnlazada() {
        this.inicio = null;
    }

    // Método para agregar un nodo al final de la lista
    public void agregar(Nota dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo ultimo = inicio;
            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }

            ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimo;
        }
    }

    // Método para imprimir la lista hacia adelante
    public void imprimir() {
        Nodo actual = inicio;
        while (actual != null) {
            actual.dato.imprimir();
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
