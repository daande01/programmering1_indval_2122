package loopar;

public class Hundraår {

	public static void main(String[] args) {

		int ålder=0;
		int riktigålder=0;



		while(riktigålder<100) {

			riktigålder++;

			if((riktigålder % 5) ==0 ) {
			ålder++;
			}
		}

		System.out.println(riktigålder+" "+ålder);
	}



}
