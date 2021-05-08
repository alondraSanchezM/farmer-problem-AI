package problemagranjero;

//Alondra Sánchez Molina
public class ProblemaGranjeroTest {

    public static void main(String[] args) {
        ProblemaGranjeroUI vista = new ProblemaGranjeroUI();
        Busquedas busquedas = new Busquedas();
        ProblemaGranjeroMain controlador = new ProblemaGranjeroMain(vista, busquedas);
        controlador.iniciarVista();
    }
}
