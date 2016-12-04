package moment1;
import arrays.Integer2dArrays;
import moment5.Characters;

public class TestChars {
	public static void main(String[] args) {
		Array7x7 arr = Characters.getChar('A');
		System.out.println(Integer2dArrays.toString(arr.getRepresentation()));
	}
}
