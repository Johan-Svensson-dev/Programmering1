package pu1;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printar ut frågan
		System.out.println("Ange ålder för 3 personer:");

		//Scanner som läser in 
		Scanner input = new Scanner(System.in);

		//antal rader och läsa in varje persons ålder
		int  pers1 = input.nextInt();
		int  pers2 = input.nextInt();
		int  pers3 = input.nextInt();

		//beräkning medelålder
		double avgAge = (pers1+pers2+pers3)/3.0;
		
		System.out.println("Medelåldern är " +avgAge);
		
		
		
		
		
		
	}

}
