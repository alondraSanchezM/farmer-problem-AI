package problemagranjero;

//Alondra Sánchez Molina
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProblemaGranjeroController implements ActionListener {

    private ProblemaGranjeroUI ui;
    private Busquedas b;
    private animacionCaminoSolucion animacion;

    public ProblemaGranjeroController(ProblemaGranjeroUI ui, Busquedas b) {
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
        limpiar();
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

            //Validación datos de entrada
            if (eInicial.comparar(eFinal)) {
                JOptionPane.showMessageDialog(null, "El estado inicial es el mismo que el estado final", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!eInicial.esEstadoValido() || !eFinal.esEstadoValido()) {
                JOptionPane.showMessageDialog(null, "Estados no permitidos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ArrayList<Estado> caminoAnchura = b.caminoSolucion(b.BFS(eInicial, eFinal));

                //Animación a partir de un hilo
                animacion = new animacionCaminoSolucion(ui, caminoAnchura);
                animacion.start();
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

            //Validación de datos de entrada
            if (eInicial.comparar(eFinal)) {
                JOptionPane.showMessageDialog(null, "El estado inicial es el mismo que el estado final", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!eInicial.esEstadoValido() || !eFinal.esEstadoValido()) {
                JOptionPane.showMessageDialog(null, "Estados no permitidos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ArrayList<Estado> caminoProfundidad = b.caminoSolucion(b.DFS(eInicial, eFinal));

                //Animación a partir de un hilo
                animacion = new animacionCaminoSolucion(ui, caminoProfundidad);
                animacion.start();
                
            }

        } else if (ui.getBtn_Reiniciar() == evento.getSource()) {
            limpiar();
            animacion.stop();  //Ya no es una buena practica
        }

    }

    //Convierte el string recibido del comboBox a un valor entero para el manejo del nodo Estado
    private int conversor(String comboInfo) {
        if ("Izquierda".equals(comboInfo)) {
            return 1;
        } else {
            return 2;
        }
    }

    private void limpiar() {
        ui.getImg_granjeroIzq().setVisible(false);
        ui.getImg_loboIzq().setVisible(false);
        ui.getImg_cabraIzq().setVisible(false);
        ui.getImg_colIzq().setVisible(false);
        ui.getImg_granjeroDer().setVisible(false);
        ui.getImg_loboDer().setVisible(false);
        ui.getImg_cabraDer().setVisible(false);
        ui.getImg_colDer().setVisible(false);
        ui.getImg_BoteIzq().setVisible(false);
        ui.getImg_BoteDer().setVisible(false);
        ui.getLb_caminoSolucion().setVisible(false);
        ui.getLb_estadoActual().setText("");
    }
}

class animacionCaminoSolucion extends Thread {

    private ArrayList<Estado> camino;
    private ProblemaGranjeroUI ui;

    public animacionCaminoSolucion(ProblemaGranjeroUI ui, ArrayList<Estado> lista) {
        this.ui = ui;
        this.camino = lista;
    }

    @Override
    public void run() {
        camino.forEach((estado) -> {
            ui.getLb_caminoSolucion().setVisible(true);
            ui.getLb_estadoActual().setText(estado.toString());
            try {
                //Movimientos
                if (estado.getGranjero() == 1) {
                    ui.getImg_granjeroIzq().setVisible(true);
                    ui.getImg_granjeroDer().setVisible(false);
                    ui.getImg_BoteIzq().setVisible(true);
                    ui.getImg_BoteDer().setVisible(false);
                } else {
                    ui.getImg_granjeroIzq().setVisible(false);
                    ui.getImg_granjeroDer().setVisible(true);
                    ui.getImg_BoteIzq().setVisible(false);
                    ui.getImg_BoteDer().setVisible(true);
                }
                if (estado.getLobo() == 1) {
                    ui.getImg_loboIzq().setVisible(true);
                    ui.getImg_loboDer().setVisible(false);
                } else {
                    ui.getImg_loboIzq().setVisible(false);
                    ui.getImg_loboDer().setVisible(true);
                }
                if (estado.getCabra() == 1) {
                    ui.getImg_cabraIzq().setVisible(true);
                    ui.getImg_cabraDer().setVisible(false);
                } else {
                    ui.getImg_cabraIzq().setVisible(false);
                    ui.getImg_cabraDer().setVisible(true);
                }
                if (estado.getCol() == 1) {
                    ui.getImg_colIzq().setVisible(true);
                    ui.getImg_colDer().setVisible(false);
                } else {
                    ui.getImg_colIzq().setVisible(false);
                    ui.getImg_colDer().setVisible(true);
                }

                //Establece el intervalo de la animación
                sleep(1300);
            } catch (InterruptedException ex) {
            }
        });
    }

}
