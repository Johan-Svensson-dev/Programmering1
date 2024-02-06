package selektion;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tal = new int[10];
		
		System.out.println(tal);
		
		System.out.println(tal[0]); //index 0 är första positionen i fältet
		
		System.out.println(tal[tal.length -1]);	//.length returnerar element i fältet
		
		tal[3] = 5; 
		
		double[] decArray = new double[100];
 		
		String[] textList = new String[23];
		//tvådimensionell array
		
		char[][] twoDimField = new char[3][4]; //en tvådim tecken fält fält eller matris
		
		System.out.println(twoDimField);
		
	}

}
