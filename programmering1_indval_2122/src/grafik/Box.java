package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Box extends JComponent {

	private int x=20;
	private int y=20;

	public Box() {
		this.setPreferredSize(new Dimension(400,400));
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.fillRect(x, y, 50, 50);
	}

	public void move() {

		x=x+10;
		y=y+10;
		repaint();

	}






public static void main(String[] args) {

	        Box b1=new Box();

	        JFrame f= new JFrame();
	        f.setVisible(true);
	        f.setLayout(new FlowLayout());
	        JButton knapp=new JButton("move");
	        f.add(knapp);
	        f.add(b1);
	        f.pack();

	        knapp.addActionListener(e->{
	        	b1.move();

	        });






}

}

