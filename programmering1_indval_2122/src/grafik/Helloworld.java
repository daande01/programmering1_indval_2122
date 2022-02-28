package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Helloworld extends JFrame {

	private int antal=0;
	private JLabel  l1= new JLabel("hej");
	private JButton b1=new JButton("-");
	private JButton b2=new JButton("+");

public Helloworld() {

	l1.setText(""+antal);
	setVisible(true);
	setLayout(new FlowLayout());
	setSize(new Dimension(400,400));
	l1.setFont(new Font("Arial", Font.BOLD, 55));
	this.add(l1);
	this.add(b1);
	this.add(b2);
	b1.addActionListener(e->{

		antal=antal-1;
		l1.setText(""+antal);

	});

	b2.addActionListener(e->{

		antal = antal+1;
		l1.setText(""+antal);
	});


}




public static void main(String[] args) {

new Helloworld();

}
}
