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

    // ! Print Subsequence : Print all possible subsequences of a given string
    // (doesnt store but print)
    // ! Really good question can be used to solve really hard problems

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

        // ! in a stair path, you can either take 1, 2 or 3 steps
        // solving in one loop
        // for (int step = 1; step <= 3; step++) {
        // if (n - step >= 0) { // 1 step
        // printStairPaths(n - step, path + step); // add path number of steps
        // }
        // }
    }

    // Print Maze Path : Print all possible maze paths of a given source and
    // destination

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) { // base case
            System.out.println(psf); // print the answer
            return;
        }

        // ! Proactive call : when we call with cases

        if (sc + 1 <= dc) { // can move right
            printMazePaths(sr, sc + 1, dr, dc, psf + "h"); // add h to the path
        }
        if (sr + 1 <= dr) { // can move down
            printMazePaths(sr + 1, sc, dr, dc, psf + "v"); // add v to the path
        }

        // Either way we can call and handle negative cases
        // ! Reactive call : when we call without cases
        // if (sr > dr && sc > dc) {
        // return;
        // }
        // printMazePaths(sr, sc + 1, dr, dc, psf + "h"); // add h to the path
        // printMazePaths(sr + 1, sc, dr, dc, psf + "v"); // add v to the path
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // !Get Maze Paths
        // int n = scn.nextInt();
        // int m = scn.nextInt();
        // ArrayList<String> myAns = getMazePathsWithJumps(0, 0, n - 1, m - 1);
        // System.out.println(myAns);

        // All Get Problems are Top Down Approach
        // All Print Problems are Bottom Up Approach

        // !Print Subsequence
        // String str = scn.next();
        // printSS(str, "");

        // !Print Stair Paths
        // int n = scn.nextInt();
        // printStairPaths(n, "");

        // !Print Maze Paths
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
        scn.close();
    }

}