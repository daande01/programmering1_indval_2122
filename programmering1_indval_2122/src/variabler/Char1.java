package variabler;

public class Char1 {


	public static void main(String[] args) {


	String s1="sär";
	String s2="skrivning";

		char c	=s1.charAt(1); // plockar ett tecken

		String s3 =s2.substring(2,6); // plockar del av ord utofrån angivet index

		int i    =s2.length();// returnerar längden på s2

		         int i1  =s2.lastIndexOf('ä');// anger vilken pos ett tecken finns på

	System.out.println(i1);

	}

}
