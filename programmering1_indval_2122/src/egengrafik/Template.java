package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Template extends JComponent {


	public Template() {

		setPreferredSize(new Dimension(400,400) );
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		//g.setColor(new Color(240,45,67));
		g.setColor(Color.green);
		g.fillRect(200, 200, 50, 50);
		g.setColor(Color.black);
		g.drawLine(30, 30, 100, 100);
		g.fillOval(40, 40, 100, 30);
	}


	public static void main(String[] args) {

		JFrame f=new JFrame();
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		Template t=new Template();
		f.add(t);
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}
}
