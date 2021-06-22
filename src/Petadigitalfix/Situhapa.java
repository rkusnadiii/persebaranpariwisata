package Petadigitalfix;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Situhapa extends JFrame {
	
	public Situhapa() {
	
		
	}
		
		
	private void frame() {
		
		Container con = getContentPane(); // memunculkan objek
		con.setBackground(new Color(35,57,93));
		
		//icon2
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
		
		ImageIcon icon5 = new ImageIcon("src/Kampung Sampireun.jpeg");
		ImageIcon icon6 = new ImageIcon("src/Saung Budaya Ciburial 1.jpeg");
		ImageIcon icon7 = new ImageIcon("src/Saung Budaya Ciburial 2.jpeg");
		Image iconrubah5 = icon5.getImage();
		Image modified5 = iconrubah5.getScaledInstance(300,300,900);
		icon5 = new ImageIcon(modified5);
		Image iconrubah6 = icon6.getImage();
		Image modified6 = iconrubah6.getScaledInstance(300,300,900);
		icon6 = new ImageIcon(modified6);
		Image iconrubah7 = icon7.getImage();
		Image modified7 = iconrubah7.getScaledInstance(300,300,900);
		icon7 = new ImageIcon(modified7);
		
		JLabel label1 = new javax.swing.JLabel ();
		JLabel label2 = new javax.swing.JLabel ();
		JLabel label3 = new javax.swing.JLabel ();
		JLabel label4 = new javax.swing.JLabel ();
		JLabel label5 = new javax.swing.JLabel ();
		JLabel label6 = new javax.swing.JLabel ();
		
		//label1
		label1.setIcon(icon2);
		label1.setBounds(500, 0, 120, 80);
		label1.setVisible(true);
		
		//label2
		label2.setIcon(icon3);
		label2.setBounds(500, 0, 120, 80);
		label2.setVisible(true);
		
		//label3
		label3.setIcon(icon4);
		label3.setBounds(500, 0, 120, 80);
		label3.setVisible(true);
		
		label4.setIcon(icon5);
		label4.setBounds(500, 0, 300, 300);
		label4.setVisible(true);
		
		label5.setIcon(icon6);
		label5.setBounds(500, 0, 120, 80);
		label5.setVisible(true);
		
		label6.setIcon(icon7);
		label6.setBounds(500, 0, 120, 80);
		label6.setVisible(true);
		
		//panel1
				
		
		this.getContentPane().setLayout(new FlowLayout());
		JPanel panel1 = new JPanel(); 
		JPanel panel2 = new JPanel (new FlowLayout(FlowLayout.LEFT,0,0));
		JPanel panel3 = new JPanel ();
		JPanel panel4 = new JPanel ();
	
	
		//icon2
		
		
		JTextArea area = new JTextArea("Proyek peta digital ini merupakan proyek yang dilakukan oleh Dinas Pariwisata & Kebudayaan Kabupaten Garut untuk memperkenalkan destinasi wisata yang berada di berbagai kecamatan di kabupaten garut yang meliputi aspek Akomodasi , Wilayah, Tipe Atraksi dan juga aksesbilitas, selain itu juga proyek peta digital ini  diharapkan dapat memperkenalkan atraksi wisata yang ada di kabupaten garut kepada wisatawan");
		JTextArea area2 = new JTextArea("Ngentot");
		
		area.setFont(new Font("Arial",Font.PLAIN,14));
		area.setForeground(new Color(242,110,1));
		area.setBackground(new Color(35,57,93));
		area.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		area.setBounds(0,0,300,300);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setEditable(false);
		
		area2.setFont(new Font("Arial",Font.PLAIN,14));
		area2.setForeground(new Color(242,110,1));
		area2.setBackground(new Color(35,57,93));
		area2.setBounds(0,0,500,500);
		area2.setLineWrap(true);
		area2.setWrapStyleWord(true);
		area2.setEditable(false);
		
		panel1.add(label3);
		panel1.add(label2);
		panel1.add(label1);
		panel1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		panel1.setBackground(new Color(35,57,93));
		panel1.setBounds(0,0,200,200);
		panel1.setVisible(true);
		
		panel2.add(label4);
		panel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		panel2.add(area);
		panel2.setBackground(new Color(35,57,93));
		panel2.setBounds(0, 0, 300, 300);
		panel2.setVisible(true);
		
		panel3.add(label5);
		panel3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		panel3.setBackground(new Color(35,57,93));
		panel3.setBounds(0,0,200,200);
		panel3.setVisible(true);
		
		panel4.add(label6);
		panel4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		panel4.setBackground(new Color(35,57,93));
		panel4.setBounds(0,0,200,200);
		panel4.setVisible(true);
		
				
		JFrame f = new JFrame();
		f.setBounds(0,0,1280, 720);
		f.setBackground(new Color(35,57,93));
		f.add(panel2, BorderLayout.CENTER);
		f.add(panel1, BorderLayout.BEFORE_FIRST_LINE);
		f.add(panel4, BorderLayout.WEST);
		f.add(panel3, BorderLayout.EAST);
	
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Situhapa().frame();

	}

}
