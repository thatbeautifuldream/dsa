
// Agenda | Dynamic Programming
// Climb Stairs With Variable Jumps
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

    public static int solveT(int[] a, int src, int dest, int[] dp) {
        if (src == dest)
            return dp[src] = 1;
        if (dp[src] != 0)
            return dp[src];
        int count = 0;
        for (int jump = 1; jump <= a[src] && src + jump <= dest; jump++) {
            count += solveT(a, src + jump, dest, dp);
        }
        return dp[src] = count;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        int ans = solveT(a, 0, n, dp);
        System.out.println(ans);
        sc.close();
    }

}