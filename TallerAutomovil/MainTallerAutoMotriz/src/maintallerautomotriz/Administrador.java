/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintallerautomotriz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jhoni
 */
public class Administrador extends javax.swing.JFrame {
   
    public static  String Nombre;
    
    public Administrador() {
        initComponents();
        Login login=new Login();
        jLabel1recibir.setText(login.texto);
        setLocationRelativeTo(this);
        Nombre=jLabel1recibir.getText();
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1_gestion_empleado = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        VOLVERLOGIN = new javax.swing.JButton();
        jButton_abrir_dentroInventario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1recibir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setMaximumSize(new java.awt.Dimension(830, 492));
        setMinimumSize(new java.awt.Dimension(123, 29));
        setPreferredSize(new java.awt.Dimension(830, 492));
        getContentPane().setLayout(null);

        jButton1_gestion_empleado.setBackground(new java.awt.Color(0, 0, 51));
        jButton1_gestion_empleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1_gestion_empleado.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_gestion_empleado.setText("Gestion Empleado");
        jButton1_gestion_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_gestion_empleadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_gestion_empleado);
        jButton1_gestion_empleado.setBounds(110, 120, 190, 50);

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ver Reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 120, 150, 50);

        VOLVERLOGIN.setBackground(new java.awt.Color(0, 0, 51));
        VOLVERLOGIN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VOLVERLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        VOLVERLOGIN.setText("Cerrar Sesion");
        VOLVERLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERLOGINActionPerformed(evt);
            }
        });
        getContentPane().add(VOLVERLOGIN);
        VOLVERLOGIN.setBounds(630, 390, 170, 40);

        jButton_abrir_dentroInventario.setBackground(new java.awt.Color(0, 0, 51));
        jButton_abrir_dentroInventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_abrir_dentroInventario.setForeground(new java.awt.Color(255, 255, 255));
        jButton_abrir_dentroInventario.setText("Añadir Inventario");
        jButton_abrir_dentroInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_abrir_dentroInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_abrir_dentroInventario);
        jButton_abrir_dentroInventario.setBounds(570, 120, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin11.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 190, 90, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admi2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 200, 80, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admi3.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 190, 80, 100);

        jLabel1recibir.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1recibir.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel1recibir.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1recibir);
        jLabel1recibir.setBounds(630, 20, 190, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 30, 60, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, -250, 860, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VOLVERLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERLOGINActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "¿Desea salir Realmen?", "Select an Option...",
	JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
         System.out.println("imput"+input);
         if(input==0){
         Login l =new Login();
         l.setVisible(true);
         setVisible(false);
         }
    }//GEN-LAST:event_VOLVERLOGINActionPerformed

    private void jButton_abrir_dentroInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_abrir_dentroInventarioActionPerformed
        Dentro_Inventario DI=new Dentro_Inventario();
        DI.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton_abrir_dentroInventarioActionPerformed

    private void jButton1_gestion_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_gestion_empleadoActionPerformed
        Dentro_Admin Da = new Dentro_Admin();
        Da.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1_gestion_empleadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Dentro_Reporte DR= new Dentro_Reporte();
        DR.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLVERLOGIN;
    private javax.swing.JButton jButton1_gestion_empleado;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_abrir_dentroInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1recibir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
