package bank;

import java.util.ArrayList;

public class BankMain {

	public static void main(String[] args) {
		//Samling
		
		ArrayList<Konto> kontoLista = new ArrayList<>();
		//andra typer av samlingar: HashMap
		
		//lägga till objekt i listan
		kontoLista.add(new Konto("Mumrik Svensson"));
		
		kontoLista.get(0).ins(69);
		
		kontoLista.add(new Konto("Gösta Lindh"));
		
		System.out.println(kontoLista.get(0).getSaldo() +" "+kontoLista.get(0).getKontoNR());
		
		
		//söker efter bankkonto
		for(int i=0; i < kontoLista.size(); i++) {
			if(kontoLista.get(i).getNamn().equals("Gösta Lindh")) {
				System.out.println(kontoLista.get(i).getSaldo());
			}
		}
	}

}
