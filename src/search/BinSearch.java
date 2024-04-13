package search;

public class BinSearch {
	private static int NO_KEY = -1;
	
	public static int binSearch(int[] sortedField, int key) {
		int lowerBound = 0;
		int upperBound = sortedField.length - 1;
		
		while(lowerBound <= upperBound) {
			int middleElement = (lowerBound + upperBound)/2;
			
			if(sortedField[middleElement] == key) {
				return middleElement;
			}
			else if(sortedField[middleElement] < key) {
				lowerBound = middleElement + 1;
			}
			else {
				upperBound = middleElement - 1;
			}
		}
		return NO_KEY;
	}
	
	public static int recBinSearch(int[] sortedField, int key, int lowerBound, int upperBound) {
		if(lowerBound > upperBound) {
			return NO_KEY;
		}
		int middleElement = (lowerBound + upperBound)/2;
		
		if(sortedField[middleElement] == key) {
			return middleElement;
		}
		else if(sortedField[middleElement] < key) {
			lowerBound = middleElement + 1;
			return recBinSearch(sortedField, key, lowerBound, upperBound);
		}
		else {
			upperBound = middleElement - 1;
			return recBinSearch(sortedField, key, lowerBound, upperBound);
		}
	}
}
