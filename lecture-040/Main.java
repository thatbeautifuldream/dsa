
// Agenda : Dynamic Programming
// Fibonacci-dp

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(fiboR(n));
        int[] dp = new int[n + 1]; // stores values of fibonacci numbers from 0 to n => (n+1) terms
        Arrays.fill(dp, -1);
        System.out.println(fiboM(n, dp));
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

}