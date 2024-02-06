package repetition;

public class For_satser {

	public static void main(String[] args) {
		//for-satser lämpar sig för ett visst antal repetitioner
		
		//for( start; slut; steg)
		
		for(int i = 0; i < 10; i++) {   	//startar på 0 slutar på 9 och ökar ett steg var vända
			System.out.println(i); 
		}
		
		int[] array = new int[10];
		
		for(int i = 0; i <array.length; i++) {
			array[i] = (int)Math.pow(2, i); //fyller array med binära tal
		}
		
		//skriver ut arrays:
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//Söka ett värde i array
		
		int index = -1; //När vi söker index ger vi startvärde -1 för att se om värde ej funnits
		int value = 4;
		
		for(int i = array.length -1 ; i >= 0; i--)  {
			if(array[i] == value) {
				index = i;
				break;   //avbryter for-satsen
				
			
			}
		}
		System.out.println("index for " +value +" is: " +index);
		
		//Chessboard
		
		String[][] chess =new String[8][8]; {
			for(int k = 0; k < 8; k++) 
		
		for(int i = 0; i < 8; i++)
			if( i % 2 == 0) {
				chess [i][k] = "[S]";
			}
			}
		for(int k = 0; k < 8; k++) {
			for ( int i = 0; i< 8; i++) {
				System.out.println(chess[i][k]);
			}
		}
		
	}

}
