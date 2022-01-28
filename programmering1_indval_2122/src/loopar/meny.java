package loopar;

import java.util.Scanner;

public class meny {

	public static void main(String[] args) {
		int val=4;
		Scanner input= new Scanner(System.in);

		while(val!=4) {
		System.out.println(" 1:uttag \n 2:saldo \n 3:insättning 4:avsluta");
		 val=input.nextInt();

		switch(val) {

		case 1:
				System.out.println("uttag");
				break;

		case 2:
				System.out.println("saldo");
				break;

		case 3:
				System.out.println("insättning");
				break;

		case 4:
				System.out.println("avsluta");
				break;

		default:
				System.out.println("du har valt fel");
		}

		}


	}



}
