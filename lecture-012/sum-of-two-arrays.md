# Sum Of Two Arrays

> 1. You are given a number n1, representing the size of array a1.
> 2. You are given n1 numbers, representing elements of array a1.
> 3. You are given a number n2, representing the size of array a2.
> 4. You are given n2 numbers, representing elements of array a2.
> 5. The two arrays represent digits of two numbers.
> 6. You are required to add the numbers represented by two arrays and print the arrays.

```
Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output Format
A number representing sum of two numbers, represented by two arrays.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
Sample Input
5
3
1
0
7
5
6
1
1
1
1
1
1
Sample Output
1
4
2
1
8
6
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        sumOfTwoArrays(a1, a2);
        sc.close();
    }

    public static void sumOfTwoArrays(int a1[], int a2[]) {
        int n1 = a1.length;
        int n2 = a2.length;
        int[] sum = new int[(n1 > n2) ? n1 : n2];
        int c = 0;
        int i = a1.length - 1; // index of a1
        int j = a2.length - 1; // index of a2
        int k = sum.length - 1; // index of sum
        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d += a1[i];
            }
            if (j >= 0) {
                d += a2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }
    }

}
```
