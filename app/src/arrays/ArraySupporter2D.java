package arrays;

import java.util.Random;

public class ArraySupporter2D {
	
	public static int[][] copy(int[][] array){
		int[][] newArray = new int[array.length][array[0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				newArray[i][j] = array[i][j];
			}
		}
		
		return newArray;
	}
	
	public static double[][] copy(double[][] array){
		double[][] newArray = new double[array.length][array[0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				newArray[i][j] = array[i][j];
			}
		}
		
		return newArray;
	}
	
	public static long[][] copy(long[][] array){
		long[][] newArray = new long[array.length][array[0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				newArray[i][j] = array[i][j];
			}
		}
		
		return newArray;
	}
	
	public static char[][] copy(char[][] array){
		char[][] newArray = new char[array.length][array[0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				newArray[i][j] = array[i][j];
			}
		}
		
		return newArray;
	}
	
	public static String[][] copy(String[][] array){
		String[][] newArray = new String[array.length][array[0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				newArray[i][j] = array[i][j];
			}
		}
		
		return newArray;
	}
	
	public static boolean[][] copy(boolean[][] array){
		boolean[][] newArray = new boolean[array.length][array[0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				newArray[i][j] = array[i][j];
			}
		}
		
		return newArray;
	}
	
	/**
	 *	Return with values inclusive intervals 
	 */
	
	public static int[][] generateRandomArray(int rows, int cols, int minInterval, int maxInterval){
		int[][] generatedArray = new int[rows][cols];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			int tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				generatedArray[i][j] = (rand.nextInt(maxInterval - minInterval + 1) + minInterval);
			}
		}
		
		return generatedArray;
	}
	
	/**
	 *	Return with values inclusive intervals 
	 */
	
	public static double[][] generateRandomArray(int rows, int cols, double minInterval, double maxInterval){
		double[][] generatedArray = new double[rows][cols];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			double tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				generatedArray[i][j] = ((rand.nextDouble() * maxInterval - minInterval) + minInterval);
			}
		}
		
		return generatedArray;
	}
	
	/**
	 *	Return with values inclusive intervals 
	 */
	
	public static long[][] generateRandomArray(int rows, int cols, long minInterval, long maxInterval){
		long[][] generatedArray = new long[rows][cols];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			long tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				generatedArray[i][j] = ((rand.nextLong() * maxInterval - minInterval) + minInterval);
			}
		}
		
		return generatedArray;
	}
	
	public static boolean[][] generateRandomArray(int rows, int cols){
		boolean[][] generatedArray = new boolean[rows][cols];
		Random rand = new Random();
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				generatedArray[i][j] = rand.nextBoolean();
			}
		}
		
		return generatedArray;
	}
	
	/**
	 *	Testad
	 */
	
	public static int maxValue(int[][] array){
		int maximalValue = array[0][0];
		
		for(int[] row: array){
			for(int col: row){
				maximalValue = Math.max(maximalValue, col);
			}
		}
		
		return maximalValue;
	}
	
	public static double maxValue(double[][] array){
		double maximalValue = array[0][0];
		
		for(double[] row: array){
			for(double col: row){
				maximalValue = Math.max(maximalValue, col);
			}
		}
		
		return maximalValue;
	}
	
	public static long maxValue(long[][] array){
		long maximalValue = array[0][0];
		
		for(long[] row: array){
			for(long col: row){
				maximalValue = Math.max(maximalValue, col);
			}
		}
		
		return maximalValue;
	}
	
	public static int minValue(int[][] array){
		int minimalValue = array[0][0];
		
		for(int[] row: array){
			for(int col: row){
				minimalValue = Math.min(minimalValue, col);
			}
		}
		
		return minimalValue;
	}
	
	public static double minValue(double[][] array){
		double minimalValue = array[0][0];
		
		for(double[] row: array){
			for(double col: row){
				minimalValue = Math.min(minimalValue, col);
			}
		}
		
		return minimalValue;
	}
	
	public static long minValue(long[][] array){
		long minimalValue = array[0][0];
		
		for(long[] row: array){
			for(long col: row){
				minimalValue = Math.min(minimalValue, col);
			}
		}
		
		return minimalValue;
	}
	
	public static int sum(int[][] array){
		int sum = 0;
		
		for(int[] row: array){
			for(int col: row){
				sum += col;
			}
		}
		
		return sum;
	}
	
	public static double sum(double[][] array){
		double sum = 0;
		
		for(double[] row: array){
			for(double col: row){
				sum += col;
			}
		}
		
		return sum;
	}
	
	public static long sum(long[][] array){
		long sum = 0;
		
		for(long[] row: array){
			for(long col: row){
				sum += col;
			}
		}
		
		return sum;
	}
	
	public static String toString(int[][] array){
		String res = "";
		
		for(int i = 0; i < array.length; i++){
			res += "[";
			
			for(int j = 0; j < array[i].length; j++){
				res += array[i][j];
				
				if(!(j == array[i].length -1)){
					res += ", ";
				}
				else{
					res += "]";
				}
			}
			
			res += "\n";
		}
		
		return res;
	}
	
	public static String toString(double[][] array){
		String res = "";
		
		for(int i = 0; i < array.length; i++){
			res += "[";
			
			for(int j = 0; j < array[i].length; j++){
				res += array[i][j];
				
				if(!(j == array[i].length -1)){
					res += ", ";
				}
				else{
					res += "]";
				}
			}
			
			res += "\n";
		}
		
		return res;
	}
	
	public static String toString(long[][] array){
		String res = "";
		
		for(int i = 0; i < array.length; i++){
			res += "[";
			
			for(int j = 0; j < array[i].length; j++){
				res += array[i][j];
				
				if(!(j == array[i].length -1)){
					res += ", ";
				}
				else{
					res += "]";
				}
			}
			
			res += "\n";
		}
		
		return res;
	}
	
	public static String toString(char[][] array){
		String res = "";
		
		for(int i = 0; i < array.length; i++){
			res += "[";
			
			for(int j = 0; j < array[i].length; j++){
				res += array[i][j];
				
				if(!(j == array[i].length -1)){
					res += ", ";
				}
				else{
					res += "]";
				}
			}
			
			res += "\n";
		}
		
		return res;
	}
	
	public static String toString(String[][] array){
		String res = "";
		
		for(int i = 0; i < array.length; i++){
			res += "[";
			
			for(int j = 0; j < array[i].length; j++){
				res += array[i][j];
				
				if(!(j == array[i].length -1)){
					res += ", ";
				}
				else{
					res += "]";
				}
			}
			
			res += "\n";
		}
		
		return res;
	}

	public static String toString(boolean[][] array){
		String res = "";
		
		for(int i = 0; i < array.length; i++){
			res += "[";
			
			for(int j = 0; j < array[i].length; j++){
				if(array[i][j]){
					res += "T";
				}
				else if(!array[i][j]){
					res += "F";
				}
				
				if(!(j == array[i].length -1)){
					res += ", ";
				}
				else{
					res += "]";
				}
			}
			
			res += "\n";
		}
		
		return res;
	}
}
