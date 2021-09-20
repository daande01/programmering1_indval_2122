package övningar;

import java.util.Scanner;

public class Ovn22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ange ett tal");

		int tal = input.nextInt();

		//int svar = tal*tal;

		double svar = Math.pow(tal, 2);

		System.out.println("svaret blir :" +svar);

	}

}
