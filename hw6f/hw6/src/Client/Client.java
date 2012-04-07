package Client;

import java.awt.Color;
import java.util.Random;

import framework.Framework;
import framework.FrameworkImpl;
import framework.Grid;
import framework.Rule;

import GUI.EntryScreen;

/**
 * This demonstrates where the points that the client can plugin to 
 * (the color array, the custom rule, the initial world)
 *	
 * The user has to set rule, if it doesn't then it will run The Game of Life
 * If the user sets rule, then they have to set a colorMap or pictureMap or 
 * it will not function correctly
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Victor Dong, Akash Kulkarni
 *
 */
public class Client {
	public static void main(String args[]){
		Framework f = new FrameworkImpl();
		Grid grid = createGrid(8, 8);
		Color[] colors = new Color[3];
		colors[0] = Color.blue;
		colors[1] = Color.black;
		colors[2] = Color.green;
		f.setColor(colors);
		Rule myRule = new MyRule();
		f.setRule(myRule);
		f.init(grid);
		EntryScreen screen = new EntryScreen(f);
		screen.display();
		
	}

	private static Grid createGrid(int rows, int cols) {
		Grid world = new Grid(rows,cols);
		Random rand = new Random();
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				world.setCell(i, j, rand.nextInt(3));
			}
		}
		return world;
	}

}