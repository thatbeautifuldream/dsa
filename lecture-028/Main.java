import java.util.*;

public class Main {

    /*
     * Todays Agenda :
     * 1. Get KPC
     * 2. Get Mazepath
     * 
     */

    // Global Variable
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // getKPC using recursion
    public static ArrayList<String> getKPC(String s) {
        if (s.length() == 0) {
            ArrayList<String> result = new ArrayList<String>();
            result.add("");
            return result;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getKPC(s));
        sc.close();
    }

}