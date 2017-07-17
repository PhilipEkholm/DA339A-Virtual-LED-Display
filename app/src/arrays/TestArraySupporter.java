package arrays;

public class TestArraySupporter {
	public static void main(String[] args) {
		int[] t = ArraySupporter.generateRandomArray(56, 1, 5);
		
		System.out.println(ArraySupporter.toString(t));
		System.out.println(ArraySupporter.toString(ArraySupporter.occurances(t, 5)));
	}
}
