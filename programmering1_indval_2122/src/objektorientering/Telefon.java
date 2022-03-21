package objektorientering;

public class Telefon {

	//substantiv instansvariabler
	private boolean skärm;
	private int knappar;
	private int ljudvolym;

	//konstruktor som inte tar någon inparameter.
	public Telefon() {

		skärm=true;
		knappar=10;
		ljudvolym=0;
		System.out.println("skärm:"+skärm+"antal knappar:"+knappar+"ludvolym:"+ljudvolym);

	}
	public Telefon(boolean s,int k,int l) {

		skärm=s;
		knappar=k;
		ljudvolym=l;

		System.out.println("skärm:"+skärm+"antal knappar:"+knappar+"ludvolym:"+ljudvolym);

	}

	public void setVolym(int nyvolym) {

		ljudvolym=nyvolym;
	}
	// verb
	//visaskärm
	//skriva
	//pipa höja ljud

	@Override
	public String toString() {

	return "skärm: "+skärm+" antal knappar: "+knappar+" ludvolym: "+ljudvolym;
	}



	public static void main(String[] args) {

		new Telefon(true,100,50);

		Telefon nokia=new Telefon(false,1,100);

		nokia.setVolym(20);
		System.out.println( nokia.toString()   );


	}



}
