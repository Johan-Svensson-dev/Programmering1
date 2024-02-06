package uppg1;

import java.util.Scanner;

public class Johan2 {

	public static void main(String[] args) {
		
		//Scanner och fråga
		Scanner input = new Scanner(System.in);
		
		//bank
		int bank = 0;
		
		//val variabel
		char val;		

		//tärning 1
		int dice1; 
		
		//tärning 2
		int dice2;
		
		
		//boolean
		boolean run = true;
		
		
		
		//do-while sats

		do {
			int vinst = 0;
			
			//Fråga
			System.out.println("Hur mycket satsar du");
			
			//variabel som lagrar input
			int belopp = input.nextInt();
			
			
			//Fråga Cho eller Han
			System.out.println("Cho eller Han");
			
			//variabel för svaret
			String chohan = input.next();
			
			
			//Random tal i variabeln dice1 o 2 (1-6)
			dice1 = (int)(Math.random()*6) +1;
			dice2 = (int)(Math.random()*6) +1;
			
			
			//Summan av dice 1 och 2
			int dicesum = dice1 + dice2;
			
			//Printar ut summan av tärningarna
			System.out.println("Summan av tärningarna blev " + dicesum);
			
			
			//Bytte ut att om summan av tärningarna är jämna
			if(dicesum % 2 == 0 && chohan.equalsIgnoreCase("cho")){
				vinst = 3 * belopp;
				System.out.println("Dubbelvinst " + belopp);
			}
			
			//Om ovan inte funkar så kör denna
			else if(dicesum % 2 == 1 && chohan.equalsIgnoreCase("han")){
				vinst = 3 * belopp;
				System.out.println("Dubbelvinst " + belopp);
			}
			
			//Om inget av ovan stämmer så är det förlust
			else {
				System.out.println("Förlust");
			}		
			
			
			//Bank fylls på med vinsten
			bank +=vinst;
			
			//Printar ut banken
			System.out.println("Du har nu " + bank);
			
			
			//Printar ut fråga om man vill spela igen
			System.out.println("Spela igen? (y/n)");

			//Om valet börjar på n så är boolean false och stoppar do-while satsen
			val = input.next().charAt(0);
			if(val == 'n') {
				run = false;
				System.out.println("Du tog ut: " +bank);
				

			}
			
			
				
			
		} while (run);
			
		
		
		}
		
		


	}


