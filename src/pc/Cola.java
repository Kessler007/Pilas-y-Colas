package pc;

import Ise.Listas_SE;
import Ise.Nodo;

public class Cola extends Listas_SE {
    @Override
    public void insertarInicio(Object dato) {
        if (estavacio()){
            Nodo nuevo=new Nodo(dato,null);
            inicio=nuevo;
        }else {
            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!= null){
                ultimo=ultimo.getSiguiente();
            }
            Nodo nuevo=new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }
    }
}
