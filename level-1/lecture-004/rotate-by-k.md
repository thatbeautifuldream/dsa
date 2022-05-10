# Rotate A Number

> 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
> 2. Take as input n and k.
> 3. Print the rotated number.
> 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
>    n = 12340056
>    k = 3
>    r = 05612340

```
Input Format
"n" where n is any integer.
"K" where k is any integer.
Output Format
"r", the rotated number

Constraints
1 <= n < 10^9
-10^9 < k < 10^9
Sample Input
562984
2
Sample Output
845629
```

## Solution

```java
import java.util.Scanner;

public class Main {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int rotateNumber(int n, int k) {
        int len = countDigits(n);
        k = (k % len + len) % len;
        int div = 1, mul = 1;
        for (int i = 1; i <= k; i++) {
            div *= 10;
        }
        for (int i = 1; i <= len - k; i++) {
            mul *= 10;
        }
        int a = n / div;
        int b = n % div;
        return (b * mul + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rotatedNumber = rotateNumber(n, k);
        System.out.println(rotatedNumber);
        sc.close();
    }
}
```
