package uppgifter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift1 {
	
	public static void main(String[] args) {
		//Scanner
		
		int tal;
		while(true) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Ange ett heltal");
			tal = input.nextInt();
			break;
			
		}

			
			try {
			}catch(InputMismatchException e) {
				System.out.println("Vänligen mata in ett heltal");
			}
			char [] chararray = new char [tal];

			
			

		
	}

}

