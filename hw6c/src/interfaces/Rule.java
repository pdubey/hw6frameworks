package interfaces;

/**
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Akash Kulkarni, Victor Dong
 * 
 * The interface specifies what kind of rules a cellular automaton must adhere
 * to. The methods in the interface are to be implemented by the user. Thus,
 * implementing the Rule interface is akin to implementing the plugin that
 * decides what rules to follow during a simulation. Changing the 
 * implementations of the methods of this interface will lead to the 
 * evolution of new cellular automata.
 *
 */

public interface Rule {
	
	/**
	 * The method determines how to generate the 
	 * @param g
	 * @return
	 */
	public Grid getNextGrid(Grid g);
	
	/**
	 * The method determines how to generate the next state of a given cell.
	 * It looks at the grid and neighbours and decides what the next state
	 * will be.
	 * 
	 * @param x the column of the cell
	 * @param y the row of the cell
	 * @return Cell the next state of the Given cell
	 */
	public Cell getNextCell(Grid g, int x, int y);
}
