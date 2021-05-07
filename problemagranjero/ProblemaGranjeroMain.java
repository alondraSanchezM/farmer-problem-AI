
package problemagranjero;

//Alondra Sánchez Molina

import java.util.ArrayList;
import java.util.LinkedList;

public class ProblemaGranjeroMain {

    public static void main(String[] args) {
        
        //Inicialización provisional 
        Estado eInicial = new Estado(1, 2, 1, 1);
        Estado eFinal = new Estado(2, 2, 2, 2);
        
        Busquedas b = new Busquedas();
        
        LinkedList resultadoAnchura = b.BFS(eInicial, eFinal);
        
        System.out.println("Recorrido busqueda por anchura: ");
        for (int i = 0; i < resultadoAnchura.size(); i++) {
            System.out.println(i+1 + "  " + resultadoAnchura.get(i));
        }
        
        ArrayList<Estado> caminoAnchura =  b.caminoSolucion(resultadoAnchura);
        
        for (Estado estado : caminoAnchura) {
            System.out.println(estado.toString());
        }
        
        LinkedList resultadoProfundidad = b.DFS(eInicial, eFinal);
        
        System.out.println("Recorrido busqueda por profundidad: ");
        for (int i = 0; i < resultadoProfundidad.size(); i++) {
            System.out.println(i+1 + "  " + resultadoProfundidad.get(i));
        }
        
        ArrayList<Estado> caminoProfundidad =  b.caminoSolucion(resultadoProfundidad);
        
        for (Estado estado : caminoProfundidad) {
            System.out.println(estado.toString());
        }
        
    }

}
