package moment1;

/**
 * 	The Class Array 7x7 is an extended version of the twodimensional
 * 	Integer-array.
 * 
 * 	@author Philip Ekholm
 * 	Class created 2016-12-04 16:01
 */

public class Array7x7 {
	private int[][] representation; //Change the name if you can think of something else
	
	/**
	 *	Starts up an Array7x7 and sets character representation
	 *	@param representation displaycharacter 
	*/
	
	public Array7x7(int[][] representation){
		this.representation = representation;
	}
	
	/**
	 *	Returns the representation array
	 *	@return representatin
	*/
	
	public int[][] getRepresentation(){
		return this.representation;
	}
}
