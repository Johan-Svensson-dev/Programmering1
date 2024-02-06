package gui;

public class getLista {
	//instans variabler
	private String namn;
	private String tel;
	
	public getLista(String namn, String tel) {
		this.namn = namn;
		this.tel = tel;
		
	}
	
	public String getKontakt() {
		String kontakt = namn + "       " + tel + "\n";
		return kontakt;
		
	}
	
	public String getTel() {
		return tel;
	}
	
	public String getName() {
		return namn;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}




