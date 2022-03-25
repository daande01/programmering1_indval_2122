package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Cirkel extends JComponent {

	private int y = 100; // instansvariabel
	private int x = 100; // instansvariabel
	private int xv=1;
	private int yv=1;

	Timer t;

// konstruktor
	public Cirkel() {

		setPreferredSize(new Dimension(400,400));
		t = new Timer(20, e -> {

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

		y=y+yv;
		x=x+xv;

		if((y+50)>=400) {

			yv=yv*-1;
		}


		repaint();
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("hej");
		f.setSize(new Dimension(400, 400));
		f.setLayout(new FlowLayout());
		f.setVisible(true);

		Cirkel c = new Cirkel();
		f.setContentPane(c);
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

}
