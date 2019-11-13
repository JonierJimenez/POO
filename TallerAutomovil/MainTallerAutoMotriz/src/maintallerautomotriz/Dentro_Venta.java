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
 * @author jhonier
 */
public class Dentro_Venta extends javax.swing.JFrame {

  
    String [] Ventas;
    String [] Inventario;
    String [] Mecanicos;
    public int va,va2,inventario=0,escribir=0;
    
    public Dentro_Venta() {
        initComponents();
        setLocationRelativeTo(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1_volver_avendedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Inventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        CodigoPieza = new javax.swing.JTextField();
        CantidadVendida = new javax.swing.JTextField();
        NombreMecanico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MostrarInventario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1MostrarMecanicos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2Ventas = new javax.swing.JTable();
        MostrarVentas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 492));
        getContentPane().setLayout(null);

        jTabbedPane1.setToolTipText("");

        jPanel1.setLayout(null);

        jButton1_volver_avendedor.setText("Volver");
        jButton1_volver_avendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_volver_avendedorActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_volver_avendedor);
        jButton1_volver_avendedor.setBounds(350, 360, 63, 23);

        jTable1Inventario.setBackground(new java.awt.Color(0, 51, 51));
        jTable1Inventario.setForeground(new java.awt.Color(255, 255, 255));
        jTable1Inventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1Inventario.setRowHeight(26);
        jScrollPane1.setViewportView(jTable1Inventario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 290, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Cliente:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 47, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos de la venta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 30, 130, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("codigo pieza");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 120, 76, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("cantidad");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 180, 52, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Mecanico");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 230, 109, 30);
        jPanel1.add(NombreCliente);
        NombreCliente.setBounds(320, 80, 119, 30);
        jPanel1.add(CodigoPieza);
        CodigoPieza.setBounds(340, 140, 70, 30);
        jPanel1.add(CantidadVendida);
        CantidadVendida.setBounds(340, 200, 70, 30);
        jPanel1.add(NombreMecanico);
        NombreMecanico.setBounds(320, 260, 104, 30);

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("IngresarVenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 310, 119, 25);

        MostrarInventario.setBackground(new java.awt.Color(0, 255, 51));
        MostrarInventario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MostrarInventario.setForeground(new java.awt.Color(255, 255, 255));
        MostrarInventario.setText("Mostra Inventario");
        MostrarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarInventario);
        MostrarInventario.setBounds(60, 20, 141, 25);

        jTable1MostrarMecanicos.setBackground(new java.awt.Color(51, 0, 51));
        jTable1MostrarMecanicos.setForeground(new java.awt.Color(255, 255, 255));
        jTable1MostrarMecanicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1MostrarMecanicos.setRowHeight(20);
        jScrollPane3.setViewportView(jTable1MostrarMecanicos);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 210, 270, 120);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 510, 440);

        jTabbedPane1.addTab("Inicio", jPanel1);

        jPanel2.setLayout(null);

        jTable2Ventas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2Ventas.setMinimumSize(new java.awt.Dimension(70, 120));
        jTable2Ventas.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2Ventas);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 350, 150);

        MostrarVentas.setBackground(new java.awt.Color(0, 51, 51));
        MostrarVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarVentas.setForeground(new java.awt.Color(255, 255, 255));
        MostrarVentas.setText("Mostrar");
        MostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarVentasActionPerformed(evt);
            }
        });
        jPanel2.add(MostrarVentas);
        MostrarVentas.setBounds(380, 10, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 510, 450);

        jTabbedPane1.addTab("Registro Ventas", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 0, 510, 470);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 840, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_volver_avendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_volver_avendedorActionPerformed
        Vendedor VD=new Vendedor();
        VD.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1_volver_avendedorActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(inventario==1){
        try {
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            
           String NombreC="",Idpieza="",CantidaV="",NombreMecanico="";
            archivo=new File("Ventas.txt");
            
            NombreC=NombreCliente.getText();
            Idpieza= CodigoPieza.getText();
            CantidaV=CantidadVendida.getText();
            NombreMecanico=this.NombreMecanico.getText();
            
            for(int i=0;i<Inventario.length;i++){ //valido  que me ingrese codigo de pieza correcto
                if(Inventario[i].equals(Idpieza)){
                    this.escribir=1;
                }
            }

            escribir = new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);

            //Escribimos en el archivo
                if(this.escribir==1){
                linea.println(NombreC);
                linea.println(Idpieza);
                linea.println(CantidaV);
                linea.println(NombreMecanico);
                linea.close();
                escribir.close();
                JOptionPane.showMessageDialog(rootPane, "Agregado con exito", "Agregar",1);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ingreso mal Codigo de pieza");
                
                }        
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        NombreCliente.setText("");
        CodigoPieza.setText("");
        CantidadVendida.setText("");
        this.NombreMecanico.setText("");
        }else{
          JOptionPane.showMessageDialog(null,"Muestre el inventario primero");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarVentasActionPerformed
        // TODO add your handling code here:
        
        try {
            va=0;
            int i=0;
            String linea;
            Scanner sc ;
            sc = new Scanner(new File("Ventas.txt"));      
            File f = new File("Ventas.txt");
            FileReader fr;
            
            fr = new FileReader(f);       
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())!=null){//linea buena la cuenta linea 0 del vectos igual a linea 1 del this.linea
                    va++;
                }
             
            } catch (IOException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (va==0){
                JOptionPane.showMessageDialog(null,"No se ha ingresado Ventas");
            }
            Ventas = new String[va];  
            
            while(sc.hasNextLine()){
                Ventas[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }
            
             mostrar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_MostrarVentasActionPerformed

    private void MostrarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInventarioActionPerformed
        try {
            inventario=1;
            va=0;
            int i=0;
            String linea;
            Scanner sc ;
            sc = new Scanner(new File("Inventario.txt"));      
            File f = new File("Inventario.txt");
            FileReader fr;
            
            fr = new FileReader(f);       
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())!=null){
                    va++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Inventario = new String[va];   
            
            while(sc.hasNextLine()){
                Inventario [i++]=sc.nextLine();   //siclo que me llena el arreglo
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            va2=0;
            int i=0;
            String linea;
            Scanner sc ;
            sc = new Scanner(new File("Mecanicos.txt"));      
            File f = new File("Mecanicos.txt");
            FileReader fr;
            
            fr = new FileReader(f);       
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())!=null){
                    va2++;
                }
               
            } catch (IOException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Mecanicos = new String[va2];   
            
            while(sc.hasNextLine()){
                Mecanicos [i++]=sc.nextLine();   
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         mostrarIM();
    }//GEN-LAST:event_MostrarInventarioActionPerformed

    public void mostrar(){
        int c=0;
        String matriz [][] = new String [va/4][4];
        
        for (int i = 0; i < va/4; i++) {
             for(int j=0;j<4;j++){
                
                matriz [i][j]= Ventas[c];
                   c++;
             }
        }
           
 
          jTable2Ventas.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nombre Cliente", "Codigo pieza", "Cantidad","Nombre Mecanico"
            }
        ));
        
    }
     public void mostrarIM(){
        int c=0;
        String matriz [][] = new String [va/4][4];
        
        for (int i = 0; i < va/4; i++) {
             for(int j=0;j<4;j++){
                
                matriz [i][j]= Inventario[c];
                   c++;
             }
        }
           
 
          jTable1Inventario.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nom Producto", "Cod pieza", "Cantidad","$Presio Dolar "
            }
        ));
        
        int c2=0;
        String matriz2 [][] = new String [va2/3][3];
        
        for (int i = 0; i < va2/3; i++) {
             for(int j=0;j<3;j++){
                
                matriz2 [i][j]= Mecanicos[c2];
                   c2++;
             }
        }
           
 
          jTable1MostrarMecanicos.setModel(new javax.swing.table.DefaultTableModel(
            matriz2,
            new String [] {
                "Nom Mecanico","C","Codigo"
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
            java.util.logging.Logger.getLogger(Dentro_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dentro_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dentro_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dentro_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dentro_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadVendida;
    private javax.swing.JTextField CodigoPieza;
    private javax.swing.JButton MostrarInventario;
    private javax.swing.JButton MostrarVentas;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JTextField NombreMecanico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_volver_avendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1Inventario;
    private javax.swing.JTable jTable1MostrarMecanicos;
    private javax.swing.JTable jTable2Ventas;
    // End of variables declaration//GEN-END:variables
}
