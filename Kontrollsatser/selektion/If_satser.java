package selektion;

import java.util.Scanner;

public class If_satser {

	public static void main(String[] args) {
		// If-satser styrs av lokiska uttryck såkallade "villkor" ett villkor kan antingen vara sant eller falskt
		
		//variabler
		int heltal = 2;
		double tal = 2.5;
		char tecken = 'b';
		boolean val = true;
		
		//skriver in en logisk utsaga
		System.out.println(heltal == 3);

		if(heltal == 2) {
			System.out.println("Heltal har värdet två");
			}
		else {        //om if-blocket ej körs så körs elseblocket
			System.out.println("Heltal har inte värdet två");
		}
		//decimaltal i ett interval: -2 <x< 3         Flera villkor med och && eller "eller" || (alt + <)
		
		if (tal >-2&& tal <3) {
			System.out.println("Decimalet ligger mellan -2 och 3");
			
		}
		else if(tal >= 3 && tal < 5) {
			System.out.println("Talet ligger mellan tre och fem");
		}
		else {
			System.out.println("Talet är större än fem (eller mindre än -2)");
			
		}
		//tecknet ska inte vara ett k
		if(tecken != 'k') {
			System.out.println("Tecknet är inte ett k");
		}
		//styra med boolksvariabel
		
		if(val) {
		//kodblocket körs om ej val blivit falsk	
		}
		if(true) {
			//kodblocket körs alltid
		}
		
		//styra if-satser med metoder/funktioner
		String anv = "johan";
		String pw = "password";
		
		//inlogging
		
		System.out.println("Ange användarnamn");
		//Scanner objekt
		Scanner input=new Scanner (System.in);
		String mail = input.nextLine();
		
		System.out.println("Ange lösenord");
		String password = input.next();
		
		if (mail.equalsIgnoreCase(anv) && password.equals(pw) ) {
			System.out.println("Välkommen " + mail);
		}
		else {System.out.println("Lösenord eller användarnamn finns ej i vår databas");
		}
		
	}
	
}
