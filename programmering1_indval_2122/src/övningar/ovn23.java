package �vningar;

import java.util.Scanner;

public class ovn23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ange din �lder:");

		int �lder = sc.nextInt();  //37

		int tal1= �lder/10;  // 3

		int tal2= (1+tal1)*10;

		int �rkvar=tal2-�lder;

		System.out.println(tal2  +"�r kvar"+�rkvar);





	}

}
