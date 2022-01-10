package loopar;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {

		int summa=0;
		Scanner sc = new Scanner(System.in);

		for(int i =0; i<3; i++) {

		int k = i+1;
		System.out.println("ange tal"+k);
		summa=summa+ sc.nextInt();

		}

		System.out.println(summa);



	}

}
