package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Trafikljus extends JComponent {

	Timer t;
	int counter=0;

	//konstruktor
	public Trafikljus() {
		setPreferredSize(new Dimension(400,400));

		t= new Timer(1000, e->{

			counter++;

			if(counter==3) {
				counter=0;
			}
			System.out.println(counter);

			repaint();
		});
		t.start();

	}

	// paint metod
	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.fillRect(150, 150, 50, 150);

		if(counter ==0) {   /// gröntljus
			g.setColor(Color.GREEN);
			g.fillOval(155, 155, 40, 40);

			g.setColor(new Color(204,102,0));
			g.fillOval(155, 200, 40, 40);
			g.setColor(new Color(150,0,0));
			g.fillOval(155, 245, 40, 40);

		}
		if(counter ==1) {

			g.setColor(new Color(0,150,0));
			g.fillOval(155, 155, 40, 40);

			g.setColor(Color.ORANGE);
			g.fillOval(155, 200, 40, 40);
			g.setColor(new Color(150,0,0));
			g.fillOval(155, 245, 40, 40);

		}
		if(counter ==2) {
			g.setColor(new Color(0,150,0));
			g.fillOval(155, 155, 40, 40);
			g.setColor(new Color(204,102,0));
			g.fillOval(155, 200, 40, 40);
			g.setColor(Color.red);
			g.fillOval(155, 245, 40, 40);
		}










	}


	// main metod
	public static void main(String[] args) {

	JFrame f=new JFrame("trafikljus");
	f.setVisible(true);
	f.setLayout(new FlowLayout());
	Trafikljus t = new Trafikljus();
	f.add(t);
	f.pack();

	}

}
