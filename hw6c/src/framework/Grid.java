package framework;

/**
 * The class contains the definition of the grid that will be used to model
 * the world in the game. It specifies a bunch of methods to manipulate
 * the grid.
 * 
 * @author Gautham Nagaraju, Victor Dong, Prakhar Dubey, Akash Kulkarni
 *
 */
public class Grid {

	private Cell[][] grid;
	
	/**
	 * The constructor for the grid that initialises the grid with 
	 * the said number of rows and columns
	 * 
	 * @param rows the number of rows to make the grid
	 * @param cols the number of columns to make the grid
	 */
	public Grid(int rows, int cols){
		grid = new Cell[rows][cols];
	}
	
	/**
	 * Sets the state of the specified cell to the specified value.
	 * 
	 * @param x the row in which the cell occurs
	 * @param y the col in which the cell occurs
	 * @param state the state to update the cell to.
	 * @return Void
	 */
	public void setCell(int x, int y, int state){
		grid[x][y] = new Cell(state,x,y);
	}
	
	public Cell getCell(int x, int y){
		return grid[x][y];
	}
	
	/**
	 * The method gets the number of rows in the grid
	 * 
	 * @param void
	 * @return int number of rows in the grid.
	 */
	public int getNumRows(){
		return grid.length;
	}
	
	/**
	 * The method gets the number of cols in the grid
	 * 
	 * @param void
	 * @return int number of cols in the grid.
	 */
	public int getNumCols(){
		return grid[0].length;
	}
}
