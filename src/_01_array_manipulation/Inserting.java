package _01_array_manipulation;

import java.util.ArrayList;
import java.util.Iterator;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		int[] newArray = new int[testArray.length + 1];
		for (int k = 0; k < newArray.length; k++) {
			if(k==i) {
				newArray[k]=j;
			}else if(k>i){
				newArray[k] = testArray[k-1];
			}else {
				newArray[k] = testArray[k];
			}
		}
		return newArray;
//		System.out.println(testArray);
//		int[] newArray = new int[testArray.length + 1];
//		int[] firstArray = new int[j];
//		int[] secondArray = new int[testArray.length - j];
//		for (int k = 0; k < j; k++) {
//			firstArray[k] = testArray[k];
//		}
//		System.out.println(firstArray.toString());
//		for(int k = testArray.length; k > testArray.length - j; k--) {
//			secondArray[k] = testArray[k];
//		}
//		System.out.println(secondArray);
//		for (int k = 0; k < firstArray.length; k++) {
//			newArray[k] = firstArray[k];
//		}
//		newArray[i] = i;
//		for (int k = j+1; k < newArray.length ; k++) {
//			newArray[k] = secondArray[k];
//		}
//		return newArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		Sorting sort = new Sorting();
		
		String[]newArray = new String[orderedArray.length + 1];
		for (int i = 0; i < newArray.length - 1; i++) {
			newArray[i] = orderedArray[i];
		}
		newArray[newArray.length - 1] = string;
		sort.sort(newArray);
		return newArray;
	}
	
}
