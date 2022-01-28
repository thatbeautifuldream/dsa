import java.util.*;

public class Main {

    public static int goldMine(int i, int j, int[][] grid, int[][] dp) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int op1 = goldMine(i - 1, j + 1, grid, dp);
        int op2 = goldMine(i, j + 1, grid, dp);
        int op3 = goldMine(i + 1, j + 1, grid, dp);
        int max = Math.max(op1, Math.max(op2, op3));
        dp[i][j] = max + grid[i][j];
        return dp[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmpAns = goldMine(i, 0, grid, dp);
            if (tmpAns > ans) {
                ans = tmpAns;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}