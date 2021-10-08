package arr;

import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {

		int [] k =new int[4]; //skapar referensen k av datatypen int och låter den referrera till en int array med 4 positioner

		k[0]=12;  // tilldelar pos 0 värdet 12
		k[1]=23;
		k[2]=11;
		k[3]=34;

		System.out.println(k[0]+" "+k[1]+" "+k[2]+" "+k[3]); // printar värdena från arryen

		System.out.println(Arrays.toString(k));// print arrayen k

	}

}
