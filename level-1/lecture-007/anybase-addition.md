# Any Base Addition

> 1. You are given a base b.
> 2. You are given two numbers n1 and n2 of base b.
> 3. You are required to add the two numbes and print their value in base b.

```
Input Format
A base b
A number n1
A number n2
Output Format
A number representing the sum of n1 and n2 in base b.

Constraints
2 <= b <= 10
0 <= n1 <= 256
0 <= n2 <= 256
Sample Input
8
777
1
Sample Output
1000
```

## Solution

```java
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = anyAddition(n1, n2, b);
        System.out.println(d);
    }

    public static int anyAddition(int n, int m, int b) {
        int ans = 0, carry = 0, pow = 1;
        while (n != 0 || m != 0 || carry != 0) {
            int sum = n % 10 + m % 10 + carry;
            n /= 10;
            m /= 10;
            carry = sum / b;
            sum %= b;
            ans += sum * pow;
            pow *= 10;
        }
        return ans;
    }
}
```
