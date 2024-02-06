package pu1;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner som läser in temperaturen i Fahrenheit
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in temperaturen i Fahrenheit:");
		//TempFahr är inputen Temperatur i Fahrenheit
		double TempFahr = input.nextDouble();
		//C är celsuis som beräknas med följande
		double C = (TempFahr -32) * 0.56;
		System.out.println("Temperaturen i Celsius är " +C +"°");
		
		
		
		

	}

}
