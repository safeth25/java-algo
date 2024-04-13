package sort;

public class InsertionSort {
	
	public static void sort(int[] array) {
		
		for(int position = 1; position < array.length; position++){
			int placeHolder = array[position];
			int lowerPosition = position - 1;
			
			while(lowerPosition >= 0) {
				if(array[lowerPosition] > placeHolder) {
					//swap
					array[lowerPosition + 1] = array[lowerPosition];
					array[lowerPosition] = placeHolder;
					lowerPosition--;
				}
				else {
					break;
				}
			}
		}
	}
}
