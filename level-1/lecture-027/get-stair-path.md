# Get Stair Paths

> 1. You are given a number n representing number of stairs in a staircase.
> 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
> 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
>    Use sample input and output to take idea about output.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
Output Format
Contents of the arraylist containing paths as shown in sample output

Constraints
0 <= n <= 10
Sample Input
3
Sample Output
[111, 12, 21, 3]
```

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) { // base case
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        ArrayList<String> ans = new ArrayList<String>();
        if (n - 1 >= 0) {
            ArrayList<String> nm1 = getStairPaths(n - 1); // get all possible paths for n-1 or 1 step
            for (String s : nm1) {
                ans.add("1" + s);
            }
        }
        if (n - 2 >= 0) {
            ArrayList<String> nm2 = getStairPaths(n - 2); // get all possible paths for n-2 or 2 step
            for (String s : nm2) {
                ans.add("2" + s);
            }
        }
        if (n - 3 >= 0) {
            ArrayList<String> nm3 = getStairPaths(n - 3); // get all possible paths for n-3 or 3 step
            for (String s : nm3) {
                ans.add("3" + s);
            }
        }
        return ans;
    }
}
```
