package framework;

/**
 * The class specifies the attributes of each cell in the grid of
 * the game. It provides methods for manipulating each cell in the grid.
 * 
 * @author Gautham Nagaraju, Akash Kulkarni, Victor Dong, Prakhar Dubey
 *
 */
public class Cell {
	private int state;
	private int row;
	private int col;
	
	/**
	 * The constructor that sets the state of each cell
	 * 
	 * @param state the state of the cell
	 * @param row the row in which the cell occurs
	 * @param col the col in which the cell occurs
	 */
	public Cell(int state, int row, int col){
		this.state = state;
		this.row = row;
		this.col=col;
	}
	
	/**
	 * The method returns the state of the current cell
	 * 
	 * @param Void
	 * @return int the state of the cell
	 */
	public int getState(){
		return state;
	}
	
	/**
	 * The method returns the row in which the cell occurs
	 * 
	 * @param Void
	 * @return int the row in which the cell occurs
	 */
	public int getRow(){
		return row;
	}
	
	/**
	 * The method returns the col in which the cell occurs
	 * 
	 * @param Void
	 * @return int the row in which the cell occurs
	 */
	public int getCol(){
		return col;
	}
	
	/**
	 * The method sets the state of the current cell 
	 * 
	 * @param state the state to set the value of the current cell
	 * @return Void
	 */
	public void setState(int state){
		this.state = state;
	}
	
	/**
	 * The method sets the row of the current cell 
	 * 
	 * @param x the row to set the value of the current cell
	 * @return Void
	 */
	public void setRow(int x){
		row =x;
	}
	
	/**
	 * The method sets the column of the current cell 
	 * 
	 * @param y the column to set the value of the current cell
	 * @return Void
	 */
	public void setCol(int y){
		this.col =y;
	}
}
