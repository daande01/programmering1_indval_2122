package metoder;

public class Teststatic {

	static final int antal=10;

	public static void stars() {

		for (int i = 0; i < antal; i++) {

			System.out.print("*");
		}

		antal=20;
	}

	public static void pipe() {

		for (int i = 0; i < antal; i++) {

			System.out.print("|");
		}

	}

	public static void main(String[] args) {

		stars();

		pipe();

	}

}
