package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Toggletext extends JFrame { //skapar class ärver jframe klass

	boolean   toggleState= true; // skapar variabel av typen boolean tilldelar värdet true

	JButton b1= new JButton("click"); //skapar en knapp alltså ett objekt av klassen jbutton skickar texten "click" som inparameter till konstruktor
	JLabel l1 = new JLabel("hund");  // textruta

	public Toggletext() { // konstruktor körs när man skapar ett objekt av klassen

		this.setLayout(new FlowLayout()); // sätter layout på klassen
		setVisible(true);// synlig
		setSize(new Dimension(400,400)); //sätter storlek på jframe
		add(b1); //lägger till b1 knappen till rutan (Jframen)
		add(l1);//lägger till l1 knappen till rutan (Jframen)
		b1.addActionListener(e->{

			if(toggleState== true) {

				l1.setText("katt");
				toggleState= false;

			}else {

				l1.setText("hund");
				toggleState= true;

			}




		});

	}



	public static void main(String[] args) {

		new Toggletext();

	}

}
