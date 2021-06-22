package Cilawu;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
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

import Petadigitalfix.KebunJerukBosaga;
import Petadigitalfix.PetaDigital;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PetaDigitalCilawu extends JFrame {
	
	public PetaDigitalCilawu() {
		
		
	}
	
	
	public void frame() {
		
		
		Container con = getContentPane(); // memunculkan objek
		con.setBackground(new Color(35,57,93)); 
		
		//icon
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
		ImageIcon icon1 = new ImageIcon("src/Cilawu2.png");
		Image iconrubah1 = icon1.getImage();
		Image modified1 = iconrubah1.getScaledInstance(500, 500, 900);
		icon1 = new ImageIcon(modified1);
		//icon5
		ImageIcon icon5 = new ImageIcon("src/bulat2.jpg");
		Image iconrubah5 = icon5.getImage();
		Image modified5 = iconrubah5.getScaledInstance(20, 20, 900);
		icon5 = new ImageIcon(modified5);

		
		JButton button1 = new JButton ("Back\n anjing ");
		JButton button2 = new JButton ();
		JButton button3 = new JButton ();
		JButton button4 = new JButton ();
		JButton button5 = new JButton ();
		JButton button6 = new JButton ();
		JButton button7 = new JButton ();
		JButton button8 = new JButton ();
		JButton button9 = new JButton ();
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
		JLabel label7 = new JLabel();
		
		//frame
		JFrame f = new JFrame ();
		f.setBounds(0,0,1280, 720);
		f.setBackground(new Color(35,57,93));
		f.setVisible(true);
		f.setTitle("Peta Digital Kabupaten Garut");
		f.setIconImage(modified2);
		
		f.getContentPane().add(button1);
		f.getContentPane().add(button2);
		f.getContentPane().add(button3);
		f.getContentPane().add(button4);
		f.getContentPane().add(button5);
		f.getContentPane().add(button6);
		f.getContentPane().add(button7);
		f.getContentPane().add(button8);
		f.getContentPane().add(button9);
		f.getContentPane().add(label5);
		f.getContentPane().add(label6);
		f.getContentPane().add(panel1);
		f.getContentPane().add(panel4);
		f.getContentPane().add(panel3);
		f.getContentPane().add(panel2);
		
		
		
		
		//button2
		button2.setIcon(icon5);
		button2.setVisible(true);
		button2.setBounds(717, 290, 10, 10);
		button2.setBorderPainted(false);
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button2ActionPerformed(evt);
	
			}

			private void button2ActionPerformed(ActionEvent evt) {
				CirorekBikePark a = new CirorekBikePark();
				a.frame();
				f.dispose();
			}});
		
		//button3
		
		button3.setIcon(icon5);
		button3.setVisible(true);
		button3.setBounds(640, 282, 10, 10);
		button3.setBorderPainted(false);
		button3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button3ActionPerformed(evt);
	
			}

			private void button3ActionPerformed(ActionEvent evt) {
				WisataEdukasidanKopiLuwak a = new WisataEdukasidanKopiLuwak();
				a.frame();
				f.dispose();
			}});
		//button4
		
				button4.setIcon(icon5);
				button4.setVisible(true);
				button4.setBounds(562, 359, 10, 10);
				button4.setBorderPainted(false);
				button4.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button4ActionPerformed(evt);
			
					}

					private void button4ActionPerformed(ActionEvent evt) {
						GunungCikuray a = new GunungCikuray();
						a.frame();
						f.dispose();
					}});
		//button5
				
				button5.setIcon(icon5);
				button5.setVisible(true);
				button5.setBounds(580, 178, 10, 10);
				button5.setBorderPainted(false);
				button5.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button4ActionPerformed(evt);
			
					}

					private void button4ActionPerformed(ActionEvent evt) {
						LapangGolfNgamplang a = new LapangGolfNgamplang();
						a.frame();
						f.dispose();
					}});
				
		//button6
				button6.setIcon(icon5);
				button6.setVisible(true);
				button6.setBounds(710, 465, 10, 10);
				button6.setBorderPainted(false);
				button6.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button6ActionPerformed(evt);
			
					}

					private void button6ActionPerformed(ActionEvent evt) {
						DesaWisataSindangkasih a = new DesaWisataSindangkasih();
						a.frame();
						f.dispose();
					}});
		//button7
				button7.setIcon(icon5);
				button7.setVisible(true);
				button7.setBounds(600, 417, 10, 10);
				button7.setBorderPainted(false);
				button7.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button7ActionPerformed(evt);
			
					}

					private void button7ActionPerformed(ActionEvent evt) {
						DayeuhManggung a = new DayeuhManggung();
						a.frame();
						f.dispose();
					}});
				
				//button8
				button8.setIcon(icon5);
				button8.setVisible(true);
				button8.setBounds(565, 560, 10, 10);
				button8.setBorderPainted(false);
				button8.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button8ActionPerformed(evt);
			
					}

					private void button8ActionPerformed(ActionEvent evt) {
						CurugCisarua a = new CurugCisarua();
						a.frame();
						f.dispose();
					}});
				//button9
				button9.setIcon(icon5);
				button9.setVisible(true);
				button9.setBounds(612, 491, 10, 10);
				button9.setBorderPainted(false);
				button9.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button8ActionPerformed(evt);
			
					}

					private void button8ActionPerformed(ActionEvent evt) {
						CurugCihanyawar a = new CurugCihanyawar();
						a.frame();
						f.dispose();
					}});
		
		
		//panel1
		panel1.setBackground(new Color(35,57,93));
		
		
		
	
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
		label4.setBounds(0, 0, 200, 200);
		label4.setVisible(true);
		
//label5
		label5.setText("Dinas Pariwisata & Kebudayaan Kabupaten Garut 2021");
		label5.setFont(new Font("Arial",Font.PLAIN,18));
		label5.setForeground(new Color(242,110,1));
		label5.setBounds(420, 500, 1000, 300);
		
//label6
		label6.setText("Kecamatan Cilawu");
		label6.setFont(new Font("Arial",Font.PLAIN,30));
		label6.setForeground(new Color(242,110,1));
		label6.setBounds(0,0 ,400, 70);
//panel2
		
	
		panel2.add(label3);
		panel2.add(label2);
		panel2.add(label1);
		panel2.setBorder(BorderFactory.createEmptyBorder(0, 890, 0, 0));
		panel2.setBackground(new Color(35,57,93));
		panel2.setBounds(0,0,400,200);
		panel2.setVisible(true);
		

		//panel4
		panel4.add(label4);
		panel4.setVisible(true);
		panel4.setBackground(new Color(35,57,93));
		panel4.setBounds(270,100,800 ,500);
		
		//button1
		button1.setVisible(true);
		button1.setBackground(new Color(211,250,190));
		button1.setBounds(20, 590, 100, 50);
		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button1ActionPerformed(evt);
	
			}

			private void button1ActionPerformed(ActionEvent evt) {
				PetaDigital a = new PetaDigital();
				a.frame();
				f.dispose();
			}});
	
		
	}
		

	public static void main(String[] args) {
		new PetaDigitalCilawu().frame();

	}

}
