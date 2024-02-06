package up2;

import java.util.Scanner;

public class Uppgift5 {

	public static void main(String[] args) {
		//scanner
		Scanner input=new Scanner (System.in);
		//fråga
		System.out.println("Ange ålder");
		
		//bevara svaret
		int age = input.nextInt();
		
		//Om age är mindre än 30
		if(age < 30) {
			System.out.println("Ung");
		}
		
		//Om age är mellan 30 och 40
		if(age > 29 && age <40) {
			System.out.println("Medelålder");
		}
		
		//Om age är mellan 40 och 65
		if(age > 39 && age <65) {
			System.out.println("Övre Medelålder");
		}
		//Om age är mellan 40 och 65
		if(age > 64) {
			System.out.println("Gammal");
		}
		
		
		
		
	}

}
