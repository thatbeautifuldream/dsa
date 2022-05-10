import java.util.*;

public class Main {
    // ! Agenda
    // Problem : Target Sum Subsets
    // Problem : NQueens

    // asf is answer so far
    // sum is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        if (idx == arr.length) { // base case when we reach the end of the array
            if (tar == sum) { // if the sum of the subset is equal to the target
                System.out.println(asf + "."); // print the subset
            }
            return; // return out of the function
        }
        // picked
        printTargetSumSubsets(arr, idx + 1, asf + arr[idx] + ", ", sum + arr[idx], tar);
        // not picked
        printTargetSumSubsets(arr, idx + 1, asf, sum, tar);
    }

    public static void printNQueens(int[][] chess, String asf, int row) {
        if (row == chess.length) {
            System.out.println(asf + ".");
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1; // mark the queen
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0; // unplace the queen
            }
        }
    }

    public static boolean isSafe(int[][] chess, int row, int col) {
        // check row
        for (int i = 0; i < chess.length; i++) {
            if (chess[row][i] == 1) {
                return false;
            }
        }
        // check col
        for (int i = 0; i < chess.length; i++) {
            if (chess[i][col] == 1) {
                return false;
            }
        }
        // check diagonal
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if (i + j == row + col && chess[i][j] == 1) {
                    return false;
                }
            }
        }
        // check anti-diagonal
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if (i - j == row - col && chess[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int tar = sc.nextInt();
        // printTargetSumSubsets(arr, 0, "", 0, tar);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 0;
            }
        }
        printNQueens(chess, "", 0); // print all the possible solutions

        sc.close();
    }
}