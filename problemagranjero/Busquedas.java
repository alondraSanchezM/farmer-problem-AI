package problemagranjero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Alondra Sánchez Molina
public class Busquedas {

    //Búsqueda en profundidad - LIFO
    public LinkedList DFS(Estado estadoInicial, Estado estadoFinal){
        
        if (estadoInicial.esEstadoSolucion(estadoFinal)) {
            return null;
        }
        
        LinkedList<Estado> recorridoProfundidad = new LinkedList<>();
        //Uso de una lista ligada en lugar de una pila
        LinkedList<Estado> abiertos = new LinkedList<>();    
        LinkedList<Estado> visitados = new LinkedList<>();
        
        abiertos.push(estadoInicial);
        int nivel = 0;
        
        while (!abiertos.isEmpty()) {

            Estado estadoActual = abiertos.pop();
            visitados.push(estadoActual);
            recorridoProfundidad.add(estadoActual);

            List<Estado> sucesores = estadoActual.getEstadosSucesores();

            for (Estado hijo : sucesores) {
                System.out.println("Recorriendo nivel " + nivel + " " + estadoActual);
                hijo.setEstadoPadre(estadoActual);

                if (!esRepetido(visitados, abiertos, hijo)) {   //!visitados.contains(hijo) || !abiertos.contains(hijo)
                    nivel = nivel + 1;
                    if (hijo.esEstadoSolucion(estadoFinal)) {
                        recorridoProfundidad.add(hijo);
                        System.out.println("Solución encontrada " + hijo);
                        return recorridoProfundidad;
                    }
                    abiertos.push(hijo);
                    System.out.println("Añadiendo estado " + hijo);

                }
            }
        }
        return null;
    }
    
    //Búsqueda en anchura - FIFO
    public LinkedList BFS(Estado estadoInicial, Estado estadoFinal) {

        if (estadoInicial.esEstadoSolucion(estadoFinal)) {
            return null;
        }

        LinkedList<Estado> recorridoAnchura = new LinkedList<>();
        //Uso de una lista ligada en lugar de una cola
        LinkedList<Estado> abiertos = new LinkedList<>();
        LinkedList<Estado> visitados = new LinkedList<>();

        abiertos.add(estadoInicial);
        int nivel = 0;

        while (!abiertos.isEmpty()) {

            Estado estadoActual = abiertos.poll();
            visitados.push(estadoActual);
            recorridoAnchura.add(estadoActual);

            List<Estado> sucesores = estadoActual.getEstadosSucesores();

            for (Estado hijo : sucesores) {
                System.out.println("Recorriendo nivel " + nivel + " " + estadoActual);
                hijo.setEstadoPadre(estadoActual);

                if (!esRepetido(visitados, abiertos, hijo)) {   //!visitados.contains(hijo) || !abiertos.contains(hijo)
                    nivel = nivel + 1;
                    if (hijo.esEstadoSolucion(estadoFinal)) {
                        recorridoAnchura.add(hijo);
                        System.out.println("Solución encontrada " + hijo);
                        return recorridoAnchura;
                    }
                    abiertos.add(hijo);
                    System.out.println("Añadiendo estado " + hijo);

                }
            }
        }
        return null;
    }
    
    //Evitar nodos repetidos 
    private boolean esRepetido(LinkedList<Estado> visitados, LinkedList<Estado> abiertos, Estado hijo) {
        if (abiertos.stream().anyMatch((c) -> (hijo.comparar(c)))) {
            return true;
        }
        //Uso de una operación funcional en luagr de un for y un if
        if (visitados.stream().anyMatch((c) -> (hijo.comparar(c)))) {
            return true;
        }
        return false;
    }
    
    
    //Imprimir camino solución 
    public ArrayList caminoSolucion(LinkedList<Estado> recorrido) {
        if (null == recorrido) {
            return null;
        } else {
            System.out.println("\nCamino solución: ");
            
            //Se reocorre inversamente desde el nodo final mediante los nodos padres al nodo inicial
            ArrayList<Estado> camino = new ArrayList<>();
            int ubicacion = 0;
            for (int i = 0; i < recorrido.size(); i++) {
                if (recorrido.get(i).comparar(recorrido.getLast())) {
                    ubicacion = i;
                }
            }
            Estado actual = recorrido.get(ubicacion);
            camino.add(actual);
            while (!actual.getEstadoPadre().comparar(recorrido.getFirst())) {
                actual = actual.getEstadoPadre();
                camino.add(actual);
            }
            camino.add(recorrido.getFirst());

            //Inversión del camino 
            ArrayList<Estado> caminoF = new ArrayList<>();
            ListIterator iter = camino.listIterator(camino.size());
            while (iter.hasPrevious()) {
                caminoF.add((Estado) iter.previous());
            }

            return caminoF;
        }
    }

}
