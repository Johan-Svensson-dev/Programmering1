package puMetoder;

public class Uppgift8 {

	public static void main(String[] args) {
		int[] array = {5, 25, 3, 6, 7, 45};
		int tal[] = (storstmint(array));
		for(int a: tal) {
			System.out.println(a);
		
	}
	}	
	public static int[] storstmint(int[] array) {
		int minVärde = array[0];
		int maxVärde = array[0];
			 for(int i = 0; i < array.length; i++) {
				 if(array[i] < minVärde) {
					 minVärde = array[i];
				 } else if (array[i] > maxVärde ) {
					 maxVärde = array[i];
				 }
			 }
		int[] resultat = {minVärde, maxVärde};
		return resultat;
	}

}
