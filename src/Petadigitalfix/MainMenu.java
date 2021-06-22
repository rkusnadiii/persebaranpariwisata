package Petadigitalfix;

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
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.Dimension;
	import java.awt.FlowLayout;

	import javax.swing.ImageIcon;
	import javax.swing.JFrame;



	public class MainMenu extends JFrame {
		
		public MainMenu() {
		
			
		}
			
			
		void frame() {
			
			Container con = getContentPane(); // memunculkan objek
			con.setBackground(new Color(35,57,93)); 
			
			//icon
			
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
					//icon5
					ImageIcon icon5 = new ImageIcon("src/Jawa Barat.png");
					Image iconrubah5 = icon5.getImage();
					Image modified5 = iconrubah5.getScaledInstance(170, 170, 900);
					icon5 = new ImageIcon(modified5);
					//icon6
					ImageIcon icon6 = new ImageIcon("src/Logo Kabupaten Garut.png");
					Image iconrubah6 = icon6.getImage();
					Image modified6 = iconrubah6.getScaledInstance(300, 200, 900);
					icon6 = new ImageIcon(modified6);
				
	
					
			JButton button1 = new JButton ("Peta Digital");
			JButton button2 = new JButton ("Exit");
			JButton button3 = new JButton ("About");	
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
			JLabel label8 = new JLabel();
			JLabel label9 = new JLabel();
			JLabel label10 = new JLabel();
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
			
			
			//button1
			button1.setBounds(553, 420, 150, 50);
			button1.setVisible(true);
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
					label4.setBounds(0, 0, 200, 200);
					label4.setVisible(true);
			
					
					
			//label5
					label5.setText("Peta Digital Kabupaten Garut");
					label5.setBounds(0, 0, 500, 100);
					label5.setFont(new Font("Arial",Font.PLAIN,30));
					label5.setForeground(new Color(242,110,1));
					
			//label6
					label6.setText("Peta Digital Potensi Kabupaten Garut");
					label6.setFont(new Font("Arial",Font.PLAIN,24));
					label6.setForeground(new Color(242,110,1));
					label6.setBounds(440, 230, 1000, 300);
			//label7
					label7.setText("Dinas Pariwisata & Kebudayaan Kabupaten Garut 2021");
					label7.setFont(new Font("Arial",Font.PLAIN,18));
					label7.setForeground(new Color(242,110,1));
					label7.setBounds(420, 480, 1000, 300);
					
			//label9
					label9.setIcon(icon5);
					label9.setBounds(0, 0, 200, 200);
					label9.setVisible(true);
			
					
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
			panel3.add(label9);
			panel3.setVisible(true);
			panel3.setBackground(new Color(35,57,93));
			panel3.setBounds(630, 185, 200, 200);
			
			
			//panel4
			panel4.add(label4);
			panel4.setVisible(true);
			panel4.setBackground(new Color(35,57,93));
			panel4.setBounds(440, 170, 200, 200);
			
			
			
			
			
			
		
			
		}

		public static void main(String[] args) {
			new MainMenu().frame();
		}
		
	}
		





		


