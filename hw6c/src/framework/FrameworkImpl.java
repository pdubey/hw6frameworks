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
			
		public void init(){
			init(null, null, null, null);
		}
		/**
		 * The method initialises the default grid, if the client
		 * doesn't provide a grid to initialise.
		 * 
		 * @param Void
		 * @return Void
		 */
		public void init(Rule r, Grid g, Icon[] imageMap, Color[] colorMap) {
			// TODO Auto-generated method stub
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

		
		/**
		 * The method sets the rules for determining what the next state for
		 * each cell will be. 
		 * 
		 * @param r the rules to use for determining the next state.
		 * @return Void
		 */
		public void setRule(Rule r) {
			this.r = r;
			
		}

		
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

		private void setDefault(){
			r = new GameOfLife();
			grid = new Grid(Constants.DEFAULT_GRID_HEIGHT, Constants.DEFAULT_GRID_WIDTH);
			setGrid();
			//pictureMap = Constants.DEFAULT_ICON_MAP;
			Color[] colors = new Color[2];
			colors[0] = Color.red;
			colors[1] = Color.blue;
			colorMap = colors;
			disp = new DisplayGrid(this);
		}
		
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

		
		/**
		 * The method sets the colours for the different states of each cell.
		 * 
		 * @param c the array that specifies the colour for each step.
		 * @return Void 
		 */
		public void setColor(Color[] c) {
			colorMap = c;
		}


		public Color[] getColorMap(){
			return colorMap;
		}
		
		public Icon[] getPictureMap(){
			return pictureMap;
		}
		
		public Grid getGrid(){
			return grid;
		}
		
		public void setImage(Icon[] i) {
			pictureMap = i;
			
		}
		
		public void setGrid(Grid g) {
			grid =g;
			
		}

	}
