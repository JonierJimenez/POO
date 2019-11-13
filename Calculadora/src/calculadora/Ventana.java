package calculadora;


import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ventana extends JFrame implements  ActionListener{
    
    public JButton cero;
    public JButton uno;
    public JButton dos;
    public JButton tres;
    public JButton cuatro;
    public JButton cinco;
    public JButton seis;
    public JButton siete;
    public JButton ocho;
    public JButton nueve;
    public JButton punto;
    public JButton suma;
    public JButton resta;
    public JButton multiplicacion;
    public JButton division;
    public JButton igual;
    public JButton retroceso;
    public JButton clear;
    public JButton allclear;
    
    public JButton memori_s;
    public JButton memori_mr;
    public JButton memori_mMas;
    public JButton memori_mMenos;
    public JButton memori_mc;
    
    public JTextField pantalla;
    public JTextField pantalla2;
    
    public Integer resultado;
    public String operador;
    public String memoria1;
    public String memoria2;
    public String ms="0";
    public String mMas;
    public String mMenos;
    public String mMC;
    public Double summemori;
    
    
    public Ventana(String title) throws HeadlessException {
        
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,30, 400,720);
        setLayout(null);
        
        cero=new JButton("0");
        cero.setBounds(100, 580, 80, 80);
        add(cero);
        cero.addActionListener(this);
        cero.setForeground(new Color(132,192,199));
        cero.setFont(new Font("Arial", 2, 30));
        cero.setBackground(Color.RED);
        
        uno=new JButton("1");
        uno.setBounds(10, 480, 80, 80);
        add(uno);
        uno.addActionListener(this);
        uno.setForeground(new Color(10,172,179));
        uno.setFont(new Font("Arial", 2, 30));
        uno.setBackground(Color.DARK_GRAY);
        
        dos=new JButton("2");
        dos.setBounds(100, 480, 80, 80);
        add(dos);
        dos.addActionListener(this);
        dos.setForeground(new Color(10,172,179));
        dos.setFont(new Font("Arial", 2, 30));
        dos.setBackground(Color.DARK_GRAY);
        
        tres=new JButton("3");
        tres.setBounds(200, 480, 80, 80);
        add(tres);
        tres.addActionListener(this);
        tres.setForeground(new Color(10,172,179));
        tres.setFont(new Font("Arial", 2, 30));
        tres.setBackground(Color.DARK_GRAY);
        
        cuatro=new JButton("4");
        cuatro.setBounds(10, 380, 80, 80);
        add(cuatro);
        cuatro.addActionListener(this);
        cuatro.setForeground(new Color(10,172,179));
        cuatro.setFont(new Font("Arial", 2, 30));
        cuatro.setBackground(Color.DARK_GRAY);
        
        cinco=new JButton("5");
        cinco.setBounds(100, 380, 80, 80);
        add(cinco);
        cinco.addActionListener(this);
        cinco.setForeground(new Color(10,172,179));
        cinco.setFont(new Font("Arial", 2, 30));
        cinco.setBackground(Color.DARK_GRAY);
        
        seis=new JButton("6");
        seis.setBounds(200, 380, 80, 80);
        add(seis);
        seis.addActionListener(this);
        seis.setForeground(new Color(10,172,179));
        seis.setFont(new Font("Arial", 2, 30));
        seis.setBackground(Color.DARK_GRAY);
        
        siete=new JButton("7");
        siete.setBounds(10, 280, 80, 80);
        add(siete);
        siete.addActionListener(this);
        siete.setForeground(new Color(10,172,179));
        siete.setFont(new Font("Arial", 2, 30));
        siete.setBackground(Color.DARK_GRAY);
        
        ocho=new JButton("8");
        ocho.setBounds(100, 280, 80, 80);
        add(ocho);
        ocho.addActionListener(this);
        ocho.setForeground(new Color(10,172,179));
        ocho.setFont(new Font("Arial", 2, 30));
        ocho.setBackground(Color.DARK_GRAY);
        
        nueve=new JButton("9");
        nueve.setBounds(200, 280, 80, 80);
        add(nueve);
        nueve.addActionListener(this);
        nueve.setForeground(new Color(10,172,179));
        nueve.setFont(new Font("Arial", 2, 30));
        nueve.setBackground(Color.DARK_GRAY);
        
        
        punto=new JButton(".");
        punto.setBounds(200, 580, 80, 80);
        add(punto);
        punto.addActionListener(this);
        punto.setBackground(Color.RED);
        punto.setFont(new Font("Arial", 2, 60));
        punto.setForeground(new Color(132,192,199));
        
         
        
        igual=new JButton("=");
        igual.setBounds(300, 580, 80, 80);
        add(igual);
        igual.addActionListener(this);
        igual.setForeground(new Color(132,192,199));
        igual.setBackground(Color.BLUE);
        igual.setFont(new Font("Arial", 2, 30));
        
        suma=new JButton("+");
        suma.setBounds(300, 480, 80, 80);
        add(suma);
        suma.addActionListener(this);
        suma.setForeground(new Color(132,192,199));
        suma.setBackground(Color.BLUE);
        suma.setFont(new Font("Arial", 2, 30));
        
        resta=new JButton("-");
        resta.setBounds(300, 380, 80, 80);
        add(resta);
        resta.addActionListener(this);
        resta.setForeground(new Color(132,192,199));
        resta.setBackground(Color.BLUE);
        resta.setFont(new Font("Arial", 2, 30));
        
        multiplicacion=new JButton("X");
        multiplicacion.setBounds(300, 280, 80, 80);
        add(multiplicacion);
        multiplicacion.addActionListener(this);
        multiplicacion.setForeground(new Color(132,192,199));
        multiplicacion.setBackground(Color.BLUE);
        multiplicacion.setFont(new Font("Arial", 2, 30));
        
        division=new JButton("/");
        division.setBounds(300, 180, 80, 80);
        add(division);
        division.addActionListener(this);
        division.setForeground(new Color(132,192,199));
        division.setBackground(Color.BLUE);
        division.setFont(new Font("Arial", 2, 30));
        
        retroceso=new JButton("<-");
        retroceso.setBounds(200, 180, 80, 80);
        add(retroceso);
        retroceso.addActionListener(this);
        retroceso.setForeground(new Color(1,2,2));
        retroceso.setFont(new Font("Arial", 2, 30));
        retroceso.setBackground(Color.BLUE);
        
        clear=new JButton("C");
        clear.setBounds(100, 180, 80, 80);
        add(clear);
        clear.addActionListener(this);
        clear.setForeground(new Color(1,2,2));
        clear.setFont(new Font("Arial", 2, 30));
        clear.setBackground(Color.BLUE);
        
        allclear=new JButton("AC");
        allclear.setBounds(10, 180, 80, 80);
        add(allclear);
        allclear.addActionListener(this);
        allclear.setForeground(new Color(1,2,2));
        allclear.setFont(new Font("Arial", 2, 30));
        allclear.setBackground(Color.BLUE);
        
        memori_s=new JButton("MS");
        memori_s.setBounds(100, 90, 80, 80);
        add(memori_s);
        memori_s.addActionListener(this);
        memori_s.setBackground(Color.RED);
        memori_s.setFont(new Font("Arial", 2, 25));
        memori_s.setForeground(new Color(132,192,199));
        
        
        memori_mr=new JButton("MR");
        memori_mr.setBounds(10, 90, 80, 80);
        add(memori_mr);
        memori_mr.addActionListener(this);
        memori_mr.setBackground(Color.RED);
        memori_mr.setFont(new Font("Arial", 2, 25));
        memori_mr.setForeground(new Color(132,192,199));
        
        
        
        memori_mMas=new JButton("M+");
        memori_mMas.setBounds(200, 90, 80, 80);
        add(memori_mMas);
        memori_mMas.addActionListener(this);
        memori_mMas.setBackground(Color.RED);
        memori_mMas.setFont(new Font("Arial", 2, 25));
        memori_mMas.setForeground(new Color(132,192,199));
        
        
        memori_mMenos=new JButton("M-");
        memori_mMenos.setBounds(300, 90, 80, 80);
        add(memori_mMenos);
        memori_mMenos.addActionListener(this);
        memori_mMenos.setBackground(Color.RED);
        memori_mMenos.setFont(new Font("Arial", 2, 25));
        memori_mMenos.setForeground(new Color(132,192,199));
        
        
        memori_mc=new JButton("MC");
        memori_mc.setBounds(10, 580, 80, 80);
        add(memori_mc);
        memori_mc.addActionListener(this);
        memori_mc.setBackground(Color.RED);
        memori_mc.setFont(new Font("Arial", 2, 25));
        memori_mc.setForeground(new Color(132,192,199));
        
        pantalla=new JTextField("0");
        pantalla.setBounds(10, 25, 370, 60);
        add(pantalla);
        pantalla.addActionListener(this);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.white);
        pantalla.setFont(new Font("Arial", 2, 30));
        
        pantalla2=new JTextField("0");
        pantalla2.setBounds(210, 2, 170, 22);
        add(pantalla2);
        pantalla2.setEditable(false);
        pantalla2.setBackground(Color.white);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String r=e.getActionCommand();
        System.out.println(r);
        if(r.charAt(0)>='1' && r.charAt(0)<='9'){
            if(pantalla.getText().charAt(0)=='0'){
                pantalla.setText("");
            }
            pantalla.setText(pantalla.getText()+r);
        }else{
            switch(r){
                case "0":
                    if(pantalla.getText().charAt(0)!='0')
                        pantalla.setText(pantalla.getText()+"0");
                    break;
                case "C":
                    pantalla.setText("0");
                    break;
                case "AC":
                    pantalla.setText("0");
                    pantalla2.setText("0");
                    break;
                case "<-":
                    String cadena;
                    cadena = pantalla.getText();
                    if(cadena.length()>0){
                        cadena=cadena.substring(0,cadena.length()-1);
                        pantalla.setText(cadena);
                    }if(cadena.length()==0){
                        pantalla.setText("0");
                    }
                    break;
                   
                case "+":
                    
                    if(!pantalla.getText().equals("")){
                    memoria1=pantalla.getText();
                    operador="+";
                    pantalla2.setText(pantalla.getText()+"+");
                    pantalla.setText("0");
                }                                              
                    break;  
                case "-": 
                    if(!pantalla.getText().equals("")){
                    memoria1=pantalla.getText();
                    operador="-";
                    pantalla2.setText(pantalla.getText()+"-");
                    pantalla.setText("0");
                }
                    break;
                    
                case "X": if(!pantalla.getText().equals("")){
                    memoria1=pantalla.getText();
                    operador="*";
                    pantalla2.setText(pantalla.getText()+"*");
                    pantalla.setText("0");
                }
                    break;
                case "/": 
                    if(!pantalla.getText().equals("")){
                    memoria1=pantalla.getText();
                    operador="/";
                    pantalla2.setText(pantalla.getText()+"/");
                    pantalla.setText("0");
                }
                    break;
                case".": String cadena2;
                         cadena2= pantalla.getText();
                         if(cadena2.length()<=0){
                             pantalla.setText("0.");
                         }else{
                             if(!existepunto(pantalla.getText())){
                                 pantalla.setText(pantalla.getText()+".");
                             }
                         }
                         break;
                         
                case "MS": ms=pantalla.getText(); break;
                case "MR": if(ms.length()>0) pantalla.setText(ms); break;
                case "M+": 
                           mMas=pantalla.getText();
                           summemori=Double.parseDouble(ms)+Double.parseDouble(mMas); 
                           ms=summemori.toString();  break;
                case "M-": 
                           mMenos=pantalla.getText();
                           summemori=Double.parseDouble(ms)-Double.parseDouble(mMenos); 
                           ms=summemori.toString();  break;
                case "MC": ms=""; break;
                case "=":
                    pantalla2.setText("0");
                    String resultado;
                    memoria2=pantalla.getText();
                    if(!memoria2.equals("")){
                        resultado=calculadora(memoria1,memoria2,operador);
                        pantalla.setText(resultado);
                    }
                   /* if(operador=='+'){
                        resultado+=Integer.parseInt(pantalla.getText());
                    }
                    if(operador=='-'){
                        resultado-=Integer.parseInt(pantalla.getText());
                    }
                    if(operador=='*'){
                        resultado*=Integer.parseInt(pantalla.getText());
                    }
                    /*if(operador=='/'){
                        resultado/=Integer.parsefloat(pantalla.getText());
                    }*/
                    //pantalla.setText(resultado.toString());
                    break;
                
            }
        }
        
    }
    public static boolean existepunto(String cadena){
        boolean resultado=false;
        for(int i=0;i<cadena.length();i++){
            if(cadena.substring(i, i+1).equals(".")){
                resultado=true;
            }
        }
        return resultado;
    }
    
     public static String calculadora(String memoria1,String memoria2,String operador){
       Double resultado=0.0;
       String respuesta;
       if(operador.equals("+")){
           resultado= Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
       }
       if(operador.equals("-")){
           resultado= Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
       }
       if(operador.equals("*")){
           resultado= Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
       }
       if(operador.equals("/")){
           resultado= Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
       }
       respuesta=resultado.toString();
       return respuesta;
    }

}
