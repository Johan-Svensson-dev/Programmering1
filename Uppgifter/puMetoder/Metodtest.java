package puMetoder;

public class Metodtest {

	public static void main(String[] args) {
		//uppgift1
		double tal = 56;
		char resultat = Uppgift1.ponev(tal);
		System.out.println(resultat);
		
		//uppgift2
		String förNamn = "Johan";
		String efterNamn = "Svensson";
		String telNummer = "133769";
		Uppgift2.details(förNamn, efterNamn, telNummer);
		
		//uppgift3
		int bas = 3;
		int exponent = 3;
		
		double potens = Math.pow(bas, exponent);
		System.out.println(potens);
	}
	public static void potens(int bas, int exponent) {
		
		double potens = Math.pow(bas, exponent);		
		
	}
	
	

}
