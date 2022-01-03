```java
import java.io.*;
import java.util.*;

public class Main {

    public static void printNQueens(int[][] chess, String asf, int row) {
        if (row == chess.length) {
            System.out.println(asf + ".");
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1; // mark the queen
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0; // unplace the queen
            }
        }
    }

    public static boolean isSafe(int[][] chess, int row, int col) {
        // check row
        for (int i = 0; i < chess.length; i++) {
            if (chess[row][i] == 1) {
                return false;
            }
        }
        // check col
        for (int i = 0; i < chess.length; i++) {
            if (chess[i][col] == 1) {
                return false;
            }
        }
        // check diagonal
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if (i + j == row + col && chess[i][j] == 1) {
                    return false;
                }
            }
        }
        // check anti-diagonal
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if (i - j == row - col && chess[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 0;
            }
        }
        printNQueens(chess, "", 0); // print all the possible solutions
        sc.close();
    }
}
```
