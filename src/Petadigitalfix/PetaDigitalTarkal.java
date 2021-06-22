package Petadigitalfix;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;


public class PetaDigitalTarkal extends JFrame {

    public PetaDigitalTarkal() {

        JFrame Frame;
    }

    void frame() {

        //icon1
        ImageIcon icon1 = new ImageIcon("src/rsz_tarogong_kaler.jpg");
        Image iconrubah1 = icon1.getImage();
        Image modified1 = iconrubah1.getScaledInstance(1400, 450, 900);
        icon1 = new ImageIcon(modified1);
        // icon2
        ImageIcon icon2 = new ImageIcon("src/Pesona Garut.png");
        Image iconrubah = icon2.getImage();
        Image modified2 = iconrubah.getScaledInstance(120, 80, 900);
        icon2 = new ImageIcon(modified2);
        //icon3
        ImageIcon icon3 = new ImageIcon("src/wonderful-indonesia.png");
        Image iconrubah2 = icon3.getImage();
        Image modified3 = iconrubah2.getScaledInstance(120,80,900);
        icon3 = new ImageIcon(modified3);
        //icon4
        ImageIcon icon4 = new ImageIcon("src/ffun.png");
        Image iconrubah3 = icon4.getImage();
        Image modified4 = iconrubah3.getScaledInstance(100, 80, 900);
        icon4 = new ImageIcon(modified4);


        getPreferredSize();// agar sesuai ukuran ketika minimize
        setBounds(0,0, 1280, 720);// membuat ukuran frame
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new javax.swing.JLabel();
        JLabel label2 = new javax.swing.JLabel();
        JLabel label3 = new javax.swing.JLabel();
        JLabel label4 = new javax.swing.JLabel();
        JLabel label5 = new javax.swing.JLabel();
        JLabel label6 = new javax.swing.JLabel();
        JPanel Panel1 = new javax.swing.JPanel();
        JPanel Panel2 = new javax.swing.JPanel();
        JPanel Panel3 = new javax.swing.JPanel();
        JPanel Panel4 = new javax.swing.JPanel();
        JPanel Panel5 = new javax.swing.JPanel();

        Container con = getContentPane(); // memunculkan objek
        setResizable(false);
        con.setBackground(new Color(35,57,93));


        //label1
        label1.setIcon(icon2);
        label1.setBounds(0, 0, 120, 80);
        label1.setVisible(true);
        //label2
        label2.setIcon(icon3);
        label2.setBounds(0, 0, 120, 80);
        label2.setVisible(true);
        //label3
        label3.setIcon(icon4);
        label3.setBounds(0, 0, 120, 80);
        label3.setVisible(true);
        //label4
        label4.setText("Dinas Pariwisata & Kebudayaan Kabupaten Garut 2021");
        label4.setFont(new Font("Arial",Font.PLAIN,18));
        label4.setForeground(new Color(242,110,1));
        label4.setBounds(420, 500, 1000, 300);
        //label5
        label5.setIcon(icon1);
        label5.setBounds(0,0,1246,426);
        label5.setVisible(true);

        //label6
        label6.setText("Kecamatan Tarogong Kaler");
        label6.setFont(new Font("Arial",Font.PLAIN,30));
        label6.setForeground(new Color(242,110,1));
        label6.setBounds(0,0 ,400, 70);



        //panel2
        Panel2.add(label1);
        Panel2.setVisible(true);
        Panel2.setBackground(new Color(35,57,93));
        Panel2.setBounds(1140, 0, 120, 80);

        //panel3
        Panel3.add(label2);
        Panel3.setVisible(true);
        Panel3.setBackground(new Color(35,57,93));
        Panel3.setBounds(1000,10, 120, 80);

        //panel4
        Panel4.add(label3);
        Panel4.setVisible(true);
        Panel4.setBackground(new Color(35,57,93));
        Panel4.setBounds(870,10,120 ,80);

        //panel5
        Panel5.add(label5);
        Panel5.setVisible(true);
        Panel5.setBackground(new Color(35,57,93));
        Panel5.setBounds(-40,130,1246 ,426);

        con.add(label6);
        con.add(Panel2);
        con.add(Panel3);
        con.add(Panel4);
        con.add(label4);
        con.add(Panel5);









    }








    public static void main(String[] args) {
        new TarogongKaler().frame();

    }
    private void serDefaultCloseOperation(int exitOnClose) {
        // TODO Auto-generated method stub
    }

}
