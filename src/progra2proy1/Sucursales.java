package progra2proy1;

public class Sucursales extends javax.swing.JFrame {
    
    public String sucursal = "";
    
    public Sucursales() {
        initComponents();
    }
    
    public void CargarIngredientes() {
        
        String[] nombres = new String[] {"Torta de carne","Salchicha","Pan de hamburguesa","Pan de Hot Dog","Repollo","Lechuga","Tomate","Cebolla","Ketchup","Mayonesa","Mantequilla","Papas","Ajo en polvo","Sal","Aceite","Queso blanco","Queso amarillo","Pollo","Tortillas","Jamón",};
        int[] precios = new int[] {400,200,150,125,100,80,150,150,50,50,100,150,15,5,25,200,150,400,100,300};
        Accesos agregar = new Accesos();
        
        for (int i = 0; i < 20; i++) {
            Ingrediente ingrediente = new Ingrediente();
            ingrediente.setID(i);
            ingrediente.setNombre(nombres[i]);
            ingrediente.setPrecio(precios[i]);
            agregar.AgregarIngrediente(ingrediente);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSanPedro = new javax.swing.JButton();
        btnLosYoses = new javax.swing.JButton();
        btnCurridabat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadena de Comida Rápida", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        jPanel1.setRequestFocusEnabled(false);

        jLabel2.setText("Este módulo le permitirá manejar los productos ofrecidos por la cadena.");

        jLabel3.setText("Seleccione una sucursal a continuación:");

        btnSanPedro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progra2proy1/imagenes/sanpedro.png"))); // NOI18N
        btnSanPedro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPedroActionPerformed(evt);
            }
        });

        btnLosYoses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progra2proy1/imagenes/losyoses.png"))); // NOI18N
        btnLosYoses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLosYosesActionPerformed(evt);
            }
        });

        btnCurridabat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progra2proy1/imagenes/curridabat.png"))); // NOI18N
        btnCurridabat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurridabatActionPerformed(evt);
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
                        .addComponent(btnSanPedro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLosYoses, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCurridabat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSanPedro)
                    .addComponent(btnLosYoses)
                    .addComponent(btnCurridabat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnSanPedroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPedroActionPerformed
        
        sucursal = "San Pedro";
        SucursalSeleccionada();
    }//GEN-LAST:event_btnSanPedroActionPerformed

    private void btnLosYosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLosYosesActionPerformed
        
        sucursal = "Los Yoses";
        SucursalSeleccionada();
    }//GEN-LAST:event_btnLosYosesActionPerformed

    private void btnCurridabatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurridabatActionPerformed
        
        sucursal = "Curridabat";
        SucursalSeleccionada();
    }//GEN-LAST:event_btnCurridabatActionPerformed

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
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucursales().setVisible(true);
            }
        });
    }
    
    public void SucursalSeleccionada () {
        
        Tareas tareas = new Tareas(sucursal);
        tareas.setVisible(true);
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurridabat;
    private javax.swing.JButton btnLosYoses;
    private javax.swing.JButton btnSanPedro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}