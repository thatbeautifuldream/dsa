# Print Permutations

> 1. You are given a string str.
> 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A string str
Output Format
Permutations of str in order hinted by Sample output

Constraints
0 <= str.length <= 7
Sample Input
abc
Sample Output
abc
acb
bac
bca
cab
cba
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    // Print Permutations
    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // get ch from str
            String ros = str.substring(0, i) + str.substring(i + 1); // exclude ch from str
            printPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPermutations(s, "");
        sc.close();
    }
}
```
