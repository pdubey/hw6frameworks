package interfaces;

import java.awt.Color;

/**
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Akash Kulkarni, Victor Dong
 * 
 * The class implements the Framework interface. The framework sets up the 
 * whole cellular automata depending upon the rules
 * setup by the client in the plugin. The framework takes care of initialising 
 * the grid and setting up the rules obtained from the plugin. After this,
 * the framework generates the next state for each cell and displays this. 
 * It also provides options and features for the GUI so as to display the 
 * automata in interesting forms.
 *
 */

public class FrameworkImpl implements Framework{

	private Color[] colorMap;
	private Rule r;
	private Grid nextGrid;
	private Grid currentGrid;
	
	@Override
	/**
	 * The method initialises the default grid, if the client
	 * doesn't provide a grid to initialise.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method sets the rules for determining what the next state for
	 * each cell will be. 
	 * 
	 * @param r the rules to use for determining the next state.
	 * @return Void
	 */
	public void setRule(Rule r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method generates the grid after one unit of time, thereby, 
	 * updating all the cells to the next state. 
	 * 
	 * @param Void
	 * @return Void
	 */
	public void nextGrid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method generates the GUI for displaying the grid as the grid
	 * updates itself. It also provides the user a bunch of options in the
	 * GUI that enhance user interaction.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void display(Framework f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method simulates the evolution of the automata through the 
	 * given number of steps.
	 * 
	 * @param num the number of steps to simulate the automata.
	 * @return Void. 
	 */
	public void simulate(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method generates the grid after num number of time steps.
	 * 
	 * @param num The number of time steps after which to generate the
	 * grid.
	 * @return Void
	 */
	public void step(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method sets the colours for the different states of each cell.
	 * 
	 * @param c the array that specifies the colour for each step.
	 * @return Void 
	 */
	public void setColor(Color[] c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method stops a running simulation.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method starts a simulation that stops only when the client calls
	 * stop().
	 * 
	 * @param Void
	 * @return Void
	 */
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * The method initialises the grid using the grid supplied by the
	 * client and the default set of rules for the cellular automata. 
	 * Rules refers to the characteristics of a particular automata. 
	 * By default the rules will refer to Convay's Game of Life.
	 * 
	 * @param g the grid to initialise.
	 * @return Void
	 */
	public void init(Grid g) {
		// TODO Auto-generated method stub
		
	}

}
