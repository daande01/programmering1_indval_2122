package loopar;

public class Miljon {

	public static void main(String[] args) {

		int lön = 1 ;
		int kapital =0;
		int dagar=0;
		while(kapital <=1000000) {

			lön = lön*2;

			kapital=kapital+lön;
			dagar +=1;

		}

		System.out.println(kapital+" efter "+dagar);



	}

}
