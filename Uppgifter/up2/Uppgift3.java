package up2;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {

		//scanner
		Scanner input=new Scanner (System.in);
		
		//Skriv in 3 tal
		
		System.out.println("Skriv in tal");
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		
		if(tal1 < tal2) {
			System.out.println("Det andra talet är störst: " +tal2);
	
		}
		
		if(tal1 == tal2) {			
			System.out.println("Talen är lika stora");
		}
		
		if(tal1 > tal2) {
			System.out.println("Det första talet är störst: " +tal1);
	
		}

	}

}
