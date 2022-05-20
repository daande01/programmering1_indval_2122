package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Majblomma extends JComponent {


	public Majblomma() {
		setPreferredSize(new Dimension(500,500));
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillOval(200, 200, 50, 50);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(230, 230, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(240, 210, 50, 50);
	}

	public static void main(String[] args) {

		JFrame f=new JFrame();
		Majblomma b=new Majblomma();
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.add(b);
		f.pack();


	}


}
