
package maintallerautomotriz;

import javax.swing.JOptionPane;

/**
 *
 * @author jhoni
 */
public class Vendedor extends javax.swing.JFrame {

   public static String Nombre;
    public Vendedor() {
        initComponents();
        Login login=new Login();
        RecibiVendedortxt.setText(login.texto);
        setLocationRelativeTo(this);
        Nombre=RecibiVendedortxt.getText();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_gestioncliente_Dentroventa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4_Volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RecibiVendedor = new javax.swing.JLabel();
        RecibiVendedortxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendedor");
        setPreferredSize(new java.awt.Dimension(830, 492));
        getContentPane().setLayout(null);

        jButton1_gestioncliente_Dentroventa.setBackground(new java.awt.Color(0, 102, 102));
        jButton1_gestioncliente_Dentroventa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1_gestioncliente_Dentroventa.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_gestioncliente_Dentroventa.setText("Gestionar Clientes");
        jButton1_gestioncliente_Dentroventa.setMaximumSize(new java.awt.Dimension(600, 423));
        jButton1_gestioncliente_Dentroventa.setMinimumSize(new java.awt.Dimension(600, 423));
        jButton1_gestioncliente_Dentroventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_gestioncliente_DentroventaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_gestioncliente_Dentroventa);
        jButton1_gestioncliente_Dentroventa.setBounds(280, 80, 180, 50);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/callring_gestion_clientes1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 20, 560, 370);

        jButton4_Volver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4_Volver.setText("Cerrar Sesion");
        jButton4_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4_Volver);
        jButton4_Volver.setBounds(300, 400, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vendedor:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 20, 90, 40);

        RecibiVendedor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(RecibiVendedor);
        RecibiVendedor.setBounds(690, 280, 0, 0);

        RecibiVendedortxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RecibiVendedortxt.setForeground(new java.awt.Color(255, 255, 255));
        RecibiVendedortxt.setText("jLabel5");
        getContentPane().add(RecibiVendedortxt);
        RecibiVendedortxt.setBounds(750, 30, 90, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 830, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_gestioncliente_DentroventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_gestioncliente_DentroventaActionPerformed
        Dentro_Venta DV = new Dentro_Venta();
        DV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1_gestioncliente_DentroventaActionPerformed

    private void jButton4_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_VolverActionPerformed
        
         int input = JOptionPane.showConfirmDialog(null, "¿Desea salir Realmen?", "Select an Option...",
	 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
         System.out.println("imput"+input);
         if(input==0){
          Login l=new Login();
          l.setVisible(true);
          this.setVisible(false);
         }
    }//GEN-LAST:event_jButton4_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RecibiVendedor;
    private javax.swing.JLabel RecibiVendedortxt;
    private javax.swing.JButton jButton1_gestioncliente_Dentroventa;
    private javax.swing.JButton jButton4_Volver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
