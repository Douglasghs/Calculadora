
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;

public class Interface extends JFrame {
    
    boolean validador = true;
    int num1, num2;
    String opc;
    
     public  Interface(){
          initcomponentes();
     }
    
    public void initcomponentes(){
        setSize(400, 230);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        painel = new javax.swing.JPanel();
        painel.setSize(400, 230);
        painel.setBackground(Color.GREEN);
        add(painel);
        
        tf_01 = new javax.swing.JTextField();
        tf_01.setBounds(1, 1, 382, 30);
        add(tf_01);
        // caract... botão 01
        bt_01 = new javax.swing.JButton();
        bt_01.setBounds(1, 31, 70, 30);
        bt_01.setText("1");
        bt_01.setBackground(Color.DARK_GRAY);
        bt_01.setForeground(Color.white);
                                                   //click (botão 01)
        bt_01.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(validador == true){
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"1");
                }
                else{
                     String texto = tf_01.getText();
                    tf_01.setText(texto+"1");
                }
            }
        });
        add(bt_01);
         // caract... botão 02
        bt_02 = new javax.swing.JButton();
        bt_02.setBounds(72, 31, 70, 30);
        bt_02.setText("2");
        bt_02.setBackground(Color.DARK_GRAY);
        bt_02.setForeground(Color.white);
                                                   //click (botão 02)
        bt_02.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(validador == true){
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"2");
                }
                else{
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"2");
                }
            }
        });
        add(bt_02);
         // caract... botão 03
        bt_03 = new javax.swing.JButton();
        bt_03.setBounds(143, 31, 70, 30);
        bt_03.setText("3");
        bt_03.setBackground(Color.DARK_GRAY);
        bt_03.setForeground(Color.white);
                                                   //click (botão 03)
        bt_03.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(validador == true){
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"3");
                } 
                else{
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"3");
                }
            }
        });
        add(bt_03);
         // caract... botão 04
        bt_04 = new javax.swing.JButton();
        bt_04.setBounds(1, 62, 70, 30);
        bt_04.setText("4");
        bt_04.setBackground(Color.DARK_GRAY);
        bt_04.setForeground(Color.white);
                                                   //click (botão 04)
        bt_04.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(validador == true){
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"4");
                }
                else{
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"4");
                }
            }
        });
        add(bt_04);
         // caract... botão 05
        bt_05 = new javax.swing.JButton();
        bt_05.setBounds(72, 62, 70, 30);
        bt_05.setText("5");
        bt_05.setBackground(Color.DARK_GRAY);
        bt_05.setForeground(Color.white);
                                                    //click (botão 05)
         bt_05.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 if(validador == true){
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"5");
                 }
                 else{
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"5");
                 }
             }
         });
        add(bt_05);
         // caract... botão 06
        bt_06 = new javax.swing.JButton();
        bt_06.setBounds(143, 62, 70, 30);
        bt_06.setText("6");
        bt_06.setBackground(Color.DARK_GRAY);
        bt_06.setForeground(Color.WHITE);
                                                    //click (botão 06)
         bt_06.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 if(validador == true){
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"6");
                 }
                 else{
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"6");
                 }
             }
         });
        add(bt_06);
         // caract... botão 07
        bt_07 = new javax.swing.JButton();
        bt_07.setBounds(1, 93, 70, 30);
        bt_07.setText("7");
        bt_07.setBackground(Color.DARK_GRAY);
        bt_07.setForeground(Color.white);
                                                    //click (botão 07)
         bt_07.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 if(validador == true){
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"7");
                 }
                 else{
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"7");
                 }
             }
         });
        add(bt_07);
         // caract... botão 08
        bt_08 = new javax.swing.JButton();
        bt_08.setBounds(72, 93, 70, 30);
        bt_08.setText("8");
        bt_08.setBackground(Color.DARK_GRAY);
        bt_08.setForeground(Color.white);
                                                     //click (botão 08)
         bt_08.addActionListener( new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 if(validador == true){
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"8");
                 }
                 else{
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"8");
                 }
             }
         });
        add(bt_08);
         // caract... botão 09
        bt_09 = new javax.swing.JButton();
        bt_09.setBounds(143, 93, 70, 30);
        bt_09.setText("9");
        bt_09.setBackground(Color.DARK_GRAY);
        bt_09.setForeground(Color.white);
                                                   //click (botão 09)
        bt_09.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(validador == true){
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"9");
                }
                else{
                    String texto = tf_01.getText();
                    tf_01.setText(texto+"9");
                }
            }
        });
        add(bt_09);
         // caract... botão 10
        bt_10 = new javax.swing.JButton();
        bt_10.setBounds(72, 124, 70, 30);
        bt_10.setText("0");
        bt_10.setBackground(Color.DARK_GRAY);
        bt_10.setForeground(Color.white);
                                                    //click (botão 10)
         bt_10.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 if(validador == true){
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"0");
                 }
                 else{
                     String texto = tf_01.getText();
                     tf_01.setText(texto+"0");
                 }
             }
         });
        add(bt_10);
        
         // caract... botão 11
        bt_11 = new javax.swing.JButton();
        bt_11.setBounds(1, 124, 70, 30);
        bt_11.setText(".");
        bt_11.setBackground(Color.DARK_GRAY);
        bt_11.setForeground(Color.white);
         //click (botão 11)
         bt_11.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 if(validador == true){
                     String texto = tf_01.getText();
                     tf_01.setText(texto+".");
                 }
                 else{
                      String texto = tf_01.getText();
                     tf_01.setText(texto+".");
                 }
             }
         });
        add(bt_11);
         // caract... botão 12
        bt_12 = new javax.swing.JButton();
        bt_12.setBounds(143, 124, 70, 30);
        bt_12.setText(",");
        bt_12.setBackground(Color.DARK_GRAY);
        bt_12.setForeground(Color.white);
         //click (botão 12)
         bt_12.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 if(validador == true){
                     String texto = tf_01.getText();
                     tf_01.setText(texto+",");
                 }
                 else{
                     String texto = tf_01.getText();
                     tf_01.setText(texto+",");
                 }
             }
         });
        add(bt_12);
         // caract... botão 13
        bt_13 = new javax.swing.JButton();
        bt_13.setBounds(1, 155, 90, 35);
        bt_13.setBackground(Color.red);
        bt_13.setForeground(Color.white);
        bt_13.setText("Close");
                                                    //click (botão 13)
         bt_13.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 
             }
         });
        add(bt_13);
         // caract... botão 14
        bt_14 = new javax.swing.JButton();
        bt_14.setBounds(93, 155, 120, 35);
        bt_14.setText("=");
                                                   //click (botão 14)
        bt_14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num2 = Integer.parseInt(tf_01.getText());
                tf_01.setText("");
                if(opc == "soma"){
                    int r = num1+num2;
                    tf_01.setText(Integer.toString(r));
                } 
                else if(opc == "sub"){
                    int r = num1 - num2;
                    tf_01.setText(Integer.toString(r));
                }
                else if(opc == "multi"){
                    int r = num1*num2;
                    tf_01.setText(Integer.toString(r));
                }
                else if(opc == "div"){
                    int r = num1 / num2;
                    tf_01.setText(Integer.toString(r));
                }
                
            }
        });
        add(bt_14);
         // caract... botão 15
        bt_15 = new javax.swing.JButton();
        bt_15.setBounds(214, 31, 50, 30);
        bt_15.setText("+");
        bt_15.setBackground(Color.ORANGE);
                                                   //click (botão 15)
        bt_15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1 = Integer.parseInt(tf_01.getText());
                tf_01.setText("");
                opc = "soma";
                validador=false;
            }
        });
        add(bt_15);
         // caract... botão 16
        bt_16 = new javax.swing.JButton();
        bt_16.setBounds(214, 62, 50, 30);
        bt_16.setText("-");
        bt_16.setBackground(Color.ORANGE);
                                                   //click (botão 16)
        bt_16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1 = Integer.parseInt(tf_01.getText());
                tf_01.setText("");
                opc= "sub";
                validador=false;
            }
        });
        add(bt_16);
        
         // caract... botão 17
        bt_17 = new javax.swing.JButton();
        bt_17.setBounds(214, 93, 50, 30);
        bt_17.setText("x");
        bt_17.setBackground(Color.ORANGE);
                                                   //click (botão 17)
         bt_17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1 = Integer.parseInt(tf_01.getText());
                tf_01.setText("");
                opc = "multi";
                validador=false;
            }
        });
        add(bt_17);
         // caract... botão 18
        bt_18 = new javax.swing.JButton();
        bt_18.setBounds(214, 124, 50, 30);
        bt_18.setText("/");
        bt_18.setBackground(Color.ORANGE);
                                                    //click (botão 18)
         bt_18.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 num1 = Integer.parseInt(tf_01.getText());
                 tf_01.setText("");
                 opc = "div";
                 validador=false;
             }
         });
        add(bt_18);
        
        setVisible(true);
    } //Chamadas dos botões e funcões
    
    public static void main(String []args){
        new Interface();
    }
    private javax.swing.JPanel painel;
    private javax.swing.JTextField tf_01;
    private javax.swing.JButton bt_01;
    private javax.swing.JButton bt_02;
    private javax.swing.JButton bt_03;
    private javax.swing.JButton bt_04;
    private javax.swing.JButton bt_05;
    private javax.swing.JButton bt_06;
    private javax.swing.JButton bt_07;
    private javax.swing.JButton bt_08;
    private javax.swing.JButton bt_09;
    private javax.swing.JButton bt_10;
    private javax.swing.JButton bt_11;
    private javax.swing.JButton bt_12;
    private javax.swing.JButton bt_13;
    private javax.swing.JButton bt_14;
    private javax.swing.JButton bt_15;
    private javax.swing.JButton bt_16;
    private javax.swing.JButton bt_17;
    private javax.swing.JButton bt_18;
}
