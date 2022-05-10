import java.util.*;

public class Main {

    // !Agenda for today:
    // Knights Tour
    // OOPS
    // Linked Lists

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

// !Rough Notes (from the lecture)

/*
 * OOPS : Object Oriented Programming (Classes, Objects)
 * Classes : blueprints for objects
 * Objects : instances of classes
 * We can make User defined classes (User defined data types)
 * Java Program can have any no. of class & this program can have any name.
 * Java Program can have atmost 1 public class & this program must have of name
 * of the public class.
 * Different classes can have diff main method After complilation class files
 * are created containing main method.
 * we can run diff .class files.
 * but if a class does not contain main method
 * -Error: No main method found.
 * if we run any random name
 * -Error: No class found.
 */

class robot {
    int x = 10;

    void fun() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        robot r = new robot();
        r.fun();
    }
}

// javac Main.java && java robot

/*
 * Linked Lists : A data structure that stores a sequence of elements (Linear
 * Data Structure)
 * It consists of a sequence of nodes, each of which contains a reference to
 * the next node in the sequence.
 * It is a dynamic data structure.
 * It is a collection of nodes.
 * A Node is a data structure that contains data and a reference to the next
 * (data | next node's reference) -> ... -> (data | null)
 * 
 * Why Linked Lists?
 * It can store in a format that stores in a fragmented memory space.
 * It can store in non contiguous memory space. (chunks of memory)
 * Helps in efficient memory management.
 * 
 * Advantage of Linked Lists :
 * 1. Efficient memory management
 * 2. Easily insert and delete elements : O(1) time
 * 
 * 
 * Disadvantages of Linked Lists:
 * 1. Extra memory space required
 * 2. To access elements, we need to traverse the entire list
 * Performs a Linear Search : O(n) time
 * 
 */
