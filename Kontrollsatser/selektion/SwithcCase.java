package selektion;

import java.util.Scanner;

public class SwithcCase {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("1. Alternativ ett\n2. Alternativ två\n3. Alternativ tre\n4. Hjälp");

		int val =input.nextInt(); 

		switch(val) {
		case 1:
			System.out.println("Du valde alternativ ett");
			break;
		case 2:
			System.out.println("Du valde alternativ två");
			break;
		case 3:
			System.out.println("Du valde alternativ tre");
			break;
		case 4:
			System.out.println("Du valde alternativ fyra");
			break;
		default:
			System.out.println("Felaktigt val, fuck you");


		}
		String trash = input.nextLine();
		//En switch-case där alternativen styrs av text

		System.out.println("Vilken dag är det idag?");

		boolean run = true;

		do {
			String dag = input.nextLine();

			switch(dag) {
			case "måndag":
				System.out.println("Tisdag");
			case "tisdag":
				System.out.println("Onsdag");
			case "onsdag":
				System.out.println("Torsdag");
			case "torsdag":
				System.out.println("Fredag");
			case "fredag":
				System.out.println("Lördag");
			case "lördag":
				System.out.println("Söndag");
			case "Söndag":
				break; 
			default:
				System.out.println("Skriv dagen med gemener");

			}
		}while(run);

	}}
