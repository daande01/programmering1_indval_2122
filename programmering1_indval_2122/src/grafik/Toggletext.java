package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Toggletext extends JFrame {

	boolean   toggleState= true;

	JButton b1= new JButton("click");
	JLabel l1 = new JLabel("hund");

	public Toggletext() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		add(b1);
		add(l1);
		b1.addActionListener(e->{

			if(toggleState== true) {

				l1.setText("katt");
				toggleState= false;

			}else {

				l1.setText("hund");
				toggleState= true;

			}




		});

	}



	public static void main(String[] args) {

		new Toggletext();

	}

}
