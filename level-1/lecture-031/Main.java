import java.util.*;

public class Main {
    // Recursion and Backtracking
    // ! Agenda :
    // Flood Fill Algorithm

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] vis) {
        if (sr < 0 || sr >= maze.length || sc < 0 || sc >= maze[0].length) {
            return;
        }
        if (vis[sr][sc]) {
            return;
        }
        if (maze[sr][sc] == 0) {
            return;
        }
        vis[sr][sc] = true;
        asf += maze[sr][sc];
        floodfill(maze, sr - 1, sc, asf + "t", vis);
        floodfill(maze, sr, sc - 1, asf + "l", vis);
        floodfill(maze, sr + 1, sc, asf + "d", vis);
        floodfill(maze, sr, sc + 1, asf + "r", vis);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
        scn.close();
    }

}