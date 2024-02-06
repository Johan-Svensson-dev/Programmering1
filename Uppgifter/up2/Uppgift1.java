package up2;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		//scannare

		Scanner input=new Scanner (System.in);
		
		//inlogg
		
		System.out.println("Ange ålder");
			
		
		int age = input.nextInt();		
		
		
		if(age > 17) {
			System.out.println("Myndig");
		}
		else {System.out.println("ej myndig");
		}

	}

}
