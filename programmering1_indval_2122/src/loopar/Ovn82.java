package loopar;

import java.util.Scanner;

public class Ovn82 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ange startv�rde f�r loopen");
		int start=input.nextInt();

		System.out.println("ange slutv�rde f�r loopen");
		int slut=input.nextInt();

		System.out.println("ange f�r�ndringsv�rde f�r loopen");
		int f�r�ndringsv�rde=input.nextInt();


		for (int i = start; i < slut; i=i+f�r�ndringsv�rde) {

			System.out.println(i);
		}




	}

}
