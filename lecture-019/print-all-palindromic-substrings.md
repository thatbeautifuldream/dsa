# Print All Palindromic Substrings

>1. You are given a string. 
>2. You have to print all palindromic substrings of the given string.

```
Input Format
A String
Output Format
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.
Constraints
1 <= length of string <= 500
Sample Input
abcc
Sample Output
a
b
c
cc
c
```

```java
import java.io.*;
import java.util.*;

public class Main {
	public static void printAllPalindromicSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printAllPalindromicSubstrings(str);
	}

}
```