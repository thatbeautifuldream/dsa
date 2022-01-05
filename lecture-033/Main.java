import java.util.*;

public class Main {

    // !Agenda for today:
    // Knights Tour

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {

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
        System.out.println("1");
        sc.close();
    }
}