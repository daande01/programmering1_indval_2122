package loopar;

public class Miljon {

	public static void main(String[] args) {

		int l�n = 1 ;
		int kapital =0;
		int dagar=0;
		while(kapital <=1000000) {

			l�n = l�n*2;

			kapital=kapital+l�n;
			dagar +=1;

		}

		System.out.println(kapital+" efter "+dagar);



	}

}
