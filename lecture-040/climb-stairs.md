# Climb Stairs

`Easy`

> 1. You are given a number n, representing the number of stairs in a staircase.
> 2. You are on the 0th step and are required to climb to the top.
> 3. In one move, you are allowed to climb 1, 2 or 3 stairs.
> 4. You are required to print the number of different paths via which you can climb to the top.

## Input Format

> A number n

## Output Format

> A number representing the number of ways to climb the stairs from 0 to top.

## Constraints

> 0 <= n <= 20

## Sample Input

> 4

## Sample Output

> 7

## Solution (Recursion)

```java
import java.io.*;
import java.util.*;

public class Main {
    public static int climbStairsR(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        if (n - 1 >= 0) {
            count += climbStairsR(n - 1);
        }
        if (n - 2 >= 0) {
            count += climbStairsR(n - 2);
        }
        if (n - 3 >= 0) {
            count += climbStairsR(n - 3);
        }
        return count;
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = climbStairsR(n);
        System.out.println(ans);
        sc.close();
    }
}
```

## Solution (Memoisation)

```java
import java.io.*;
import java.util.*;

public class Main {
    // Memoization
    public static int climbStairsM(int n, int[] dp) {
        if (n == 0) {
            dp[n] = 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int count = 0;
        if (n - 1 >= 0) {
            count += climbStairsR(n - 1);
        }
        if (n - 2 >= 0) {
            count += climbStairsR(n - 2);
        }
        if (n - 3 >= 0) {
            count += climbStairsR(n - 3);
        }
        return dp[n] = count;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbStairsM(n, dp));
        sc.close();
    }
}
```

## Solution (Tabulation)

```java
import java.io.*;
import java.util.*;

public class Main {
    // Tabulation (Convertion of memoization to tabulation)
    public static int climbStairsT(int N, int[] dp) {
        for (int n = 0; n < dp.length; n++) {
            if (n == 0) {
                dp[n] = 1;
            }
            int count = 0;
            if (n - 1 >= 0) {
                count += dp[n - 1];
                continue;
            }
            if (n - 2 >= 0) {
                count += dp[n - 2];
                continue;
            }
            if (n - 3 >= 0) {
                count += dp[n - 3];
                continue;
            }
            dp[n] = count;
        }
        return dp[N];
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbStairsT(n, dp));
        sc.close();
    }
}
```
