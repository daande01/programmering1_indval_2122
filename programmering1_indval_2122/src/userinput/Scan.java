package userinput;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ange ditt namn:");

		String name =sc.nextLine();

		System.out.println("ange din �lder:");

		       int �lder=sc.nextInt();

		System.out.println("enge m�ngden pengar p� banken");

			double pengar=sc.nextDouble();

		System.out.println("personen heter "+name+"och �r "+�lder+" �r gammal och inne har"+pengar+" kr");

	}


}
