package pu3;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		
		// array med decimaltal
		double[] decimaltalArray = new double[100]; // 100 som maxantal
		
		

		// variabel som håller koll på antal decimaler
		int antalTal = 0;

		// Loop för att låta användaren mata in decimaltal
		do {
			System.out.print("Mata in ett decimaltal: ");
			decimaltalArray[antalTal] = input.nextDouble();
			antalTal ++;
			System.out.print("Vill du mata in fler tal? (ja/nej): ");
			String svar = input.next();

			if (svar.equalsIgnoreCase("nej")) {
				break;
			}
		} while (true);
		
		

		// Skriver ut de inmatade decimaltalen
		System.out.println("De inmatade decimaltalen är:");
		for(int i = 0; i < antalTal; i++ ) {
			System.out.println(decimaltalArray[i]);
		}
		// Skriver ut de inmatade decimaltalen i omvänd ordning
		System.out.println("De inmatade decimaltalen i omvänd ordning är");
		for(int i = antalTal -1; i >= 0; i--) {
			System.out.println(decimaltalArray[i]);
			
		}
		// Skriver ut de positiva inmatade decimaltalen
				System.out.println("De positiva inmatade decimaltalen är:");
				for(int i = 0; i < antalTal; i++ ) {
					if (decimaltalArray[i] < 0) {
						continue; }
					System.out.println(decimaltalArray[i]);
		}
				
		//Programmet skall skriva ut vartannat tal med början med talet på position 0
				System.out.println("Vartannat tal:");
				for(int i = 0; i < antalTal; i+=2 ) {
					if (decimaltalArray[i] < 0) {
						continue; }	
					System.out.println(decimaltalArray[i]);
		}	
				
		double min = decimaltalArray[0];
				
		for(int i=0; i < decimaltalArray.length; i++) {
			if (decimaltalArray [i]< min) {
				min = decimaltalArray [i];

			}
		
		}
		System.out.println("Det minsta talet är " +min);


	

				
		}
	
	
	
	
	

		}

	
	








