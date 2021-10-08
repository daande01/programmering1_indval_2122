package uppgifter;

import java.util.Scanner;

public class Upp31 {

	public static void main(String[] args) {

		double [] d = new double[3];

		Scanner sc = new Scanner(System.in);

		System.out.println("ange ett tal");
		d[0]=sc.nextDouble();

		System.out.println("ange ett tal");
		d[1]=sc.nextDouble();

		System.out.println("ange ett tal");
		d[2]=sc.nextDouble();

		double summa = d[0]+d[1]+d[2];

		double medelvärde= summa/3;

		System.out.println("summa :" +summa+" medel:"+medelvärde);

	}



}
