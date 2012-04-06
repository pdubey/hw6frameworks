package GUI;
import javax.swing.*;
import framework.*;
import java.awt.*;

/**
 * The class defines the GUI involved in displaying the grid of the game.
 * It displays the grid after each time step. It is the main class that 
 * defines the GUI for the automata.
 * 
 * @author Gautham Nagaraju, Akash Kulkarni, Victor Dong, Prakhar Dubey
 *
 */
public class DisplayGrid extends JFrame {
	private Framework framework;
	private JButton[][] grid; //names the grid of buttons
	private int rows;
	private int cols;
	private Grid griduser;
	private Color[] colorMap;
	private Icon[] pictureMap;

	/**
	 * The constructor that initialises the grid to display. 
	 * 
	 * @param f the framework to use while displaying the grid.
	 */
	public DisplayGrid(Framework f){
		framework = f;
		griduser = framework.getGrid();
		colorMap = framework.getColorMap();
		pictureMap = framework.getPictureMap();
	}
	
	/**
	 * This method displays the GUI of the cellular automata on the user
	 * screen. 
	 * 
	 * @param Void
	 * @return Void
	 */
	
	public void display(){
		griduser = framework.getGrid();
		rows = (framework.getGrid()).getNumRows();
		cols = framework.getGrid().getNumCols();
		createGrid(rows,cols);
	}

	/**
	 * This method displays the grid with all the cells in their respective
	 * states on the user screen. It is a helper method for display();
	 * 
	 * @param rows the number of rows in the grid to be displayed.
	 * @param cols the number of cols in the grid to be displayed.
	 */
	private void createGrid(int rows, int cols){ //constructor with 2 parameters
		getContentPane().removeAll();
		JPanel panel = new JPanel();
		panel.removeAll();
		setSize(400,400);
		grid=new JButton[rows][cols]; //allocate the size of grid
		for(int x=0; x<rows; x++){
			for(int y=0; y<cols; y++){
				grid[x][y]=new JButton("("+x+","+y+")");
				int index = griduser.getCell(x,y).getState();//changed
				System.out.print(index+" ");
				if(pictureMap==null){
					grid[x][y].setBackground(colorMap[index]);
					grid[x][y].setForeground(colorMap[index]);
				}
				else{
					grid[x][y].setIcon(pictureMap[index]);
					grid[x][y].setIcon(pictureMap[index]);
				}
				panel.add(grid[x][y]); //adds button to grid
				//grid[0][0].setIcon(pictureMap[0]); HAVE CHANGED : What is this for?
			}
			System.out.println();
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		panel.setLayout(new GridLayout(rows,cols));
		//panel.revalidate();
		panel.repaint();
		getContentPane().add(panel);
		getContentPane().invalidate();
		getContentPane().validate();
		pack();
		setVisible(true);
	}
}