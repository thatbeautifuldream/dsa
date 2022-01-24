# Get Subsequence

> 1. You are given a string str.
> 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
>    Use sample input and output to take idea about subsequences.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.`
> `Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output

Constraints
0 <= str.length <= 20
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    // Get Subsequence : to calculate all subsequences of string
    public static ArrayList<String> gss(String s) {
        if (s.length() == 0) {
            ArrayList<String> empty = new ArrayList<String>();
            empty.add("");
            return empty;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        ArrayList<String> rec = gss(ros);
        ArrayList<String> result = new ArrayList<String>();
        for (String str : rec) {
            result.add(str);
        }
        for (String str : rec) {
            result.add(ch + str);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> list = gss(s);
        System.out.println(list);
        sc.close();
    }
}
```
