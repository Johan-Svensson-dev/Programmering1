package puMetoder;

public class Uppgift6 {

	public static void main(String[] args) {
		char siffra = 'a';
		System.out.println(decider(siffra));
		
	}
	
	public static boolean decider (char siffra) {
		if(Character.isDigit(siffra) ) {
			return true;
		}
		else {
			return false;
		}
	}

}
