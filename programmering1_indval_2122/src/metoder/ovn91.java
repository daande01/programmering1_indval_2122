package metoder;

import java.util.Scanner;

public class ovn91 {


	public static void basYtaCylinder(double radie) {

		double area= Math.pow(radie,2)*Math.PI;

		System.out.println("arean blir"+area);

	}

	public static int getAreaRektangel(int a, int b) {

		int area=a*b;

		return area;
	}



	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ange en radie");
		double r=input.nextDouble();

		basYtaCylinder(r);

		int a=getAreaRektangel(10, 10);

		System.out.println("arean av en rektangel blir"+a);
	}
}
