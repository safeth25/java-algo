package search;

public class SeqSearch {
	private final static int NO_KEY = -1;
	
	/**@
	 * Linear search through the sorted array
	 * @param sortedField
	 * @param key
	 * @return Position of key, else NO_KEY
	 */
	public static int seqSearch(int[] sortedField, int key) {
		for(int position = 0; position < sortedField.length; position++) {
			if(sortedField[position] == key) {
				return position;
			}
		}
		return NO_KEY;
	}
}
