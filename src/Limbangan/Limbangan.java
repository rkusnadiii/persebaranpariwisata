package Limbangan;

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

import Cilawu.CirorekBikePark;
import Cilawu.WisataEdukasidanKopiLuwak;
import Petadigitalfix.KebunJerukBosaga;
import Petadigitalfix.PetaDigital;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Limbangan extends JFrame {
	
	public Limbangan() {
		
		
	}
	
	
	public void frame() {
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JLabel label6 = new JLabel();
		JButton button1 = new JButton ("Back");
		JButton button2 = new JButton ();
		JButton button3 = new JButton ();
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
				ImageIcon icon1 = new ImageIcon("src/Limbangan 1.jpg");
				Image iconrubah1 = icon1.getImage();
				Image modified1 = iconrubah1.getScaledInstance(600, 600, 900);
				icon1 = new ImageIcon(modified1);
				//icon5
				ImageIcon icon5 = new ImageIcon("src/bulat2.jpg");
				Image iconrubah5 = icon5.getImage();
				Image modified5 = iconrubah5.getScaledInstance(20, 20, 900);
				icon5 = new ImageIcon(modified5);
		
		//frame

		JFrame f = new JFrame ();
		f.setBounds(0,0,1280, 720);
		f.setBackground(new Color(35,57,93));
		f.setVisible(true);
		f.setTitle("Peta Digital Kabupaten Garut");
		//ContentPane
		f.getContentPane().add(label5);
		f.getContentPane().add(label6);
		f.getContentPane().add(button1);
		f.getContentPane().add(button2);
		f.getContentPane().add(button3);
		f.getContentPane().add(panel3);
		f.getContentPane().add(panel1);
		f.getContentPane().add(panel2);
		
		//panel1
		panel1.setBackground(new Color(35,57,93));

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

		//button2
		button2.setIcon(icon5);
		button2.setVisible(true);
		button2.setBounds(616, 340, 10, 10);
		button2.setBorderPainted(false);
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button2ActionPerformed(evt);
	
			}

			private void button2ActionPerformed(ActionEvent evt) {
				MakamSunanRumenggong a = new MakamSunanRumenggong();
				a.frame();
				f.dispose();
			}});
		//button3
		
				button3.setIcon(icon5);
				button3.setVisible(true);
				button3.setBounds(728, 503, 10, 10);
				button3.setBorderPainted(false);
				button3.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button3ActionPerformed(evt);
			
					}

					private void button3ActionPerformed(ActionEvent evt) {
						MakamSunanCipancar a = new MakamSunanCipancar();
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
				label4.setBounds(0, 0, 200, 200);
				label4.setVisible(true);
				
		//label5
				label5.setText("Dinas Pariwisata & Kebudayaan Kabupaten Garut 2021");
				label5.setFont(new Font("Arial",Font.PLAIN,18));
				label5.setForeground(new Color(242,110,1));
				label5.setBounds(420, 500, 1000, 300);
				
		//label6
				label6.setText("Kecamatan Limbangan");
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
				

		//panel3
				panel3.add(label4);
				panel3.setVisible(true);
				panel3.setBackground(new Color(35,57,93));
				panel3.setBounds(300,80,600 ,600);
				
		
	} 

	public static void main(String[] args) {
		new Limbangan().frame();
	}

}
