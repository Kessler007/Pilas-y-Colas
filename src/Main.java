import pc.Cola;
import pc.Pila;

public class Main {
    public static void main(String[] args) {
        /*Cola cola = new Cola();
        System.out.println(cola.estavacio());

        for (int i = 1; i <= 8; i++) {
            cola.insertarInicio(i);
        }
        cola.mostrar();

        cola.eliminarInicio();
        cola.eliminarInicio();
        cola.mostrar();*/

        Pila pila=new Pila();
        System.out.println(pila.estavacio());

        for (int i=1;i<=5;i++){
            pila.insertarInicio(i);
        }
        pila.mostrar();

        pila.eliminarInicio();
        pila.eliminarInicio();
        pila.eliminarInicio();
        pila.mostrar();
    }
}
