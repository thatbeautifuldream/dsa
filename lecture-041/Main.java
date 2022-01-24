
// Agenda | Dynamic Programming
// Climb Stairs With Variable Jumps
// Min Cost In Maze Traversal

import java.io.*;
import java.util.*;

public class Main {

    public static int solve(int[] a, int src, int dest) {
        if (src == dest)
            return 1;
        int count = 0;
        for (int jump = 1; jump <= a[src] && src + jump <= dest; jump++) {
            count += solve(a, src + jump, dest); // new src = src + jump
        }
        return count;
    }

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

    public static int solveT(int[] arr, int SRC, int dest, int[] dp) {
        for (int src = dp.length - 1; src >= SRC; src--) {
            if (src == dest) {
                dp[src] = 1;
                continue;
            }
            int count = 0;
            for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {
                count += dp[src + jump];// solveM(arr, src + jump, dest, dp);
            }
            dp[src] = count;
        }
        return dp[SRC];
    }

    public static void main(String[] args) throws Exception {
        // Climb stairs with variable jumps

        // Recursive Solution
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = sc.nextInt();
        // }
        // int ans = solve(a, 0, n); // arr, src, dest
        // System.out.println(ans);

        // Memoize Solution
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = sc.nextInt();
        // }
        // int[] dp = new int[n + 1];
        // int ans = solveM(a, 0, n, dp);
        // System.out.println(ans);
        // sc.close();

        // Tabulation
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = sc.nextInt();
        // }
        // int[] dp = new int[n + 1];
        // int ans = solveT(a, 0, n, dp);
        // System.out.println(ans);
        // sc.close();

        // Min Cost In Maze Traversal (Tabulation)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    // single block
                    dp[i][j] = a[i][j];
                } else if (i == n - 1) {
                    // last row
                    dp[i][j] = a[i][j] + dp[i][j + 1];
                } else if (j == m - 1) {
                    // last column
                    dp[i][j] = a[i][j] + dp[i + 1][j];
                } else {
                    // all other blocks
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + a[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
        sc.close();
    }

}