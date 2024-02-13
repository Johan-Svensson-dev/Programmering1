package algoritmer;

public class Bubbelsort {

	public static void main(String[] args) {
		int[] array = {4, 6, 2, 3, 8, 79, 99, 33, 22, 1, 0};
		
		int[] sortArray = bubbel(array);
		
		//urskrift 
		for(int a:sortArray) {
			System.out.print(a +" ");
		}
		
		System.out.println(bin(sortArray, 8));
		

	}
	public static int bin(int[] array, int talet) {
		int index = -1;
		int min = 0;
		int max = array.length -1;
		int mid; 
		
		while(index == -1 && min < max) {
			mid = (max + min) /2;
			if(talet > array[mid]) {
				min = mid +1; //nedre gräns i mitten
				
			}
			else if(talet < array[mid]) {
				max = mid -1; //övre gräns i mittens
				
			}
			index = mid;
		}
		return index;
		
	}
	public static int[] bubbel(int[] array) {
		int temp; 
		int size = array.length;
		for(int i = size - 1; i > 0; i--) { //forsats som minskar ner i arrayn efter sorteringsgrunderna
			for(int k = 0; k < i; k++) {
				if(array[k] > array[k+1]) {
					temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
				
			}
			
		}
		return array;
		
	}

}
