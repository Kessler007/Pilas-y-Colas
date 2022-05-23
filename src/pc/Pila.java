package pc;

import Ise.Nodo;

public class Pila extends Cola {
    @Override
    public void eliminarInicio() {
        if (!estavacio()){
            Nodo ultimo=inicio;
            Nodo penultimo=null;
            while (ultimo.getSiguiente()!= null){
                penultimo=ultimo;
                ultimo=ultimo.getSiguiente();

            }
            penultimo.setSiguiente(null);
        }
    }
}

