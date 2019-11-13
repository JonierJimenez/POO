/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintallerautomotriz;

import javax.swing.JOptionPane;

/**
 *
 * @author jhoni
 */
public class Mecanico extends javax.swing.JFrame {
    public static String Nombre;
    
    public Mecanico() {
        initComponents();
        setLocationRelativeTo(this);
        Login login=new Login();
        jLabel2txt.setText(login.texto);
        Nombre=jLabel2txt.getText();
        System.out.println("nombrem"+Nombre);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GESTIONARSERVICIO = new javax.swing.JButton();
        jLabel2txt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4_volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mecanico");
        setPreferredSize(new java.awt.Dimension(830, 492));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mecanico:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 20, 100, 30);

        GESTIONARSERVICIO.setBackground(new java.awt.Color(0, 51, 51));
        GESTIONARSERVICIO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GESTIONARSERVICIO.setForeground(new java.awt.Color(255, 255, 255));
        GESTIONARSERVICIO.setText("Gestionar Servicios");
        GESTIONARSERVICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GESTIONARSERVICIOActionPerformed(evt);
            }
        });
        getContentPane().add(GESTIONARSERVICIO);
        GESTIONARSERVICIO.setBounds(330, 110, 220, 31);

        jLabel2txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2txt.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2txt.setText("jLabel2");
        getContentPane().add(jLabel2txt);
        jLabel2txt.setBounds(700, 10, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mecanico1.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 10, 660, 440);

        jButton4_volver.setBackground(new java.awt.Color(204, 0, 0));
        jButton4_volver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4_volver.setForeground(new java.awt.Color(255, 255, 255));
        jButton4_volver.setText("Cerrar Sesion");
        jButton4_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_volverActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4_volver);
        jButton4_volver.setBounds(650, 410, 150, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 840, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_volverActionPerformed
        Login l=new Login();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4_volverActionPerformed

    private void GESTIONARSERVICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GESTIONARSERVICIOActionPerformed
        Dentro_Mecanico DM=new Dentro_Mecanico();
        DM.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_GESTIONARSERVICIOActionPerformed

   
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
            java.util.logging.Logger.getLogger(Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mecanico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GESTIONARSERVICIO;
    private javax.swing.JButton jButton4_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2txt;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
