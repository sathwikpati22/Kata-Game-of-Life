# Kata Game of Life

Game Of Life Kata

The Game of Life, is a cellular automation simulation invented by the British mathematician
John Horton Conway in 1970. For more background information, see https://en.wikipedia.org/
wiki/Conway%27s_Game_of_Life

Goal

In this kata you will write a program that calculates the next generation of Conway’s game of
life, given an initial state.

Rules of the Game

The board (or playing field) for the Game of Life is a two dimensional grid of cells. Each cell is
considered to be either “alive” or “dead”. The next generation of the grid is calculated using
these rules:
1. Any live cell with fewer than two live neighbors dies, as if caused by under
population.
2. Any live cell with more than three live neighbors dies, as if by overcrowding.
3. Any live cell with two or three live neighbors lives on to the next generation.
4. Any dead cell with exactly three live neighbors becomes a live cell.
5. A cell’s neighbors are those cells which are horizontally, vertically or
diagonally adjacent. Most cells will have eight neighbors. Cells placed on the
edge of the grid will have fewer.

Input / Output

For this exercise, let’s assume the playing field is an 8x6 grid of cells (i.e. 8 columns by 6 rows).
Design your program to accept an initial 8x6 grid where each cell is identified as alive or dead.
After accepting the input, your program should output the next state according to the rules of
Conway’s Game of Life listed above. You may choose how to represent or display the state of
the grid, but here is a simple example of how the grid might look using a terminal / console
interface:
1 - Is Considered as Active Cell and 0 is considered as Dead Cell 

Initial State   
00000010
11100010
00000010
00000000
00011000
00011000

New State
01000000	 
01000111
01000000	 
00000000
00011000
00011000


Design

This code is designed and implemented in TDD.

Execution
The Main logic of the function is in src/main/GameGrid.java
Run the src/main/mainClass.java to see the results 
You can change the values in the mainClass.java files and give custom values to view results 

Running TestCases
The junit testcases are written for public functions 
To test the junit testcases run the src/test/GridTest.java. Ideally all the testcases should run successfully

