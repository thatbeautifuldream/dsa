import java.util.*;

public class Main {

    /*
     * Todays Agenda :
     * 1. Get KPC
     * 2. Get Mazepath (Leetcode 17)
     * 
     */

    // Global Variable
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // getKPC using recursion
    public static ArrayList<String> getKPC(String s) {
        if (s.length() == 0) { // base case when string is empty
            ArrayList<String> base = new ArrayList<String>();
            base.add(""); // empty string
            return base;
        }
        char ch = s.charAt(0); // get first character
        String ros = s.substring(1); // remove first character
        ArrayList<String> recAns = getKPC(ros); // returns all possible strings without ch
        ArrayList<String> myAns = new ArrayList<String>(); // all possible strings added with ch one by one
        int idx = ch - '0'; // index of ch in codes and digits from keys
        String code = codes[idx]; // get the code for ch
        for (int i = 0; i < code.length(); i++) {
            char newChar = code.charAt(i); // get the new char at i
            for (String str : recAns) {
                myAns.add(newChar + str); // add newChar to all possible strings
            }
        }
        return myAns;

    }

    // Get Mazepath using recursion

    /*
     * Sample Input :
     * 3 3
     * Sample Output :
     * [hhvv,hvhv,hvvh,vhhv,vhvh,vvhh]
     */

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) { // base case
            ArrayList<String> base = new ArrayList<String>();
            base.add(""); // empty string
            return base;
        }
        ArrayList<String> myAns = new ArrayList<String>(); // to store all possible combinations
        // Two calls : Horizontal and Vertical (order matters)

        if (sc + 1 <= dc) { // Horizontal Call (Jump of source column + 1)
            ArrayList<String> right = getMazePaths(sr, sc + 1, dr, dc); // get all possible paths for all right calls
            for (String str : right) {
                myAns.add("h" + str); // add h to myAns
            }
        }

        if (sr + 1 <= dr) { // Vertical Call (Jump of source row + 1)
            ArrayList<String> down = getMazePaths(sr + 1, sc, dr, dc); // get all possible paths for all down calls
            for (String str : down) {
                myAns.add("v" + str); // add v to myAns
            }
        }

        return myAns; // returns all possible strings
    }

    // Get Mazepath with Jumps using recursion

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
        // ??? Home Work, I guess.
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get KPC (Keen Pad Combinations) :
        // String s = sc.nextLine();
        // System.out.println(getKPC(s));

        // get Maze Paths :
        int n = sc.nextInt(); // number of rows
        int m = sc.nextInt(); // number of columns
        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1); // get all possible paths from (0,0) to (n-1, m-1)
        System.out.println(ans);
        sc.close();
    }

}