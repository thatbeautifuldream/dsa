# Fibonacci Sequence

- Fibonacci sequence is a sequence of numbers where each number is the sum of the two preceding numbers.
- Recursive logic for this sequence is:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fibn = fibonacci(n);
        System.out.println(fibn);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fibonacci(n - 1);
        int fibnm2 = fibonacci(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
}
```

- The problem with the recursive code is that it repeats the calculations of same nodes multiple times.
- Lets take the example for the recursive tree for n = 4,

```text
        4
       / \
      3   2
     / \ / \
    2  1 1  0
   / \
  1   0
```

- The calculation for fib(2) has repeated for 2 times in this tree, as we increase value of n the number of repetations for the calculations for fib(n) increases more and more which is very un-efficient.
- To optimise,

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fibn = fibonacciMemoised(n, new int[n + 1]);
        System.out.println(fibn);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fibonacci(n - 1);
        int fibnm2 = fibonacci(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static int fibonacciMemoised(int n, int[] qb) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(qb[n] != 0) {
            return qb[n];
        }
        int fibnm1 = fibonacci(n - 1);
        int fibnm2 = fibonacci(n - 2);
        int fibn = fibnm1 + fibnm2;
        qb[n] = fibn;
        return fibn;
    }
}
```
