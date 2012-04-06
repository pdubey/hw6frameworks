package interfaces;

/**
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Akash Kulkarni, Victor Dong
 * 
 * The class implements the grid of cells on which all the simulation occurs.
 * It lets one access the cells in the grid and set the properties of the 
 * cell.
 *
 */

public class Grid {

	public Cell[][] grid;
	
	/**
	 * The constructor intialises the grid with the specified number of 
	 * rows and cols
	 * @param x Number of columns in the grid
	 * @param y Number of rows in the grid
	 */
	public Grid(int x, int y){ 
	}
	
	/**
	 * The method sets the specified cell in the grid.
	 * 
	 * @param x the column of the cell we wish to set
	 * @param y the row of the cell we wish to set
	 * @return Void
	 */
	public void setCell(int x, int y){
		
	}
	
	/**
	 * The method gets the specified cell in the grid.
	 * 
	 * @param x the column of the cell we wish to set
	 * @param y the row of the cell we wish to set
	 * @return Cell the cell we want to access in the grid.
	 */
	public Cell getCell(int x, int y){
		return null;
	}
}
