package interfaces;

/**
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Victor Dong, Akash Kulkarni
 * 
 * The class specifies all the attributes associated with a cell in the 
 * Grid in a given cellular automata.
 *
 */

public class Cell {
	private int state;
	private int x;
	private int y;
	
	/**
	 * Constructor that constructs the Cell object.
	 * @param state sets the state of a Cell.
	 * @param x sets the column of the cell in the grid.
	 * @param y sets the row of the cell in the grid.
	 */
	public Cell(int state, int x, int y){
		
	}
	
	/**
	 * The method returns the current state of the cell.
	 * 
	 * @param Void
	 * @return int the current state of the cell. 
	 */
	public int getState(){
		return 0;
	}
	
	/**
	 * The method returns the column of the cell in the grid.
	 * 
	 * @param Void
	 * @return int the column of the cell in the grid.
	 */
	public int getX(){
		return 0;
	}
	
	/**
	 * The method returns the row of the cell in the grid. 
	 * 
	 * @param Void
	 * @return int the row of the cell in the grid.
	 */
	public int getY(){
		return 0;
	}
	
	/**
	 * The method sets the state of the cell. 
	 * 
	 * @param Void
	 * @return Void.
	 */
	public void setState(){
		
	}
	
	/**
	 * The method sets the column of the cell in the grid.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void setX(){
		
	}
	
	/**
	 * The method sets the row of the cell in the grid.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void setY(){
		
	}
}
