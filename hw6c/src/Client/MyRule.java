package Client;

import framework.Cell;
import framework.Grid;
import framework.Rule;
import framework.RuleAbstract;
/*Brian's brain*/
public class MyRule extends RuleAbstract {

	private final int DEADZONE = -1;
	private final int ALIVE = 2;
	private final int DIEING = 1;
	private final int DEAD = 0;
	/**
	 * This class contains the rules for the Brains's Brain game.
	 * We wrote this class to implement the plugin we wrote. It contains all 
	 * the rules for Brian's Brain.
	 * 
	 * @author Gautham Nagaraju, Akash Kulkarni, Victor Dong, Prakhar Dubey
	 *
	 */
	@Override
	public Cell getNextCell(Grid g, int x, int y) {
		int state = g.getCell(x, y).getState();
		if(state == -1){
			return new Cell(-1, x, y);
		}
		else if(state == DEAD){
			if(birthPossible(g,x,y)){
				return new Cell(ALIVE, x, y);
			}
			else{
				return new Cell(DEAD,x,y);
			}
		}
		else if(state == DIEING){
			return new Cell(DEAD, x, y);
		}
		else if(state == ALIVE){
			return new Cell(DIEING, x, y);
		}
		else{
			return null;
		}
	}

	private boolean birthPossible(Grid g, int x, int y) {
		int liveCells = 0;
		boolean deadZone = false;
		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				if(!(i==0 && j==0)){
					int xpos = (x + i)%(g.getNumRows());
					int ypos = (y + i)%(g.getNumCols());
					if(xpos < 0)
						xpos = g.getNumRows() + xpos;
					if(ypos < 0)
						ypos = g.getNumCols() + ypos;
					int neighbourState = g.getCell(xpos, ypos).getState();
					if(neighbourState == 2){
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
		else if(liveCells >= 2){
			return true;
		}
		else{
			return false;
		}
	}

	private boolean liveCondition(Grid g, int x, int y) {
		int liveCells = 0;
		boolean deadZone = false;
		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				if(!(i==0 && j==0)){
					int xpos = (x + i)%(g.getNumRows());
					int ypos = (y + i)%(g.getNumCols());
					int neighbourState = g.getCell(xpos, ypos).getState();
					if(neighbourState == 2){
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
		else if(liveCells >= 2){
			return true;
		}
		else{
			return false;
		}
	}

}