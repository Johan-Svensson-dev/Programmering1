package up2;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		//Scanner
		Scanner input=new Scanner (System.in);
		//Fråga
		System.out.print("Skriv in det första tecknet: ");
        char tecken1 = input.next().charAt(0);

        System.out.print("Skriv in det andra tecknet: ");
        char tecken2 = input.next().charAt(0);

        if ((tecken1 == 'a' && tecken2 != 'a') || (tecken1 != 'a' && tecken2 == 'a')) {
            System.out.println("Vinst!");
        } else {
            System.out.println("Förlust");
        }
			
		}
		
	
	


}
