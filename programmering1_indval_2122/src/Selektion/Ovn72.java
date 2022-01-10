package Selektion;

import javax.swing.JOptionPane;

public class Ovn72 {

	public static void main(String[] args) {

		int tankvolym=50;
		double prisPerLiter=9.5;


		String kvarString=JOptionPane.showInputDialog("hur mycket bränsle kvar");

		int bränslekvar=Integer.parseInt(kvarString);



		if(bränslekvar >10) {

			JOptionPane.showMessageDialog(null, "kör vidare");
		}else {

			int hurMycketKanFyllas=tankvolym-bränslekvar;
			double kostnad=hurMycketKanFyllas*prisPerLiter;

			JOptionPane.showMessageDialog(null, "du bör tanka, du kan tanka"+hurMycketKanFyllas+"liter ,det kommer kosta "+kostnad);

		}


	}



}
