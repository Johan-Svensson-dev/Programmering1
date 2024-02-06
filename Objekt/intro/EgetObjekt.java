package intro;

public class EgetObjekt {
	//instansvariabler 
	private String namn; 
	private int klass;
	private int age;
	private boolean alergi;
	
	//kontrstruktor
	public EgetObjekt(String namn, boolean allergi) {
		this.namn=namn;
		klass = 1;
		age = 7;
		this.alergi = alergi;
		
	}
	
	// Set&Get Metoder
	public int getKlass() {
		return klass;
	}
	public String getNamn(){
		return namn;
	}
	public void newYear () {
		klass++;
		age++;
	}

}
