package övningar;

import java.util.Scanner;

public class Ovn24 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("ange tre tal ");

	int tal1 = sc.nextInt();

	int tal2 = sc.nextInt();

	int tal3 = sc.nextInt();

	int summa = tal1+tal2+tal3;

	double medel = summa/3.0;

	int avrundad = (int) (medel+0.5);

	System.out.println(summa+" "+ medel);
	}

}
