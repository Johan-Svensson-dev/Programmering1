package introduktion;

public class MetoderMain {

	public static void main(String[] args) {
		//metodtest:
		int square = kvadrat(9);
		
		System.out.println(square);
		print("Hej Hej, 3");
		System.out.println(tecken("Hej" , 2));
		
		//text av extern metod:
		char bokstav = tecken("vadårå?", 3);
		
		if(ExternaMetoder.charTest(bokstav)) {
			print("Versal");
		}
		else {
			print("Gemen");
		}
	}
	
	//statisk funktion går att köra direkt
	//public/protected/private static returtyp namn(indata, indata)
	public static int kvadrat(double tal) {
		int square = (int) (tal * tal);
		return square;
	}
	
	//metod som returnerar tecken
	//Utskrift av text
	public static char tecken(String text, int index) {
		char retur = text.charAt(index);
		return retur;
	}
	public static void print(String utskr) {
		System.out.println(utskr);
	}
	
	
	
}
