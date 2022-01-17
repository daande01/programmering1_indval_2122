package loopar;

import java.util.Arrays;
import java.util.Scanner;

public class LoopInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i[]=new int[3];

		for(int k=0;k<i.length;k++) {

		System.out.println("ange ett tal");
		i[k]=input.nextInt();

		}
		System.out.println(Arrays.toString(i));
	}
}
