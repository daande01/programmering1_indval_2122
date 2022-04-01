package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Spelplan extends JComponent {

	Boll []  b=new Boll[20];


	public Spelplan() {

		setPreferredSize(new Dimension(800,800));

		for(int i = 0; i<20;i++) {

		b[i]=new Boll((int)(Math.random()*800),
				(int)(Math.random()*800),
				new Color((int)(Math.random()*255),
						  (int)(Math.random()*255),
						  (int)(Math.random()*255) ),
				(int)(Math.random()*50),
				(int)(Math.random()*9),
				(int)(Math.random()*9));

		}


		/// skapa timer


		for (Boll boll : b) {

			boll.update();

		}


	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("bollar");
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(new Spelplan());
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);


	}

}
