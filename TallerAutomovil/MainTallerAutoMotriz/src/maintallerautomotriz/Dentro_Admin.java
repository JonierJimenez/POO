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
public class Dentro_Admin extends javax.swing.JFrame {
    
    
    public String [] Dusuarios = null; // vector global 
     public String [] Mecanicos = null; // vector global 
    int nlineas=0;
    public int va=0,va2=0;
    int no_encontro;
     
    public Dentro_Admin() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1_ver_Mostrar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Buton_Volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contrasena = new javax.swing.JTextField();
        Jbuton_Agregar_dentro_admin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cargotextfiel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Euser = new javax.swing.JTextField();
        Ecargo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4_dentroadmin_eliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1Mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablepersona = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(836, 492));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Buton_Volver.setText("Volver");
        Buton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Buton_Volver);
        Buton_Volver.setBounds(290, 340, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BIENVENIDO AL INICIO (GESTION DE USUARIO)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 420, 40);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("1.Si quiere agregar empleados puedes hacerlo 1 = Admin ; 2=vendedor; 3=Mecanico");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 90, 460, 14);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("2.tambien puedes ver la lista de empleados que tienes incluyendo admin");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 120, 370, 14);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("3.por ultimo podras despedidir a los empleados que quieras");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 150, 330, 14);

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(70, 250, 41, 14);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 450, 440);

        jTabbedPane1_ver_Mostrar.addTab("Inicio", jPanel1);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 40, 73, 22);
        jPanel2.add(user);
        user.setBounds(160, 30, 220, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 90, 94, 22);
        jPanel2.add(contrasena);
        contrasena.setBounds(160, 80, 200, 40);

        Jbuton_Agregar_dentro_admin.setBackground(new java.awt.Color(0, 102, 102));
        Jbuton_Agregar_dentro_admin.setText("Agregar");
        Jbuton_Agregar_dentro_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbuton_Agregar_dentro_adminActionPerformed(evt);
            }
        });
        jPanel2.add(Jbuton_Agregar_dentro_admin);
        Jbuton_Agregar_dentro_admin.setBounds(300, 320, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cargo:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 140, 52, 22);

        cargotextfiel.setToolTipText("Ingrese cargo 1=Admin, 2=Vendedor,3=Mecanico");
        jPanel2.add(cargotextfiel);
        cargotextfiel.setBounds(160, 130, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vendedo1.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(170, 180, 110, 70);

        jLabel15.setText("jLabel15");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(315, 158, 41, 14);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel2.add(jLabel16);
        jLabel16.setBounds(0, 0, 450, 450);

        jTabbedPane1_ver_Mostrar.addTab("Agregar", jPanel2);

        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(50, 100, 65, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(60, 150, 52, 22);
        jPanel4.add(Euser);
        Euser.setBounds(130, 90, 170, 40);

        Ecargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcargoActionPerformed(evt);
            }
        });
        jPanel4.add(Ecargo);
        Ecargo.setBounds(130, 140, 150, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BUSCAR USUARIO A ELIMINAR");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(89, 36, 290, 24);

        jButton4_dentroadmin_eliminar.setBackground(new java.awt.Color(204, 51, 0));
        jButton4_dentroadmin_eliminar.setText("ELIMINAR");
        jButton4_dentroadmin_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_dentroadmin_eliminarActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4_dentroadmin_eliminar);
        jButton4_dentroadmin_eliminar.setBounds(310, 340, 90, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar_inventarioopequqe.jpg"))); // NOI18N
        jPanel4.add(jLabel17);
        jLabel17.setBounds(150, 210, 130, 120);

        jLabel18.setText("jLabel18");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(320, 280, 41, 14);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel4.add(jLabel19);
        jLabel19.setBounds(0, 0, 450, 440);

        jTabbedPane1_ver_Mostrar.addTab("Eliminar", jPanel4);

        jPanel3.setLayout(null);

        jButton1Mostrar.setBackground(new java.awt.Color(0, 102, 102));
        jButton1Mostrar.setText("Mostrar");
        jButton1Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1Mostrar);
        jButton1Mostrar.setBounds(350, 10, 80, 23);

        jTablepersona.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablepersona.setRowHeight(30);
        jScrollPane1.setViewportView(jTablepersona);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(25, 40, 365, 341);

        jLabel20.setText("jLabel20");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(408, 253, 41, 14);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        jPanel3.add(jLabel21);
        jLabel21.setBounds(0, 0, 450, 440);

        jTabbedPane1_ver_Mostrar.addTab("Mostrar Empleados", jPanel3);

        getContentPane().add(jTabbedPane1_ver_Mostrar);
        jTabbedPane1_ver_Mostrar.setBounds(10, 11, 453, 470);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(0, 0, 830, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbuton_Agregar_dentro_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbuton_Agregar_dentro_adminActionPerformed
             
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
                    System.out.println("va:"+va);
                } catch (IOException ex) {
                    Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

                Dusuarios = new String[this.va];   //9

                while(sc.hasNextLine()){
                    Dusuarios[i++]=sc.nextLine();   //siclo que me llena el arreglo
                }
                
                for(int j=0;j<Dusuarios.length;j++){
                    System.out.println("Usuarios: "+Dusuarios[j]);
                }
                
     
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Dentro_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         
//////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            
            String usuario="",pas="",cargo="";
            archivo=new File("Usuarios.txt");
            
            usuario=user.getText();
            pas= contrasena.getText();
            cargo=cargotextfiel.getText();

            escribir = new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);

            //Escribimos en el archivo
             for(int l=0;l<Dusuarios.length;l++){
                if(Dusuarios[l].equals(user.getText()) && Dusuarios[l+2].equals(cargotextfiel.getText())){
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
                    
                    lineaM.println(user.getText());
                    lineaM.println(contrasena.getText());
                    lineaM.println(cargotextfiel.getText());
                    lineaM.close();
                    escribirM.close();   
                }
               
                linea.println(usuario);
                linea.println(pas);
                linea.println(cargo);
                JOptionPane.showMessageDialog(rootPane, "Agregado con exito", "Agregar",1);
                escribir.close();
            }else{
                JOptionPane.showMessageDialog(this,"(1=ADMIN,2=VENDEDOR,3=MECANICO)","Cargo Invalido" ,3);
            }

               
        }else{
                no_encontro=0;
            }
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
           user.setText("");
           contrasena.setText("");
           cargotextfiel.setText("");
    }//GEN-LAST:event_Jbuton_Agregar_dentro_adminActionPerformed

    private void Buton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buton_VolverActionPerformed
        Administrador ad = new Administrador();
        setVisible(false);
        ad.setVisible(true);
        
    }//GEN-LAST:event_Buton_VolverActionPerformed

    private void jButton1MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarActionPerformed
            //if(va==0){
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
        
     //}
    }//GEN-LAST:event_jButton1MostrarActionPerformed

    private void jButton4_dentroadmin_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_dentroadmin_eliminarActionPerformed
        ///////////////////////////////////////7// ELIMINAR//////////////////////////////////////////7
        try {
             va=0;
            int i=0;

            String linea;
            String Elimuser="",Elimpas="",Elimcargo="";
            Scanner sc = new Scanner(new File("Usuarios.txt")); //C:\Users\ESTUDIANTE\Downloads
            File f= new File("Usuarios.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            try {
                while((linea=br.readLine())!=null){
                    va++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            Dusuarios = new String[va];
            while(sc.hasNextLine()){
                Dusuarios[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }

            Elimuser=Euser.getText();
            Elimcargo=Ecargo.getText();
            
            System.out.println("Nlineas: "+va);

            boolean cg = validarUsuario_eliminar(Dusuarios,Elimuser,Elimcargo,va);
            System.out.println("cg:"+cg);
            if(cg){

                JOptionPane.showMessageDialog(this,"Eliminado correctamente");
                int a1=0,a2=1,a3=2;
                try {

                    File archivo;
                    FileWriter escribir;
                    PrintWriter lineaN;

                    String usuarioN="",pasN="",cargoN="";
                    archivo=new File("Usuarios.txt");
                    escribir = new FileWriter(archivo);
                    lineaN=new PrintWriter(escribir);
                    
                    int resultado=((va-3)/3); //-3 para que no se repitan los tres ultimos dijitos
                    for(int ww=0;ww<resultado;ww++){

                        if(i==0){

                        }
                        usuarioN=Dusuarios[a1];
                        pasN=Dusuarios[a2];
                        cargoN=Dusuarios[a3];

                        //Escribimos en el archivo     del vector al archivo
                        lineaN.println(usuarioN);
                        lineaN.println(pasN);
                        lineaN.println(cargoN);

                        a1+=3;
                        a2+=3;
                        a3+=3;
                        System.out.println("ENTRO:"+ww);
                    }
                    lineaN.close();
                    escribir.close();

                    System.out.println("el boton sirve");
                } catch (IOException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }

            }else{
                JOptionPane.showMessageDialog(null, "No se encontro");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Para el archivo mecanicos/////////////////////////////////////////////////////////////////////////////////////////////
         try {
             va2=0;
            int i=0;

            String linea;
            String Elimuser="",Elimpas="",Elimcargo="";
            Scanner sc = new Scanner(new File("Mecanicos.txt")); //C:\Users\ESTUDIANTE\Downloads
            File f= new File("Mecanicos.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            try {
                while((linea=br.readLine())!=null){
                    va2++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            Mecanicos = new String[va];
            while(sc.hasNextLine()){
                Mecanicos[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }

            Elimuser=Euser.getText();
            Elimcargo=Ecargo.getText();
            
            System.out.println("Nlineas: "+va2);

            boolean cg2 = validarUsuario_eliminar2(Mecanicos,Elimuser,Elimcargo,va2);
            System.out.println("cg:"+cg2);
            if(cg2){

                int aa1=0,aa2=1,aa3=2;
                try {

                    File archivo;
                    FileWriter escribir;
                    PrintWriter lineaNN;

                    String usuarioN="",pasN="",cargoN="";
                    archivo=new File("Mecanicos.txt");
                    escribir = new FileWriter(archivo);
                    lineaNN=new PrintWriter(escribir);
                    
                    int resultado=((va2-3)/3); //-3 para que no se repitan los tres ultimos dijitos
                    for(int ww=0;ww<resultado;ww++){

                        usuarioN=Mecanicos[aa1];
                        pasN=Mecanicos[aa2];
                        cargoN=Mecanicos[aa3];

                        //Escribimos en el archivo     del vector al archivo
                        lineaNN.println(usuarioN);
                        lineaNN.println(pasN);
                        lineaNN.println(cargoN);

                        aa1+=3;
                        aa2+=3;
                        aa3+=3;
                        
                    }
                    lineaNN.close();
                    escribir.close();

                } catch (IOException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
            Euser.setText("");
            Ecargo.setText("");
    }//GEN-LAST:event_jButton4_dentroadmin_eliminarActionPerformed

    private void EcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EcargoActionPerformed
    
    public boolean validarUsuario_eliminar(String usuarios[], String user, String pas, int pos){
        int c=0,r=0;
        pos=(pos)-1;
        for(int i=0;  i < pos ;i++){
            
         if(usuarios[i].equalsIgnoreCase(user)  &&  usuarios[i+2].equals(pas)){
             System.out.println("ingreso al if");
                 while(r<3){
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
    
     public boolean validarUsuario_eliminar2(String usuarios[], String user, String pas, int pos){
        int c=0,r=0;
        pos=(pos)-1;
        for(int i=0;  i < pos ;i++){
            
         if(usuarios[i].equalsIgnoreCase(user)  &&  usuarios[i+2].equals(pas)){
                 while(r<3){
                     for(int j=0;j<pos;j++){
                     if(j==i){
                         while(j<pos){
                             usuarios[j]=usuarios[j+1];
                             j++;
                         }
                    }
                }
                     r++;
              }  
             return true;
            }      
        }    
     return false;
    }
    
    public void mostrar(){
        
        int c=0;
        String matriz [][] = new String [va/3][3];
        
        for (int i = 0; i < va/3; i++) {
             for(int j=0;j<3;j++){
                
                matriz [i][j]= Dusuarios[c];
                   c++;
             }
        }
           
 
          jTablepersona.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Usuario", "Contraseña", "Cargo"
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
            java.util.logging.Logger.getLogger(Dentro_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dentro_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dentro_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dentro_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dentro_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buton_Volver;
    private javax.swing.JTextField Ecargo;
    private javax.swing.JTextField Euser;
    private javax.swing.JButton Jbuton_Agregar_dentro_admin;
    private javax.swing.JTextField cargotextfiel;
    private javax.swing.JTextField contrasena;
    private javax.swing.JButton jButton1Mostrar;
    private javax.swing.JButton jButton4_dentroadmin_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1_ver_Mostrar;
    private javax.swing.JTable jTablepersona;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
