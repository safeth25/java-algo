package sort;

public class Sort {
	public static void swap(int array[], int idx1, int idx2) {
		int placeHolder = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = placeHolder;
	}
}
