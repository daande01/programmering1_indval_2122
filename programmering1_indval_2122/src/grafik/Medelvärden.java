package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Medelvärden extends JFrame {

	JButton b1 = new JButton("calculate avg");
	JLabel l1 = new JLabel("");
	JTextField t1= new JTextField(10);
	int arr[]=new int[1000];
	int k=0;
	public Medelvärden() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(500,500));
		add(t1);
		add(b1);
		add(l1);
		b1.addActionListener(e->{

			String tal=t1.getText();
			arr[k]=Integer.parseInt(tal);
			l1.setText(""+tal);
			k++;

			System.out.println(Arrays.toString(arr));
			int summa=0;
			for (int i = 0; i < arr.length; i++) {
				summa= summa+arr[i];
			}
			double medel= summa/(k+0.0)  ;
			l1.setText(""+medel);
		});
	}

	public static void main(String[] args) {
	Medelvärden mm	=new Medelvärden();
	}


}
