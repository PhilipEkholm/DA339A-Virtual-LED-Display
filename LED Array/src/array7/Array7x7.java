package array7;

/**
 * 	The Class Array 7x7 is an extended version of the two dimensional
 * 	Integer-array.
 * 
 * 	@author Philip Ekholm
 * 	Class created 2016-12-04 16:01
 */

public class Array7x7 {
	private int[][] representation;
	
	/**
	 *	Starts up an Array7x7 and sets character representation
	 *	@param representation display character 
	*/
	
	public Array7x7(int[][] representation){
		this.representation = representation;
	}
	
	/**
	 *	Simple getter for the representation-array
	 *
	 *	@param pos position to target in array
	 *	@return specific value at position
	*/
	
	public int getElement(int row, int col){
		return this.representation[row][col];
	}
	
	/**
	 *	Simple setter for the elements-array
	 *
	 *	@param pos position to target in array
	 *	@param value value to set position to
	 *	@return specific value at position
	*/
	
	public void setElement(int row, int col, int value){
		this.representation[row][col] = value;
	}
	
	/**
	 *	A getter for collecting an entire Array7x7 row. Note that index starts at 0,
	 *	just like normal arrays. 
	 *
	 *	Please access arrays using getters and 
	 *	setters, even internally for consistency reasons.
	 *
	 *	@param pos position to target in array
	 *	@param value value to set position to
	 *	@return specific value at position
	*/
	
	public Array7 getRow(int row){
		Array7 arr = new Array7();
		
		for(int i = 0; i < this.representation.length; i++){
			arr.setElement(i, this.getElement(row, i));
		}
		
		return arr;
	}
}
