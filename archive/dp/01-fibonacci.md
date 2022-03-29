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

- This calls inidividual nodes once and stores the result in the array and returns it if it is asked to be computed again

- Time Complexity for recursive solution is O(2^n)

```text
T(n) = T(n-1) + T(n-2) + k

[ T(n) ~ 2T(n-1) + k ]
[ T(n-1) ~ 2T(n-2) + k ] * 2
[ T(n-2) ~ 2T(n-3) + k ] * 2^2
[ T(n-3) ~ 2T(n-4) + k ] * 2^3
.
.
.
T(n) ~ k + 2k + 2^2 k + 2^3 k + ... + 2^n-1 k
T(n) ~ k(2^n - 1)/2-1 (Sum of GP)
T(n) proportional to 2^n
```

- With input growing 10 times time grows in order of 2^19 multiple of T(n)

- With memoisation, we can reduce the time complexity to O(n) (linear)

## Footnotes for Dynamic Programming

- DP can be used in problems where simmilar subproblems are solved repeatedly.
- DP can be used in problems where the subproblems are similar but the solution is not.
- Two types of DP:
  - Bottom-up (Memoisation)
  - Top-down (Tabulation)
