package framework;

import java.awt.Color;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Default.Constants;
import Default.GameOfLife;
import GUI.DisplayGrid;

/**
 * The class implements the methods contained in the Framework Interface.
 * the class specifies how the grid for the game should be initialised,
 * what rules should be used to determine the next state, how the GUI
 * should interact with the framework to display the game and provides
 * some User features that enhance user experience.
 * 
 * @author Gautham Nagaraju, Akash Kulkarni, Prakhar Dubey, Victor Dong
 *
 */
public class FrameworkImpl implements Framework{

		private Color[] colorMap;
		private Rule r;
		private Grid grid;
		private DisplayGrid disp;
		private Icon[] pictureMap;
		
		/**
		 * The default initialisation of the game. By default the game 
		 * is initialised to Convay's Game of Life.
		 * 
		 * @param Void
		 * @return Void
		 */
		public void init(){
			init(null, null, null, null);
		}
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
		@Override
		public void init(Rule r, Grid g, Icon[] imageMap, Color[] colorMap) {
			if(r ==null){
				setDefault();
			}
			else{
				this.r = r;
				this.grid = g;
				this.colorMap = colorMap;
				disp = new DisplayGrid(this);
			}
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
			grid = g;
			disp = new DisplayGrid(this);
		}
		
		/**
		 * The method defines the initial states of the cells of the grid.It
		 * is a helper method for generating the initial state of the grid.
		 * 
		 * @param Void
		 * @return Void
		 */
		private void setGrid() {
			Random rand = new Random();
			for(int i = 0; i < grid.getNumRows(); i++){
				for(int j = 0; j < grid.getNumCols(); j++){
					if(i == 0 || j == 0 || i == grid.getNumRows() - 1 || j == grid.getNumCols() - 1)
						grid.setCell(i, j, 0);
					else
						grid.setCell(i, j, rand.nextInt(2));
				}
			}			
		}

		@Override
		/**
		 * The method sets the rules for determining what the next state for
		 * each cell will be in the given game. 
		 * 
		 * @param r the rules to use for determining the next state.
		 * @return Void
		 */
		public void setRule(Rule r) {
			this.r = r;
			
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
			grid = r.getNextGrid(grid);
			
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
		public void display() {
			if(r ==null){
				setDefault();
			}
			disp.display();
		}

		/**
		 * This method is called by the other methods of the class to 
		 * initialise the default configuration of the grid and set the 
		 * rules of the game. The default game is the COnvay's game of Life.
		 * 
		 * @param Void
		 * @return Void
		 */
		private void setDefault(){
			r = new GameOfLife();
			grid = new Grid(Constants.DEFAULT_GRID_HEIGHT, Constants.DEFAULT_GRID_WIDTH);
			setGrid();
			pictureMap = Constants.DEFAULT_ICON_MAP;
			colorMap = Constants.DEFAULT_COLOR_MAP;
			disp = new DisplayGrid(this);
		}
		@Override
		/**
		 * The method simulates the evolution of the automata through the 
		 * given number of steps.
		 * 
		 * @param num the number of steps to simulate the automata.
		 * @return Void. 
		 */
		public void advance(int num) {
			for(int i = num; i > 0; i--){
				nextGrid();
			}
			display();
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
			for(int i = num; i > 0; i--)
				nextGrid();
			display();
		}

		@Override
		/**
		 * The method sets the colours for the different states of each cell.
		 * 
		 * @param c the array that specifies the colour for each cell's state
		 * by corresponding to the integer value of the states.
		 * @return Void 
		 */
		public void setColor(Color[] c) {
			colorMap = c;
		}

		/**
		 * The method gets the current array that relates the integer states
		 * with the colours of each of the states.
		 * 
		 * @param Void
		 * @return Color[] returns the array that relates the integer states
		 * with the colours of each of the states.
		 */
		public Color[] getColorMap(){
			return colorMap;
		}
		
		/**
		 * The method gets the current array that relates the integer states
		 * with the pictures of each of the states.
		 * 
		 * @param Void
		 * @return Icon[] returns the array that relates the integer states
		 * with the pictures of each of the states.
		 */
		public Icon[] getPictureMap(){
			return pictureMap;
		}
		
		/**
		 * The method returns the current state of the grid.
		 * 
		 * @param Void
		 * @return Grid returns the grid with the cells in the current
		 * state
		 */
		public Grid getGrid(){
			return grid;
		}
		@Override
		/**
		 * The method sets the pictures for the different states of each cell.
		 * 
		 * @param i the array that specifies the picture for each cell's state by
		 * corresponding to the integer value of the states.
		 * @return Void
		 */
		public void setImage(Icon[] i) {
			pictureMap = i;
			
		}

	}
