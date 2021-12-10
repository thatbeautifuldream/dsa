import java.util.*;

public class Main {

    // String Compression :
    // 1st function : aabcccccaaa -> abca
    // 2nd function : aaabbccdddda -> a3b2c2d4a

    public static String compression1(String s) {
        String ans = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) { // start loop from 1 since we're checking the previous char
            if (s.charAt(i) != s.charAt(i - 1)) { // if the current char is not the same as the previous char
                ans += s.charAt(i); // add the current char to the answer
            }
        }
        return ans; // return the answer
    }

    public static String compression2(String s) {
        int count = 1;
        String ans = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) { // if curr == prev char (same char) then increment count
                count++;
            } else { // if curr != prev char (different char) then add count to answer
                ans += (count > 1) ? ("" + count + s.charAt(i)) : ("" + s.charAt(i));
                count = 1; // reset the count
            }
        }
        ans += (count > 1) ? ("" + count + s.charAt(s.length() - 1)) : ("" + s.charAt(s.length() - 1)); // add the last
                                                                                                        // count to the
                                                                                                        // answer
        return ans;
    }

    // String Builder :
    // Theory :
    // 1. StringBuilder is a mutable sequence of characters.
    // 2. StringBuilder is not thread-safe.
    // 3. StringBuilder is not synchronized.
    // String vs StringBuilder :
    // 1. String is immutable.
    // 2. StringBuilder is mutable.
    // 3. StringBuilder is thread-safe.
    // 4. StringBuilder is synchronized.
    // 5. StringBuilder is faster than String.

    public static void stringTime() {
        // String vs StringBuilder :
        // String :
        // String s = new String();
        String s = "";
        int st = (int) System.currentTimeMillis(); // returns a long value so we typecast it to int
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        int et = (int) System.currentTimeMillis();
        System.out.println("String : " + (et - st));
        // String Builder :
        StringBuilder sb = new StringBuilder();
        int stb = (int) System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        int etb = (int) System.currentTimeMillis();
        System.out.println("StringBuilder : " + (etb - stb));
    }

    public static String stringToggle(String s) {
        // Toggle the input and print using string builder
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {
                char uc = (char) (s.charAt(i) + 'A' - 'a'); // convert to uppercase
                ans.append(uc);
            } else {
                char lc = (char) (s.charAt(i) + 'a' - 'A'); // convert to lowercase
                ans.append(lc);
            }
        }
        return ans.toString();
    }

    public static String stringDiffrence(String s) {
        // String With Difference Of Every Two Consecutive Characters
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int diff = (int) (s.charAt(i) - s.charAt(i - 1));
            ans.append(diff);
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println(compression1(s));
        // System.out.println(compression2(s));
        // sc.close();
        // stringTime(); // demonstrating how String Builder is faster than String
        String s = sc.nextLine();
        // System.out.println(stringToggle(s));
        System.out.println(stringDiffrence(s));
        sc.close();
    }
}