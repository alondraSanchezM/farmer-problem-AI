package problemagranjero;

//Alondra Sánchez Molina
public class ProblemaGranjeroMain {

    public static void main(String[] args) {
        ProblemaGranjeroUI vista = new ProblemaGranjeroUI();
        Busquedas busquedas = new Busquedas();
        ProblemaGranjeroController controlador = new ProblemaGranjeroController(vista, busquedas);
        controlador.iniciarVista();
    }
}
