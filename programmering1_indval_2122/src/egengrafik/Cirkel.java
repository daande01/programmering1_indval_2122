package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Cirkel extends JComponent {
	int y = 100;
	int x = 100;

	Timer t;

	public Cirkel () {


	t=new Timer(3000, e->{

		update();
		System.out.println("funkar");

	});

	t.start();

	}


	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillOval(x, y, 50, 50);

	}

	public void update() {

		y=y+1;
		repaint();
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("hej");
		f.setSize(new Dimension(400, 400));
		f.setLayout(new FlowLayout());
		f.setVisible(true);

		Cirkel c = new Cirkel();
		f.setContentPane(c);






	}

}
