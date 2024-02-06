package up2;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		//scannare

				Scanner input=new Scanner (System.in);
				
				//inlogg
				
				System.out.println("Ange ålder");
					
				
				int age = input.nextInt();		
				
				
				if(age > 34 && age < 51) {
					System.out.println("Medelålder");
				}
				else {System.out.println("ej medelålder");
				}
	}

}
