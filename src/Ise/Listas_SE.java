package Ise;

public class Listas_SE {

    protected Nodo inicio;

    public Listas_SE() {
        inicio = null;
    }

    public boolean estavacio() {
        return inicio == null;
    }

    public int tamaño() {
        int contador = 1;
        Nodo aux = inicio;
        while (aux.getSiguiente() != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        if (contador != 0) {
            contador++;
        }
        return contador;
    }

    public Object ultimoDato() {
        Nodo aux = inicio;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        return aux.getDato();
    }

    // insertar
    public void insertarInicio(Object dato) {
        if (estavacio()) {
            Nodo nuevo = new Nodo(dato, null);
            inicio = nuevo;
        } else {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }

            Nodo nuevo = new Nodo(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }

    // eliminar
    public void eliminarInicio() {
        if (!estavacio()) {
            inicio = inicio.getSiguiente();
        }
    }

    // mostrar
    public void mostrar() {
        Nodo tmp = inicio;
        while (tmp != null) {
            System.out.print(tmp.getDato() + "   ");
            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
}