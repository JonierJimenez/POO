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
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jhoni
 */
public class Dentro_Reporte extends javax.swing.JFrame {
  int va,va2;
  String [] Dusuarios;
  String [] Dusuarios2;
    /**
     * Creates new form Dentro_Reporte
     */
    public Dentro_Reporte() {
        initComponents();
        setLocationRelativeTo(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Precio = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableReporteMecanico = new javax.swing.JTable();
        MostrarReporteFinal = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(832, 492));
        getContentPane().setLayout(null);

        jTable1Precio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1Precio.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1Precio);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 203, 130);

        jTableReporteMecanico.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableReporteMecanico.setMinimumSize(new java.awt.Dimension(100, 120));
        jTableReporteMecanico.setRowHeight(30);
        jScrollPane2.setViewportView(jTableReporteMecanico);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 440, 150);

        MostrarReporteFinal.setBackground(new java.awt.Color(0, 51, 51));
        MostrarReporteFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarReporteFinal.setForeground(new java.awt.Color(255, 255, 255));
        MostrarReporteFinal.setText("Reporte");
        MostrarReporteFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarReporteFinalActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarReporteFinal);
        MostrarReporteFinal.setBounds(500, 70, 130, 50);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 380, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarReporteFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarReporteFinalActionPerformed
         try {
            va=0;
            int i=0;
            String linea;
            Scanner sc ;
            sc = new Scanner(new File("ReporteMecanico.txt"));      
            File f = new File("ReporteMecanico.txt");
            FileReader fr;
            
            fr = new FileReader(f);       
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())!=null){//linea buena la cuenta linea 0 del vectos igual a linea 1 del this.lenea
                    this.va++;
                }
                System.out.println("nelineas en mostrar"+this.va);
            } catch (IOException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Dusuarios = new String[this.va];   //9
            
            while(sc.hasNextLine()){
                Dusuarios[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }
            System.out.println("i toda rara:"+i);
             mostrar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        try {
            va2=0;
            int i=0;
            String linea;
            Scanner sc ;
            sc = new Scanner(new File("precio.txt"));      
            File f = new File("precio.txt");
            FileReader fr;
            
            fr = new FileReader(f);       
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())!=null){//linea buena la cuenta linea 0 del vectos igual a linea 1 del this.lenea
                    this.va2++;
                }
                System.out.println("nelineas en mostrar"+this.va2);
            } catch (IOException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Dusuarios2 = new String[this.va2];   //9
            
            while(sc.hasNextLine()){
                Dusuarios2[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }
            System.out.println("i toda rara: va2:"+i);
             mostrar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(va==0){
              JOptionPane.showMessageDialog(null, " No se encuentra ningun reporte");
          }
       
    }//GEN-LAST:event_MostrarReporteFinalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Administrador l=new Administrador();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

     public void mostrar(){
        
        int c=0;
        String matriz [][] = new String [va/4][4];
        
        for (int i = 0; i < va/4; i++) {
             for(int j=0;j<4;j++){
                matriz [i][j]= Dusuarios[c];
                   c++;
             }
        }
           
 
          jTableReporteMecanico.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nom Mecanico", "Cantidad", "Cod Producto","Nom Cliente "
            }
        ));
         
       int g=0;   
       String matriz2 [][] = new String [va2/2][2];   
       for (int i = 0; i < va2/2; i++) {
             for(int j=0;j<2;j++){
                matriz2 [i][j]= Dusuarios2[g];
                   g++;
             }
        }
           
 
          jTable1Precio.setModel(new javax.swing.table.DefaultTableModel(
            matriz2,
            new String [] {
                "ESTADO", "PRESIO",
            }
        ));
    }
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
            java.util.logging.Logger.getLogger(Dentro_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dentro_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dentro_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dentro_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dentro_Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MostrarReporteFinal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1Precio;
    private javax.swing.JTable jTableReporteMecanico;
    // End of variables declaration//GEN-END:variables
}
