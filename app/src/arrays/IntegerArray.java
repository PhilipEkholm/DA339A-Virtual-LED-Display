package arrays;

public class IntegerArray {
	
	//Skriver ut array på rå form
	public static String toString(int[] array){
		String res = "{";
		
		for(int i = 0; i < array.length; i++){
			res += array[i];
			
			//Kontrollera om man ska sätta ett komma till eller om vi nått slutet
			if(!(i == array.length -1)){
				res += ", ";
			}
		}
		
		return res + "}";
	}
	
	public static int max(int[] array){
		int maximalValue = Integer.MIN_VALUE; //Talet i fråga kan vara negativt (<0)
		
		for(int key: array){
			maximalValue = Math.max(maximalValue, key);
		}
		
		return maximalValue;
	}
	
	public static int min(int[] array){
		int minimalValue = Integer.MAX_VALUE;
		
		for(int key: array){
			minimalValue = Math.min(minimalValue, key);
		}
		
		return minimalValue;
	}
	
	public static int sum(int[] array){
		int sum = 0;
		
		for(int key: array){
			sum += key;
		}
		
		return sum;
	}
	
	public static double average(int[] array){
		double sum = 0;
		
		for(int key: array){
			sum += key;
		}
		
		return (sum / array.length);
	}
	
	public static int range(int[] array){
		return (IntegerArray.max(array) - IntegerArray.min(array));
	}
	
	public static int[] reverse(int[] array){
		int[] reversedArray = new int[array.length];
		int k = 0;
		
		//Kopiera array och sedan skriv över i reverse
		
		for(int i = array.length -1; i >= 0; i--){
			reversedArray[i] = array[k];
			k++;
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = reversedArray[i];
		}
		
		return array;
	}
	
	//Denna sortering görs med bubbelsortering
	
	public static int[] sortAsc(int[] array) {
	    boolean swapped = true;
	    int j = 0;
	    int tmp;
	    
	    while (swapped) {
	        swapped = false;
	        j++;
	        
	        for (int i = 0; i < array.length - j; i++) {
	            if (array[i] > array[i + 1]) {
	                tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
	    
	    return array;
	}
	
	public static int[] sortDesc(int[] array){
		IntegerArray.sortAsc(array); //Detta fungerar då du skickar referens och inte kopia
		IntegerArray.reverse(array); //Jag har redan skrivit en reverse funktion
		
		return array;
	}
	
	public static int[] copy(int[] array){
		int[] newArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	/*
	 *	Fel i algoritmen om antalet element är jämna. 
	*/
	
	public static double median(int[] array){
		int[] newArray = IntegerArray.copy(array);
		
		IntegerArray.sortAsc(newArray);
		
		int middle = newArray.length/2;
		double medianValue = 0;
		
		if (newArray.length%2 == 1){
		    medianValue = newArray[middle];
		}
		else{
		   medianValue = (newArray[middle-1] + newArray[middle]) / 2;
		}
		
		return medianValue;
	}
	
	/*
	 *	Måste bestämma vilket tal som ska skrivas ut om flera är lika förekommande 
	 */
	public static int mode(int[] a){
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
	
	public static int findFirstTargetIndex(int target, int[] array){
		for(int i = 0; i < array.length; i++){
			if(target == array[i]){
				return i;
			}
		}
		
		return -1;
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
}





























