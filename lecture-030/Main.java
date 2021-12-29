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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // printMazePathsWithJumps1(0, 0, n - 1, m - 1, "");
        printMazePathsWithJumps2(0, 0, n - 1, m - 1, "");
        sc.close();
    }
}