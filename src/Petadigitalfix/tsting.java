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

public class tsting extends JFrame {
	

	public tsting() {
		JFrame Frame;
	}

	 void getFrame() {
		
		//icon1
		ImageIcon icon = new ImageIcon("src/Logo1.png");
		Image icon1 = icon.getImage();
		Image modified = icon1.getScaledInstance(200, 200, 900);
		icon = new ImageIcon(modified);
		// icon2
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
		//icon5
		ImageIcon icon5 = new ImageIcon("src/Jawa Barat.png");
		Image iconrubah5 = icon5.getImage();
		Image modified5 = iconrubah5.getScaledInstance(170, 170, 900);
		icon5 = new ImageIcon(modified5);
		// frame
		getPreferredSize();// agar sesuai ukuran ketika minimize
		setBounds(0,0, 1280, 720);// membuat ukuran frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new javax.swing.JLabel();
		JButton button1 = new javax.swing.JButton ("Peta Digital");
		JButton button2 = new javax.swing.JButton ("Exit");
		JButton button3 = new javax.swing.JButton ("About");
		JPanel panel1 = new javax.swing.JPanel ();
		JPanel panel2 = new javax.swing.JPanel ();
		JPanel panel3 = new javax.swing.JPanel ();
		JPanel panel4 = new javax.swing.JPanel ();
		JPanel panel5 = new javax.swing.JPanel ();
		JLabel label2 = new javax.swing.JLabel ();
		JLabel label3 = new javax.swing.JLabel ();
		JLabel label4 = new javax.swing.JLabel ();
		JLabel label5 = new javax.swing.JLabel ();
		JLabel label6 = new javax.swing.JLabel ();
		JLabel label7 = new javax.swing.JLabel ();
		JLabel label8 = new javax.swing.JLabel ();
		Container con = getContentPane(); // memunculkan objek
		setResizable(false);
		con.setBackground(new Color(35,57,93));
		
	
		//button1
		button1.setBounds(553, 420, 150, 50);
		button1.setVisible(true);
		
		//button2
		button2.setBounds(553, 530, 150, 50);
		button2.setVisible(true);
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button2ActionPerformed(evt);
			}
		private void button2ActionPerformed(ActionEvent evt) {
			System.exit(0);
		}});
		
		
		//button3
		button3.setBounds(553,475,150,50);
		button3.getPreferredSize();
		button3.setVisible(true);
		button3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				button3ActionPerformed(evt);
			}

			private void button3ActionPerformed(ActionEvent evt) {
				About a = new About();
				a.getFrame();
			}});


		
		

		//label1
		label1.setIcon(icon);
		label1.setBounds(0, 0, 200, 200);
		label1.setVisible(true);
		
		
		
		//label2
		label2.setText("Peta Digital Kabupaten Garut");
		label2.setBounds(0, -10, 500, 100);
		label2.setFont(new Font("Arial",Font.PLAIN,30));
		label2.setForeground(new Color(242,110,1));
		
		//label3
		label3.setText("Peta Digital Potensi Kabupaten Garut");
		label3.setFont(new Font("Arial",Font.PLAIN,24));
		label3.setForeground(new Color(242,110,1));
		label3.setBounds(440, 230, 1000, 300);
		
		//label4
		label4.setIcon(icon2);
		label4.setBounds(0,0, 120, 80);
		label4.setVisible(true);
		
		//label5
		label5.setIcon(icon3);
		label5.setBounds(0,0, 120,80);
		label5.setVisible(true);
		
		//label6
		label6.setIcon(icon4);
		label6.setBounds(0, 0, 120, 80);
		label6.setVisible(true);
		
		//label7
		label7.setText("Dinas Pariwisata & Kebudayaan Kabupaten Garut 2021");
		label7.setFont(new Font("Arial",Font.PLAIN,18));
		label7.setForeground(new Color(242,110,1));
		label7.setBounds(420, 500, 1000, 300);
		
		//label8
		label8.setIcon(icon5);
		label8.setBounds(0, 0, 200, 200);
		label8.setVisible(true);
		
		//panel1
		panel1.add(label1);
		panel1.setVisible(true);
		panel1.setBackground(new Color(35,57,93));
		panel1.setBounds(440, 170, 200, 200);
		
		//panel2
		panel2.add(label4);
		panel2.setVisible(true);
		panel2.setBackground(new Color(35,57,93));
		panel2.setBounds(1140, 0, 120, 80);
		
		//panel3
		panel3.add(label5);
		panel3.setVisible(true);
		panel3.setBackground(new Color(35,57,93));
		panel3.setBounds(1000,10, 120, 80);
		
		//panel4
		panel4.add(label6);
		panel4.setVisible(true);
		panel4.setBackground(new Color(35,57,93));
		panel4.setBounds(870,10,120 ,80);
		
		//panel5
		panel5.add(label8);
		panel5.setVisible(true);
		panel5.setBackground(new Color(35,57,93));
		panel5.setBounds(650, 150, 200, 200);
		
		
		//con
		con.add(label2);
		con.add(label3);
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);
		con.add(panel5);
		con.add(label7);
		con.add(button1);
		con.add(button2);
		con.add(button3);
	}

	

	public static void main(String[] args) {
		new tsting().getFrame();
	}

	private void serDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}

	
