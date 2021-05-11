package problemagranjero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Alondra Sánchez Molina
public class Busquedas {

    //Búsqueda en profundidad - LIFO
    public LinkedList DFS(Estado estadoInicial, Estado estadoFinal) {

        if (estadoInicial.esEstadoSolucion(estadoFinal)) {
            return null;
        }

        LinkedList<Estado> recorridoProfundidad = new LinkedList<>();
        //Uso de una lista ligada en lugar de una pila
        LinkedList<Estado> abiertos = new LinkedList<>();
        LinkedList<Estado> visitados = new LinkedList<>();

        abiertos.push(estadoInicial);

        while (!abiertos.isEmpty()) {

            Estado estadoActual = abiertos.pop();
            recorridoProfundidad.add(estadoActual);
            visitados.push(estadoActual);
            
            if (estadoActual.esEstadoSolucion(estadoFinal)) {
                recorridoProfundidad.add(estadoActual);
                return recorridoProfundidad;
            }

            //Obtener lista de sucesores validos
            List<Estado> sucesores = estadoActual.getEstadosSucesores();
            for (Estado hijo : sucesores) {
                hijo.setEstadoPadre(estadoActual);
                 
                //Obtener los sucesores validos que no hallan sido visitados o se encuentren abiertos
                if (!esRepetido(visitados, abiertos, hijo)) {       
                    abiertos.push(hijo);
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

        abiertos.offer(estadoInicial); 
        
        while (!abiertos.isEmpty()) {

            Estado estadoActual = abiertos.poll();
            visitados.add(estadoActual);
            recorridoAnchura.add(estadoActual);

            //Obtener lista de sucesores validos
            List<Estado> sucesores = estadoActual.getEstadosSucesores();

            for (Estado hijo : sucesores) {
                hijo.setEstadoPadre(estadoActual);
                
                //Obtener los sucesores validos que no hallan sido visitados o se encuentren abiertos
                if (!esRepetido(visitados, abiertos, hijo)) {  
                    if (hijo.esEstadoSolucion(estadoFinal)) {
                        recorridoAnchura.add(hijo);
                        return recorridoAnchura;
                    }
                    abiertos.offer(hijo);
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
        //Uso de una operación funcional en lugar de un for y un if
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
            //Se recorre inversamente desde el nodo final mediante los nodos padres al nodo inicial
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
