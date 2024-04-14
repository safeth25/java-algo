import java.util.Arrays;

import search.BinSearch;
import search.SeqSearch;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {

	public static void main(String[] args) {
//		if(args.length != 1) {
//			System.out.println("usage: SeqSearch <key>");
//			return;
//		}
		
//		int schlüssel = Integer.parseInt(args[0]);
		int schlüssel = 2;

		// Sortierte Folge
		int[] sortierteFolge = {2, 4, 5, 6, 7, 8, 9, 11};
		
		
		
		int seqSearchResult = SeqSearch.seqSearch(sortierteFolge, schlüssel);
		
		int binSearchResult = BinSearch.binSearch(sortierteFolge, schlüssel);
		
		int recBinSearchResult = BinSearch.recBinSearch(sortierteFolge, schlüssel, 0, sortierteFolge.length - 1);
		
		System.out.println("seqSearch Result: " + seqSearchResult + "\n" + "binSearch Result: " + binSearchResult + 
		"\n" + "recBinSearch Result: " + recBinSearchResult);
		
		int[] unsortedArray = {5, 1, 8, 3, 9, 2};
		int[] unsortedArray2 = {5, 1, 8, 3, 9, 2};
		int[] unsortedArray3 = {5, 1, 8, 3, 9, 2};
		
		SelectionSort.sort(unsortedArray);
		InsertionSort.sort(unsortedArray2);
		BubbleSort.sort(unsortedArray3);
		
		System.out.println(Arrays.toString(unsortedArray));
		System.out.println(Arrays.toString(unsortedArray2));
		System.out.println(Arrays.toString(unsortedArray3));
	}

}
