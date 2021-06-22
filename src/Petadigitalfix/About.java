package Petadigitalfix;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class About extends JFrame {
	public About() {
		JFrame Frame;
		JPanel Panel;
		JLabel Label;
	}


	public void getFrame(){
		this.getContentPane().setLayout(new FlowLayout());
		JTextArea area = new JTextArea("Proyek peta digital ini merupakan proyek yang dilakukan oleh Dinas Pariwisata & Kebudayaan Kabupaten Garut untuk memperkenalkan destinasi wisata yang berada di berbagai kecamatan di kabupaten garut yang meliputi aspek Akomodasi , Wilayah, Tipe Atraksi dan juga aksesbilitas, selain itu juga proyek peta digital ini  diharapkan dapat memperkenalkan atraksi wisata yang ada di kabupaten garut kepada wisatawan");
		area.setFont(new Font("Arial",Font.PLAIN,14));
		area.setForeground(new Color(242,110,1));
		area.setBackground(new Color(35,57,93));
		area.setBounds(0,0,500,500);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setEditable(false);
		
		ImageIcon icon2 = new ImageIcon("src/Pesona Garut.png");
		Image iconrubah = icon2.getImage();
		Image modified2 = iconrubah.getScaledInstance(120, 80, 900);
		icon2 = new ImageIcon(modified2);
		
		JPanel p = new JPanel();
		p.setBorder(BorderFactory.createEmptyBorder(120, 20, 20, 20));
		p.add(area, BorderLayout.CENTER);
		p.setBackground(new Color(35,57,93));
		p.setBounds(0,0,800,800);
		p.setVisible(true);
		
		JFrame f = new JFrame();
		f.setBounds(0,0,600,400);
		f.setBackground(new Color(35,57,93));
		f.add(p, BorderLayout.CENTER);
		f.setVisible(true);
		f.setTitle("Peta Digital Kabupaten Garut");
		f.setIconImage(modified2);
		
	}

	public static void main(String[] args) {
		new About().getFrame();
	}
}