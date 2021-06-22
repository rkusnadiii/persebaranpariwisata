package Petadigitalfix;
import Malangbong.PetaDigitalMalangbong;
import Garkot.PetaDigitalGarutKota;


	import java.awt.Color;
	import java.awt.Container;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
	import java.awt.Component;
	import java.awt.Container;
	import java.awt.Font;
	import java.awt.Image;
	import java.awt.LayoutManager;
	import java.awt.List;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.image.*;

	import javax.swing.BorderFactory;
	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import javax.swing.SwingConstants;
	import javax.swing.SwingUtilities;

import Cilawu.PetaDigitalCilawu;
import Karangpawitan.PetaDigitalKarangpawitan;
import Limbangan.Limbangan;

import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.Dimension;
	import java.awt.FlowLayout;

	import javax.swing.ImageIcon;
	import javax.swing.JFrame;



	public class PetaDigital extends JFrame {
		
		public PetaDigital() {
		
			
		}
		/*public String tarkal="tarogong\nkaler";
		public String getName() {
			return tarkal;
		}
		public void setName(String tarkal) {
			this.tarkal=tarkal;
		}*/
			
			
		public void frame() {
			
			Container con = getContentPane(); // memunculkan objek
			con.setBackground(new Color(35,57,93)); 
			
			
			//icon5
			
			ImageIcon icon5 = new ImageIcon("src/bulat2.jpg");
			Image iconrubah5 = icon5.getImage();
			Image modified5 = iconrubah5.getScaledInstance(20, 20, 900);
			icon5 = new ImageIcon(modified5);
					//icon2
					ImageIcon icon2 = new ImageIcon("src/Pesona Garut.png");
					Image iconrubah = icon2.getImage();
					Image modified2 = iconrubah.getScaledInstance(120, 80, 900);
					icon2 = new ImageIcon(modified2);
					//icon3
					ImageIcon icon3 = new ImageIcon("src/pesona indonesia.png");
					Image iconrubah2 = icon3.getImage();
					Image modified3 = iconrubah2.getScaledInstance(120,80,900);
					icon3 = new ImageIcon(modified3);
					//icon4
					ImageIcon icon4 = new ImageIcon("src/ffun.png");
					Image iconrubah3 = icon4.getImage();
					Image modified4 = iconrubah3.getScaledInstance(100, 80, 900);
					icon4 = new ImageIcon(modified4);
					//icon1
					ImageIcon icon1 = new ImageIcon("src/Peta Digital Kabupaten Garut.jpg");
					Image iconrubah1 = icon1.getImage();
					Image modified1 = iconrubah1.getScaledInstance(1302, 500, 900);
					icon1 = new ImageIcon(modified1);
					
				
	
			JButton button1 = new JButton ("Samarang");
			JButton button2 = new JButton ("Back");
			JButton button3 = new JButton ("Cilawu");
			JButton button4 = new JButton ("Limbangan");
			JButton button5 = new JButton ("Karangpawitan");
			JButton button6 = new JButton ();
			
			JButton button7 = new JButton ("Malangbong");
			JButton button8 = new JButton ();
			JButton button9= new JButton ();
			JButton button10 = new JButton ();
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel ();
			JPanel panel5 = new JPanel ();
			JPanel panel6 = new JPanel ();
			JPanel panel7 = new JPanel ();
			JPanel panel8 = new JPanel ();
			JPanel panel9 = new JPanel ();
			JLabel label1 = new JLabel();
			JLabel label2 = new JLabel();
			JLabel label3 = new JLabel();
			JLabel label4 = new JLabel();
			JLabel label5 = new JLabel();
			JLabel label6 = new JLabel();
			JLabel label7 = new JLabel("Tarogong");
			JLabel label8 = new JLabel("Kaler");
			JLabel label9 = new JLabel("Garut");
			JLabel label10 = new JLabel("Kota");
			JLabel label11 = new JLabel();
			JLabel label12 = new JLabel();
			JLabel label13 = new JLabel ();
			JLabel label14 = new JLabel ();
			
			
			//frame
			JFrame f = new JFrame();
			f.setBounds(0,0,1280, 720);
			f.setBackground(new Color(35,57,93));
			f.setVisible(true);
			f.setTitle("Peta Digital Kabupaten Garut");
			f.setIconImage(modified2);
			
			f.getContentPane().add(panel1);
			f.getContentPane().add(button1);
			f.getContentPane().add(button2);
			f.getContentPane().add(button3);
			f.getContentPane().add(button4);
			f.getContentPane().add(button5);
			f.getContentPane().add(button6);
			f.getContentPane().add(button7);
			f.getContentPane().add(button8);
			f.getContentPane().add(label5);
			f.getContentPane().add(label6);
			f.getContentPane().add(label7);
			f.getContentPane().add(panel5);
			f.getContentPane().add(panel6);
			f.getContentPane().add(panel7);
			f.getContentPane().add(panel8);
			f.getContentPane().add(panel9);
			f.getContentPane().add(panel4);
			f.getContentPane().add(panel3);
			f.getContentPane().add(panel2);
			
			
			
		
			
			
			
			LayoutManager layout = new FlowLayout ();
			LayoutManager layout2 = new FlowLayout ();
			
			
			
			

			//button2
			button2.setBounds(20, 590, 100, 50);
			button2.setVisible(true);
			button2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button2ActionPerformed(evt);
		
				}

				private void button2ActionPerformed(ActionEvent evt) {
					MainMenu a = new MainMenu();
					a.frame();
					f.dispose();
				}});
			
			//button1
			
			button1.setFont(new Font("Arial",Font.PLAIN,7));
			button1.setBorder(null);
			button1.setVisible(true);
			button1.isPreferredSizeSet();
			button1.setBackground(new Color(211,250,190));
			button1.setBounds(590, 250, 40, 20);
			button1.setBorderPainted(false);
			button1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button1ActionPerformed(evt);
		
				}

				private void button1ActionPerformed(ActionEvent evt) {
					Samarang2 a = new Samarang2();
					a.frame();
					f.dispose();
				}});
			
