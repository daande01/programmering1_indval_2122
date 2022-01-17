package loopar;

public class Ovn84 {
	public static void main(String[] args) {

		int [] i = new int[5];

		i[0]=89;
		i[1]=56;
		i[2]=45;
		i[3]=69;
		i[4]=63;

		int min = Integer.MAX_VALUE;


		for (int j = 0; j < 5; j++) {

			if(i[j]<min) {

				min=i[j];

			}

			System.out.println(min);

		}









	}
}
