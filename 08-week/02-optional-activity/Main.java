/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {

    // Clase Nodo
    static class Nodo {
        String dato;
        Nodo siguiente;

        // Constructor del nodo
        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Clase Lista Enlazada
    static class ListaEnlazada {
        Nodo cabeza;

        // Constructor de la lista
        public ListaEnlazada() {
            cabeza = null;
        }

        // metodo para agregar nodos
        public void agregar(String nombre) {
            Nodo nuevo = new Nodo(nombre);

            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Nodo actual = cabeza;

                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }

                actual.siguiente = nuevo;
            }
        }

        // Método para mostrar la lista
        public void mostrar() {
            Nodo actual = cabeza;

            while (actual != null) {
                System.out.print("[" + actual.dato + " | • ] → ");
                actual = actual.siguiente;
            }

            System.out.println("null");
        }
    }

    // Método principal
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        // Agregar 4 estudiantes
        lista.agregar("Felipe");
        lista.agregar("Isabella");
        lista.agregar("Steve");
        lista.agregar("Andres");

        // Mostrar el esquema
        lista.mostrar();
    }
}