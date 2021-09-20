package userinput;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ange ditt namn:");

		String name =sc.nextLine();

		System.out.println("ange din ålder:");

		       int ålder=sc.nextInt();

		System.out.println("enge mängden pengar på banken");

			double pengar=sc.nextDouble();

		System.out.println("personen heter "+name+"och är "+ålder+" år gammal och inne har"+pengar+" kr");

	}


}
