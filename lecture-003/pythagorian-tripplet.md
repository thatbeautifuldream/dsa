# Pythagorean Triplet

> 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
> 2. Take as input three numbers a, b and c.
> 3. Print true if they can form a pythagorean triplet and false otherwise.

```
Input Format
a, an integer
b, an integer
c, an integer
Output Format
true if the numbers form a pythagorean triplet and false otherwise

Constraints
1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9
Sample Input
5 3 4
Sample Output
true
```

## Solution

```java
import java.util.*;

// print if given tripplet is a pythagorean triplet
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isPythagoreanTriplets(a, b, c);
        sc.close();
    }

    public static void isPythagoreanTriplets(int a, int b, int c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("true");
        } else {
            System.out.println("flase");
        }
    }

}
```
