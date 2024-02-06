package utmatning;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		//Utmatning
		System.out.print("Hej Hej!");
		System.out.print("Hej igen!");
		
		//Utskrift med radbyte
		System.out.println("Ny rad?");		//radbyte efter
		System.out.println("Nu d�?");
		
		// \ skapar olika formatteringsalterantiv f�r text
		System.out.println("Börjar på rad ett \nHär kommer rad två"); // \n ger mig en ny rad
		System.out.println("För att tabba \tså får jag luft i raden");
		
		//extra radbyte:
		System.out.println();
		System.out.println("wow");
		
		//För snyggare utskriver kolla upp System.out.printf()
			
		Scanner input = new Scanner(System.in);
		System.out.printf("Samuel \n\tDexsam");		//Ny rad och indrag med \n\t
		
		
		String name = "Johan"; 	
		System.out.println(name.toUpperCase());
		
		
	}

}
