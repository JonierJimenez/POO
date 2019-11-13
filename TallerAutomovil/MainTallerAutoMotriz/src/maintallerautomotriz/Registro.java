/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintallerautomotriz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jhoni
 */
public class Registro extends javax.swing.JFrame {
    String [] Usuarios;
    int va,no_encontro=0;
    public Registro() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JLabel();
        Contrasena = new javax.swing.JLabel();
        Cargo = new javax.swing.JLabel();
        TXTusuario = new javax.swing.JTextField();
        TXTcargo = new javax.swing.JTextField();
        TXTcontrasena = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CancelarRegistro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRADURIA");
        setPreferredSize(new java.awt.Dimension(830, 492));
        getContentPane().setLayout(null);

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario:");
        getContentPane().add(Usuario);
        Usuario.setBounds(130, 30, 180, 50);

        Contrasena.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Contrasena.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena.setText("Contraseña:");
        getContentPane().add(Contrasena);
        Contrasena.setBounds(70, 70, 230, 80);

        Cargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cargo.setForeground(new java.awt.Color(255, 255, 255));
        Cargo.setText("Cargo(1=Admin;2=Vendedor;3=Mecanico):");
        getContentPane().add(Cargo);
        Cargo.setBounds(0, 120, 269, 100);
        getContentPane().add(TXTusuario);
        TXTusuario.setBounds(270, 30, 190, 50);

        TXTcargo.setToolTipText("Ingrese (1=Admin)(2=Vendedor)(3=mecanico)");
        TXTcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTcargoActionPerformed(evt);
            }
        });
        getContentPane().add(TXTcargo);
        TXTcargo.setBounds(270, 150, 50, 40);

        TXTcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTcontrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(TXTcontrasena);
        TXTcontrasena.setBounds(270, 90, 190, 50);

        Registrar.setBackground(new java.awt.Color(51, 255, 102));
        Registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.setPreferredSize(new java.awt.Dimension(830, 492));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar);
        Registrar.setBounds(230, 230, 160, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Registrarr.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, -40, 300, 330);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gif-coches2.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 50, 1030, 550);

        CancelarRegistro.setBackground(new java.awt.Color(255, 0, 51));
        CancelarRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CancelarRegistro.setText("Cancelar");
        CancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarRegistro);
        CancelarRegistro.setBounds(10, 410, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 820, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
         //ler el archivo
        try {
                va=0;
                int i=0;
                String linea;
                Scanner sc ;
                sc = new Scanner(new File("Usuarios.txt"));
                File f = new File("Usuarios.txt");
                FileReader fr;

                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                try {
                    while((linea=br.readLine())!=null){//linea buena la cuenta linea 0 del vectos igual a linea 1 del this.lenea
                        this.va++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

                Usuarios = new String[this.va];   //9

                while(sc.hasNextLine()){
                    Usuarios[i++]=sc.nextLine();   //siclo que me llena el arreglo
                }
                    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {  
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            
            String cargo="";
            archivo=new File("Usuarios.txt");
            
            cargo=TXTcargo.getText();

            escribir = new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);

//            //Escribimos en el archivo
            for(int l=0;l<Usuarios.length;l++){
                if(Usuarios[l].equals(TXTusuario.getText()) && Usuarios[l+2].equals(TXTcargo.getText())){
                    JOptionPane.showMessageDialog(null, "EL usuario ya Existe");
                    no_encontro=1;
                }
            }
            if(no_encontro==0){
                if(cargo.equals("1")||cargo.equals("2")||cargo.equals("3")){
                 
                if(cargo.equals("3")){
                    File archivoM;
                    FileWriter escribirM;
                    PrintWriter lineaM;


                    archivoM=new File("Mecanicos.txt");

                    escribirM = new FileWriter(archivoM,true);
                    lineaM = new PrintWriter(escribirM);
                    
                    lineaM.println(TXTusuario.getText());
                    lineaM.println(TXTcontrasena.getText());
                    lineaM.println( TXTcargo.getText());
                    lineaM.close();
                    escribirM.close();   
                }
               
                linea.println(TXTusuario.getText());
                linea.println(TXTcontrasena.getText());
                linea.println(cargo);
                JOptionPane.showMessageDialog(rootPane, "Agregado con exito", "Agregar",1);
                escribir.close();
            }else{
                JOptionPane.showMessageDialog(this,"(1=ADMIN,2=VENDEDOR,3=MECANICO)","Cargo Invalido" ,3);
            }

                Login login =new Login();
                login.setVisible(true);
                setVisible(false);
        }else{
                Login login =new Login();
                login.setVisible(true);
                setVisible(false);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void TXTcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTcargoActionPerformed

    private void TXTcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTcontrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTcontrasenaActionPerformed

    private void CancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarRegistroActionPerformed
       Login login =new Login();
       login.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_CancelarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarRegistro;
    private javax.swing.JLabel Cargo;
    private javax.swing.JLabel Contrasena;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TXTcargo;
    private javax.swing.JTextField TXTcontrasena;
    private javax.swing.JTextField TXTusuario;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
