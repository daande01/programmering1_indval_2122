package variabler;

public class Char1 {


	public static void main(String[] args) {


	String s1="s�r";
	String s2="skrivning";

		char c	=s1.charAt(1); // plockar ett tecken

		String s3 =s2.substring(2,6); // plockar del av ord utofr�n angivet index

		int i    =s2.length();// returnerar l�ngden p� s2

		         int i1  =s2.lastIndexOf('�');// anger vilken pos ett tecken finns p�

	System.out.println(i1);

	}

}
