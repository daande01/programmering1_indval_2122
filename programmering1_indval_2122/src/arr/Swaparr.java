package arr;

import java.util.Arrays;

public class Swaparr {

	public static void main(String[] args) {

		String [] ord= {"daniel", "göran","bertil"};
		String temp;

		temp= ord[0];
		ord[0] =ord[2];
		ord[2]= temp;

		System.out.println(Arrays.toString(ord));


	}

}
