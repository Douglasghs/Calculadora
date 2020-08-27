
import java.awt.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Interface extends JFrame {
    
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
        
        bt_01 = new javax.swing.JButton();
        bt_01.setBounds(1, 31, 70, 30);
        bt_01.setText("1");
        bt_01.setBackground(Color.DARK_GRAY);
        bt_01.setForeground(Color.white);
        add(bt_01);
        
        bt_02 = new javax.swing.JButton();
        bt_02.setBounds(72, 31, 70, 30);
        bt_02.setText("2");
        bt_02.setBackground(Color.DARK_GRAY);
        bt_02.setForeground(Color.white);
        add(bt_02);
        
        bt_03 = new javax.swing.JButton();
        bt_03.setBounds(143, 31, 70, 30);
        bt_03.setText("3");
        bt_03.setBackground(Color.DARK_GRAY);
        bt_03.setForeground(Color.white);
        add(bt_03);
        
        bt_04 = new javax.swing.JButton();
        bt_04.setBounds(1, 62, 70, 30);
        bt_04.setText("4");
        bt_04.setBackground(Color.DARK_GRAY);
        bt_04.setForeground(Color.white);
        add(bt_04);
        
        bt_05 = new javax.swing.JButton();
        bt_05.setBounds(72, 62, 70, 30);
        bt_05.setText("5");
        bt_05.setBackground(Color.DARK_GRAY);
        bt_05.setForeground(Color.white);
        add(bt_05);
        
        bt_06 = new javax.swing.JButton();
        bt_06.setBounds(143, 62, 70, 30);
        bt_06.setText("6");
        bt_06.setBackground(Color.DARK_GRAY);
        bt_06.setForeground(Color.WHITE);
        add(bt_06);
        
        bt_07 = new javax.swing.JButton();
        bt_07.setBounds(1, 93, 70, 30);
        bt_07.setText("7");
        bt_07.setBackground(Color.DARK_GRAY);
        bt_07.setForeground(Color.white);
        add(bt_07);
        
        bt_08 = new javax.swing.JButton();
        bt_08.setBounds(72, 93, 70, 30);
        bt_08.setText("8");
        bt_08.setBackground(Color.DARK_GRAY);
        bt_08.setForeground(Color.white);
        add(bt_08);
        
        bt_09 = new javax.swing.JButton();
        bt_09.setBounds(143, 93, 70, 30);
        bt_09.setText("9");
        bt_09.setBackground(Color.DARK_GRAY);
        bt_09.setForeground(Color.white);
        add(bt_09);
        
        bt_10 = new javax.swing.JButton();
        bt_10.setBounds(72, 124, 70, 30);
        bt_10.setText("0");
        bt_10.setBackground(Color.DARK_GRAY);
        bt_10.setForeground(Color.white);
        add(bt_10);
        
        
        bt_11 = new javax.swing.JButton();
        bt_11.setBounds(1, 124, 70, 30);
        bt_11.setText(".");
        bt_11.setBackground(Color.DARK_GRAY);
        bt_11.setForeground(Color.white);
        add(bt_11);
        
        bt_12 = new javax.swing.JButton();
        bt_12.setBounds(143, 124, 70, 30);
        bt_12.setText(",");
        bt_12.setBackground(Color.DARK_GRAY);
        bt_12.setForeground(Color.white);
        add(bt_12);
        
        bt_13 = new javax.swing.JButton();
        bt_13.setBounds(1, 155, 90, 35);
        bt_13.setBackground(Color.red);
        bt_13.setForeground(Color.white);
        bt_13.setText("Close");
        add(bt_13);
        
        bt_14 = new javax.swing.JButton();
        bt_14.setBounds(93, 155, 120, 35);
        bt_14.setText("=");
        add(bt_14);
        
        bt_15 = new javax.swing.JButton();
        bt_15.setBounds(214, 31, 50, 30);
        bt_15.setText("+");
        bt_15.setBackground(Color.ORANGE);
        add(bt_15);
        
        bt_16 = new javax.swing.JButton();
        bt_16.setBounds(214, 62, 50, 30);
        bt_16.setText("-");
        bt_16.setBackground(Color.ORANGE);
        add(bt_16);
        
        bt_17 = new javax.swing.JButton();
        bt_17.setBounds(214, 93, 50, 30);
        bt_17.setText("x");
        bt_17.setBackground(Color.ORANGE);
        add(bt_17);
        
        bt_18 = new javax.swing.JButton();
        bt_18.setBounds(214, 124, 50, 30);
        bt_18.setText("/");
        bt_18.setBackground(Color.ORANGE);
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
