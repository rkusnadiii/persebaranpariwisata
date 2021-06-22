package Garkot;

import Petadigitalfix.PetaDigital;
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

import Karangpawitan.CurugBatuLempar;
import Karangpawitan.CurugBatuSusun;
import Karangpawitan.Linggaratu;
import Karangpawitan.MakamGodog;
import Petadigitalfix.PetaDigital;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;


public class PetaDigitalGarutKota extends JFrame {
	
		public PetaDigitalGarutKota() {
		
		JFrame Frame;
	}
	
		 public void frame() {
			
				//icon1
				ImageIcon icon1 = new ImageIcon("src/GarutKota.jpg");
				Image iconrubah1 = icon1.getImage();
				Image modified1 = iconrubah1.getScaledInstance(1500, 600, 900);
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
			//icon5
				ImageIcon icon5 = new ImageIcon("src/bulat2.jpg");
				Image iconrubah5 = icon5.getImage();
				Image modified5 = iconrubah5.getScaledInstance(20, 20, 900);
				icon5 = new ImageIcon(modified5);
				
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
		
		JButton button1 = new JButton ("Back");
		JButton button2 = new JButton ();
		JButton button3 = new JButton ();
		JButton button4 = new JButton ();
		JButton button5 = new JButton ();
		JButton button6 = new JButton ();
		JButton button7 = new JButton ();
		
		
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
		label6.setText("Kecamatan Garut");
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
		f.getContentPane().add(label6);
		f.getContentPane().add(Panel2);
		f.getContentPane().add(Panel3);
		f.getContentPane().add(Panel4);
		f.getContentPane().add(label4);
		f.getContentPane().add(Panel5);
		
		
				
		
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
		button2.setBounds(475, 200, 10, 10);
		button2.setBorderPainted(false);
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button2ActionPerformed(evt);
	
			}

			private void button2ActionPerformed(ActionEvent evt) {
				AlunAlun a = new AlunAlun();
				a.frame();
				f.dispose();
			}});
		
		//button3
		button3.setIcon(icon5);
		button3.setVisible(true);
		button3.setBounds(570, 220, 10, 10);
		button3.setBorderPainted(false);
		button3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button3ActionPerformed(evt);
	
			}

			private void button3ActionPerformed(ActionEvent evt) {
				CentraKulitGarut a = new CentraKulitGarut();
				a.frame();
				f.dispose();
			}});
		//button4
		button4.setIcon(icon5);
		button4.setVisible(true);
		button4.setBounds(791, 510, 10, 10);
		button4.setBorderPainted(false);
		button4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button4ActionPerformed(evt);
	
			}

			private void button4ActionPerformed(ActionEvent evt) {
				KaracakValley a = new KaracakValley();
				a.frame();
				f.dispose();
			}});
		//button5
		button5.setIcon(icon5);
		button5.setVisible(true);
		button5.setBounds(565, 204, 10, 10);
		button5.setBorderPainted(false);
		button5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button5ActionPerformed(evt);
	
			}

			private void button5ActionPerformed(ActionEvent evt) {
				PasarCeplak a = new PasarCeplak();
				a.frame();
				f.dispose();
			}});
		//button6
		button6.setIcon(icon5);
		button6.setVisible(true);
		button6.setBounds(774, 490
				, 10, 10);
		button6.setBorderPainted(false);
		button6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button5ActionPerformed(evt);
	
			}

			private void button5ActionPerformed(ActionEvent evt) {
				PeternakanMargawati a = new PeternakanMargawati();
				a.frame();
				f.dispose();
			}});
		//button7
		button7.setIcon(icon5);
		button7.setVisible(true);
		button7.setBounds(470, 219, 10, 10);
		button7.setBorderPainted(false);
		button7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button5ActionPerformed(evt);
	
			}

			private void button5ActionPerformed(ActionEvent evt) {
				TamanMaktal a = new TamanMaktal();
				a.frame();
				f.dispose();
			}});
		
	
	
				
				
				
				
				
				
				
				
		}
				
				
			
			
			
			
			
		
	public static void main(String[] args) {
		new PetaDigitalGarutKota().frame();

	}
	private void serDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
}

}
