package loopar;

public class Hundra�r {

	public static void main(String[] args) {

		int �lder=0;
		int riktig�lder=0;



		while(riktig�lder<100) {

			riktig�lder++;

			if((riktig�lder % 5) ==0 ) {
			�lder++;
			}
		}

		System.out.println(riktig�lder+" "+�lder);
	}



}
