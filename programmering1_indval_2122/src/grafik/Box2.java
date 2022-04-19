package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Box2 extends JComponent implements KeyListener {

	private int x=20;
	private int y=20;

	public Box2() {
		addKeyListener(this);
		this.setPreferredSize(new Dimension(400,400));
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.fillRect(x, y, 100, 100);
	}

	public void move() {

		x=x+10;
		y=y+10;
		repaint();

	}






public static void main(String[] args) {

	        Box2 b1=new Box2();

	        JFrame f= new JFrame("box2");
	        f.setVisible(true);
	        f.setLayout(new FlowLayout());
	        JButton knapp=new JButton("move");
	        f.add(knapp);
	        f.add(b1);
	        f.pack();
	        f.addKeyListener(b1);

	        knapp.addActionListener(e->{
	        	b1.move();
	        	b1.requestFocusInWindow(true);
	        });






}

@Override
public void keyPressed(KeyEvent e) {

	System.out.println("test");
	if(e.getKeyCode() == KeyEvent.VK_UP) {

		x=x+5;
		repaint();

	}

}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

}





}

