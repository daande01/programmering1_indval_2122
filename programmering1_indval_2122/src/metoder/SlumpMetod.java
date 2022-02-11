package metoder;

public class SlumpMetod {

	public static int slump(int slut){

		   int i=(int) (Math.random() *slut+1);

		System.out.println(i);
		return i;
	}






	public static void main(String[] args) {




		for (int i = 0; i < 100; i++) {
			slump(100);
		}



	}



}
