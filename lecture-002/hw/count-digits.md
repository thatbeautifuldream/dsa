# Count Digits In A Number

> 1. You've to count the number of digits in a number.
> 2. Take as input "n", the number for which the digits has to be counted.
> 3. Print the digits in that number.

```
Input Format
"n" where n is any integer.
Output Format
"d" where d is the number of digits in the number "n"

Constraints
1 <= n < 10^9
Sample Input
65784383
Sample Output
8
```

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        while (n != 0) {
            d++;
            n /= 10;
        }
        System.out.println(d);
        sc.close();
    }
}
```
