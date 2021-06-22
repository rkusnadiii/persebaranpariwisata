import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KecamatanSamarang extends JFrame {

	public KecamatanSamarang() {
		JFrame Frame;
	}
	
	private void getframe() {
		
		//icon1 
		
		ImageIcon icon = new ImageIcon("src/Samarang.png");
		Image icon1 = icon.getImage();
		Image modified = icon1.getScaledInstance(1000, 650, 100);
		icon = new ImageIcon(modified);
				
		//frame
		getPreferredSize();// agar sesuai ukuran ketika minimize
		setBounds(0,0, 1280, 720);// membuat ukuran frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane(); // memunculkan objek
		setResizable(false);
		con.setBackground(new Color(35,57,93));
		JLabel label1 = new javax.swing.JLabel();
		JPanel panel1 = new javax.swing.JPanel();
		
		//label1
		
		label1.setIcon(icon);
		label1.setBounds(0, 0, 800, 600);
		label1.setVisible(true);
		
		//panel1
		panel1.add(label1);
		panel1.setVisible(true);
		panel1.setBackground(new Color(35,57,93));
		panel1.setBounds(0, 0, 800, 600);
		
		
		//con
		con.add(label1);
	
	}
	
	public static void main(String[] args) {
		new KecamatanSamarang().getframe();
	}
	
	private void serDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}}
