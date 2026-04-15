[![Watch the video]


# Sudoku
Generates a 9×9 Sudoku grid using random numbers that follow Sudoku rules for rows, columns, and 3×3 subgrids.
# How to run the Program
Compile and run Sudoku.java in any Java IDE or terminal using javac Sudoku.java then java Sudoku.
# Summary of How the Sudoku Board Is Generated: 
The program iterates through each cell (i, j) and randomly selects a number from 1–9. The verify method checks if the number fits Sudoku rules. If valid, it’s placed in the grid; if stuck, the row resets and retries until the board is filled.
# List of Files Included in the Project: 
Sudoku.java
