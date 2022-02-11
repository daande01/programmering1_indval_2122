package metoder;

public class ovn97 {

	public static String vändText(String text) {

		String baklänges = "";
		int k = text.length();

		for (int i = k - 1; i >= 0; i--) {

			baklänges = baklänges + "" + text.charAt(i);
			// System.out.println(baklänges);
		}

		//System.out.println(baklänges);

		return baklänges;
	}

	public static void main(String[] args) {

		String bak=vändText("sirap");

		System.out.println(bak);

	}

}
