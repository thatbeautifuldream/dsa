# Goldmine

`Easy`

> 1. You are given a number n, representing the number of rows.
> 2. You are given a number m, representing the number of columns.
> 3. You are given n\*m numbers, representing elements of 2d array a, which represents a gold mine.
> 4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from
>    any row in the left wall.
> 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
> 6. Each cell has a value that is the amount of gold available in the cell.
> 7. You are required to identify the maximum amount of gold that can be dug out from the mine.

## Input Format

```
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
```

## Output Format

```
An integer representing Maximum gold available.
```

## Constraints

```
1 <= n <= 10^2
1 <= m <= 10^2
0 <= e1, e2, .. n * m elements <= 1000
```

## Sample Input

```
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
```

## Sample Output

```
33
```

## Solution (Recursion)

> Fails a few test cases due to `TLE : Time Limit Exceeded`.

```java
import java.util.*;

public class Main {

    public static int goldMine(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0; // out of bounds
        }
        int op1 = goldMine(i - 1, j + 1, grid); // right-up
        int op2 = goldMine(i, j + 1, grid); // right
        int op3 = goldMine(i + 1, j + 1, grid); // right-down
        int max = Math.max(op1, Math.max(op2, op3)); // max of 3 options
        int calc = max + grid[i][j]; // add current cell value
        return calc; // return computed value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmpAns = goldMine(i, 0, grid);
            if (tmpAns > ans) {
                ans = tmpAns;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
```

## Solution (Memoisation)

```java
import java.util.*;

public class Main {

    public static int goldMine(int i, int j, int[][] grid, int[][] dp) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0; // out of bounds
        }
        if (dp[i][j] != 0) { // returns already computed value
            return dp[i][j];
        }
        int op1 = goldMine(i - 1, j + 1, grid, dp); // right-up
        int op2 = goldMine(i, j + 1, grid, dp); // right
        int op3 = goldMine(i + 1, j + 1, grid, dp); // right-down
        int max = Math.max(op1, Math.max(op2, op3)); // max of 3 options
        dp[i][j] = max + grid[i][j]; // update dp
        return dp[i][j]; // return computed value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmpAns = goldMine(i, 0, grid, dp);
            if (tmpAns > ans) {
                ans = tmpAns;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
```

## Solution (Tabulation)

```java
import java.util.*;

public class Main {

    public static int goldMineTab(int[][] grid, int[][] dp) {
        int n = grid.length;
        int m = grid[0].length;
        for (int j = m - 1; j >= 0; j--) { // iterate from right to left
            for (int i = 0; i < n; i++) { // iterate from top to bottom
                if (j == m - 1) { // first column
                    dp[i][j] = grid[i][j]; // set value
                } else if (i == 0) { // first row
                    int op1 = dp[i][j + 1]; // right-up
                    int op2 = dp[i + 1][j + 1]; // right

                    dp[i][j] = Math.max(op1, op2) + grid[i][j]; // update dp
                } else if (i == n - 1) { // last row
                    int op1 = dp[i][j + 1]; // right
                    int op2 = dp[i - 1][j + 1]; // right-up

                    dp[i][j] = Math.max(op1, op2) + grid[i][j]; // update dp
                } else { // middle
                    int op1 = dp[i][j + 1]; // right
                    int op2 = dp[i - 1][j + 1]; // right-up
                    int op3 = dp[i + 1][j + 1]; // right-down

                    dp[i][j] = Math.max(op1, Math.max(op2, op3)) + grid[i][j]; // update dp
                }

            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) { // iterate from top to bottom
            ans = Math.max(ans, dp[i][0]); // get max value
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        int ans = goldMineTab(grid, dp);
        System.out.println(ans);
        sc.close();
    }
}
```
