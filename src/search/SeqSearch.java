package search;

public class SeqSearch {
	private final static int NO_KEY = -1;
	
	public static int seqSearch(int[] sortedField, int key) {
		for(int position = 0; position < sortedField.length; position++) {
			if(sortedField[position] == key) {
				return position;
			}
		}
		return NO_KEY;
	}
}
