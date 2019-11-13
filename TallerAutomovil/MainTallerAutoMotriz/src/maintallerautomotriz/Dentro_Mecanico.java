
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
public class Dentro_Mecanico extends javax.swing.JFrame {
   int va=0,ban=0;
   public static int llenado;
   boolean verdadero;
   String [] Venta;
   String [] Dusuarios2;
   public static String [] MecanVenta;
   int nlineas;
   public static String NombreM;
   
    public Dentro_Mecanico() {
     
        initComponents();
        this.setLocationRelativeTo(this);
        Login login=new Login();
        jLabel3.setText(login.texto);
        NombreM=jLabel3.getText();
        System.out.println("nombrem"+NombreM);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        MostrarMecanico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1REPORTEMecanico = new javax.swing.JTable();
        RegresarButon = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        GuardarReporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelrecibir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 492));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        MostrarMecanico.setBackground(new java.awt.Color(0, 51, 51));
        MostrarMecanico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarMecanico.setForeground(new java.awt.Color(255, 255, 255));
        MostrarMecanico.setText("mostrar");
        MostrarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarMecanicoActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarMecanico);
        MostrarMecanico.setBounds(140, 30, 110, 30);

        jTable1REPORTEMecanico.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1REPORTEMecanico.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1REPORTEMecanico);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 380, 150);

        RegresarButon.setBackground(new java.awt.Color(0, 51, 51));
        RegresarButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegresarButon.setForeground(new java.awt.Color(255, 255, 255));
        RegresarButon.setText("Regresar");
        RegresarButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButonActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarButon);
        RegresarButon.setBounds(390, 380, 110, 31);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 180, 310, 280);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 520, 430);

        jTabbedPane1.addTab("Encargos", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(txtEstado);
        txtEstado.setBounds(190, 40, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Reporte:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 40, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Precio:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(120, 110, 80, 40);
        jPanel2.add(txtPrecio);
        txtPrecio.setBounds(190, 110, 90, 40);

        GuardarReporte.setBackground(new java.awt.Color(0, 51, 51));
        GuardarReporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GuardarReporte.setForeground(new java.awt.Color(255, 255, 255));
        GuardarReporte.setText("Guardar reporte");
        GuardarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarReporteActionPerformed(evt);
            }
        });
        jPanel2.add(GuardarReporte);
        GuardarReporte.setBounds(319, 326, 160, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iStock_000019046733Small2.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(-5, -9, 520, 430);

        jTabbedPane1.addTab("Reporte", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 10, 520, 450);

        jLabelrecibir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelrecibir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelrecibir.setText("Mecanico:");
        getContentPane().add(jLabelrecibir);
        jLabelrecibir.setBounds(570, 10, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(670, 10, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 830, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void MostrarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarMecanicoActionPerformed
            
            try {                
                va=0;
                int i=0;
                String linea;
                String Elimuser="",Elimpas="",cargo="";
                Scanner sc = new Scanner(new File("Ventas.txt")); //C:\Users\ESTUDIANTE\Downloads
                File f= new File("Ventas.txt");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                
                try {
                    while((linea=br.readLine())!=null){
                        va++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Venta = new String[va];
                while(sc.hasNextLine()){
                    Venta[i++]=sc.nextLine();   //siclo que me llena el arreglo
                }
                
               
                String Buscar = NombreM;

                verdadero = validarUsuario_guardavector(Venta,Buscar,va);
                

                if(verdadero){
                    
                    //INGRESAR EN EL ARCHIVO
                    
                    File archivo;
                    FileWriter escribir = null;
                    PrintWriter lineaN;
                    String usuarioN="",pasN="",cargoN="",cargoNn="";
                    archivo=new File("ReporteMecanico.txt");
                    try {
                        escribir = new FileWriter(archivo);
                    } catch (IOException ex) {
                        Logger.getLogger(Dentro_Mecanico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    lineaN=new PrintWriter(escribir);
                    
                        if(llenado==0){
                        lineaN.println(MecanVenta[0]);
                        lineaN.println(MecanVenta[1]);
                        lineaN.println(MecanVenta[2]);
                        lineaN.println(MecanVenta[3]);
                        }
                        if(llenado==1){
                        
                        lineaN.println(MecanVenta[0]);
                        lineaN.println(MecanVenta[1]);
                        lineaN.println(MecanVenta[2]);
                        lineaN.println(MecanVenta[3]);
                        lineaN.println(MecanVenta[4]);
                        lineaN.println(MecanVenta[5]);
                        lineaN.println(MecanVenta[6]);
                        lineaN.println(MecanVenta[7]);
                        }
                        if(llenado==2){     
                        lineaN.println(MecanVenta[0]);
                        lineaN.println(MecanVenta[1]);
                        lineaN.println(MecanVenta[2]);
                        lineaN.println(MecanVenta[3]); 
                        lineaN.println(MecanVenta[4]);
                        lineaN.println(MecanVenta[5]);
                        lineaN.println(MecanVenta[6]);
                        lineaN.println(MecanVenta[7]); 
                        lineaN.println(MecanVenta[8]);
                        lineaN.println(MecanVenta[9]);
                        lineaN.println(MecanVenta[10]);
                        lineaN.println(MecanVenta[11]);
                        }
                                           
                        lineaN.close();
                        
                        try {
                            JOptionPane.showMessageDialog(null, "se supone que agrego");
                            System.out.println("Se escribio en el archivo reporte mecanico con exito");
                            ban=1;
                            escribir.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Dentro_Mecanico.class.getName()).log(Level.SEVERE, null, ex);
                        }
     
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Dentro_Mecanico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            if(ban==1){
           //VOLVEMOS A LEER
            System.out.println("vamos a leer el archivo reporte mecanico");
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
                while((linea=br.readLine())!=null){
                    this.va++;
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Dusuarios2 = new String[this.va];   
            
            while(sc.hasNextLine()){
                Dusuarios2[i++]=sc.nextLine();   
            }
            
             mostrar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
                   
    }//GEN-LAST:event_MostrarMecanicoActionPerformed

    private void GuardarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarReporteActionPerformed
        try {
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            
            String estado="",precio="";
            archivo=new File("Precio.txt");
            
            estado=txtEstado.getText();
            precio= txtPrecio.getText();
            int c = Integer.parseInt(precio) ;
            escribir = new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);

            //Escribimos en el archivo
            if(c>0 && c<999999999){
                linea.println(estado);
                linea.println(precio);
                JOptionPane.showMessageDialog(rootPane, "Agregado con exito", "Agregar",1);
            }else{
                JOptionPane.showMessageDialog(this,"No ingreso bien el precio","Precio incorrecto" ,3);
            }
            
            linea.close();
            escribir.close();
            txtEstado.setText(" ");
            txtPrecio.setText(" ");
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarReporteActionPerformed

    private void RegresarButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarButonActionPerformed
        Mecanico  Mc=new Mecanico();
        Mc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_RegresarButonActionPerformed

     public void mostrar(){
        
        int c=0;
        String matriz [][] = new String [va/4][4];
        
        for (int i = 0; i < va/4; i++) {
             for(int j=0;j<4;j++){
                matriz [i][j]= Dusuarios2[c];
                   c++;
             }
        }
           
 
          jTable1REPORTEMecanico.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "yo", "presio", "Codigo Pieza","cliente"
            }
        ));
    }
     
     public static boolean validarUsuario_guardavector(String venta[], String user, int tam){
        int r=0,k=0,bnd=0,g=0;
        String eliminado;
        
        MecanVenta = new String[tam];
        for(int hj=0;  hj < tam ;hj++){
         if(venta[hj].equals(user)){
                 
               System.out.println(" dentro del validar encontro:"+user);
               k=hj;
               System.out.println("k:"+k);
               if(bnd==0 && g==0){
                for(int c=0 ;c<4;c++){
                MecanVenta[c]=venta[k];
                k--;
                bnd=1;
               }
                llenado=0;
               }
               if(bnd==1 && g==1){
                for(int c=4 ;c<8;c++){
                MecanVenta[c]=venta[k];
                k--;
                bnd=2;
               }
                llenado=1;
               }
                if(bnd==2 && g==2){
                for(int c=8 ;c<12;c++){
                MecanVenta[c]=venta[k];
                k--;
                bnd=0;
               }
                llenado=2;
               }
               g++;
               r=1;
            }
           }
           if(r==1){
              return true;
           }
           System.out.println("no encontro al usuario");
           return false;
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
            java.util.logging.Logger.getLogger(Dentro_Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dentro_Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dentro_Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dentro_Mecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dentro_Mecanico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarReporte;
    private javax.swing.JButton MostrarMecanico;
    private javax.swing.JButton RegresarButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelrecibir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1REPORTEMecanico;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
