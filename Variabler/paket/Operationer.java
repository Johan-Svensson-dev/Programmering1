package paket;

import java.util.Scanner;

public class Operationer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//De fem räknesätten:
		System.out.println("Skriv Två Tal");
	

	int tal1 = input.nextInt();
	int tal2 = input.nextInt();
	//addition
	
	int summa = tal1 +tal2;
	
	System.out.println("Summan är: "+summa);

	//kortare
	System.out.println();
	
	//Subtraktion
	
	int differens = tal1 - tal2;
	
	//Multiplikation
	

	int produkten = tal1 * tal2;
			
	//Division
	
	double kvot = tal1 *1.0 / tal2; //för att få kvot med decimaler krävs en ingående del med decimaler
	
	System.out.println("Kvoten är: " +kvot);
	
	//Större uträkningar
	double utr = (tal1 + tal2) / (tal1 - tal2);
	
	
	//Moduloberäkningar (resten vid division)
	
	int rest = tal1 % tal2;
	
	System.out.println("Resten vid division är:" +rest);
	
	
	//Tidsomvandling
	
	int sek = 41289;
	
	int min = sek / 60;
	
	sek = sek % 60;
	//Min är hela antal minuter, sek är de sekunder som är kvar när alla hela minuter är borta
	
	int tim = min / 60;
	min = min % 60;
	
	System.out.println (tim + " h\t" +min +" min\t" +sek +" sek");
	
	
			
	
	
	
	
	
	
	
	
}}
