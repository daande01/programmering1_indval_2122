package övningar;

import java.util.Scanner;

public class ovn23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ange din ålder:");

		int ålder = sc.nextInt();  //37

		int tal1= ålder/10;  // 3

		int tal2= (1+tal1)*10;

		int årkvar=tal2-ålder;

		System.out.println(tal2  +"år kvar"+årkvar);





	}

}
