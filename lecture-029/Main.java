import java.io.*;
import java.util.*;

public class Main {

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<String>(); // base case
            base.add(""); // empty string
            return base;
        }

        ArrayList<String> myAns = new ArrayList<String>();

        if (sc + 1 <= dc) { // can move right
            for (int jump = 1; sc + jump <= dc; jump++) { // try all possible jumps loops till we reach destination
                ArrayList<String> hCall = getMazePathsWithJumps(sr, sc + jump, dr, dc); // right jumps
                for (String s : hCall) { // for each right jump
                    myAns.add("h" + jump + s); // add it to the answer with jump count
                }
            }
        }

        if (sr + 1 <= dr) { // can move down
            for (int jump = 1; sr + jump <= dr; jump++) { // try all possible jumps loops till we reach destination
                ArrayList<String> vCall = getMazePathsWithJumps(sr + jump, sc, dr, dc); // down jumps
                for (String s : vCall) { // for each down jump
                    myAns.add("v" + jump + s); // add it to the answer with jump count
                }
            }
        }

        if (sr + 1 <= dr && sc + 1 <= dc) { // can move diagonally (down and right)
            for (int jump = 1; sr + jump <= dr && sc + jump <= dc; jump++) { // try all possible jumps loops till we
                                                                             // reach destination
                ArrayList<String> dCall = getMazePathsWithJumps(sr + jump, sc + jump, dr, dc); // diagonal jumps
                for (String s : dCall) { // for each diagonal jump
                    myAns.add("d" + jump + s); // add it to the answer with jump count
                }
            }
        }
        return myAns; // return the answer
    }

    // Question/Function Types
    // GET : ArrayList type => Top down approach
    // PRINT : Void type => Bottom up approach

    // Print Subsequence : Print all possible subsequences of a given string
    // (dont store but print)

    public static void printSS(String str, String ans) {
        if (str.length() == 0) { // base case
            System.out.println(ans); // print the answer
            return;
        }
        char ch = str.charAt(0); // get the first character : a
        String ros = str.substring(1); // get the rest of the string : bc
        printSS(ros, ans + ch); // first call : ans contains character a
        printSS(ros, ans); // second call : ans does not contain character a
    }

    // Print stair path : Print all possible stair paths of a given number of steps

    public static void printStairPaths(int n, String path) {
        if (n == 0) {
            System.out.println(path); // print the answer
            return;
        }
        if (n - 1 >= 0) { // 1 step
            printStairPaths(n - 1, path + "1"); // add 1 step
        }
        if (n - 2 >= 0) { // 2 steps
            printStairPaths(n - 2, path + "2"); // add 2 steps
        }
        if (n - 3 >= 0) { // 3 steps
            printStairPaths(n - 3, path + "3"); // add 3 steps
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // !Get Maze Paths
        // int n = scn.nextInt();
        // int m = scn.nextInt();
        // ArrayList<String> myAns = getMazePathsWithJumps(0, 0, n - 1, m - 1);
        // System.out.println(myAns);

        // !Print Subsequence
        // String str = scn.next();
        // printSS(str, "");

        // !Print Stair Paths
        int n = scn.nextInt();
        printStairPaths(n, "");
        scn.close();
    }

}