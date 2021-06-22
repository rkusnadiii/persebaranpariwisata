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

import Petadigitalfix.MakamImingBunyamin;
import Petadigitalfix.Samarang2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CurugCisarua extends JFrame{
	



public CurugCisarua() {
	
}

public void frame() {
	
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
		//icon6
		ImageIcon icon6 = new ImageIcon("src/Cisarua 1.jpg");
		Image iconrubah6 = icon6.getImage();
		Image modified6 = iconrubah6.getScaledInstance(400,300,900);
		icon6 = new ImageIcon(modified6);
		//icon7
		ImageIcon icon7 = new ImageIcon("src/Cisarua 2.jpeg");
		Image iconrubah7 = icon7.getImage();
		Image modified7 = iconrubah7.getScaledInstance(400,300,900);
		icon7 = new ImageIcon(modified7);
		
		JButton button1 = new JButton("Back"); 		
		JTextArea area = new JTextArea (" Desa : Sukamurni \n Kecamatan : Cilawu \n Kabupaten : Garut \n Jarak Dari Ibu Kota : 20,9 Km");
		JTextArea area2 = new JTextArea ("±2,5ha");
		JTextArea area3 = new JTextArea ("Curug Cisarua dapat diakses dengan menggunakan kendaraan pribadi. Jalur yang dilalui yaitu Jalan Raya Garut-Tasikmalaya. Perjalanan yang dapat ditempuh menuju Curug Cisarua yaitu 30 menit (dari Alun-Alun Garut) menggunakan kendaraan dan 30 menit dengan berjalan kaki. ");
		JTextArea area4 = new JTextArea ("Air Terjun");
		JTextArea area5 = new JTextArea ("Mushola dan Gazebo");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JLabel label6 = new JLabel();
		JLabel label7 = new JLabel();
		JLabel label8 = new JLabel();
		JLabel label9 = new JLabel();
		JLabel label10 = new JLabel();
		JLabel label11 = new JLabel();
		JLabel label12 = new JLabel();
		JLabel label13 = new JLabel();
		JLabel label14 = new JLabel();
		JLabel label15 = new JLabel();
		
		//frame
				JFrame f = new JFrame();
				f.setBounds(0,0,1280, 720);
				f.setBackground(new Color(35,57,93));
				f.setVisible(true);
				f.setTitle("Peta Digital Kabupaten Garut");
				f.setIconImage(modified2);
				
				
				f.getContentPane().add(panel1);
				f.getContentPane().add(button1);
				f.getContentPane().add(label6);
				f.getContentPane().add(label7);
				f.getContentPane().add(label8);
				f.getContentPane().add(label9);
				f.getContentPane().add(label10);
				f.getContentPane().add(label11);
				f.getContentPane().add(label12);
				f.getContentPane().add(label13);
				f.getContentPane().add(label14);
				f.getContentPane().add(panel5);
				f.getContentPane().add(panel6);
				f.getContentPane().add(panel7);
				f.getContentPane().add(panel8);
				f.getContentPane().add(panel9);
				f.getContentPane().add(panel4);
				f.getContentPane().add(panel3);
				f.getContentPane().add(panel2);
				
				//button1
				button1.setBounds(20, 590, 100, 50);
				button1.setVisible(true);
				button1.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed (java.awt.event.ActionEvent evt) {
						button1ActionPerformed(evt);
			
					}

					private void button1ActionPerformed(ActionEvent evt) {
						PetaDigitalCilawu a = new PetaDigitalCilawu();
						a.frame();
						f.dispose();
					}});
				
				
				//area
				area.setFont(new Font("Arial",Font.PLAIN,14));
				area.setForeground(new Color(242,110,1));
				area.setBackground(new Color(35,57,93));
				area.setBounds(0,0,200,200);
				area.setLineWrap(true);
				area.setWrapStyleWord(true);
				area.setEditable(false);
				
				//area2
				
				area2.setFont(new Font("Arial",Font.PLAIN,14));
				area2.setForeground(new Color(242,110,1));
				area2.setBackground(new Color(35,57,93));
				area2.setBounds(0,0,100,100);
				area2.setLineWrap(true);
				area2.setWrapStyleWord(true);
				area2.setEditable(false);
				
				//area3
				area3.setFont(new Font("Arial",Font.PLAIN,9));
				area3.setForeground(new Color(242,110,1));
				area3.setBackground(new Color(35,57,93));
				area3.setBounds(0,0,200,200);
				area3.setLineWrap(true);
				area3.setWrapStyleWord(true);
				area3.setEditable(false);
				
				//area4
				area4.setFont(new Font("Arial",Font.PLAIN,14));
				area4.setForeground(new Color(242,110,1));
				area4.setBackground(new Color(35,57,93));
				area4.setBounds(0,0,200,200);
				area4.setLineWrap(true);
				area4.setWrapStyleWord(true);
				area4.setEditable(false);
				
				//area5
				area5.setFont(new Font("Arial",Font.PLAIN,14));
				area5.setForeground(new Color(242,110,1));
				area5.setBackground(new Color(35,57,93));
				area5.setBounds(0,0,200,200);
				area5.setLineWrap(true);
				area5.setWrapStyleWord(true);
				area5.setEditable(false);
			
				
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
						label4.setIcon(icon6);
						label4.setBounds(500, 0, 120, 80);
						label4.setVisible(true);
						
				//label5
						label5.setIcon(icon7);
						label5.setBounds(500, 0, 120, 80);
						label5.setVisible(true);
				//label6
						label6.setText("CurugCisarua");
						label6.setFont(new Font("Arial",Font.PLAIN,20));
						label6.setForeground(new Color(242,110,1));
						label6.setBounds(0,0 ,400, 70);
				//label7
						label7.setText("Wisata Alam");
						label7.setFont(new Font("Arial",Font.PLAIN,14));
						label7.setForeground(new Color(242,110,1));
						label7.setBounds(0,20 ,400, 70);
				//label8
						label8.setText("Masyarakat Lokal");
						label8.setFont(new Font("Arial",Font.PLAIN,14));
						label8.setForeground(new Color(242,110,1));
						label8.setBounds(0,40 ,400, 70);
						
				//label9
						label9.setText("LOKASI :");
						label9.setFont(new Font("Arial",Font.PLAIN,16));
						label9.setForeground(new Color(242,110,1));
						label9.setBounds(150,420 ,400, 70);
				//label10
						label10.setText("LUAS :");
						label10.setFont(new Font("Arial",Font.PLAIN,16));
						label10.setForeground(new Color(242,110,1));
						label10.setBounds(360,420 ,400, 70);
				//label11
						label11.setText("AKSESIBILITAS :");
						label11.setFont(new Font("Arial",Font.PLAIN,16));
						label11.setForeground(new Color(242,110,1));
						label11.setBounds(470,420 ,400, 70);
				//label12
						label12.setText("DAYA TARIK :");
						label12.setFont(new Font("Arial",Font.PLAIN,16));
						label12.setForeground(new Color(242,110,1));
						label12.setBounds(680,420 ,400, 70);
				//label13
						label13.setText("AMENITAS :");
						label13.setFont(new Font("Arial",Font.PLAIN,16));
						label13.setForeground(new Color(242,110,1));
						label13.setBounds(890,420 ,400, 70);
				//label14
						label14.setText("Tiket Masuk : Rp 5000/orang");
						label14.setFont(new Font("Arial",Font.PLAIN,16));
						label14.setForeground(new Color(242,110,1));
						label14.setBounds(550,600 ,700, 70);
						
						//panel1
						panel1.setBackground(new Color(35,57,93));
						
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
						panel3.setBounds(200, 100, 390, 300);
						
						//panel4
						panel4.add(area);
						panel4.setBackground(new Color(35,57,93));
						panel4.setBounds(150,470, 200,200);
						panel4.setVisible(true);
						
						//panel5
						panel5.add(area2);
						panel5.setBackground(new Color(35,57,93));
						panel5.setBounds(360, 470, 100, 100);
						panel5.setVisible(true);
						
						//panel6
						panel6.add(area3);
						panel6.setBackground(new Color(35,57,93));
						panel6.setBounds(470, 470, 200, 200);
						panel6.setVisible(true);
						
						//panel7
						panel7.add(area4);
						panel7.setBackground(new Color(35,57,93));
						panel7.setBounds(680, 470, 200, 200);
						panel7.setVisible(true);
						
						//panel8
						panel8.add(label5);
						panel8.setBackground(new Color(35,57,93));
						panel8.setBounds(670, 100, 400, 300);
						panel8.setVisible(true);
						
						//panel9
						panel9.add(area5);
						panel9.setBackground(new Color(35,57,93));
						panel9.setBounds(890, 470, 200, 200);
						panel9.setVisible(true);
						
					}


	



public static void main(String[] args) {
	new CurugCisarua().frame();
	
}

}

	
 
	

