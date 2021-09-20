package userinput;

import javax.swing.JOptionPane;

public class Jop {

	public static void main(String[] args) {

	String tal1=JOptionPane.showInputDialog("ange ett tal");

	int tal1int=Integer.parseInt(tal1);

	int resultat= tal1int *10;

	JOptionPane.showMessageDialog(null,"svaret blir "+resultat);

	}

}
