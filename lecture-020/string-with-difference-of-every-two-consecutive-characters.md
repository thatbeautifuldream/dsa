# String With Difference Of Every Two Consecutive Characters

> 1.  You are given a string that contains only lowercase and uppercase alphabets.
> 2.  You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.

```
   For "abecd", the answer should be "a1b3e-2c1d", as
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1

Input Format
A String
Output Format
A String

Constraints
1 <= length of string <= 1000
Sample Input
pepCODinG
Sample Output
p-11e11p-45C12O-11D37i5n-39G
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

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
        String s = sc.nextLine();
        System.out.println(stringDiffrence(s));
        sc.close();
    }

}
```
