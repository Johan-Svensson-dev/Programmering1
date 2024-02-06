package puMetoder;

public class Uppgift7 {

	public static void main(String[] args) {
			char tecken = 'z';
			char[] array = {'a', 'g', 'h', 'z', 'p', 'B'};
			System.out.println(search(tecken, array));
	}
	
	public static int search(char tecken, char[] array) {
		int return1 = -1;
		for(int i = 0; i < array.length; i++)  {
			if(array[i] == tecken) {
				return1 = i;
				break;
			}
		}
		return return1;
	}

}

