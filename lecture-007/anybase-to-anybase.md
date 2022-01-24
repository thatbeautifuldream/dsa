# Any Base To Any Base

> 1. You are given a number n.
> 2. You are given a base b1. n is a number on base b.
> 3. You are given another base b2.
> 4. You are required to convert the number n of base b1 to a number in base b2.

```
Input Format
A number n
A base b1
A base b2
Output Format
A number of base b2 equal in value to n of base b1.

Constraints
0 <= n <= 512
2 <= b1 <= 10
2 <= b2 <= 10
Sample Input
111001
2
3
Sample Output
2010
```

## Solution

```java
import java.util.*;

public class Main {

    public static int any2dec(int n, int b) {
        int ans = 0;
        int pow = 1;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans += (rem * pow);
            pow = pow * b;
        }
        return ans;
    }

    public static int dec2any(int n, int b) {
        int ans = 0;
        int pow = 1;
        while(n > 0) {
            int rem = n % b;
            n = n / b;
            ans += (rem * pow);
            pow = pow * 10;
        }
        return ans;
    }

    public static int any2any(int n, int b1, int b2) {
        int a2d = any2dec(n, b1);
        int d2a = dec2any(a2d, b2);
        return d2a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.print(any2any(n, b1, b2));
    }
}
```
