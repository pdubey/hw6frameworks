package framework;

/**
 * The abstract class implements the rules interface. It specifies
 * some concrete methods and some abstract methods that help the 
 * client design the plugin better.
 *  
 * @author Gautham Nagaraju, Victor Dong, Akash Kulkarni, Prakhar Dubey
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
		Grid toReturn = new Grid(g.getNumRows(), g.getNumCols());
		for(int x = 0; x < g.getNumRows(); x++){
			for(int y = 0; y < g.getNumCols(); y++){
				toReturn.setCell(x, y, getNextCell(g, x, y).getState());
			}
			System.out.println();
		}
		System.out.println();
		return toReturn;
	}
}
