package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Toggletext2 extends JFrame {



	JButton b1= new JButton("click");
	JLabel l1 = new JLabel("hund");

	public Toggletext2() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		add(b1);
		add(l1);
		b1.addActionListener(e->{

			if(l1.getText().equals("hund")) {

				l1.setText("katt");


			}else {

				l1.setText("hund");


			}




		});

	}



	public static void main(String[] args) {

		new Toggletext2();

	}

}
