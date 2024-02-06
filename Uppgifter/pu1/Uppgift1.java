package pu1;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner som läser in längden
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in längden och bredden");
		
		//int som läsen in bredd och längd. Sen en int som är area och innefattar längden multiplicerat med bredden
		double längd = input.nextDouble();
		
		double bredd = input.nextDouble();
		
		double area = längd * bredd;
				
		//printar ut arean
			System.out.println("Arean är: " +area);
		


	}

}
