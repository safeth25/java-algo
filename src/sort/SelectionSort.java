package sort;

public class SelectionSort {

	public static void sort(int[] array) {
		int position = array.length - 1;
		
		while(position > 0) {
			
			// Find largest element in range 0 to position
			int largestElement = array[0];
			int indexLargestElement = 0;
			for(int nextElement = 0; nextElement <= position; nextElement++) {
				if(array[nextElement] > largestElement) {
					largestElement = array[nextElement];
					indexLargestElement = nextElement;
				}
			}
			
			// Swap
			int placeHolder = array[indexLargestElement];
			array[indexLargestElement] = array[position];
			array[position] = placeHolder;
			
			// Decrement position
			position--;
		}
	}
}
