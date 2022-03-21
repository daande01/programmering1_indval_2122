package objektorientering;

public class Telefon {

	//substantiv instansvariabler
	private boolean sk�rm;
	private int knappar;
	private int ljudvolym;

	//konstruktor som inte tar n�gon inparameter.
	public Telefon() {

		sk�rm=true;
		knappar=10;
		ljudvolym=0;
		System.out.println("sk�rm:"+sk�rm+"antal knappar:"+knappar+"ludvolym:"+ljudvolym);

	}
	public Telefon(boolean s,int k,int l) {

		sk�rm=s;
		knappar=k;
		ljudvolym=l;

		System.out.println("sk�rm:"+sk�rm+"antal knappar:"+knappar+"ludvolym:"+ljudvolym);

	}

	public void setVolym(int nyvolym) {

		ljudvolym=nyvolym;
	}
	// verb
	//visask�rm
	//skriva
	//pipa h�ja ljud

	@Override
	public String toString() {

	return "sk�rm: "+sk�rm+" antal knappar: "+knappar+" ludvolym: "+ljudvolym;
	}



	public static void main(String[] args) {

		new Telefon(true,100,50);

		Telefon nokia=new Telefon(false,1,100);

		nokia.setVolym(20);
		System.out.println( nokia.toString()   );


	}



}
