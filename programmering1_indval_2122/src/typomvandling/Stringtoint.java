package typomvandling;

public class Stringtoint {

	public static void main(String[] args) {

		double str�cka=5.9;

		String miltal= Double.toString(str�cka);// omvandlar double->string

		String s = ""+str�cka;  // omvandlar double -> String

		String �rtal="1989";

		int heltal = Integer.valueOf(�rtal); // omvandlar String-> int

		int heltal2= Integer.parseInt(�rtal); // omvandling String-> int

	}


}
