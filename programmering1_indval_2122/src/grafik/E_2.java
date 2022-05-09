package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_2 extends JFrame {

	JTextField t1= new JTextField(30);
	JButton  b1= new JButton("send");
	JLabel  l1 = new JLabel("svar:");


	public E_2() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,500));
		add(t1);
		add(b1);
		add(l1);

		b1.addActionListener(e->{

			String text = t1.getText();
			int tal  =Integer.parseInt(text);
			int svar = tal*10;

			l1.setText("svar:"+svar);

		});



	}



	public static void main(String[] args) {

		new E_2();
	}

}
