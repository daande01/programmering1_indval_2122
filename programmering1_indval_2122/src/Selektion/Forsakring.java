package Selektion;

import java.util.Scanner;

public class Forsakring {

	public static void main(String[] args) {


		Scanner input= new Scanner(System.in);
		System.out.println("ange åldern på din bil så ger jag förslag på försäkring.");
		int bilÅlder = input.nextInt();

		if(bilÅlder>=13) {

			System.out.println("du bör välja en trafikföräkring");

		}else if( (bilÅlder<=3)  &&  (bilÅlder>=0) ) {

			System.out.println("du bör välja en halvförsäkring");
		}else if(bilÅlder>3 && bilÅlder<13){
			System.out.println("välj helförsäkring");
		}





	}

}
