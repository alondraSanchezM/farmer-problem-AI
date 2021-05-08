package problemagranjero;

//Alondra Sánchez Molina
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFrame;

public class ProblemaGranjeroMain implements ActionListener {

    private ProblemaGranjeroUI ui;
    private Busquedas b;

    public ProblemaGranjeroMain(ProblemaGranjeroUI ui, Busquedas b) {
        this.ui = ui;
        this.b = b;
        this.ui.getBtn_busAnchura().addActionListener(this);
        this.ui.getBtn_busProfundidad().addActionListener(this);
        this.ui.getBtn_Reiniciar().addActionListener(this);
    }

    public void iniciarVista() {
        ui.setTitle("Problema del Granjero");
        ui.pack();
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (ui.getBtn_busAnchura() == evento.getSource()) {
            
            Estado eInicial = new Estado(conversor(ui.getCb_granjeroIni().getSelectedItem().toString()),
                                        conversor(ui.getCb_loboIni().getSelectedItem().toString()),
                                        conversor(ui.getCb_cabraIni().getSelectedItem().toString()),
                                        conversor(ui.getCb_colIni().getSelectedItem().toString()));
            
            Estado eFinal = new Estado(conversor(ui.getCb_granjeroFin().getSelectedItem().toString()),
                                        conversor(ui.getCb_loboFin().getSelectedItem().toString()),
                                        conversor(ui.getCb_cabraFin().getSelectedItem().toString()),
                                        conversor(ui.getCb_colFin().getSelectedItem().toString()));

            LinkedList resultadoAnchura = b.BFS(eInicial, eFinal);

            System.out.println("Recorrido busqueda por anchura: ");
            for (int i = 0; i < resultadoAnchura.size(); i++) {
                System.out.println(i + 1 + "  " + resultadoAnchura.get(i));
            }

            ArrayList<Estado> caminoAnchura = b.caminoSolucion(resultadoAnchura);

            for (Estado estado : caminoAnchura) {
                System.out.println(estado.toString());
            }

        } else if (ui.getBtn_busProfundidad() == evento.getSource()) {
            Estado eInicial = new Estado(conversor(ui.getCb_granjeroIni().getSelectedItem().toString()),
                                        conversor(ui.getCb_loboIni().getSelectedItem().toString()),
                                        conversor(ui.getCb_cabraIni().getSelectedItem().toString()),
                                        conversor(ui.getCb_colIni().getSelectedItem().toString()));
            
            Estado eFinal = new Estado(conversor(ui.getCb_granjeroFin().getSelectedItem().toString()),
                                        conversor(ui.getCb_loboFin().getSelectedItem().toString()),
                                        conversor(ui.getCb_cabraFin().getSelectedItem().toString()),
                                        conversor(ui.getCb_colFin().getSelectedItem().toString()));

            LinkedList resultadoProfundidad = b.DFS(eInicial, eFinal);

            System.out.println("Recorrido busqueda por profundidad: ");
            for (int i = 0; i < resultadoProfundidad.size(); i++) {
                System.out.println(i + 1 + "  " + resultadoProfundidad.get(i));
            }

            ArrayList<Estado> caminoProfundidad = b.caminoSolucion(resultadoProfundidad);

            for (Estado estado : caminoProfundidad) {
                System.out.println(estado.toString());
            }

        } else if (ui.getBtn_Reiniciar() == evento.getSource()) {
            
        }

    }
    
    //Convierte el string recibido del comboBox a un valor entero para el manejo del nodo Estado
    private int conversor(String comboInfo){
        if("Izquierda".equals(comboInfo)){
            return 1;
        }else{
            return 2;
        }
        
    }

}
