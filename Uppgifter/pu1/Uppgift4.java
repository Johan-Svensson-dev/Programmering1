package pu1;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Skanner som läser in svaret
		Scanner input = new Scanner(System.in);
		//Printar ut frågan
		System.out.println("Skriv förnamn");
		String förnamn = input.nextLine();
		System.out.println("Skriv efternamn");
		String efternamn = input.nextLine();
		
		char letter1 = förnamn.charAt(0);
		char letter2 = efternamn.charAt(0);
		
		System.out.println("Dina initialer är: " +letter1 +letter2);
	
		
		
		
		
		
		
		

	}

}
