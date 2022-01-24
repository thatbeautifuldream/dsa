# Subsets of Array

> 1.  You are given a number n, representing the count of elements.
> 2.  You are given n numbers.
> 3.  You are required to print all subsets of arr. Each subset should be
>     on separate line. For more clarity check out sample input and output.

```text
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subset]
..
All subsets

Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3
Sample Input
3
10
20
30
Sample Output
-	-	-
-	-	30
-	20	-
-	20	30
10	-	-
10	-	30
10	20	-
10	20	30

```

```java
import java.io.*;
import java.util.*;

public class Main{

public static void printSubsets(int[] arr) {
        int n = arr.length;
        int total = (int) Math.pow(2, n);
        for (int i = 0; i < total; i++) { // loop runs from 0 to (2^n - 1)
            String str = "";
            int temp = i; // temp is used to store the value of i
            for (int j = n - 1; j >= 0; j--) {
                int r = temp % 2; // r is used to store the remainder
                temp /= 2; // temp is divided by 2
                if (r == 0) {
                    str = "-\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printSubsets(arr);
        sc.close();
    }
}
```
