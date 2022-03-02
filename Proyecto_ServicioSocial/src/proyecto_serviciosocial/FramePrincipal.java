package proyecto_serviciosocial;
/**
 * @author Eduardo Leyva Bradley
 * @author Julio Eliud Ayala Reyes
 * @author Crhistian Aaron Badillo Urbina
 */
public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        super("Secretaria de Comunicaciones y Transportes");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelRegistro = new javax.swing.JPanel();
        lbFiliacion = new javax.swing.JLabel();
        txtFiliacion = new javax.swing.JTextField();
        lbCurp = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        lbRfc = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        lbHomo = new javax.swing.JLabel();
        txtHomo = new javax.swing.JTextField();
        lbDatos = new javax.swing.JLabel();
        lbPaterno = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        lbMaterno = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbDatos1 = new javax.swing.JLabel();
        lbPaterno1 = new javax.swing.JLabel();
        txtPaterno1 = new javax.swing.JTextField();
        lbMaterno1 = new javax.swing.JLabel();
        txtMaterno1 = new javax.swing.JTextField();
        lbNombre1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        panelConsulta = new javax.swing.JPanel();
        panelModificar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setFocusCycleRoot(false);

        panelFondo.setBackground(new java.awt.Color(157, 33, 67));

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));

        lbFiliacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbFiliacion.setText("FILIACIÓN:");

        txtFiliacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbCurp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCurp.setText("CURP:");

        txtCurp.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        lbRfc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbRfc.setText("RFC:");

        txtRfc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbHomo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbHomo.setText("HOMOCLAVE:");

        txtHomo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbDatos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbDatos.setText("Datos Personales:");

        lbPaterno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPaterno.setText("Apellido Paterno:");

        txtPaterno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbMaterno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMaterno.setText("Apellido Materno:");

        txtMaterno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNombre.setText("Nombre (s):");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbDatos1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbDatos1.setText("Domicilio:");

        lbPaterno1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPaterno1.setText("Apellido Paterno:");

        txtPaterno1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbMaterno1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMaterno1.setText("Apellido Materno:");

        txtMaterno1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNombre1.setText("Nombre (s):");

        txtNombre1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDatos)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbMaterno))
                                    .addComponent(lbNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(txtMaterno)
                                    .addComponent(txtNombre))))
                        .addGap(86, 86, 86)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbPaterno1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbMaterno1))
                                    .addComponent(lbNombre1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPaterno1)
                                    .addComponent(txtMaterno1)
                                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbDatos1)))
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                            .addComponent(lbFiliacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCurp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                            .addComponent(lbRfc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbHomo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHomo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPaterno1)
                            .addComponent(txtPaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaterno1)
                            .addComponent(txtMaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombre1)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFiliacion)
                            .addComponent(txtFiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCurp)
                            .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRfc)
                            .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHomo)
                            .addComponent(txtHomo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDatos)
                            .addComponent(lbDatos1))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPaterno)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaterno)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo Registro", panelRegistro);

        panelConsulta.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consultas", panelConsulta);

        panelModificar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar o Eliminar Registro", panelModificar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel3);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(LOGO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FramePrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCurp;
    private javax.swing.JLabel lbDatos;
    private javax.swing.JLabel lbDatos1;
    private javax.swing.JLabel lbFiliacion;
    private javax.swing.JLabel lbHomo;
    private javax.swing.JLabel lbMaterno;
    private javax.swing.JLabel lbMaterno1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbPaterno;
    private javax.swing.JLabel lbPaterno1;
    private javax.swing.JLabel lbRfc;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtFiliacion;
    private javax.swing.JTextField txtHomo;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtMaterno1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtPaterno1;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
}
