package Selektion;

public class compareStrings {

	public static void main(String[] args) {


	String s1="daniel";
	String s2="Daniel";

	s1=s1.toLowerCase();
	s2=s2.toLowerCase();

	if (s1.equals(s2)) {

		System.out.println("true");

	}else {

		System.out.println("false");
	}


	}
}
