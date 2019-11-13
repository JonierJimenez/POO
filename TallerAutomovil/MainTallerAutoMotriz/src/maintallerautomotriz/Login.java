/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintallerautomotriz;

import java.awt.event.KeyEvent;
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
 * @author jhonier
 */
public class Login extends javax.swing.JFrame {
    
    String [] usuarios ;
    private int cargo;
    private static Scanner sc;
    private static String user,pas;
    private String NombreMc;
    public static String texto;
    int bandera=0;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btningresar = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        lblpas = new javax.swing.JLabel();
        pantallapas = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lblImagen1 = new javax.swing.JLabel();
        lblImage2 = new javax.swing.JLabel();
        Registrate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btningresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btningresar.setMinimumSize(new java.awt.Dimension(600, 400));
        btningresar.setLayout(null);

        lbluser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        lbluser.setText("Usuario:");
        btningresar.add(lbluser);
        lbluser.setBounds(260, 130, 80, 21);

        lblpas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblpas.setForeground(new java.awt.Color(255, 255, 255));
        lblpas.setText("Contraseña:");
        btningresar.add(lblpas);
        lblpas.setBounds(260, 210, 100, 21);

        pantallauser.setToolTipText("Ingrese nombre de usuario");
        btningresar.add(pantallauser);
        pantallauser.setBounds(350, 120, 210, 40);

        pantallapas.setToolTipText("Ingresa la contraseña");
        pantallapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallapasActionPerformed(evt);
            }
        });
        pantallapas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pantallapasKeyPressed(evt);
            }
        });
        btningresar.add(pantallapas);
        pantallapas.setBounds(360, 200, 180, 40);

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir1.jpg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cierre la aplicacion");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btningresar.add(btnCancelar);
        btnCancelar.setBounds(110, 360, 140, 40);

        btnIngresar.setBackground(new java.awt.Color(153, 153, 153));
        btnIngresar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ingreso1.jpg"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setToolTipText("Iniciar seccion ");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btningresar.add(btnIngresar);
        btnIngresar.setBounds(570, 360, 140, 40);

        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user1.jpg"))); // NOI18N
        btningresar.add(lblImagen1);
        lblImagen1.setBounds(180, 110, 80, 70);

        lblImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass1.jpg"))); // NOI18N
        btningresar.add(lblImage2);
        lblImage2.setBounds(180, 200, 55, 55);

        Registrate.setBackground(new java.awt.Color(153, 153, 153));
        Registrate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Registrate.setText("REGISTRATE");
        Registrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrateActionPerformed(evt);
            }
        });
        btningresar.add(Registrate);
        Registrate.setBounds(330, 360, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3052765-slide-s-11-renault-final-morph.gif"))); // NOI18N
        btningresar.add(jLabel1);
        jLabel1.setBounds(40, -10, 830, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pantallapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallapasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallapasActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        

       texto = pantallauser.getText();
        try {
            bandera=0;
            int nlineas=0;
            int i=0;          
            String linea;
            sc= new Scanner(new File("Usuarios.txt"));
            File f= new File("Usuarios.txt");
            FileReader fr=null;
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())!=null){
                    nlineas++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            usuarios = new String[nlineas];
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }
           
            
            user=pantallauser.getText();
            pas=pantallapas.getText();
            
            
           validarUsuario(usuarios, user, pas);
            
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           
          
           if(getcargo()==1){
            Administrador pa=new Administrador();
            setVisible(false);
            pa.setVisible(true); 
           }
           if(getcargo()==2){
            Vendedor vd=new Vendedor();
            setVisible(false);
            vd.setVisible(true); 
           }
           if(getcargo()==3){
            Mecanico mc=new Mecanico();
            setVisible(false);
            mc.setVisible(true); 
           }
           if(bandera==0){
               JOptionPane.showMessageDialog(null, "clave (Y/O) usuario erroneos ", "  ", JOptionPane.ERROR_MESSAGE);
                pantallauser.setText("");
                pantallapas.setText("");
               
           }
        }
            
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed
    
    public boolean validarUsuario(String usuarios[], String user, String pas){
        
        int c = 0;
        String res;
        String aux;
       
        for(int i=0;  i < usuarios.length ;i++){   
            
            if(usuarios[i].equalsIgnoreCase(user)  &&  usuarios[i+1].equals(pas)){
                bandera=1;
                 c=i+2;                 
                 if(usuarios[c].equals("1")){                                                                            
                     setcargo(1);
                     return true;
                 }
                 if(usuarios[c].equals("2")){
                     setcargo(2);
                     return true;
                 }
                 if(usuarios[c].equals("3")){
                     setcargo(3);
                     return true;
                 }              
            }
    }
        return false;
 }
    
    public int getcargo(){
        return cargo;
    }
    public void setcargo(int cargo){
        this.cargo =cargo;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void RegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrateActionPerformed
        Registro R=new Registro();
        R.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_RegistrateActionPerformed

    private void pantallapasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantallapasKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            texto = pantallauser.getText();
        try {
            bandera=0;
            int nlineas=0;
            int i=0;          
            String linea;
            sc= new Scanner(new File("Usuarios.txt"));
            File f= new File("Usuarios.txt");
            FileReader fr=null;
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())!=null){
                    nlineas++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            usuarios = new String[nlineas];
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine();   //siclo que me llena el arreglo
            }
           
            
            user=pantallauser.getText();;
            pas=pantallapas.getText();
            
            
           validarUsuario(usuarios, user, pas);
            
           fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
            
        
       
           if(getcargo()==1){
            Administrador pa=new Administrador();
            setVisible(false);
            pa.setVisible(true); 
           }
           if(getcargo()==2){
            Vendedor vd=new Vendedor();
            setVisible(false);
            vd.setVisible(true); 
           }
           if(getcargo()==3){
            Mecanico mc=new Mecanico();
            setVisible(false);
            mc.setVisible(true); 
           }
           if(bandera==0){
               JOptionPane.showMessageDialog(null, "clave (Y/O) usuario erroneos ", "  ", JOptionPane.ERROR_MESSAGE);
           }
        }
            
        
        
        }
    }//GEN-LAST:event_pantallapasKeyPressed

   
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrate;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel btningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblpas;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPasswordField pantallapas;
    public final javax.swing.JTextField pantallauser = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
