package Default;

import framework.Cell;
import framework.Grid;
import framework.RuleAbstract;

/**
 * The class defines the rules for Convay's game of Life. These rules will be
 * used by the framework if the plugin doesn't specify the rules.
 * 
 * @author Gautham Nagaraju, Victor Dong, Prakhar Dubey, Akash Kulkarni
 *
 */
public class GameOfLife extends RuleAbstract{	

	@Override
	public Cell getNextCell(Grid g, int x, int y) {
		int state = g.getCell(x, y).getState();
		if(state == -1){
			return new Cell(-1, x, y);
		}
		else if(state == 0){
			if(birthPossible(g,x,y)){
				return new Cell(1, x, y);
			}
			else{
				return new Cell(0,x,y);
			}
		}
		else if(state == 1){
			if(liveCondition(g,x,y)){
				return new Cell(1, x, y);
			}
			else{
				return new Cell(0, x, y);
			}
		}
		else{
			return null;
		}
	}

	/**
	 * This method determines the condition if a birth is possible in a
	 * specified cell.
	 * 
	 * @param g the grid we are considering
	 * @param row the row of the cell we are interested in.
	 * @param col the col of the cell we are interested in.
	 * @return boolean if birth is possible or not in a given cell.
	 */
	private boolean birthPossible(Grid g, int row, int col) {
		int liveCells = 0;
		boolean deadZone = false;
		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				if(!(i==0 && j==0)){
					int rowpos = (row + i)%(g.getNumRows());
					int colpos = (col + j)%(g.getNumCols());
					if(rowpos < 0){
						rowpos = g.getNumRows() + rowpos;
					}
					if(colpos < 0){
						colpos = g.getNumCols() + colpos;
					}
					int neighbourState = g.getCell(rowpos, colpos).getState();
					if(neighbourState == 1){
						liveCells++;
					}
					else if(neighbourState == -1){
						deadZone = true;
						break;
					}
				}
			}
		}
		if(deadZone)
			return false;
		else if(liveCells == 3){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * This method determines if the specified cell will live in the 
	 * next time step.
	 * 
	 * @param g the grid we are considering
	 * @param row the row of the cell we are considering
	 * @param col the col of the cell we are considering
	 * @return boolean if the cell lives in the next time step
	 */
	private boolean liveCondition(Grid g, int row, int col) {
		int liveCells = 0;
		boolean deadZone = false;
		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				if(!(i==0 && j==0)){
					int rowpos = (row + i)%(g.getNumRows());
					int colpos = (col + j)%(g.getNumCols());
					if(rowpos < 0){
						rowpos = g.getNumRows() + rowpos;
					}
					if(colpos < 0){
						colpos = g.getNumCols() + colpos;
					}
					int neighbourState = g.getCell(rowpos, colpos).getState();
					if(neighbourState == 1){
						liveCells++;
					}
					else if(neighbourState == -1){
						deadZone = true;
						break;
					}
				}
			}
		}
		if(deadZone)
			return false;
		else if(liveCells == 2 || liveCells == 3){
			return true;
		}
		else{
			return false;
		}
	}
}
