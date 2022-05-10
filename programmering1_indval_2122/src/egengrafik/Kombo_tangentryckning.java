package egengrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo_tangentryckning extends JComponent implements KeyListener {

	private int x = 200;

	public Kombo_tangentryckning() {

		this.setPreferredSize(new Dimension(600, 600));
		this.addKeyListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.fillRect(x, 200, 50, 50);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			System.out.println("up");
			x += 20;
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

	public static void main(String[] args) {

		JFrame f = new JFrame("sdsdsds");
		Kombo_tangentryckning k = new Kombo_tangentryckning();
		f.setVisible(true);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		JButton b = new JButton("\u261E");
		p.add(b);
		f.addKeyListener(k);
		b.addActionListener(e -> {

			k.x += 20;
			k.repaint();
			k.requestFocusInWindow();
		});

		p.add(k);
		f.add(p);
		f.pack();

	}

}
