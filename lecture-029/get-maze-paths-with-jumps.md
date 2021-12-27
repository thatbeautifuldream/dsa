# Get Maze Path With Jumps

> 1. You are given a number n and a number m representing number of rows and columns in a maze.
> 2. You are standing in the top-left corner and have to reach the bottom-right corner.
> 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
> 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.

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
2
2
Sample Output
[h1v1, v1h1, d1]
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<String>(); // base case
            base.add(""); // empty string
            return base;
        }

        ArrayList<String> myAns = new ArrayList<String>();

        if (sc + 1 <= dc) { // can move right
            for (int jump = 1; sc + jump <= dc; jump++) { // try all possible jumps loops till we reach destination
                ArrayList<String> hCall = getMazePathsWithJumps(sr, sc + jump, dr, dc); // right jumps
                for (String s : hCall) { // for each right jump
                    myAns.add("h" + jump + s); // add it to the answer with jump count
                }
            }
        }

        if (sr + 1 <= dr) { // can move down
            for (int jump = 1; sr + jump <= dr; jump++) { // try all possible jumps loops till we reach destination
                ArrayList<String> vCall = getMazePathsWithJumps(sr + jump, sc, dr, dc); // down jumps
                for (String s : vCall) { // for each down jump
                    myAns.add("v" + jump + s); // add it to the answer with jump count
                }
            }
        }

        if (sr + 1 <= dr && sc + 1 <= dc) { // can move diagonally (down and right)
            for (int jump = 1; sr + jump <= dr && sc + jump <= dc; jump++) { // try all possible jumps loops till we
                                                                             // reach destination
                ArrayList<String> dCall = getMazePathsWithJumps(sr + jump, sc + jump, dr, dc); // diagonal jumps
                for (String s : dCall) { // for each diagonal jump
                    myAns.add("d" + jump + s); // add it to the answer with jump count
                }
            }
        }
        return myAns; // return the answer
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> myAns = getMazePathsWithJumps(0, 0, n - 1, m - 1);
        System.out.println(myAns);
        scn.close();
    }

}
```
