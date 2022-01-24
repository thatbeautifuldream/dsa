# Climb Stairs With Variable Jumps

`Easy`

> 1. You are given a number n, representing the number of stairs in a staircase.
> 2. You are on the 0th step and are required to climb to the top.
> 3. You are given n numbers, where ith element's value represents - till how far from the step you
>    could jump to in a single move.  
>     You can of course jump fewer number of steps in the move.
> 4. You are required to print the number of different paths via which you can climb to the top.

## Input Format

> 1. A number n
> 2. .. n more elements

## Output Format

> A number representing the number of ways to climb the stairs from 0 to top.

Constraints

> 1. 0 <= n <= 20
> 2. 0 <= n1, n2, .. <= 20

## Sample Input

```
10
3
3
0
2
1
2
4
2
0
0
```

## Sample Output

`5`

## Solution (Recursive Solution)

```java
import java.io.*;
import java.util.*;

public class Main {

    public static int solve(int[] a, int src, int dest) {
        if (src == dest)
            return 1;
        int count = 0;
        for (int jump = 1; jump <= a[src] &&  src + jump <= dest; jump++) {
            count += solve(a, src + jump, dest); // new src = src + jump
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        // Climb stairs with variable jumps
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = solve(a, 0, n); // arr, src, dest
        System.out.println(ans);
        sc.close();
    }

}
```

## Solution (DP - Memoization)

```java
import java.io.*;
import java.util.*;

public class Main {

    public static int solveM(int[] a, int src, int dest, int[] dp) {
        if (src == dest)
            return dp[src] = 1;
        if (dp[src] != 0)
            return dp[src];
        int count = 0;
        for (int jump = 1; jump <= a[src] && src + jump <= dest; jump++) {
            count += solveM(a, src + jump, dest, dp);
        }
        return dp[src] = count;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        int ans = solveM(a, 0, n, dp);
        System.out.println(ans);
        sc.close();
    }

}

```

## Solution (DP - Tabulation)

```java


```
