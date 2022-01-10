package loopar;

import java.util.Arrays;
import java.util.Scanner;

public class Loop2array {

	public static void main(String[] args) {

		int talArr []  =new int [3];

		Scanner input= new Scanner(System.in);

		for(int i=0;i<3;i++) {

		System.out.println("ange ett tal");
		talArr[i]=input.nextInt();
		}

		System.out.println(Arrays.toString(talArr));
	}



}
