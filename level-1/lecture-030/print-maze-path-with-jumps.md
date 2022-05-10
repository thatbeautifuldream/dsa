# Print Maze Paths With Jumps

> 1. You are given a number n and a number m representing number of rows and columns in a maze.
> 2. You are standing in the top-left corner and have to reach the bottom-right corner.
> 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
> 4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
A number m
Output Format
Print paths (one path in each line) in order hinted by Sample output

Constraints
0 <= n <= 5
0 <= m <= 5
Sample Input
3
3
Sample Output
h1h1v1v1
h1h1v2
h1v1h1v1
h1v1v1h1
h1v1d1
h1v2h1
h1d1v1
h2v1v1
h2v2
v1h1h1v1
v1h1v1h1
v1h1d1
v1h2v1
v1v1h1h1
v1v1h2
v1d1h1
v2h1h1
v2h2
d1h1v1
d1v1h1
d1d1
d2
```

## Solution

```java
import java.util.*;

public class Main {
    // ! Solving using two approaches
    // Approach 1

    public static void printMazePathsWithJumps1(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        if (sr > dr || sc > dc) {
            return;
        }
        // horizontal
        if (sc + 1 <= dc) {
            for (int jump = 1; sc + jump <= dc; jump++) {
                printMazePathsWithJumps(sr, sc + jump, dr, dc, psf + "h" + jump);
            }
        }
        // vertical
        if (sr + 1 <= dr) {
            for (int jump = 1; sr + jump <= dr; jump++) {
                printMazePathsWithJumps(sr + jump, sc, dr, dc, psf + "v" + jump);
            }
        }
        // diagonal
        if (sr + 1 <= dr && sc + 1 <= dc) {
            for (int jump = 1; sr + jump <= dr && sc + jump <= dc; jump++) {
                printMazePathsWithJumps(sr + jump, sc + jump, dr, dc, psf + "d" + jump);
            }
        }
    }

    // Approach 2 : using "Direction Array"

    // global scoped variables
    static int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } }; // {horizontal(right), vertical(down), diagonal(right-down)}
    static String[] dirN = { "h", "v", "d" }; // direction names

    public static void printMazePathsWithJumps2(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) { // base case
            System.out.println(psf);
            return;
        }
        for (int d = 0; d < dir.length; d++) {
            for (int jump = 1; jump <= Math.max(dr, dc); jump++) {
                int r = sr + (jump * dir[d][0]);
                int c = sc + (jump * dir[d][1]);
                if (r >= 0 && r <= dr && c >= 0 && c <= dc) {
                    printMazePathsWithJumps2(r, c, dr, dc, psf + dirN[d] + jump);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // printMazePathsWithJumps1(0, 0, n - 1, m - 1, "");
        printMazePathsWithJumps2(0, 0, n - 1, m - 1, "");
        sc.close();
    }
}
```
