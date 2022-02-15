package metoder;

public class ptov2uppC1 {

	public static String kvarTillFödelsedag(String personnummer) {

		String idag = java.time.LocalDateTime.now().toString();

		System.out.println(idag);

		String månad = idag.substring(5, 7);
		System.out.println(månad);
		int månadInt = Integer.parseInt(månad);

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
		System.out.println(text);
		return "";

	}

	public static void main(String[] args) {

		kvarTillFödelsedag("820412");

	}
}
