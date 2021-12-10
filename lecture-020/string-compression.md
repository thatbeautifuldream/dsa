# String Compression 

>1. You are given a string. 
>2. You have to compress the given string in the following two ways - 
>   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
>   For "aaabbccdee", the compressed string will be "abcde".
>   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the ?
>   number of consecutive duplicates.
>   For "aaabbccdee", the compressed string will be "a3b2c2de2".


```text
Input Format
A String
Output Format
Two strings representing first compressed string and second compressed string respectively.
Constraints
1 <= length of string <= 1000
Sample Input
wwwwaaadexxxxxx
Sample Output
wadex
w4a3dex6
```

```java
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compression1(s));
        System.out.println(compression2(s));
        sc.close();
    }
}
```