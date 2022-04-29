package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Textinput extends JFrame {


	JTextField t1= new JTextField(30);
	JTextField t2= new JTextField(30);
	JButton b1= new JButton("click");
	JLabel l1 = new JLabel("summa=0");

	public Textinput() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		add(b1);
		add(l1);
		add(t1);
		add(t2);
		b1.addActionListener(e->{

				String text1=t1.getText();
				int tal1=Integer.parseInt(text1);

				String text2=t2.getText();
				int tal2 = Integer.parseInt(text2);

				int summa = tal1+tal2;

				l1.setText(" summa="+summa);

		});

	}



	public static void main(String[] args) {

		new Textinput();

	}

}
