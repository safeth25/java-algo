import search.BinSearch;
import search.SeqSearch;

public class Main {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("usage: SeqSearch <key>");
			return;
		}
		
		int schlüssel = Integer.parseInt(args[0]);
		
		// Sortierte Folge
		int[] sortierteFolge = {2, 4, 5, 6, 7, 8, 9, 11};
		
		
		
		int seqSearchResult = SeqSearch.seqSearch(sortierteFolge, schlüssel);
		
		int binSearchResult = BinSearch.binSearch(sortierteFolge, schlüssel);
		
		int recBinSearchResult = BinSearch.recBinSearch(sortierteFolge, schlüssel, 0, sortierteFolge.length - 1);
		
		System.out.println("seqSearch Result: " + seqSearchResult + "\n" + "binSearch Result: " + binSearchResult + 
		"\n" + "recBinSearch Result: " + recBinSearchResult);
	}

}
