import java.util.*;

public class Main {

    // !Agenda for today:
    // Knights Tour

    // Direction array for kinght tour (8 moves clockwise fashion)
    static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        // negative base case (if we got out of board)
        if (r >= chess.length || r < 0 || c >= chess[0].length || c < 0 || chess[r][c] != 0) {
            return;
        }
        // logical base case (if we got the answer i.e we reached on the last move)
        if (upcomingMove == chess.length * chess[0].length) {
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        // mark
        chess[r][c] = upcomingMove;

        // calls
        for (int d = 0; d < dir.length; d++) {
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            printKnightsTour(chess, x, y, upcomingMove + 1);
        }

        // unmark
        chess[r][c] = 0;

    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        // starting position
        int r = sc.nextInt();
        int c = sc.nextInt();
        printKnightsTour(chess, r, c, 1);
        sc.close();
    }
}