package loopar;

public class Ovn86 {


	public static void main(String[] args) {

		double folkmängd=1000000;
		int år=0;
		while(folkmängd<=2000000) {

			folkmängd=folkmängd*1.05;
			år=år+1;
		}
		System.out.println("det tar "+år+" år");

		//2000000=1000000*1.05^x

	}



}
