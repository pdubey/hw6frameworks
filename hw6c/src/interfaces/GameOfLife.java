package interfaces;

/**
 * 
 * @author Gautham Nagaraju, Prakhar Dubey, Victor Dong, Akash Kulkarni
 * 
 * The class implements the rules associated with the Game of Life automaton. 
 * The universe of the Game of Life is an infinite two-dimensional orthogonal
 * grid of square cells, each of which is in one of two possible states, alive 
 * or dead. Every cell interacts with its eight neighbours, which are the 
 * cells that are horizontally, vertically, or diagonally adjacent. At 
 * each step in time, the following transitions occur:
 *
 *   1) Any live cell with fewer than two live neighbours dies, 
 *   	as if caused by under-population.
 *   2) Any live cell with two or three live neighbours lives on to the 
 *   	next generation.
 *   3) Any live cell with more than three live neighbours dies, 
 *   	as if by overcrowding.
 *   4) Any dead cell with exactly three live neighbours becomes a live cell, 
 *   	as if by reproduction.
 *
 */

public class GameOfLife extends RuleAbstract{

	@Override
	/**
	 * The method defines the rule that decides the next state of the cell
	 * specified by the coordinates
	 * 
	 * @param x Defines the column of the grid in which the cell occurs.
	 * @param y Defines the row of the grid in which the cell occurs.
	 * @return Cell returns the next state of the specified Cell.
	 */
	public Cell getNextCell(Grid g, int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}
