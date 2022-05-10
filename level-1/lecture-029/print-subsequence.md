# Print Subsequence

> 1. You are given a string str.
> 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A string str
Output Format
Subsequences of str in order hinted by Sample output

Constraints
0 <= str.length <= 7
Sample Input
yvTA

Sample Output
yvTA
yvT
yvA
yv
yTA
yT
yA
y
vTA
vT
vA
v
TA
T
A
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSS(s, "");
    }

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
}
```
