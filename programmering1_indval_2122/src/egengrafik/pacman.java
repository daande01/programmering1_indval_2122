package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class pacman extends JComponent {

	public pacman() {

		setPreferredSize(new Dimension(400,400));

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 100, 100);

		int xPoints[]= {100,150,100};
		int yPoints[]= {125,150,175 };
		g.setColor(this.getBackground());
		g.fillPolygon(xPoints, yPoints,3);


	}



	public static void main(String[] args) {

		  pacman p=new pacman();
		JFrame f= new JFrame();
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.add(p);
		f.pack();

	}


}
