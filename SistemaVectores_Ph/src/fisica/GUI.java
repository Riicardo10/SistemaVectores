package fisica;
import java.text.DecimalFormat;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class GUI extends javax.swing.JFrame {
    Lista listaVectores = new Lista();
    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"Magnitud", "Direccion"};
    public void salir(){
        Object option[] = {"SI", "NO"};
        int salir = JOptionPane.showOptionDialog(null, "¿REALMENTE DESEA SALIR?", ":::MENSAJE DE SALIDA:::", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.YES_NO_OPTION, null, option, 0);
        if(salir == 0){
            this.dispose();
            System.exit(0);
        }
    }
    public void borrarCampos(){
        txtMagnitudInput.setText(null);
        txtDireccionInput.setText(null);
    }
    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
        md = new DefaultTableModel(data, cabeza);
        jTblDatos.setModel(md);
    }
    @Override
    public Image getIconImage(){
        Image refValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Iconos/logotecpequeno.png"));
        return refValue;
    }
    DecimalFormat tresDig = new DecimalFormat("0.000");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMagnitudInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionInput = new javax.swing.JTextField();
        bttAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDatos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtVectoresIng = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtResultanteTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccionTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSigmaFx = new javax.swing.JTextField();
        txtSigmaFy = new javax.swing.JTextField();
        bttSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::RESULTANTE DE SISTEMAS DE VECTORES:::");
        setBounds(new java.awt.Rectangle(420, 60, 0, 0));
        setIconImage(getIconImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(":::Introduce datos:::"));

        jLabel1.setText("Magnitud de vector:");

        txtMagnitudInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMagnitudInputKeyPressed(evt);
            }
        });

        jLabel2.setText("Direccion:");

        txtDireccionInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionInputKeyPressed(evt);
            }
        });

        bttAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ok.gif"))); // NOI18N
        bttAceptar.setText("Aceptar");
        bttAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAceptarActionPerformed(evt);
            }
        });

        jTblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTblDatos.setEnabled(false);
        jTblDatos.setFocusable(false);
        jScrollPane1.setViewportView(jTblDatos);

        jLabel3.setText("--- Contador de vectores:");

        txtVectoresIng.setFocusable(false);

        jLabel4.setText(":::RESULTANTE:::");

        txtResultanteTotal.setFocusable(false);

        jLabel5.setText(":::DIRECCION:::");

        txtDireccionTotal.setFocusable(false);

        jLabel6.setText("Sigma Fx:");

        jLabel7.setText("Sigma Fy:");

        txtSigmaFx.setFocusable(false);

        txtSigmaFy.setFocusable(false);

        bttSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eye.png"))); // NOI18N
        bttSalir.setText("Salir");
        bttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDireccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtMagnitudInput, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSigmaFx, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVectoresIng, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(68, 68, 68)
                                        .addComponent(txtSigmaFy, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttAceptar)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultanteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccionTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(bttSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMagnitudInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSigmaFx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSigmaFy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVectoresIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtResultanteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccionTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttSalir)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void bttAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAceptarActionPerformed
        String rell = "Error: \n";
        String errInput = "Error: \n";
        boolean rell1 = false;
        boolean errInput1 = false;
        if(txtMagnitudInput.getText().length() == 0){
            rell += "\t- Rellena campo Magnitud.\n";
            rell1 = true;
        }
        if(txtDireccionInput.getText().length() == 0){
            rell += "\t- Rellena campo Direccion.\n";
            rell1 = true;
        }
        if(rell1){
            JOptionPane.showMessageDialog(null, rell, ":::AVISO:::", JOptionPane.WARNING_MESSAGE);
        }
        // SEGUIR CON LOS PATRONES
        else{
            double direccionP = 0;
            double magnitudP = 0;
            if(!txtMagnitudInput.getText().matches("^[0-9]([0-9]+)?([.][0-9]{1,2})?")){
                errInput += "\t- Verifica magnitud.\n";
                errInput1 = true;
            }
            else{
                magnitudP = Double.parseDouble(txtMagnitudInput.getText());
            }
            if(!txtDireccionInput.getText().matches("[0-9]([0-9]+)?([.][0-9]{1,2})?")){
                errInput += "\t- Verifica direccion.\n";
                errInput1 = true;
            }
            else{
                direccionP = Double.parseDouble(txtDireccionInput.getText());
            }
            if(direccionP < 0){
                errInput += "\t   - Direccion minima [0]";
                errInput1 = true;
            }
            if(direccionP > 360){
                errInput += "\t   - Direccion maxima [360]";
                errInput1 = true;
            }
            if(errInput1){
                JOptionPane.showMessageDialog(null, errInput, ":::AVISO:::", JOptionPane.WARNING_MESSAGE);
            }
            else{
                // VALIDACION CORRECTA
                String datos[] = {magnitudP + "", direccionP + ""};
                md.addRow(datos);
                borrarCampos();
                listaVectores.insertarVector(magnitudP, direccionP);
                listaVectores.calculoFX(magnitudP, direccionP);
                listaVectores.calculoFY(magnitudP, direccionP);
                txtVectoresIng.setText(listaVectores.getTamanio()+ "");
                txtSigmaFx.setText(tresDig.format(listaVectores.getSumaFx()) + "");
                txtSigmaFy.setText(tresDig.format(listaVectores.getSumaFy()) + "");
                txtResultanteTotal.setText(tresDig.format(listaVectores.calcularResultante()) + "");
                txtDireccionTotal.setText(tresDig.format(listaVectores.getDireccionTotal()) + "");
                borrarCampos();
            }
        }    
    }//GEN-LAST:event_bttAceptarActionPerformed
    private void bttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirActionPerformed
        salir();
    }//GEN-LAST:event_bttSalirActionPerformed
    private void txtMagnitudInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMagnitudInputKeyPressed
       
    }//GEN-LAST:event_txtMagnitudInputKeyPressed
    private void txtDireccionInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionInputKeyPressed
      
    }//GEN-LAST:event_txtDireccionInputKeyPressed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAceptar;
    private javax.swing.JButton bttSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblDatos;
    private javax.swing.JTextField txtDireccionInput;
    private javax.swing.JTextField txtDireccionTotal;
    private javax.swing.JTextField txtMagnitudInput;
    private javax.swing.JTextField txtResultanteTotal;
    private javax.swing.JTextField txtSigmaFx;
    private javax.swing.JTextField txtSigmaFy;
    private javax.swing.JTextField txtVectoresIng;
    // End of variables declaration//GEN-END:variables
}