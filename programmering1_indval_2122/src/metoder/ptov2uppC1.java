package metoder;

public class ptov2uppC1 {

	public static String kvarTillFödelsedag(String personnummer) {

		String idag = java.time.LocalDateTime.now().toString();

		System.out.println(idag);

		//plockar ut månad från dagens datum
		String månad = idag.substring(5, 7);
		System.out.println(månad);
		int månadInt = Integer.parseInt(månad);

		//plockar ut dag från dagens datum
		String dag = idag.substring(5, 7);
		System.out.println(dag);
		int dagInt = Integer.parseInt(dag);

		//plockar ut dagen från personnummer

		String dagPerson = personnummer.substring(4, 6);
		System.out.println(dagPerson);
		int dagPersonInt = Integer.parseInt(dagPerson);

		//plovkar ut månaden från personnummer

		String månadPerson = personnummer.substring(2, 4);
		System.out.println(månadPerson);
		int månadPersonInt = Integer.parseInt(månadPerson);
		System.out.println(månadPersonInt);

		String text = "månader kvar"+(månadPersonInt-månadInt)+"dagar kvar"+(dagPersonInt-dagInt);

		return text;

	}

	public static void main(String[] args) {

		String text=kvarTillFödelsedag("820412");

		System.out.println(text);
	}
}
