package introduktion;

public class ArrayMetod {
	public static void main(String[] args) {
	char[] tecken = {'a', 'g', 'h', '6', 'p', 'B'};
	
	int[] kod = ArrayOmv(tecken);
	
	//annan typ av forsats (variabeltyp och namn i saml: saml=
	
}


//Metoder tar emot en tecken-array och returnerar tecknenas Unicodevärden i en in array	
	public static int[] ArrayOmv(char[] tecken) {
		
		int antal = tecken.length; //antal positioner i retur-array:en
		int[] kod = new int[antal]; //array som ska returneras
		
		for(int i = 0; i < antal; i++) {
			kod[i] = (int)tecken[i];
		}
		return kod;
	}
	}