package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Löpning extends JFrame {

	JLabel l1= new JLabel("mata in tid för första löparen");
	JLabel l2= new JLabel("mata in tid för andra löparen");
	JLabel l3= new JLabel("mata in tid för tredje löparen");
	JTextField t1=new JTextField(20);
	JTextField t2=new JTextField(20);
	JTextField t3=new JTextField(20);
	JButton b1= new JButton("beräkna medel tid");

	public Löpning() {

		setLayout(new FlowLayout());
		setSize(new Dimension(500,300));
		setVisible(true);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);

		b1.addActionListener(e->{

			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();

			int tid1= Integer.parseInt(s1);
			int tid2= Integer.parseInt(s2);
			int tid3= Integer.parseInt(s3);

			double medel= (tid1+tid2+tid3) /3;

			b1.setText(""+medel);

		});

	}





	public static void main(String[] args) {
		new Löpning();
	}
}
