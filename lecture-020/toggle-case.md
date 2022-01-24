# Toggle Case

> 1.  You are given a string that contains only lowercase and uppercase alphabets.
> 2.  You have to toggle the case of every character of the given string.

```
Input Format
A String
Output Format
A String
Constraints
1 <= length of string <= 1000
Sample Input
pepCODinG
Sample Output
PEPcodINg
```

## Solution

````java
import java.io.*;
import java.util.*;

public class Main {

    public static String toggleCase(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // CH = ch - 'a' + 'A'
            if (ch >= 'A' && ch <= 'Z') {
                char lc = (char) (ch - 'A' + 'a'); // to convert to lower case
                ans.append(lc);
            } else {
                char uc = (char) (ch - 'a' + 'A'); // to convert to upper case
                ans.append(uc);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}```
````
