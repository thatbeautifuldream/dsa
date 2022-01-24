# Print Stair Paths

> 1. You are given a number n representing number of stairs in a staircase.
> 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
> 3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
Output Format
Print paths (one path in each line) in order hinted by Sample output

Constraints
0 <= n <= 10
Sample Input
3
Sample Output
111
12
21
3
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String path) {

        // ! in a stair path, you can either take 1, 2 or 3 steps

        if (n == 0) {
            System.out.println(path); // print the answer
            return;
        }

        if (n - 1 >= 0) { // 1 step
            printStairPaths(n - 1, path + "1"); // add 1 step
        }

        if (n - 2 >= 0) { // 2 steps
            printStairPaths(n - 2, path + "2"); // add 2 steps
        }

        if (n - 3 >= 0) { // 3 steps
            printStairPaths(n - 3, path + "3"); // add 3 steps
        }

        // solving in one loop
        // for (int step = 1; step <= 3; step++) {
        // if (n - step >= 0) { // 1 step
        // printStairPaths(n - step, path + step); // add path number of steps
        // }
        // }
    }

}
```
