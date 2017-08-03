package test;

import main.GameGrid;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;
public class GridTest {
	
	@Test
	public void GridInitialize() throws Exception{
		GameGrid grid = new GameGrid(8,6);
		assertFalse(grid.isAlive(1, 1));
	}
	
	@Test
	public void AliveTest() throws Exception{
		GameGrid grid = new GameGrid(8,6);
		grid.setAlive(5, 5);
		assertTrue(grid.isAlive(5, 5));
	}
	
	@Test
	public void checkNeighboursTest() throws Exception{
		GameGrid grid = new GameGrid(3,3);
		/**
		 * Sample Initial State
		 * 0 1 1
		 * 0 0 0
		 * 1 0 0 
		 */
		grid.setAlive(0, 1);
		grid.setAlive(0, 2);
		grid.setAlive(2, 0);
		GameGrid nextState = grid.nextState();
		/**
		 * Next State
		 * 0 0 0 
		 * 0 1 0
		 * 0 0 0
		 */		
		 assertTrue(nextState.isAlive(1, 1));
	}
}
