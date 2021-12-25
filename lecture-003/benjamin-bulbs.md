# The Curious Case Of Benjamin Bulbs

> 1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
> 2. Take as input a number n, representing the number of bulbs.
> 3. Print all the bulbs that will be on after the nth fluctuation in voltage.

```
Input Format
n, an integer
Output Format
b1 b2 b3 b4 .. all bulbs that will be on after nth wave

Constraints
2 <= n < 10^9
Sample Input
6
Sample Output
1
4
```

## Solution

```java
import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        benjaminBulbs(n);
        sc.close();
    }

    public static void benjaminBulbs(int n) {
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }
}
```
