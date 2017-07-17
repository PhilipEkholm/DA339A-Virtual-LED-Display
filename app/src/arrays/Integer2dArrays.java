package arrays;

/*
 *	Biblioteket skrivet av Philip Ekholm
 *
 * 	En vidareutveckling av biblioteket ArraySupporter som skrevs några labbar tillbaka
 * 	för att underlätta programmeringen.
*/

public class Integer2dArrays {
	public static String toString(int[][] array){
		String res = "";
		res += "{";
		
		for(int i = 0; i < array.length; i++){
			res += "{";
			
			for(int j = 0; j < array[i].length; j++){
				res += array[i][j];
				
				if(!(j == array[i].length - 1)){
					res += ", ";
				}
			}
			
			res += "}";
			
			if(!(i == array.length - 1)){
				res += ",";
			}
		}
		
		res += "}";
		
		return res;
	}
	
	public static int elements(int[][] array){
		int amountOfElements = 0;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				amountOfElements++;
			}
		}
		
		return amountOfElements;
	}
	
	public static int max(int[][] array){
		int maximalValue = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				maximalValue = Math.max(maximalValue, array[i][j]);
			}
		}
		
		return maximalValue;
	}
	
	public static int min(int[][] array){
		int minimalValue = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				minimalValue = Math.min(minimalValue, array[i][j]);
			}
		}
		
		return minimalValue;
	}
	
	public static int sum(int[][] array){
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				sum += array[i][j];
			}
		}
		
		return sum;
	}
	
	public static double average(int[][] array){
		double 	sum = 0,
				average;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				sum += array[i][j];
			}
		}
		
		
		
		average = sum / (Integer2dArrays.elements(array));
		return average;
	}
}






























