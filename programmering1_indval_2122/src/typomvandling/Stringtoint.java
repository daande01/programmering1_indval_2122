package typomvandling;

public class Stringtoint {

	public static void main(String[] args) {

		double sträcka=5.9;

		String miltal= Double.toString(sträcka);// omvandlar double->string

		String s = ""+sträcka;  // omvandlar double -> String

		String årtal="1989";

		int heltal = Integer.valueOf(årtal); // omvandlar String-> int

		int heltal2= Integer.parseInt(årtal); // omvandling String-> int

	}


}
