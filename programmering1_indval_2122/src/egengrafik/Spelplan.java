package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Spelplan extends JComponent {

	Boll []  b=new Boll[1000];


	public Spelplan() {

		setPreferredSize(new Dimension(800,800));

		for(int i = 0; i<1000;i++) {

			int x=(int)(Math.random()*800);
					int xv;
			if((x%10)==0) {

				xv=(int)(Math.random()*9)*-1;

			}else {
				xv=(int)(Math.random()*9);
			}



		b[i]=new Boll(x,
				(int)(Math.random()*800),
				new Color((int)(Math.random()*255),
						  (int)(Math.random()*255),
						  (int)(Math.random()*255) ),
				(int)(Math.random()*50),
				xv,
				(int)(Math.random()*9));

		}


		Timer t= new Timer(50, e->{


		for (Boll boll : b) {

			boll.update();

		}
		repaint();
		});
		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		for (Boll boll : b) {
			boll.rita(g);
		}
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
