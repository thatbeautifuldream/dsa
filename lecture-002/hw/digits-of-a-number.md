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
import java.util.Scanner;

// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.
public class Main {
    public static void digitsOfNumber(int num) {
        int len = countDigitOfNumber(num) - 1;
        while (len >= 0) {
            int digit = num / (int) Math.pow(10, len);
            num = num % (int) Math.pow(10, len);
            System.out.println(digit);
            len--;
        }
    }

    public static int countDigitOfNumber(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        digitsOfNumber(num);
        sc.close();
    }
}
```
