package metoder;

public class ptov2uppC1 {

	public static String kvarTillF�delsedag(String personnummer) {

		String idag = java.time.LocalDateTime.now().toString();

		System.out.println(idag);

		//plockar ut m�nad fr�n dagens datum
		String m�nad = idag.substring(5, 7);
		System.out.println(m�nad);
		int m�nadInt = Integer.parseInt(m�nad);

		//plockar ut dag fr�n dagens datum
		String dag = idag.substring(5, 7);
		System.out.println(dag);
		int dagInt = Integer.parseInt(dag);

		//plockar ut dagen fr�n personnummer

		String dagPerson = personnummer.substring(4, 6);
		System.out.println(dagPerson);
		int dagPersonInt = Integer.parseInt(dagPerson);

		//plovkar ut m�naden fr�n personnummer

		String m�nadPerson = personnummer.substring(2, 4);
		System.out.println(m�nadPerson);
		int m�nadPersonInt = Integer.parseInt(m�nadPerson);
		System.out.println(m�nadPersonInt);

		String text = "m�nader kvar"+(m�nadPersonInt-m�nadInt)+"dagar kvar"+(dagPersonInt-dagInt);

		return text;

	}

	public static void main(String[] args) {

		String text=kvarTillF�delsedag("820412");

		System.out.println(text);
	}
}
