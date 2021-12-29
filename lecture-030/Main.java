import java.util.*;

public class Main {
    // ! Agenda :
    // Print Maze path with jumps
    // Print Permutations
    // Print Encodings

    public static void printMazePathsWithJumps1(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        if (sr > dr || sc > dc) {
            return;
        }
        // horizontal
        if (sc + 1 <= dc) {
            for (int jump = 1; sc + jump <= dc; jump++) {
                printMazePathsWithJumps(sr, sc + jump, dr, dc, psf + "h" + jump);
            }
        }
        // vertical
        if (sr + 1 <= dr) {
            for (int jump = 1; sr + jump <= dr; jump++) {
                printMazePathsWithJumps(sr + jump, sc, dr, dc, psf + "v" + jump);
            }
        }
        // diagonal
        if (sr + 1 <= dr && sc + 1 <= dc) {
            for (int jump = 1; sr + jump <= dr && sc + jump <= dc; jump++) {
                printMazePathsWithJumps(sr + jump, sc + jump, dr, dc, psf + "d" + jump);
            }
        }
    }

    // global scoped variables
    static int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } }; // {horizontal(right), vertical(down), diagonal(right-down)}
    static String[] dirN = { "h", "v", "d" }; // direction names

    public static void printMazePathsWithJumps2(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) { // base case
            System.out.println(psf);
            return;
        }
        for (int d = 0; d < dir.length; d++) {
            for (int jump = 1; jump <= Math.max(dr, dc); jump++) {
                int r = sr + (jump * dir[d][0]);
                int c = sc + (jump * dir[d][1]);
                if (r >= 0 && r <= dr && c >= 0 && c <= dc) {
                    printMazePathsWithJumps2(r, c, dr, dc, psf + dirN[d] + jump);
                }
            }
        }
    }

    // Print Permutations
    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // get ch from str
            String ros = str.substring(0, i) + str.substring(i + 1); // exclude ch from str
            printPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // printMazePathsWithJumps1(0, 0, n - 1, m - 1, "");
        // printMazePathsWithJumps2(0, 0, n - 1, m - 1, "");
        String s = sc.next();
        printPermutations(s, "");
        sc.close();
    }
}