package metoder;

public class ovn97 {

	public static String v�ndText(String text) {

		String bakl�nges = "";
		int k = text.length();

		for (int i = k - 1; i >= 0; i--) {

			bakl�nges = bakl�nges + "" + text.charAt(i);
			// System.out.println(bakl�nges);
		}

		//System.out.println(bakl�nges);

		return bakl�nges;
	}

	public static void main(String[] args) {

		String bak=v�ndText("sirap");

		System.out.println(bak);

	}

}
