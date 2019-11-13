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
public class Dentro_Inventario extends javax.swing.JFrame {
    
    public static int Vf=0;
    String [] Inventario;
    int nlineas;
    int va=0;
    
    public Dentro_Inventario() {
        initComponents();
        setLocationRelativeTo(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1_elim = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Buton_Volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ENombrep = new javax.swing.JTextField();
        EcodigoP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4_dentroInventario_eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1Mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Jbuton_Agregar_dentro_Inventario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 492));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Buton_Volver.setText("Volver");
        Buton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Buton_Volver);
        Buton_Volver.setBounds(350, 340, 63, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("BIENVENIDO AL INICIO (GESTION DE INVENTARIO)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 20, 440, 40);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/piezas-del-coche.jpg"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(-80, 0, 600, 470);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 0, 470, 450);

        jTabbedPane1_elim.addTab("Inicio", jPanel1);

        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Producto:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 90, 144, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo Producto:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(21, 140, 140, 22);
        jPanel4.add(ENombrep);
        ENombrep.setBounds(180, 90, 170, 30);

        EcodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcodigoPActionPerformed(evt);
            }
        });
        jPanel4.add(EcodigoP);
        EcodigoP.setBounds(180, 140, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BUSCAR PRODUCTO A ELIMINAR");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(50, 20, 280, 24);

        jButton4_dentroInventario_eliminar.setBackground(new java.awt.Color(255, 0, 51));
        jButton4_dentroInventario_eliminar.setText("ELIMINAR");
        jButton4_dentroInventario_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_dentroInventario_eliminarActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4_dentroInventario_eliminar);
        jButton4_dentroInventario_eliminar.setBounds(333, 327, 90, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar_inventarioo.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(80, 220, 210, 190);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel4.add(jLabel19);
        jLabel19.setBounds(0, 0, 470, 450);

        jTabbedPane1_elim.addTab("Eliminar", jPanel4);

        jPanel3.setLayout(null);

        jButton1Mostrar.setText("Mostrar");
        jButton1Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1Mostrar);
        jButton1Mostrar.setBounds(369, 11, 69, 23);

        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuario", "Contraseña", "Cargo"
            }
        ));
        jTableInventario.setRowHeight(30);
        jScrollPane1.setViewportView(jTableInventario);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 370, 380);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, 0, 530, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel3.add(jLabel14);
        jLabel14.setBounds(0, 10, 470, 440);

        jTabbedPane1_elim.addTab("Mostrar Inventario", jPanel3);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Producto:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 150, 22);
        jPanel2.add(NombreP);
        NombreP.setBounds(170, 10, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 80, 90, 22);
        jPanel2.add(Codigo);
        Codigo.setBounds(170, 70, 120, 40);

        Jbuton_Agregar_dentro_Inventario.setBackground(new java.awt.Color(102, 255, 102));
        Jbuton_Agregar_dentro_Inventario.setForeground(new java.awt.Color(255, 255, 255));
        Jbuton_Agregar_dentro_Inventario.setText("Agregar");
        Jbuton_Agregar_dentro_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbuton_Agregar_dentro_InventarioActionPerformed(evt);
            }
        });
        jPanel2.add(Jbuton_Agregar_dentro_Inventario);
        Jbuton_Agregar_dentro_Inventario.setBounds(326, 302, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 140, 90, 30);

        Cantidad.setToolTipText("Ingrese cargo 1=Admin, 2=Vendedor,3=Mecanico");
        jPanel2.add(Cantidad);
        Cantidad.setBounds(170, 130, 80, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRECIO:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(90, 200, 72, 22);
        jPanel2.add(Precio);
        Precio.setBounds(170, 190, 80, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 500, 450);

        jTabbedPane1_elim.addTab("Agregar", jPanel2);

        getContentPane().add(jTabbedPane1_elim);
        jTabbedPane1_elim.setBounds(0, 0, 470, 480);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1, -60, 810, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Buton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buton_VolverActionPerformed
        Administrador ad = new Administrador();
        setVisible(false);
        ad.setVisible(true);

    }//GEN-LAST:event_Buton_VolverActionPerformed

    private void Jbuton_Agregar_dentro_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbuton_Agregar_dentro_InventarioActionPerformed

        try {
            File archivo;
            FileWriter escribir;
            PrintWriter linea;

            String Nombrep="",codigo="",cantidad="",pre="";
            archivo=new File("Inventario.txt");

            Nombrep=NombreP.getText();
            codigo= Codigo.getText();
            cantidad=Cantidad.getText();
            pre=Precio.getText();

            escribir = new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);

            //Escribimos en el archivo
           
                linea.println(Nombrep);
                linea.println(codigo);
                linea.println(cantidad);
                linea.println(pre);
                JOptionPane.showMessageDialog(rootPane, "Agregado con exito", "Agregar",1);
                NombreP.setText("");
                Codigo.setText("");
                Cantidad.setText("");
                Precio.setText("");
            
            

            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Jbuton_Agregar_dentro_InventarioActionPerformed

    private void EcodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcodigoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EcodigoPActionPerformed

    private void jButton4_dentroInventario_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_dentroInventario_eliminarActionPerformed
        // ELIMINAR
        try {

            int i=0;
            va=0;
            String linea;
            String Elimp="",Elicod="",cargo="";
            Scanner sc = new Scanner(new File("Inventario.txt")); //C:\Users\ESTUDIANTE\Downloads
            File f= new File("Inventario.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            try {
                while((linea=br.readLine())!=null){
                    va++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            Inventario = new String[va];
            while(sc.hasNextLine()){
                Inventario[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }

            Elimp=ENombrep.getText();
            Elicod=EcodigoP.getText();
            
            boolean gc = validarProducto_eliminar(Inventario,Elimp,Elicod,va);
            System.out.println("cg:"+gc);/////////////////////////////////////////////////////////////
           

            if(gc){
               
                JOptionPane.showMessageDialog(this,"Eliminado correctamente");
                int a1=0,a2=1,a3=2,a4=3;
                try {

                    File archivo;
                    FileWriter escribir;
                    PrintWriter lineaN;

                    String usuarioN="",pasN="",cargoN="",presio="";
                    archivo=new File("Inventario.txt");
                    escribir = new FileWriter(archivo);
                    lineaN=new PrintWriter(escribir);
                    int resultado=((va-4)/4); //-4 para que no se repitan los tres ultimos dijitos
                    for(int ww=0;ww<resultado;ww++){

                        
                        usuarioN=Inventario[a1];
                        pasN=Inventario[a2];
                        cargoN=Inventario[a3];
                        presio=Inventario[a4];
                        

                        //Escribimos en el archivo
                        lineaN.println(usuarioN);
                        lineaN.println(pasN);
                        lineaN.println(cargoN);
                        lineaN.println(presio);

                        a1+=4;
                        a2+=4;
                        a3+=4;
                        a4+=4;
                        System.out.println("ENTRO:"+ww);
                    }
                    lineaN.close();
                    escribir.close();

                    System.out.println("el boton sirve");
                } catch (IOException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }else{
                JOptionPane.showMessageDialog(null,"No es posible eliminar");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        ENombrep.setText("");
        EcodigoP.setText("");
    }//GEN-LAST:event_jButton4_dentroInventario_eliminarActionPerformed
    
   public boolean validarProducto_eliminar(String usuarios[], String Producto, String pas, int pos){
        int c=0,r=0;
        pos=(pos)-1;
        System.out.println("entro en validar");
        for(int i=0;  i < pos ;i++){
            
         if(usuarios[i].equals(Producto) &&  usuarios[i+1].equals(pas)){
             System.out.println("entro al if");
                 while(r<4){
                     for(int j=0;j<pos;j++){
                     if(j==i){
                         while(j<pos){
                             usuarios[j]=usuarios[j+1];
                             j++;
                         }
                         System.out.println("elimino y movio todo a una pos anteriror");
                    }
                }
                     r++;
              }   //while  
             return true;
            }      
        }    
     return false;
    }
    
    
   
    private void jButton1MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarActionPerformed
        //if(va==0){
            try {
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
                    while((linea=br.readLine())!=null){//linea buena la cuenta linea 0 del vectos igual a linea 1 del this.lenea
                        this.va++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

                Inventario = new String[this.va];   //9

                while(sc.hasNextLine()){
                    Inventario[i++]=sc.nextLine();   //siclo que me llena el arreglo
                }
                
                mostrar();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_jButton1MostrarActionPerformed

    public void mostrar(){
        
        int c=0;
        String matriz [][] = new String [va/4][4];
        
        for (int i = 0; i < va/4; i++) {
             for(int j=0;j<4;j++){
                matriz [i][j]= Inventario[c];
                   c++;
             }
        }
           
 
          jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "PRODUCTO", "CODIGO", "CANTIDAD","PRESIO $DOlAR "
            }
        ));
    }
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
            java.util.logging.Logger.getLogger(Dentro_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dentro_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dentro_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dentro_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dentro_Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buton_Volver;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField ENombrep;
    private javax.swing.JTextField EcodigoP;
    private javax.swing.JButton Jbuton_Agregar_dentro_Inventario;
    private javax.swing.JTextField NombreP;
    private javax.swing.JTextField Precio;
    private javax.swing.JButton jButton1Mostrar;
    private javax.swing.JButton jButton4_dentroInventario_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1_elim;
    private javax.swing.JTable jTableInventario;
    // End of variables declaration//GEN-END:variables
}
