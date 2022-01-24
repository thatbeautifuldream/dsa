# Print All Primes Till N

> 1. You've to print all prime numbers between a range.
> 2. Take as input "low", the lower limit of range.
> 3. Take as input "high", the higher limit of range.
> 4. For the range print all the primes numbers between low and high (both included).

```
Input Format
low
high
Output Format
n1
n2
.. all primes between low and high (both included)

Constraints
2 <= low < high < 10 ^ 6
Sample Input
6
24
Sample Output
7
11
13
17
19
23
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lo = sc.nextInt(), hi = sc.nextInt();
        for (int i = lo; i <= hi; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
