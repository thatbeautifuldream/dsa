# Get Subsequence

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
