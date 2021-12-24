# Get Kpc

> 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
> 2. The following list is the key to characters map :

```
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
```

> 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
>    Use sample input and output to take idea about output.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A string str
Output Format
Contents of the arraylist containing words as shown in sample output

Constraints
0 <= str.length <= 10
str contains numbers only
Sample Input
78
Sample Output
[tv, tw, tx, uv, uw, ux]
```

## Solution

```java
import java.util.*;

public class Main {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getKPC(s));
        sc.close();
    }
}
```
