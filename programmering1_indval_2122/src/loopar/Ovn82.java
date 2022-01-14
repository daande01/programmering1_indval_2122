package loopar;

import java.util.Scanner;

public class Ovn82 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ange startvärde för loopen");
		int start=input.nextInt();

		System.out.println("ange slutvärde för loopen");
		int slut=input.nextInt();

		System.out.println("ange färändringsvärde för loopen");
		int förändringsvärde=input.nextInt();


		for (int i = start; i < slut; i=i+förändringsvärde) {

			System.out.println(i);
		}




	}

}
