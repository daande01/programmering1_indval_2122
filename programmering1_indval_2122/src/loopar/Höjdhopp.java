package loopar;

public class Höjdhopp {

	public static void main(String[] args) {


		 int k []=new int[3];

		 k[0]=4;
		 k[1]=2;
		 k[2]=5;


		int i []= {4,2,5,1,6,4};

		int max=0;

		for (int j = 0; j < i.length; j++) {

			if(i[j]>max) {

				max=i[j];
			}


		}
		System.out.println("max:"+max);
	}


}
