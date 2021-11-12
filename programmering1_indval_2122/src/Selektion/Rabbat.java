package Selektion;

import javax.swing.JOptionPane;

public class Rabbat {

	public static void main(String[] args) {

		double produkt = 0;

		String prisString = JOptionPane.showInputDialog("ange varans pris");

		produkt = Double.parseDouble(prisString);

		if (produkt >= 10000 && produkt < 100000) {
			produkt = produkt * 0.9;
		} else if (produkt >= 100000) {

				produkt = produkt * 0.5;
			}


		System.out.println("priset blir " + produkt + "kr");

	}

}
