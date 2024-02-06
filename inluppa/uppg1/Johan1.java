package uppg1;

import java.util.Scanner;

public class Johan1 {

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
			
			//Random tal i variabeln dice1 o 2 (1-6)
			dice1 = (int)(Math.random()*6) +1;
			dice2 = (int)(Math.random()*6) +1;
		
			
			//Printar ut 
			System.out.println("Tärning 1: " + dice1);
			System.out.println("Tärning 2: " + dice2);
			
			
			//Om tärningarna är 1 och 6
			if(dice1 == 6 && dice2 == 1 || dice1 == 1 && dice2 == 6) {
				vinst = 3 * belopp;
				System.out.println("Dubbelvinst " + belopp);
			}
			
			//Om tärningarna är par
			else if(dice1 == dice2) {
				vinst = belopp;
				System.out.println("Par " +belopp);
				
			}
			
			//Om tärningarna är lika med 7
			else if(dice1 + dice2 ==7) {
				System.out.println("Vinst " +belopp);
		
			}
			
			//Om inget ovan stämmer
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


