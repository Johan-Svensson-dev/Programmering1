package puMetoder;

public class Uppgift5 {
	
	public static char conv (char bokstav) {
		if(Character.isLowerCase(bokstav)) {
		}
		return Character.toUpperCase(bokstav);
	}	

	public static void main(String[] args) {
		char bokstav = 'h';
		System.out.println(conv(bokstav));
	}

}	
