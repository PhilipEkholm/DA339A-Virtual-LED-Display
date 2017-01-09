package array7;
import arrays.ArraySupporter2D;
import characters.Characters;
import exceptions.IllegalBitException;

/**
 * 	The Class Array 7x7 is an extended version of the two dimensional
 * 	Integer-array.
 * 
 * 	@author Philip Ekholm, Lucas Borg (shiftUp and shiftDown)
 * 	Class created 2016-12-04 16:01
 */

public class Array7x7 {
	private int[][] representation;
	
	/**
	 *	Starts up an Array7x7 and sets character representation.
	 *	This constructor will be called if getChar in characters is called.
	 *	@param character display character 
	*/
	
	public Array7x7(int[][] character){
		this.representation = ArraySupporter2D.copy(character);
	}
	
	/**
	 *	Starts up Array7x7. If no representation passed as argument it will
	 *	show the unknown symbol. 
	*/
	
	public Array7x7(){
		this.representation = ArraySupporter2D.copy(Characters.UNKNOWN);
	}
	
	/**
	 *	Simple getter for the representation-array
	 *
	 *	@param row position to target in array
	 *	@param col position to target in array
	 *	@return specific value at position
	*/
	
	public int getElement(int row, int col){
		return this.representation[row][col];
	}
	
	/**
	 *	Simple setter for the elements-array. If illegal value is passed then IllegalBitException will be thrown
	 *
	 *	@param row position to target in array
	 *	@param col position to target in array
	 *	@param value value to set position to
	*/
	
	public void setElement(int row, int col, int value) throws IllegalBitException{
		if(value < 0 || value > 1){
			throw new IllegalBitException("Illegal value passed in Array7x7.setElement!");
		}
		else{
			this.representation[row][col] = value;
		}
	}
	
	/**
	 *	A getter for collecting an entire Array7x7 row. Note that index starts at 0,
	 *	just like normal arrays. 
	 *
	 *	Please access arrays using getters and 
	 *	setters, even internally for consistency reasons.
	 *
	 *	@param row to target in array
	 *	@return specific row at position
	*/
	
	public Array7 getRow(int row){
		Array7 arr = new Array7();
		
		for(int i = 0; i < this.representation.length; i++){
			arr.setElement(i, this.getElement(row, i));
		}
		
		return arr;
	}
	
	/**
	 * 	Set a whole row of the array. If an illegal value is passed then IllegalBitException will be thrown.
	 * 
	 * 	@param row to target in array, starts at 0
	 * 	@param newRowValue to overwrite the row with
	 */
	
	public void setRow(int row, Array7 newRowValue) throws IllegalBitException{
		int[] elem = newRowValue.getElements();
		for(int i = 0; i < elem.length; i++){
			if(elem[i] < 0 || elem[i] > 1){
				throw new IllegalBitException("Illegal value passed in Array7x7.setRow!");
			}
		}
		
		this.representation[row] = newRowValue.getElements();
	}
	
	/**
	 * 	Get a whole column of values.
	 * 
	 * 	@param col column to access, starts at 0
	 * 	@return Array7 of column values
	 */
	
	public Array7 getCol(int col){
		Array7 arr = new Array7();
		
		for(int i = 0; i < this.representation.length; i++){
			arr.setElement(i, this.representation[i][col]);
		}
		
		return arr;
	}
	
	/**
	 *	Set a whole column of values.
	 *
	 *	@param col column to access, starts at 0
	 *	@param arr array to overwrite the column with
	*/
	
	public void setCol(int col, Array7 arr) throws IllegalBitException{
		int[] elem = arr.getElements();
		for(int i = 0; i < elem.length; i++){
			if(elem[i] < 0 || elem[i] > 1){
				throw new IllegalBitException("Illegal value passed in Array7x7.setCol!");
			}
		}
		
		for(int i = 0; i < this.representation.length; i++){
			this.representation[i][col] = arr.getElements()[i];
		}
	}
	
	/**
	 * 	Get the whole representation as int[][]
	 * 
	 *  @return representation as int[][]
	 */
	
	public int[][] getRepresentation(){
		return ArraySupporter2D.copy(this.representation);
	}
	
	/**
	 *	Shifts all the bit of the representation to the left.
	 *	@param inputCol column to replace the column to the right with
	 *	@return the leftmost column
	 */
	
	public Array7 shiftLeft(Array7 inputCol){
		Array7 oldArrayPart = this.getCol(0);
		
		for(int i = 0; i < this.representation.length; i++){
			for(int j = 0; j < this.representation[i].length - 1; j++){
				this.representation[i][j] = this.representation[i][j +1];
			}
		}
		
		this.setCol(6, inputCol);
		
		return oldArrayPart;
	}
	
	/**
	 *	Shifts all the bit of the representation to the right.
	 *	@param inputCol column to replace the column to the left with
	 *	@return the rightmost column
	 */
	
	public Array7 shiftRight(Array7 inputCol){
		Array7 oldArrayPart = this.getCol(6);
		
		for(int i = 0; i < this.representation.length; i++){
			for(int j = this.representation.length - 1; j > 0; j--){
				this.representation[i][j] = this.representation[i][j - 1];
			}
		}
		
		this.setCol(0, inputCol);
		
		return oldArrayPart;
	}
	
	/**
	 *	Shifts all the bit of the representation upwards.
	 *	@param inputRow row to replace the row upwards with
	 *	@return the top row
	 */
	public Array7 shiftUp(Array7 inputRow) {
		Array7 oldArrayPart = this.getCol(6);
		
		for(int i = 0; i<this.representation.length-1; i++) {
			for(int j = 0; j<this.representation[i].length - 1; j++){
				this.representation[i][j] = this.representation[i+1][j];
			}
		}
		
		this.setRow(6, inputRow);
		
		return oldArrayPart;
	}
	
	/**
	 *	Shifts all the bit of the representation downwards.
	 *	@param inputRow row to replace the row downwards with
	 *	@return the bottom row
	 */
	public Array7 shiftDown(Array7 inputRow) {
		Array7 oldArrayPart = this.getCol(0);
		
		for(int i = this.representation.length-1; i>0; i--) {
			for(int j = 0; j<this.representation[i].length - 1; j++){
				this.representation[i][j] = this.representation[i-1][j];
			}
		}
		
		this.setRow(0, inputRow);
		
		return oldArrayPart;
	}
	
	/**
	 *	Print the whole array as a matrix
	 *	@return String as matrix
	 */
	
	public String toString(){
		String res = "";
		
		for(int i = 0; i < this.representation.length; i++){
			res += "[";
			
			for(int j = 0; j < this.representation[i].length; j++){
				res += this.representation[i][j];
				
				//If we've reached the end of the row, the last colon should not be put
				if(j != this.representation[i].length - 1){
					res += ", ";
				}
			}
			
			res += "]\n";
		}
		
		return res;
	}
}













