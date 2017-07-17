package arrays;

import java.util.Arrays;
import java.util.Random;

/*
 *	Klassen skriven av Philip Ekholm 2016-10-22
 *
 * 	Klassen erbjuder stödfunktionalitet för 
 * 	arrayer i java, då de inte har egen funktionalitet.
 * 
 * 	ArraySupporter 2.0
*/

//Testa många av dem, javadoc funktionalitet för metoderna dessutom.
//Get col, och get row
//Print 3D Array

public class ArraySupporter{
	
	/**
	 *	Tested 
	 */
	public static double average(int[] array){
		double sum = 0;
		
		for(int key: array){
			sum += key;
		}
		
		return (sum / array.length);
	}
	
	/**
	 *	Tested 
	 */
	
	public static double average(double[] array){
		double sum = 0;
		
		for(double key: array){
			sum += key;
		}
		
		return (sum / array.length);
	}
	
	public static double average(long[] array){
		double sum = 0;
		
		for(double key: array){
			sum += key;
		}
		
		return (sum / array.length);
	}
	
	public static boolean average(boolean[] array){
		int numberOfTrue = 0,
			numberOfFalse = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i]){
				numberOfTrue++;
			}
			else if(!array[i]){
				numberOfFalse++;
			}
		}
		
		return (numberOfTrue >= numberOfFalse);
	}
	
	public static int[] copy(int[] array){
		int[] newArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static double[] copy(double[] array){
		double[] newArray = new double[array.length];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static long[] copy(long[] array){
		long[] newArray = new long[array.length];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static char[] copy(char[] array){
		char[] newArray = new char[array.length];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static String[] copy(String[] array){
		String[] newArray = new String[array.length];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static boolean[] copy(boolean[] array){
		boolean[] newArray = new boolean[array.length];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static int[] cut(int[] array, int startIndex, int stopIndex){
		int[] reducedArray;
		
		if(startIndex > stopIndex){
			int tmp;
			
			tmp = startIndex;
			startIndex = stopIndex;
			stopIndex = tmp;
		}
		
		reducedArray = new int[(stopIndex + 1) - startIndex];
		
		int k = 0;
		for(int i = startIndex; i <= stopIndex; i++){
			reducedArray[k] = array[i];
			k++;
		}
		
		return reducedArray;
	}
	
	public static double[] cut(double[] array, int startIndex, int stopIndex){
		double[] reducedArray;
		
		if(startIndex > stopIndex){
			int tmp;
			
			tmp = startIndex;
			startIndex = stopIndex;
			stopIndex = tmp;
		}
		
		reducedArray = new double[(stopIndex + 1) - startIndex];
		
		int k = 0;
		for(int i = startIndex; i <= stopIndex; i++){
			reducedArray[k] = array[i];
			k++;
		}
		
		return reducedArray;
	}
	
	public static long[] cut(long[] array, int startIndex, int stopIndex){
		long[] reducedArray;
		
		if(startIndex > stopIndex){
			int tmp;
			
			tmp = startIndex;
			startIndex = stopIndex;
			stopIndex = tmp;
		}
		
		reducedArray = new long[(stopIndex + 1) - startIndex];
		
		int k = 0;
		for(int i = startIndex; i <= stopIndex; i++){
			reducedArray[k] = array[i];
			k++;
		}
		
		return reducedArray;
	}
	
	public static char[] cut(char[] array, int startIndex, int stopIndex){
		char[] reducedArray;
		
		if(startIndex > stopIndex){
			int tmp;
			
			tmp = startIndex;
			startIndex = stopIndex;
			stopIndex = tmp;
		}
		
		reducedArray = new char[(stopIndex + 1) - startIndex];
		
		int k = 0;
		for(int i = startIndex; i <= stopIndex; i++){
			reducedArray[k] = array[i];
			k++;
		}
		
		return reducedArray;
	}
	
	public static String[] cut(String[] array, int startIndex, int stopIndex){
		String[] reducedArray;
		
		if(startIndex > stopIndex){
			int tmp;
			
			tmp = startIndex;
			startIndex = stopIndex;
			stopIndex = tmp;
		}
		
		reducedArray = new String[(stopIndex + 1) - startIndex];
		
		int k = 0;
		for(int i = startIndex; i <= stopIndex; i++){
			reducedArray[k] = array[i];
			k++;
		}
		
		return reducedArray;
	}
	
	public static boolean[] cut(boolean[] array, int startIndex, int stopIndex){
		boolean[] reducedArray;
		
		if(startIndex > stopIndex){
			int tmp;
			
			tmp = startIndex;
			startIndex = stopIndex;
			stopIndex = tmp;
		}
		
		reducedArray = new boolean[(stopIndex + 1) - startIndex];
		
		int k = 0;
		for(int i = startIndex; i <= stopIndex; i++){
			reducedArray[k] = array[i];
			k++;
		}
		
		return reducedArray;
	}
	
	public static int findFirstTargetIndex(int target, int[] array){
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				return i;
			}
		}
		
		return -1;
	}
	
	public static int findFirstTargetIndex(double target, double[] array){
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				return i;
			}
		}
		
		return -1;
	}
	
	public static int findFirstTargetIndex(long target, long[] array){
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				return i;
			}
		}
		
		return -1;
	}
	
	public static int findFirstTargetIndex(char target, char[] array){
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				return i;
			}
		}
		
		return -1;
	}
	
	public static int findFirstTargetIndex(String target, String[] array){
		for(int i = 0; i < array.length; i++){
			if(target.equals(array[i])){
				return i;
			}
		}
		
		return -1;
	}
	
	public static int findFirstTargetIndex(boolean target, boolean[] array){
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 *	Return with values inclusive intervals 
	 */
	
	public static int[] generateRandomArray(int length, int minInterval, int maxInterval){
		int[] generatedArray = new int[length];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			int tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			generatedArray[i] = (rand.nextInt(maxInterval - minInterval + 1) + minInterval);
		}
		
		return generatedArray;
	}
	
	/**
	 *	Return with values inclusive intervals 
	 */
	
	public static double[] generateRandomArray(int length, double minInterval, double maxInterval){
		double[] generatedArray = new double[length];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			double tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			generatedArray[i] = ((rand.nextDouble() * maxInterval - minInterval) + minInterval);
		}
		
		return generatedArray;
	}
	
	/**
	 *	Return with values inclusive intervals, must be tested
	 */
	
	public static long[] generateRandomArray(int length, long minInterval, long maxInterval){
		long[] generatedArray = new long[length];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			long tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			generatedArray[i] = ((rand.nextLong() * maxInterval - minInterval) + minInterval);

		}
		
		return generatedArray;
	}
	
	public static boolean[] generateRandomArray(int length){
		boolean[] generatedArray = new boolean[length];
		Random rand = new Random();
		
		for(int i = 0; i < generatedArray.length; i++){
			generatedArray[i] = rand.nextBoolean();
		}
		
		return generatedArray;
	}

	public static int maxValue(int[] array){
		int maximalValue = Integer.MIN_VALUE;
		
		for(int key: array){
			maximalValue = Math.max(maximalValue, key);
		}
		
		return maximalValue;
	}
	
	public static double maxValue(double[] array){
		double maximalValue = Double.MIN_VALUE;
		
		for(double key: array){
			maximalValue = Math.max(maximalValue, key);
		}
		
		return maximalValue;
	}
	
	public static long maxValue(long[] array){
		long maximalValue = Long.MIN_VALUE;
		
		for(long key: array){
			maximalValue = Math.max(maximalValue, key);
		}
		
		return maximalValue;
	}
	
	/**
	 * 	Testad
	 */
	
	public static double median(int[] array){
		int[] reference = ArraySupporter.copy(array);
		int position;
		Arrays.sort(reference);
		
		if(reference.length % 2 != 0){
			//OBS! Supertrick, det blir aldrig jämnt men då 
			//det är division med heltal räknas rest bort, så stämmer detta
			position = reference.length / 2;
			
			return (reference[(int)position]);
		}
		else if(reference.length != 0){
			position = (reference.length - 1) / 2;
			double value = reference[position];
			value += reference[position + 1];
			
			return value / 2;
		}
		else{
			return 0;
		}
	}
	
	public static double median(double[] array){
		double[] reference = ArraySupporter.copy(array);
		int position;
		Arrays.sort(reference);
		
		if(reference.length % 2 != 0){
			//OBS! Supertrick, det blir aldrig jämnt men då 
			//det är division med heltal räknas rest bort, så stämmer detta
			position = reference.length / 2;
			
			return (reference[(int)position]);
		}
		else if(reference.length != 0){
			position = (reference.length - 1) / 2;
			double value = reference[position];
			value += reference[position + 1];
			
			return value / 2;
		}
		else{
			return 0;
		}
	}
	
	public static double median(long[] array){
		long[] reference = ArraySupporter.copy(array);
		int position;
		Arrays.sort(reference);
		
		if(reference.length % 2 != 0){
			//OBS! Supertrick, det blir aldrig jämnt men då 
			//det är division med heltal räknas rest bort, så stämmer detta
			position = reference.length / 2;
			
			return (reference[(int)position]);
		}
		else if(reference.length != 0){
			position = (reference.length - 1) / 2;
			double value = reference[position];
			value += reference[position + 1];
			
			return value / 2;
		}
		else{
			return 0;
		}
	}

	public static int[] merge(int[] array1, int[] array2){
		int totalLength = array1.length + array2.length;
		
		int[] merged = new int[totalLength];
		
		for(int i = 0; i < totalLength; i++){
			if(array1.length > i){
				merged[i] = array1[i];
			}
			else{
				merged[i] = array2[i - array1.length];
			}
		}
		
		return merged;
	}

	public static double[] merge(double[] array1, double[] array2){
		int totalLength = array1.length + array2.length;
		
		double[] merged = new double[totalLength];
		
		for(int i = 0; i < totalLength; i++){
			if(array1.length > i){
				merged[i] = array1[i];
			}
			else{
				merged[i] = array2[i - array1.length];
			}
		}
		
		return merged;
	}

	public static long[] merge(long[] array1, long[] array2){
		int totalLength = array1.length + array2.length;
		
		long[] merged = new long[totalLength];
		
		for(int i = 0; i < totalLength; i++){
			if(array1.length > i){
				merged[i] = array1[i];
			}
			else{
				merged[i] = array2[i - array1.length];
			}
		}
		
		return merged;
	}
	
	public static char[] merge(char[] array1, char[] array2){
		int totalLength = array1.length + array2.length;
		
		char[] merged = new char[totalLength];
		
		for(int i = 0; i < totalLength; i++){
			if(array1.length > i){
				merged[i] = array1[i];
			}
			else{
				merged[i] = array2[i - array1.length];
			}
		}
		
		return merged;
	}
	
	public static String[] merge(String[] array1, String[] array2){
		int totalLength = array1.length + array2.length;
		
		String[] merged = new String[totalLength];
		
		for(int i = 0; i < totalLength; i++){
			if(array1.length > i){
				merged[i] = array1[i];
			}
			else{
				merged[i] = array2[i - array1.length];
			}
		}
		
		return merged;
	}
	
	public static boolean[] merge(boolean[] array1, boolean[] array2){
		int totalLength = array1.length + array2.length;
		
		boolean[] merged = new boolean[totalLength];
		
		for(int i = 0; i < totalLength; i++){
			if(array1.length > i){
				merged[i] = array1[i];
			}
			else{
				merged[i] = array2[i - array1.length];
			}
		}
		
		return merged;
	}
	
	/*
	 * Måste testas mer noggrant
	 * */
	
	public static int[][] merge2D(int[][] array1, int[][] array2, MergePosition pos){
		int longestRow = Math.max(array1.length, array2.length),
			longestCol = Math.max(array1[0].length, array2[0].length),
			totalRowLength = array1.length + array2.length,
			totalColLength = array1[0].length + array2[0].length;
		int [][] mergedArray;
		
		if(pos == MergePosition.EXPANDCOLS){
			mergedArray = new int[longestRow][totalColLength];
			
			for(int i = 0; i < mergedArray.length; i++){
				for(int j = 0; j < totalColLength; j++){
					if(array1[0].length > j){
						mergedArray[i][j] = array1[i][j];
					}
					else{
						mergedArray[i][j] = array2[i][j - array1[0].length];
					}
				}
			}
			
			return mergedArray;
		}
		else if(pos == MergePosition.EXPANDROWS){
			mergedArray = new int[totalRowLength][longestCol];
			
			for(int i = 0; i < mergedArray.length; i++){
				for(int j = 0; j < mergedArray[0].length; j++){
					if(array1.length > i){
						mergedArray[i][j] = array1[i][j];
					}
					else{
						mergedArray[i][j] = array2[i - array1.length][j];
					}
				}
			}
			
			return mergedArray;
		}
		else{
			System.out.println("Ogiltigt enum alternativ!");
			return new int[0][0];
		}
	}
	
	public static int mostCommonNumber(int[] a){
		int count = 1, tempCount;
		int popular = a[0];
		int temp = 0;
	  
		for (int i = 0; i < (a.length - 1); i++){
			temp = a[i];
			tempCount = 0;
			
			for (int j = 1; j < a.length; j++){
				if (temp == a[j]){
					tempCount++;
				}
			}
	    
			if (tempCount > count){
				popular = temp;
				count = tempCount;
			}
		}
		
		return popular;
	}
	
	public static int minValue(int[] array){
		int minimalValue = Integer.MAX_VALUE;
		
		for(int key: array){
			minimalValue = Math.min(minimalValue, key);
		}
		
		return minimalValue;
	}
	
	public static double minValue(double[] array){
		double minimalValue = Integer.MAX_VALUE;
		
		for(double key: array){
			minimalValue = Math.min(minimalValue, key);
		}
		
		return minimalValue;
	}
	
	public static long minValue(long[] array){
		long minimalValue = Integer.MAX_VALUE;
		
		for(long key: array){
			minimalValue = Math.min(minimalValue, key);
		}
		
		return minimalValue;
	}
	
	public static int[] occurances(int[] array, int target){
		int count = 0;
		int[] positions;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				count++;
			}
		}
		
		positions = new int[count];
		count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				positions[count] = i;
				count++;
			}
		}
		
		return positions;
	}
	
	public static int[] occurances(double[] array, double target){
		int count = 0;
		int[] positions;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				count++;
			}
		}
		
		positions = new int[count];
		count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				positions[count] = i;
				count++;
			}
		}
		
		return positions;
	}
	
	public static int[] occurances(long[] array, long target){
		int count = 0;
		int[] positions;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				count++;
			}
		}
		
		positions = new int[count];
		count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				positions[count] = i;
				count++;
			}
		}
		
		return positions;
	}
	
	public static int[] occurances(char[] array, char target){
		int count = 0;
		int[] positions;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				count++;
			}
		}
		
		positions = new int[count];
		count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				positions[count] = i;
				count++;
			}
		}
		
		return positions;
	}
	
	public static int[] occurances(String[] array, String target){
		int count = 0;
		int[] positions;
		
		for(int i = 0; i < array.length; i++){
			if(target.equals(array[i])){
				count++;
			}
		}
		
		positions = new int[count];
		count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(target.equals(array[i])){
				positions[count] = i;
				count++;
			}
		}
		
		return positions;
	}
	
	public static int[] occurances(boolean[] array, boolean target){
		int count = 0;
		int[] positions;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				count++;
			}
		}
		
		positions = new int[count];
		count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				positions[count] = i;
				count++;
			}
		}
		
		return positions;
	}
	
	public static int[] reverse(int[] array){
		int[] reversedArray = new int[array.length];
		int k = 0;
		
		for(int i = array.length -1; i >= 0; i--){
			reversedArray[i] = array[k];
			k++;
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = reversedArray[i];
		}
		
		return array;
	}
	
	public static double[] reverse(double[] array){
		double[] reversedArray = new double[array.length];
		int k = 0;
		
		for(int i = array.length -1; i >= 0; i--){
			reversedArray[i] = array[k];
			k++;
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = reversedArray[i];
		}
		
		return array;
	}
	
	public static long[] reverse(long[] array){
		long[] reversedArray = new long[array.length];
		int k = 0;
		
		for(int i = array.length -1; i >= 0; i--){
			reversedArray[i] = array[k];
			k++;
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = reversedArray[i];
		}
		
		return array;
	}
	
	public static char[] reverse(char[] array){
		char[] reversedArray = new char[array.length];
		int k = 0;
		
		for(int i = array.length -1; i >= 0; i--){
			reversedArray[i] = array[k];
			k++;
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = reversedArray[i];
		}
		
		return array;
	}

	public static String[] reverse(String[] array){
		String[] reversedArray = new String[array.length];
		int k = 0;
		
		for(int i = array.length -1; i >= 0; i--){
			reversedArray[i] = array[k];
			k++;
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = reversedArray[i];
		}
		
		return array;
	}
	
	public static boolean[] reverse(boolean[] array){
		boolean[] reversedArray = new boolean[array.length];
		int k = 0;
		
		for(int i = array.length -1; i >= 0; i--){
			reversedArray[i] = array[k];
			k++;
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = reversedArray[i];
		}
		
		return array;
	}
	
	public static int sum(int[] array){
		int sum = 0;
		
		for(int key: array){
			sum += key;
		}
		
		return sum;
	}

	public static double sum(double[] array){
		double sum = 0;
		
		for(double key: array){
			sum += key;
		}
		
		return sum;
	}
	
	public static long sum(long[] array){
		long sum = 0;
		
		for(double key: array){
			sum += key;
		}
		
		return sum;
	}
	
	public static int[] sortDesc(int[] array){
		Arrays.sort(array);
		ArraySupporter.reverse(array); 
		
		return array;
	}
	
	public static double[] sortDesc(double[] array){
		Arrays.sort(array);
		ArraySupporter.reverse(array); 
		
		return array;
	}
	
	public static long[] sortDesc(long[] array){
		Arrays.sort(array);
		ArraySupporter.reverse(array); 
		
		return array;
	}
	
	public static String toString(int[] array){
		String res = "[";
		
		for(int i = 0; i < array.length; i++){
			res += array[i];
			
			if(!(i == array.length -1)){
				res += ", ";
			}
		}
		
		res += "]";
		
		return res;
	}
	
	public static String toString(double[] array){
		String res = "[";
		
		for(int i = 0; i < array.length; i++){
			res += array[i];
			
			if(!(i == array.length -1)){
				res += ", ";
			}
		}
		
		res += "]";
		
		return res;
	}
	
	public static String toString(long[] array){
		String res = "[";
		
		for(int i = 0; i < array.length; i++){
			res += array[i];
			
			if(!(i == array.length -1)){
				res += ", ";
			}
		}
		
		res += "]";
		
		return res;
	}
	
	public static String toString(char[] array){
		String res = "[";
		
		for(int i = 0; i < array.length; i++){
			res += array[i];
			
			if(!(i == array.length -1)){
				res += ", ";
			}
		}
		
		res += "]";
		
		return res;
	}
	
	public static String toString(String[] array){
		String res = "[";
		
		for(int i = 0; i < array.length; i++){
			res += array[i];
			
			if(!(i == array.length -1)){
				res += ", ";
			}
		}
		
		res += "]";
		
		return res;
	}

	public static String toString(boolean[] array){
		String res = "[";
		
		for(int i = 0; i < array.length; i++){
			if(array[i]){
				res += "T";
			}
			else{
				res += "F";
			}
			
			if(!(i == array.length -1)){
				res += ", ";
			}
		}
		
		res += "]";
		
		return res;
	}
}











