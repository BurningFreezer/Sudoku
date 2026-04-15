import java.util.ArrayList;
public class Sudoku {
    static int[][] grid = new int[9][9];
    static ArrayList<Integer> usedNumbers = new ArrayList<>();
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int tries = 0;
                while (true) {
                    int num = (int)(Math.random() * 9) + 1;
                    if (verify(num, i, j)) {
                        grid[i][j] = num;
                        usedNumbers.add(num);
                        break;
                    }
                    tries++;
                    if (tries > 40) {
                        for (int k = 0; k < 9; k++) {
                            grid[i][k] = 0;
                        }
                        j = -1;
                        break;
                    }
                }
            }
        }
        printGrid();
        long end = System.currentTimeMillis();
        System.out.println("Runtime: " + (end - start) + " ms");
    }
    public static boolean verify(int num, int i, int j) {
        for (int x = 0; x < 9; x++) {
            if (grid[i][x] == num || grid[x][j] == num)
                return false;
        }
        int r = (i / 3) * 3, c = (j / 3) * 3;
        for (int x = r; x < r + 3; x++) {
            for (int y = c; y < c + 3; y++) {
                if (grid[x][y] == num)
                    return false;
            }
        }
        return true;
    }
    public static void printGrid() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0)
                System.out.println("+-------+-------+-------+");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0)
                    System.out.print("| ");
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
}
