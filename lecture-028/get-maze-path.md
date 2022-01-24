# Get Maze Paths

> 1. You are given a number n and a number m representing number of rows and columns in a maze.
> 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
> 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
> Use sample input and output to take idea about output.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
A number m
Output Format
Contents of the arraylist containing paths as shown in sample output

Constraints
0 <= n <= 10
0 <= m <= 10
Sample Input
3
3
Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {
    // Get Mazepath using recursion

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) { // base case
            ArrayList<String> base = new ArrayList<String>();
            base.add(""); // empty string
            return base;
        }
        ArrayList<String> myAns = new ArrayList<String>(); // to store all possible combinations
        // Two calls : Horizontal and Vertical (order matters)

        if (sc + 1 <= dc) { // Horizontal Call (Jump of source column + 1)
            ArrayList<String> right = getMazePaths(sr, sc + 1, dr, dc); // get all possible paths for all right calls
            for (String str : right) {
                myAns.add("h" + str); // add h to myAns
            }
        }

        if (sr + 1 <= dr) { // Vertical Call (Jump of source row + 1)
            ArrayList<String> down = getMazePaths(sr + 1, sc, dr, dc); // get all possible paths for all down calls
            for (String str : down) {
                myAns.add("v" + str); // add v to myAns
            }
        }

        return myAns; // returns all possible strings
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println(getKPC(s));

        // get Maze Paths
        int n = sc.nextInt(); // number of rows
        int m = sc.nextInt(); // number of columns
        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1); // get all possible paths from (0,0) to (n-1, m-1)
        System.out.println(ans);
        sc.close();
    }

}
```