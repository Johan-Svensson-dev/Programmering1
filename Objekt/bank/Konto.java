package bank;

public class Konto {
	//instansvariablet
	private String namn;
	private double saldo;
	private int kontonr;
	
	//statiska variabel
	private static int counter = 1;
	
	//konstruktor
	public Konto(String namn) {
		this.namn = namn;
		kontonr = 1336 + counter;
		counter++;
	}
	
	//insättning
	public void ins(int belopp) {
		saldo += belopp;
	}
	//uttag
	public boolean uttag(int belopp) {
		if(saldo >= belopp) {
			saldo = belopp;
			return true;
		}
		else {
			return false;
		}
	}
	public int getKontoNR() {
		return kontonr;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getNamn() {
		return namn;
		
	}
}
