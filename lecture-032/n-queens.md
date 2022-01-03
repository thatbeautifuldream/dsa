# N Queens

> 1. You are given a number n, the size of a chess board.
> 2. You are required to place n number of queens in the n \* n cells of board such that no queen can kill another.
>    `Note - Queens kill at distance in all 8 directions`
> 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
Output Format
Safe configurations of queens as suggested in sample output

Constraints
1 <= n <= 10
Sample Input
4
Sample Output
0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, .
```

## Visualization [Recursive N-Queens](http://www.algoanim.ide.sk/index.php?page=showanim&id=61)

## Solution

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
