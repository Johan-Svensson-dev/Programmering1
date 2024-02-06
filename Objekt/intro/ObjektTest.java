package intro;

import javax.swing.JFrame;

public class ObjektTest {

	public static void main(String[] args) {
		//För att skapa objekt
		
		JFrame window = new JFrame();
		//Klassnamn egetnamn = new Kontruktor
		window.setVisible(true);
		
		//Testar EgetObjekt;
		EgetObjekt e1= new EgetObjekt("Gösta", true);
		
		EgetObjekt e2 = new EgetObjekt("Lisa Nordh", false);
		
		e1.newYear();
		
		System.out.println(e1.getKlass() +" " + e2.getKlass());

		
	}

}
