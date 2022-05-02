package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Template extends JComponent { // �rver jcomponent


	public Template() { // konstruktor

		setPreferredSize(new Dimension(400,400) ); // s�tter storlek p� jcomponent
	}

	@Override
	protected void paintComponent(Graphics g) { // metod f�r att rita

		super.paintComponent(g);// ritar om f�r�lder

		//g.setColor(new Color(240,45,67));
		g.setColor(Color.green);
		g.fillRect(200, 200, 50, 50);
		g.setColor(Color.black);
		g.drawLine(30, 30, 100, 100);
		g.fillOval(40, 40, 100, 30);
	}


	public static void main(String[] args) {

		JFrame f=new JFrame(); //main  har en jframe
		f.setVisible(true); // synlighet
		f.setLayout(new FlowLayout());// placering av komponenter
		Template t=new Template(); // skapar objekt av klassen
		f.add(t); // l�gger till jcomponent till jframe
		f.pack(); // s�tter storlek p� jframe utifr�n storleken p� jcomponenten
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}
}
