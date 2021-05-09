
package problemagranjero;

//Alondra Sánchez Molina

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProblemaGranjeroUI extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    public ProblemaGranjeroUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JButton getBtn_Reiniciar() {
        return btn_Reiniciar;
    }

    public JButton getBtn_busAnchura() {
        return btn_busAnchura;
    }

    public JButton getBtn_busProfundidad() {
        return btn_busProfundidad;
    }

    public JComboBox<String> getCb_cabraFin() {
        return cb_cabraFin;
    }

    public JComboBox<String> getCb_cabraIni() {
        return cb_cabraIni;
    }

    public JComboBox<String> getCb_colFin() {
        return cb_colFin;
    }

    public JComboBox<String> getCb_colIni() {
        return cb_colIni;
    }

    public JComboBox<String> getCb_granjeroFin() {
        return cb_granjeroFin;
    }

    public JComboBox<String> getCb_granjeroIni() {
        return cb_granjeroIni;
    }

    public JComboBox<String> getCb_loboFin() {
        return cb_loboFin;
    }

    public JComboBox<String> getCb_loboIni() {
        return cb_loboIni;
    }

    public JLabel getImg_cabraDer() {
        return img_cabraDer;
    }

    public JLabel getImg_cabraIzq() {
        return img_cabraIzq;
    }

    public JLabel getImg_colDer() {
        return img_colDer;
    }

    public JLabel getImg_colIzq() {
        return img_colIzq;
    }

    public JLabel getImg_granjeroDer() {
        return img_granjeroDer;
    }

    public JLabel getImg_granjeroIzq() {
        return img_granjeroIzq;
    }

    public JLabel getImg_loboDer() {
        return img_loboDer;
    }

    public JLabel getImg_loboIzq() {
        return img_loboIzq;
    }

    public JLabel getImg_BoteDer() {
        return img_BoteDer;
    }

    public JLabel getImg_BoteIzq() {
        return img_BoteIzq;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_background = new FondoPanel();
        img_granjeroIzq = new javax.swing.JLabel();
        img_colIzq = new javax.swing.JLabel();
        img_loboIzq = new javax.swing.JLabel();
        img_cabraIzq = new javax.swing.JLabel();
        img_colDer = new javax.swing.JLabel();
        img_granjeroDer = new javax.swing.JLabel();
        img_cabraDer = new javax.swing.JLabel();
        img_loboDer = new javax.swing.JLabel();
        img_BoteDer = new javax.swing.JLabel();
        img_BoteIzq = new javax.swing.JLabel();
        pn_variables = new javax.swing.JPanel();
        pn_configFin = new javax.swing.JPanel();
        lb_configFinal = new javax.swing.JLabel();
        lb_loboFin = new javax.swing.JLabel();
        cb_loboFin = new javax.swing.JComboBox<>();
        lb_granjeroFin = new javax.swing.JLabel();
        cb_granjeroFin = new javax.swing.JComboBox<>();
        cb_cabraFin = new javax.swing.JComboBox<>();
        lb_cabraFin = new javax.swing.JLabel();
        lb_colFin = new javax.swing.JLabel();
        cb_colFin = new javax.swing.JComboBox<>();
        pn_configIni = new javax.swing.JPanel();
        lb_configInicial = new javax.swing.JLabel();
        lb_loboIni = new javax.swing.JLabel();
        cb_loboIni = new javax.swing.JComboBox<>();
        lb_granjeroIni = new javax.swing.JLabel();
        cb_granjeroIni = new javax.swing.JComboBox<>();
        cb_cabraIni = new javax.swing.JComboBox<>();
        lb_cabrraIni = new javax.swing.JLabel();
        ln_colIni = new javax.swing.JLabel();
        cb_colIni = new javax.swing.JComboBox<>();
        btn_busProfundidad = new javax.swing.JButton();
        btn_busAnchura = new javax.swing.JButton();
        btn_Reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_background.setBackground(new java.awt.Color(255, 153, 153));
        pn_background.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pn_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_granjeroIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/farmer.png"))); // NOI18N
        pn_background.add(img_granjeroIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        img_colIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cabbage.png"))); // NOI18N
        pn_background.add(img_colIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        img_loboIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wolf.png"))); // NOI18N
        pn_background.add(img_loboIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        img_cabraIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goat.png"))); // NOI18N
        pn_background.add(img_cabraIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        img_colDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cabbage.png"))); // NOI18N
        pn_background.add(img_colDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, -1, -1));

        img_granjeroDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/farmer.png"))); // NOI18N
        pn_background.add(img_granjeroDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, -1, -1));

        img_cabraDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goat.png"))); // NOI18N
        pn_background.add(img_cabraDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, -1, -1));

        img_loboDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wolf.png"))); // NOI18N
        pn_background.add(img_loboDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 420, -1, -1));

        img_BoteDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bote.png"))); // NOI18N
        pn_background.add(img_BoteDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));

        img_BoteIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bote.png"))); // NOI18N
        pn_background.add(img_BoteIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        getContentPane().add(pn_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 640));

        pn_variables.setBackground(new java.awt.Color(255, 255, 255));
        pn_variables.setEnabled(false);

        pn_configFin.setBackground(new java.awt.Color(255, 255, 255));
        pn_configFin.setEnabled(false);

        lb_configFinal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_configFinal.setText("Configuración final");

        lb_loboFin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_loboFin.setText("Lobo");

        cb_loboFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        lb_granjeroFin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_granjeroFin.setText("Granjero");

        cb_granjeroFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        cb_cabraFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        lb_cabraFin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_cabraFin.setText("Cabra");

        lb_colFin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_colFin.setText("Col");

        cb_colFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        pn_configIni.setBackground(new java.awt.Color(255, 255, 255));
        pn_configIni.setEnabled(false);

        lb_configInicial.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_configInicial.setText("Configuración inicial");

        lb_loboIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_loboIni.setText("Lobo");

        cb_loboIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        lb_granjeroIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_granjeroIni.setText("Granjero");

        cb_granjeroIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        cb_cabraIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        lb_cabrraIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_cabrraIni.setText("Cabra");

        ln_colIni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ln_colIni.setText("Col");

        cb_colIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));

        javax.swing.GroupLayout pn_configIniLayout = new javax.swing.GroupLayout(pn_configIni);
        pn_configIni.setLayout(pn_configIniLayout);
        pn_configIniLayout.setHorizontalGroup(
            pn_configIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_configIniLayout.createSequentialGroup()
                .addComponent(lb_configInicial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_configIniLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(lb_granjeroIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_granjeroIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_loboIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_loboIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cabrraIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_cabraIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ln_colIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_colIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        pn_configIniLayout.setVerticalGroup(
            pn_configIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_configIniLayout.createSequentialGroup()
                .addComponent(lb_configInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_configIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_loboIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_granjeroIni)
                    .addComponent(cb_granjeroIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_loboIni)
                    .addComponent(cb_cabraIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cabrraIni)
                    .addComponent(cb_colIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ln_colIni))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btn_busProfundidad.setBackground(new java.awt.Color(58, 96, 110));
        btn_busProfundidad.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btn_busProfundidad.setForeground(new java.awt.Color(255, 255, 255));
        btn_busProfundidad.setText("Búsqueda en Profundidad");
        btn_busProfundidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_busProfundidad.setFocusPainted(false);
        btn_busProfundidad.setName("Generar Ruta"); // NOI18N

        btn_busAnchura.setBackground(new java.awt.Color(58, 96, 110));
        btn_busAnchura.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btn_busAnchura.setForeground(new java.awt.Color(255, 255, 255));
        btn_busAnchura.setText("Búsqueda en Anchura");
        btn_busAnchura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_busAnchura.setFocusPainted(false);
        btn_busAnchura.setName("Generar Ruta"); // NOI18N

        btn_Reiniciar.setBackground(new java.awt.Color(58, 96, 110));
        btn_Reiniciar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btn_Reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Reiniciar.setText("Reiniciar");
        btn_Reiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Reiniciar.setFocusPainted(false);
        btn_Reiniciar.setName("Generar Ruta"); // NOI18N

        javax.swing.GroupLayout pn_configFinLayout = new javax.swing.GroupLayout(pn_configFin);
        pn_configFin.setLayout(pn_configFinLayout);
        pn_configFinLayout.setHorizontalGroup(
            pn_configFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_configFinLayout.createSequentialGroup()
                .addGroup(pn_configFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_configFinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn_configIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_configFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_configFinal)
                            .addGroup(pn_configFinLayout.createSequentialGroup()
                                .addComponent(lb_granjeroFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_granjeroFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_loboFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_loboFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_cabraFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_cabraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_colFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_colFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn_configFinLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btn_busProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_busAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(btn_Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_configFinLayout.setVerticalGroup(
            pn_configFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_configFinLayout.createSequentialGroup()
                .addGroup(pn_configFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_configFinLayout.createSequentialGroup()
                        .addComponent(lb_configFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_configFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_loboFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_granjeroFin)
                            .addComponent(cb_granjeroFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_loboFin)
                            .addComponent(cb_cabraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cabraFin)
                            .addComponent(cb_colFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_colFin)))
                    .addComponent(pn_configIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn_configFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_busProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_busAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_variablesLayout = new javax.swing.GroupLayout(pn_variables);
        pn_variables.setLayout(pn_variablesLayout);
        pn_variablesLayout.setHorizontalGroup(
            pn_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_configFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn_variablesLayout.setVerticalGroup(
            pn_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_variablesLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pn_configFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        getContentPane().add(pn_variables, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 638, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reiniciar;
    private javax.swing.JButton btn_busAnchura;
    private javax.swing.JButton btn_busProfundidad;
    private javax.swing.JComboBox<String> cb_cabraFin;
    private javax.swing.JComboBox<String> cb_cabraIni;
    private javax.swing.JComboBox<String> cb_colFin;
    private javax.swing.JComboBox<String> cb_colIni;
    private javax.swing.JComboBox<String> cb_granjeroFin;
    private javax.swing.JComboBox<String> cb_granjeroIni;
    private javax.swing.JComboBox<String> cb_loboFin;
    private javax.swing.JComboBox<String> cb_loboIni;
    private javax.swing.JLabel img_BoteDer;
    private javax.swing.JLabel img_BoteIzq;
    private javax.swing.JLabel img_cabraDer;
    private javax.swing.JLabel img_cabraIzq;
    private javax.swing.JLabel img_colDer;
    private javax.swing.JLabel img_colIzq;
    private javax.swing.JLabel img_granjeroDer;
    private javax.swing.JLabel img_granjeroIzq;
    private javax.swing.JLabel img_loboDer;
    private javax.swing.JLabel img_loboIzq;
    private javax.swing.JLabel lb_cabraFin;
    private javax.swing.JLabel lb_cabrraIni;
    private javax.swing.JLabel lb_colFin;
    private javax.swing.JLabel lb_configFinal;
    private javax.swing.JLabel lb_configInicial;
    private javax.swing.JLabel lb_granjeroFin;
    private javax.swing.JLabel lb_granjeroIni;
    private javax.swing.JLabel lb_loboFin;
    private javax.swing.JLabel lb_loboIni;
    private javax.swing.JLabel ln_colIni;
    private javax.swing.JPanel pn_background;
    private javax.swing.JPanel pn_configFin;
    private javax.swing.JPanel pn_configIni;
    private javax.swing.JPanel pn_variables;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        private Image imagen;
        
        public void paint(Graphics g){
            imagen =  new ImageIcon(getClass().getResource("/imagenes/background.png")).getImage();
            
            g.drawImage(imagen,0, 0, 1326, getHeight(), this );
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
}
