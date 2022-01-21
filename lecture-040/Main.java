
// Agenda : Dynamic Programming
// Fibonacci-dp

import java.io.*;
import java.util.*;

public class Main {

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // recursive solution
    public static int fiboR(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fiboR(n - 1) + fiboR(n - 2);
        }
    }

    // memoization : stores values of fiboR(n)
    public static int fiboM(int n, int[] dp) {
        if (n <= 1) {
            return dp[n] = n;
        } else {
            if (dp[n] == -1) {
                return dp[n] = fiboM(n - 1, dp) + fiboM(n - 2, dp);
            }
            return dp[n];
        }
    }

    // to convert memoisation to tabulation :
    // 1. create a new array of size n+1
    // 2. fill the first two values of the array with 0 and 1
    // 3. fill the rest of the array with dp[n-1] + dp[n-2]
    // 4. return dp[n]

    public static int fiboT(int N, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for (int n = 2; n < dp.length; n++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[N];
    }

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
        // FIBO
        // int n = sc.nextInt();
        // // System.out.println(fiboR(n));
        // int[] dp = new int[n + 1]; // stores values of fibonacci numbers from 0 to n
        // => (n+1) terms
        // Arrays.fill(dp, -1); // -1 is used to represent uninitialized values
        // System.out.println(fiboM(n, dp)); // spits nth fibonacci number
        // display(dp); // spits the fibonacci series

        // CLIMB STAIRS
        int n = sc.nextInt();
        // int ans = climbStairsR(n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        // System.out.println(climbStairsM(n, dp));
        System.out.println(climbStairsT(n, dp));
        sc.close();
    }
}