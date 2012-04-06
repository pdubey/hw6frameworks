package framework;

/**
 * The interface defines what the rules written by the client plugin 
 * should specify. This ensures that the framework has a consistent 
 * set of rules to work with. These methods decide how the next
 * state of a cell is determined.
 *  
 * @author Gautham Nagaraju, Victor Dong, Akash Kulkarni, Prakhar Dubey
 *
 */
public interface Rule {
	/**
	 * The method gets the grid with each cell updated to the
	 * next state. 
	 * 
	 *  @param g the grid whose next state we want to calculate
	 *  @return Grid the grid with all the Cells updated to the
	 *  		next state.
	 */
	public Grid getNextGrid(Grid g);
	
	/**
	 * The method that defines the next state of the 
	 * specified cell.
	 * 
	 * @param g the grid for which we find the next cell's state
	 * @param x the column of the cell
	 * @param y the row of the cell
	 * @return Cell the next state of the Given cell
	 */
	public Cell getNextCell(Grid g, int x, int y);
}

