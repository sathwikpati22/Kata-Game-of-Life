package main;

public class GameGrid {
	
	private int[][] gridCells;
	private int col = 0, row = 0;
	
	//initialize the empty dead grid
	 public GameGrid(int col, int row) {
		 
		 	//initializing the grid size ex:8*6
		 	this.col = col;
		 	this.row = row;
		 	gridCells = new int[row][col];	        
		 	//initializing the grid with all dead cells
		 	for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	            	gridCells[i][j] = 0;
	            }
	        }
		 	
	 }
	
	 //Set a particular cell Alive
	 public void setAlive(int x, int y){
		 gridCells[x][y] = 1;
	 }
	 
	 //Check is Alive 
	 public boolean isAlive(int x, int y){
		 if (gridCells[x][y] == 1)
			 return true;
		 else 
			 return false;
	 }
	 
	 
	//Calculate the next State of the game
	public GameGrid nextState() {
			 
		GameGrid newGrid = new GameGrid(col, row);
		
		for (int x = 0; x < row; x++) {
			
		    for (int y = 0; y < col; y++) {
		    	
		    	int cellNeighboursCount = neighboursCheck(x,y);
		    	
		    	if (gridCells[x][y] == 0){
		    		
		    		if (cellNeighboursCount > 2){
		    			//Set cell alive
		    			newGrid.gridCells[x][y] = 1;
		    		}
		    		
		    	} else {
		    		
		    		if (cellNeighboursCount > 1){
		    			//Set cell alive
		    			newGrid.gridCells[x][y] = 1;
		    		}
		    		
		    	}
		        
		    }
		}
		
		return newGrid;
		        
	}	 
	
	
	// Print the current Grid   
	public void printCurrentGrid(){
		
		for (int x = 0; x < row; x++) {			
		    for (int y = 0; y < col; y++) {		    	
		    	System.out.print(gridCells[x][y]);		    	
		    }
		    System.out.println();
		}
		
	}
	
	//Calculate the active neighbour cells 
	private int neighboursCheck(int x, int y){
		int count = 0;
		for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i < 0 || j < 0 || i > row -1 || j > col -1 || (i == x && j ==y)) {
                    continue;
                }
                if (gridCells[i][j] == 1)
                	count++;
            }
        }
		return count;
	}
	 

}
