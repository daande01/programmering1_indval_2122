package metoder;

import java.util.Arrays;

public class Callbyrefarray {

	public static void medel(int[] arrk) {

		// int medel = (arrk[0]+arrk[1]+arrk[2])/arrk.length;

		int m = 0;

		for (int i = 0; i < arrk.length; i++) {

			m = m + arrk[i];
			// 10=0+10
			// 21 =10+11
			// 33 =21+12
		}
		m = m / 3;
		System.out.println(m);

		arrk[0]=10000000;

	}

	public static void main(String[] args) {

		int k[] = { 10, 11, 12 };

		medel(k);

		System.out.println(Arrays.toString(k));

	}

}
