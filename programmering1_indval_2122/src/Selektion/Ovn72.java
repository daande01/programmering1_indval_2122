package Selektion;

import javax.swing.JOptionPane;

public class Ovn72 {

	public static void main(String[] args) {

		int tankvolym=50;
		double prisPerLiter=9.5;


		String kvarString=JOptionPane.showInputDialog("hur mycket br�nsle kvar");

		int br�nslekvar=Integer.parseInt(kvarString);



		if(br�nslekvar >10) {

			JOptionPane.showMessageDialog(null, "k�r vidare");
		}else {

			int hurMycketKanFyllas=tankvolym-br�nslekvar;
			double kostnad=hurMycketKanFyllas*prisPerLiter;

			JOptionPane.showMessageDialog(null, "du b�r tanka, du kan tanka"+hurMycketKanFyllas+"liter ,det kommer kosta "+kostnad);

		}


	}



}
