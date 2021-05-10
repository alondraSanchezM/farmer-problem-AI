
package problemagranjero;

import java.util.LinkedList;
import java.util.List;

//Alondra Sánchez Molina

public class Estado {
    final int IZQUIERDA = 1;
    final int DERECHA = 2;
    
    private int granjero;
    private int lobo;
    private int cabra;
    private int col;
    
    private Estado estadoPadre;

    public Estado(int granjero, int lobo, int cabra, int col) {
        this.granjero = granjero;
        this.lobo = lobo;
        this.cabra = cabra;
        this.col = col;
    }
    
    public Estado getEstadoPadre() {
        return estadoPadre;
    }

    public int getGranjero() {
        return granjero;
    }

    public int getLobo() {
        return lobo;
    }

    public int getCabra() {
        return cabra;
    }

    public int getCol() {
        return col;
    }

    public void setEstadoPadre(Estado estadoPadre) {
        this.estadoPadre = estadoPadre;
    }
    
    public int opuesto(int orilla) {
        if(orilla == IZQUIERDA) {
            return DERECHA;
        } else {
            return IZQUIERDA;
        }
    }

    //Restricciones
    public boolean esEstadoValido() {  
        //El lobo y la cabra no pueden estar sin el granjero en la misma orilla
        if((lobo == cabra) && (granjero != cabra))  
            return false;
        
        //La cabra y la col no pueden estar sin el granjero en la misma orilla
        if((cabra == col) && (granjero != col))
            return false;
        
        return true;
    }
    
    //Operadores
    List<Estado> getEstadosSucesores() {
        LinkedList<Estado> estadosPosibles = new LinkedList<>();         
        
        //Granjero cruza solo
        estadosPosibles.add(new Estado(opuesto(granjero),lobo,cabra,col));             
        
        //Granjero cruza con el lobo
        if(granjero == lobo){
            estadosPosibles.add(new Estado(opuesto(granjero),opuesto(lobo),cabra,col));
        }
        
        //Granjero cruza con la cabra
        if(granjero == cabra){
            estadosPosibles.add(new Estado(opuesto(granjero), lobo, opuesto(cabra), col));
        }
        
        //Granjero cruz con la col
        if(granjero == col){
            estadosPosibles.add(new Estado(opuesto(granjero), lobo, cabra, opuesto(col)));
        }
        
        LinkedList<Estado> estadosValidos = new LinkedList<>();         
        for(Estado e : estadosPosibles) {
            if(e.esEstadoValido()) {
                estadosValidos.add(e);
            }
        }
        return estadosValidos;
    }
    
    public boolean comparar(Estado s) {
        if(!(s.getGranjero() == granjero)){
            return false;
        }
        if(!(s.getLobo()== lobo)){
            return false;
        }
        if(!(s.getCabra()== cabra)){
            return false;
        }
        if(!(s.getCol() == col)){
            return false;
        }
        return true;
    }
    
    public boolean esEstadoSolucion(Estado estadoFinal){
        return estadoFinal.getGranjero() == granjero && estadoFinal.getLobo() == lobo && estadoFinal.getCabra() == cabra && estadoFinal.getCol() == col;
    }

    @Override
    public String toString() {
        return "Estado{ " + "granjero= " + granjero + ", lobo= " + lobo + ", cabra= " + cabra + ", col= " + col + '}';
    }
  
}
