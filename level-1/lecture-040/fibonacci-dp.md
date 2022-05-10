# Fibonacci-dp

`Easy`

> 1. You are given a number n.
> 2. You are required to print the nth element of fibonnaci sequence.

> `Note -> Notice precisely how we have defined the fibonnaci sequence`

```
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8
```

## Input Format

> A number n

## Output Format

> A number representing the nth element of fibonnaci sequence

## Constraints

> 0 <= n <= 45

## Sample Input

> 10

## Sample Output

> 55

## Solution (Recursion)

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fiboR(n));
        sc.close();
    }

    // recursive solution
    public static int fiboR(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fiboR(n - 1) + fiboR(n - 2);
        }
    }
}
```

## Solution (Memoization)

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1]; // stores values of fibonacci numbers from 0 to n => (n+1) terms
        Arrays.fill(dp, -1);
        System.out.println(fiboM(n, dp));
        sc.close();
    }

    // memoization : stores values of fiboR(n)
    public static int fiboM(int n, int[] dp) {
        if (n <= 1) {
            return dp[n] = n;
        } else {
            if (dp[n] != -1) {
                return dp[n];
            }
            return dp[n] = fiboM(n - 1, dp) + fiboM(n - 2, dp);
        }
    }
}
```

## Solution (Tabulation)

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1]; // stores values of fibonacci numbers from 0 to n => (n+1) terms
        Arrays.fill(dp, -1); // -1 is used to represent uninitialized values
        System.out.println(fiboT(n, dp)); // spits nth fibonacci number
        sc.close();
    }

    // (converting memoisation to tabulation)
    public static int fiboT(int N, int[] dp) {
        for (int n = 0; n < dp.length; n++) {
            if (n <= 1) {
                dp[n] = n;
                continue;
            }
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[N];
    }

    // or tabulation methord
    public static int fiboT2(int N, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for (int n = 2; n < dp.length; n++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[N];
    }
}
```
