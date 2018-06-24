package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		String word1 = "";
		String word2 = "";
		int compare = 0;
		boolean swap = false;
		boolean test = true;
		int swapcounter = 0;
		while(test == true) {
			swapcounter=0;
			for (int i = 0; i < testArray.length-1; i++) {
				swap = false;
				word1 = testArray[i];
				word2 = testArray[i+1];
				compare = word1.compareTo(word2);
				if(compare <= -1) {
					
				}else if(compare == 0) {
					
				}else {
					testArray[i]=word2;
					testArray[i+1]=word1;
					swapcounter++;
				}
			}
			if(swapcounter==0) {
				test=false;
			}else {
				test=true;
			}
		}
	
		
	}

}
