package interfaces;

/**
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Akash Kulkarni, Victor Dong
 * 
 * The class is an abstract class that implements the Rule interface.
 * It has abstract methods that defines how the next state of a cell.
 *
 */

public abstract class RuleAbstract implements Rule{

	/**
	 * The abstract method that defines the next state of the 
	 * specified cell.
	 * 
	 * @param g the grid for which we find the next cell's state
	 * @param x the column of the cell
	 * @param y the row of the cell
	 * @return Cell the next state of the Given cell
	 */
	public abstract Cell getNextCell(Grid g, int x, int y);
	
	/**
	 * The method gets the grid with each cell updated to the
	 * next state. 
	 * 
	 *  @param g the grid whose next state we want to calculate
	 *  @return Grid the grid with all the Cells updated to the
	 *  		next state.
	 */
	public Grid getNextGrid(Grid g){
		return null;
	}
}
