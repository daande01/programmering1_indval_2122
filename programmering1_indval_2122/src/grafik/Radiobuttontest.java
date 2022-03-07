package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Radiobuttontest extends JFrame {

	JRadioButton b1 = new JRadioButton("fotboll");
	JRadioButton b2 = new JRadioButton("pingis");
	JRadioButton b3 = new JRadioButton("handboll");
	JButton knapp  = new JButton("välj");
	JLabel   l1 = new JLabel();
	ButtonGroup grupp=new ButtonGroup();

	public Radiobuttontest() {

		setLayout(new FlowLayout());
		setSize(new Dimension(400,400));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(b1);
		add(b2);
		add(b3);
		add(knapp);
		add(l1);

		grupp.add(b1);
		grupp.add(b2);
		grupp.add(b3);

		knapp.addActionListener(e->{

			if (b1.isSelected()) {

				l1.setText("du har valt fotboll");
			}


		});







	}


	public static void main(String[] args) {
		new Radiobuttontest();
	}
}
