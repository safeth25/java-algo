package sort;


public class BubbleSort {
	
	public static void sort(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for(int position = 0; position < array.length - 1; position++) {
				if(array[position] > array[position + 1]) {
					Sort.swap(array, position, position + 1);
					swapped = true;
				}
			}
		}while(swapped);
	}
}
