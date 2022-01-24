# First and Last Index

> 1.  You are given a number n, representing the size of array a.
> 2.  You are given n numbers, representing elements of array a.
>     Asssumption - Array is sorted. Array may have duplicate values.

```text
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing first index
A number representing last index

Constraints
1 <= n <= 1000
1 <= n1, n2, .. n elements <= 100
1 <= d <= 100
Sample Input
15
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33
Sample Output
5
9
```

```java
import java.io.*;
import java.util.*;

public class Main{

public static void firstLastIndex(int[] arr, int d) {
        int start = 0, end = arr.length, fi = -1, li = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (d < arr[mid]) {
                end = mid - 1;
            } else if (d > arr[mid]) {
                start = mid + 1;
            } else {
                li = mid;
                start = mid + 1;
            }
        }
        start = 0;
        end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (d < arr[mid]) {
                end = mid - 1;
            } else if (d > arr[mid]) {
                start = mid + 1;
            } else {
                fi = mid;
                end = mid - 1;
            }
        }
        System.out.println(fi);
        System.out.println(li);
    }
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        firstLastIndex(arr, d);
        sc.close();
 }

}
```
