package puMetoder;

public class Uppgift4 {
	public static void romb (int n) {
		String tecken = "*";
		String mellanrum = " ";

		for(int i = 0; i < n; i++) {
			System.out.println(mellanrum.repeat(i) + tecken.repeat(n));
		}
			
			
	}
	public static void main(String[] args) {
		romb(3);
	}
}

