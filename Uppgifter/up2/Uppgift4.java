package up2;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		// Scanner
		Scanner input=new Scanner (System.in);
		//Fråga
		System.out.println("Skriv in 3 heltal");
		
		//Lagra det vi skriver in och kalla det för tal1-3
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		int tal3 = input.nextInt();
		
		//Om tal1 är minst:
		if (tal1 < tal2 && tal1 <tal3) {
			System.out.println(+tal1);
		}
		//Om tal2 är minst
		if(tal2 < tal1 && tal2 <tal3) {
			System.out.println(+tal2);
		}
		//Om tal3 är minst
		if(tal3 < tal1 && tal3 < tal2) {
			System.out.println(+tal3);
		}
	}

}
