package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare extends JFrame {

	JLabel l1 = new JLabel(new ImageIcon("bild1.jpg"));
	JButton b1 = new JButton("bytbild");

	boolean toggleState=true;

	public Bildväxlare() {

		setLayout(new FlowLayout());
		setSize(new Dimension(1000,1000));
		setVisible(true);

		add(l1);
		add(b1);

		b1.addActionListener(e->{

			if (toggleState==true) {

				l1.setIcon(new ImageIcon("bild2.jpg"));
				toggleState=false;

			}else {
				l1.setIcon(new ImageIcon("bild1.jpg"));
				toggleState=true;

			}



		});


	}



	public static void main(String[] args) {

		new Bildväxlare();

	}
}
