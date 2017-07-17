package arrays;

import java.util.Random;

public class ArraySupporter3D {
	public static int[][][] copy(int[][][] array){
		int[][][] newArray = new int[array.length][array[0].length][array[0][0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				for(int k = 0; k < array[i][j].length; k++){
					newArray[i][j][k] = array[i][j][k];
				}
			}
		}
		
		return newArray;
	}
	
	public static double[][][] copy(double[][][] array){
		double[][][] newArray = new double[array.length][array[0].length][array[0][0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				for(int k = 0; k < array[i][j].length; k++){
					newArray[i][j][k] = array[i][j][k];
				}
			}
		}
		
		return newArray;
	}
	
	public static long[][][] copy(long[][][] array){
		long[][][] newArray = new long[array.length][array[0].length][array[0][0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				for(int k = 0; k < array[i][j].length; k++){
					newArray[i][j][k] = array[i][j][k];
				}
			}
		}
		
		return newArray;
	}
	
	public static char[][][] copy(char[][][] array){
		char[][][] newArray = new char[array.length][array[0].length][array[0][0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				for(int k = 0; k < array[i][j].length; k++){
					newArray[i][j][k] = array[i][j][k];
				}
			}
		}
		
		return newArray;
	}
	
	public static String[][][] copy(String[][][] array){
		String[][][] newArray = new String[array.length][array[0].length][array[0][0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				for(int k = 0; k < array[i][j].length; k++){
					newArray[i][j][k] = array[i][j][k];
				}
			}
		}
		
		return newArray;
	}
	
	public static boolean[][][] copy(boolean[][][] array){
		boolean[][][] newArray = new boolean[array.length][array[0].length][array[0][0].length];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				for(int k = 0; k < array[i][j].length; k++){
					newArray[i][j][k] = array[i][j][k];
				}
			}
		}
		
		return newArray;
	}
	
	/**
	 *	Return with values inclusive intervals 
	 */
	
	public static int[][][] generateRandomArray(int rows, int cols, int depth, int minInterval, int maxInterval){
		int[][][] generatedArray = new int[rows][cols][depth];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			int tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				for(int k = 0; k < generatedArray[i][j].length; j++){
					generatedArray[i][j][k] = (rand.nextInt(maxInterval - minInterval + 1) + minInterval);
				}
			}
		}
		
		return generatedArray;
	}
	
	public static double[][][] generateRandomArray(int rows, int cols, int depth, double minInterval, double maxInterval){
		double[][][] generatedArray = new double[rows][cols][depth];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			double tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				for(int k = 0; k < generatedArray[i][j].length; j++){
					generatedArray[i][j][k] = ((rand.nextDouble() * maxInterval - minInterval) + minInterval);
				}
			}
		}
		
		return generatedArray;
	}
	
	public static long[][][] generateRandomArray(int rows, int cols, int depth, long minInterval, long maxInterval){
		long[][][] generatedArray = new long[rows][cols][depth];
		Random rand = new Random();
		
		if(minInterval > maxInterval){
			long tmp;
			
			tmp = minInterval;
			minInterval = maxInterval;
			maxInterval = tmp;
		}
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				for(int k = 0; k < generatedArray[i][j].length; j++){
					generatedArray[i][j][k] = ((rand.nextLong() * maxInterval - minInterval) + minInterval);
				}
			}
		}
		
		return generatedArray;
	}
	
	public static boolean[][][] generateRandomArray(int depth, int rows, int cols){
		boolean[][][] generatedArray = new boolean[depth][rows][cols];
		Random rand = new Random();
		
		for(int i = 0; i < generatedArray.length; i++){
			for(int j = 0; j < generatedArray[i].length; j++){
				for(int k = 0; k < generatedArray[i][j].length; k++){
					generatedArray[i][j][k] = rand.nextBoolean();
				}
			}
		}
		return generatedArray;
	}
	
	public static int maxValue(int[][][] array){
		int maximalValue = array[0][0][0];
		
		for(int[][] table: array){
			for(int[] row : table){
				for(int depth: row){
					maximalValue = Math.max(maximalValue, depth);
				}
			}
		}
		
		return maximalValue;
	}
	
	public static double maxValue(double[][][] array){
		double maximalValue = array[0][0][0];
		
		for(double[][] table: array){
			for(double[] row : table){
				for(double depth: row){
					maximalValue = Math.max(maximalValue, depth);
				}
			}
		}
		
		return maximalValue;
	}
	
	public static long maxValue(long[][][] array){
		long maximalValue = array[0][0][0];
		
		for(long[][] table: array){
			for(long[] row : table){
				for(long depth: row){
					maximalValue = Math.max(maximalValue, depth);
				}
			}
		}
		
		return maximalValue;
	}
}
