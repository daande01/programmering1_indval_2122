package Selektion;

import java.util.Scanner;

public class Forsakring {

	public static void main(String[] args) {


		Scanner input= new Scanner(System.in);
		System.out.println("ange �ldern p� din bil s� ger jag f�rslag p� f�rs�kring.");
		int bil�lder = input.nextInt();

		if(bil�lder>=13) {

			System.out.println("du b�r v�lja en trafikf�r�kring");

		}else if( (bil�lder<=3)  &&  (bil�lder>=0) ) {

			System.out.println("du b�r v�lja en halvf�rs�kring");
		}else if(bil�lder>3 && bil�lder<13){
			System.out.println("v�lj helf�rs�kring");
		}





	}

}
