package loopar;

public class Ovn86 {


	public static void main(String[] args) {

		double folkm�ngd=1000000;
		int �r=0;
		while(folkm�ngd<=2000000) {

			folkm�ngd=folkm�ngd*1.05;
			�r=�r+1;
		}
		System.out.println("det tar "+�r+" �r");

		//2000000=1000000*1.05^x

	}



}
