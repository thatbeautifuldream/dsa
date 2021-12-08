# Print all fibonacci numbers till n

```java
import java.util.*;

// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
        sc.close();
    }

    public static void fibo(int n) {
        int f1 = 0, f2 = 1, i;
        if (n < 1)
            return;
        System.out.println(f1);
        for (i = 0; i < n - 1; i++) {
            System.out.println(f2);
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }

    }
}
```