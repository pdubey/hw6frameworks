package framework;

import java.awt.Color;

import javax.swing.Icon;

/**
 * The interface specifies the functionality and the methods contained 
 * in the Framework.
 * The interface specifies how the grid for the game should be initialised,
 * what rules should be used to determine the next state, how the GUI
 * should interact with the framework to display the game and provides
 * some User features that enhance user experience.
 * 
 * @author Gautham Nagaraju, Akash Kulkarni, Prakhar Dubey, Victor Dong
 *
 */
public interface Framework {
	/**
	 * The default initialisation of the game. By default the game 
	 * is initialised to Convay's Game of Life.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void init();
	
	/**
	 * The method initialises the grid with the provided parameters.
	 * 
	 * @param r defines the rules of the game to be considered. In 
	 * the default case it is the convay's game of life. If this is null
	 * the game is set to Convay's game of Life with a default initial 
	 * grid.
	 * @param g the grid that we are dealing with in the game. This 
	 * grid has to be initialised by the client and cannot be null.
	 * @param imageMap the array of images to display for each state of
	 * the cell in a game. The position of each picture has to be in
	 * correspondence with the integer value associated with that state.
	 * @param colorMap the array of colours to display for each state of
	 * the cell in a game. The position of each picture has to be in
	 * correspondence with the integer value associated with that state. 
	 * @return Void
	 */
	public void init(Rule r, Grid g, Icon[] imageMap, Color[] colorMap);
	
	/**
	 * The method initialises the grid using the grid supplied by the
	 * client and the default set of rules for the cellular automata. 
	 * Rules refers to the characteristics of a particular automata. 
	 * By default the rules will refer to Convay's Game of Life.
	 * 
	 * @param g the grid to initialise.
	 * @return Void
	 */
	public void init(Grid g);
	
	/**
	 * The method generates the grid after one unit of time, thereby, 
	 * updating all the cells to the next state. 
	 * 
	 * @param Void
	 * @return Void
	 */
	public void nextGrid();
	
	/**
	 * The method generates the GUI for displaying the grid as the grid
	 * updates itself. It also provides the user a bunch of options in the
	 * GUI that enhance user interaction.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void display();
	
	/**
	 * The method simulates the evolution of the automata through the 
	 * given number of steps.
	 * 
	 * @param num the number of steps to simulate the automata.
	 * @return Void. 
	 */
	public void advance(int num);
	
	/**
	 * The method generates the grid after num number of time steps.
	 * 
	 * @param num The number of time steps after which to generate the
	 * grid.
	 * @return Void
	 */
	public void step(int num);
	
	/**
	 * The method sets the colours for the different states of each cell.
	 * 
	 * @param c the array that specifies the colour for each cell's state
	 * by corresponding to the integer value of the states.
	 * @return Void 
	 */
	public void setColor(Color[] c);
	
	/**
	 * The method sets the rules for determining what the next state for
	 * each cell will be in the given game. 
	 * 
	 * @param r the rules to use for determining the next state.
	 * @return Void
	 */
	public void setRule(Rule r);
	
	/**
	 * This method sets the grid to be considered in the current game.
	 * It should ideally be set in the beginning of the game. 
	 * 
	 * @param g the grid for the game to be set to.
	 * @return Void 
	 */
	public void setGrid(Grid g);
	
	/**
	 * The method sets the pictures for the different states of each cell.
	 * 
	 * @param i the array that specifies the picture for each cell's state by
	 * corresponding to the integer value of the states.
	 * @return Void
	 */
	public void setImage(Icon[] i);
	
	/**
	 * The method gets the current array that relates the integer states
	 * with the pictures of each of the states.
	 * 
	 * @param Void
	 * @return Icon[] returns the array that relates the integer states
	 * with the pictures of each of the states.
	 */
	public Icon[] getPictureMap();
	
	/**
	 * The method gets the current array that relates the integer states
	 * with the colours of each of the states.
	 * 
	 * @param Void
	 * @return Color[] returns the array that relates the integer states
	 * with the colours of each of the states.
	 */
	public Color[] getColorMap();
	
	/**
	 * The method returns the current state of the grid.
	 * 
	 * @param Void
	 * @return Grid returns the grid with the cells in the current
	 * state
	 */
	public Grid getGrid();
}
