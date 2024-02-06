package paket;

public class Casting {

	public static void main(String[] args) {
		//Variabel omvandling
		
		int heltal = 2;
		
		double decTal = heltal; //int ryms i double direkt
		
		heltal = (int)decTal; //castar med önskad typ inom parantesen
		
		//avrundning 
		decTal = 2.9;
		int avrund = (int)(decTal + 0.5); //addera 0,5 och casta för att avrunda korrekt
		
		//cast char som heltal
		int gemen = (int) 'a';
		
		System.out.println(gemen);
		
		int versal = (int) 'A';
		
		System.out.println(versal);

		//testar fler bokstäver
		
		System.out.println((int) 'k' - (int) 'K');	
		
		//textredigering
		
		String text = "Hej, idag har jag jobbat. Kuligt!";
		char tecken;
		char tecken2;
		
		for(int i = 0; i < text.length(); i++) {
			tecken = text.charAt(i);
			if((int)tecken > 65 && (int)tecken <=90); {
				tecken2 = (char)((int)tecken + 32);
				text.replace(tecken, tecken2);
		
		
			}}
		System.out.println(text);
		
	}

}