//button3
			
			button3.setFont(new Font("Arial",Font.PLAIN,7));
			button3.setBorder(null);
			button3.setVisible(true);
			button3.setBackground(new Color(211,250,190));
			button3.setBounds(670, 330, 40, 20);
			button3.setBorderPainted(false);
			button3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button1ActionPerformed(evt);
		
				}

				private void button1ActionPerformed(ActionEvent evt) {
					PetaDigitalCilawu a = new PetaDigitalCilawu();
					a.frame();
					f.dispose();
				}});
			
//button4
			
			button4.setFont(new Font("Arial",Font.PLAIN,8));
			button4.setBorder(null);
			button4.setVisible(true);
			button4.setBackground(new Color(211,250,190));
			button4.setBounds(710, 140, 48, 20);
			button4.setBorderPainted(false);
			button4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button4ActionPerformed(evt);
		
				}

				private void button4ActionPerformed(ActionEvent evt) {
					Limbangan a = new Limbangan();
					a.frame();
					f.dispose();
				}});
			
			
//button5
			
			button5.setFont(new Font("Arial",Font.PLAIN,6));
			button5.setBorder(null);
			button5.setVisible(true);
			button5.setBackground(new Color(211,250,190));
			button5.setBounds(718, 285, 42, 8);
			button5.setBorderPainted(false);
			button5.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button5ActionPerformed(evt);
		
				}

				private void button5ActionPerformed(ActionEvent evt) {
					PetaDigitalKarangpawitan a = new PetaDigitalKarangpawitan();
					a.frame();
					f.dispose();
				}});
			
			//button6
			button6.setLayout(new BorderLayout());
			button6.setFont(new Font("Arial",Font.PLAIN,8));
			button6.setBorder(null);
			button6.setVisible(true);
			button6.setBackground(new Color(211,250,190));
			button6.setBounds(645, 245, 35, 20);
			button6.add(BorderLayout.NORTH,label7);
			button6.add(BorderLayout.SOUTH,label8);
			button6.setBorderPainted(false);
			button6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button6ActionPerformed(evt);
		
				}

				private void button6ActionPerformed(ActionEvent evt) {
					TarogongKaler a = new TarogongKaler();
					a.frame();
					f.dispose();
				}});
			
			//button7
			button7.setFont(new Font("Arial",Font.PLAIN,8));
			button7.setBorder(null);
			button7.setVisible(true);
			button7.setBackground(new Color(211,250,190));
			button7.setBounds(822, 175, 55, 30);
			button7.setBorderPainted(false);
			button7.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button7ActionPerformed(evt);
				}
				private void button7ActionPerformed(ActionEvent evt) {
					PetaDigitalMalangbong a= new PetaDigitalMalangbong();
					a.frame();
					f.dispose();
				}
			});
			
			//button8
			button8.setLayout(new BorderLayout());
			button8.setFont(new Font("Arial",Font.PLAIN,8));
			button8.setBorder(null);
			button8.setVisible(true);
			button8.setBackground(new Color(211,250,190));
			button8.setBounds(710, 300, 15, 15);
			button8.add(BorderLayout.NORTH,label9);
			button8.add(BorderLayout.SOUTH,label10);
			button8.setBorderPainted(false);
			button8.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed (java.awt.event.ActionEvent evt) {
					button6ActionPerformed(evt);
		
				}

				private void button6ActionPerformed(ActionEvent evt) {
					PetaDigitalGarutKota a = new PetaDigitalGarutKota();
					a.frame();
					f.dispose();
				}});
			
			
		
			
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
					
			//label4
					label4.setIcon(icon1);
					label4.setBounds(0,0,1246,426);
					label4.setVisible(true);
			//label5
					label5.setText("Dinas Pariwisata & Kebudayaan Kabupaten Garut 2021");
					label5.setFont(new Font("Arial",Font.PLAIN,18));
					label5.setForeground(new Color(242,110,1));
					label5.setBounds(420, 500, 1000, 300);
			//label6
					label6.setText("Peta Digital Kabupaten Garut");
					label6.setFont(new Font("Arial",Font.PLAIN,30));
					label6.setForeground(new Color(242,110,1));
					label6.setBounds(0,0 ,400, 70);
					
			//label7
					label7.setFont(new Font("Arial",Font.PLAIN,8));
					
			//label8
					label8.setFont(new Font("Arial",Font.PLAIN,8));
			//label9
					label9.setFont(new Font("Arial",Font.PLAIN,6));
					
			//label10
					label10.setFont(new Font("Arial",Font.PLAIN,6));
					
		
			
					
			//panel1
			panel1.setBackground(new Color(35,57,93));
			
			//panel2
			
			panel2.setLayout(layout);
			panel2.add(label3);
			panel2.add(label2);
			panel2.add(label1);
			panel2.setBorder(BorderFactory.createEmptyBorder(0, 890, 0, 0));
			panel2.setBackground(new Color(35,57,93));
			panel2.setBounds(0,0,400,200);
			panel2.setVisible(true);
			
			//panel3
			
			panel3.setLayout(layout2);
			panel3.add(label4);
			panel3.setVisible(true);
			panel3.setBackground(new Color(35,57,93));
			panel3.setBounds(200, 100, 390, 300);
			
			//panel4
			panel4.add(label4);
			panel4.setVisible(true);
			panel4.setBackground(new Color(35,57,93));
			panel4.setBounds(60,110,1246 ,679);
			
			
	
			
		
		
		
			
			
			
			
			
			
			
		
			
		}

		public static void main(String[] args) {
			new PetaDigital().frame();
		}
		
	}
		





		


