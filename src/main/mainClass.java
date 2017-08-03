package main;

public class mainClass {
	
	//Considering 1 as a ActiveCell and 0 as a InActiveCell
	public static void main(String[] args){
		
		//Also can be given through scanner class
		int cols = 8;
		int rows = 6;
		
		//Input values to the Grid of size 8*6 
		int[][] cells = new int[][]{
			{0,0,0,0,0,0,1,0},
			{1,1,1,0,0,0,1,0},
			{0,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,1,1,0,0,0},
			{0,0,0,1,1,0,0,0}};
	 	
		GameGrid gr = new GameGrid(cols,rows);
		
		//Initialize the values for initial state in the Grid
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	if ( cells[i][j] != 0){
            		gr.setAlive(i, j);
            	}
            }
        }
		
		
	 	System.out.println("Initial Grid");
	 	gr.printCurrentGrid();
	 	
	 	int noOfLoops = 3;
	 	// Displaying 3 Levels in the Game 	 	
	 	for (int i = 1; i <= noOfLoops; i++) {
		 	System.out.println("Next Grid " + i);
		 	gr = gr.nextState();
		 	gr.printCurrentGrid();
	 	}
	}
}
