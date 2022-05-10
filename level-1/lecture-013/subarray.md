# Subarray

> 1.  You are given an array of size 'n' and n elements of the same array.
> 2.  You are required to find and print all the subarrays of the given array.
> 3.  Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

```text
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subarray]
..
All subarrays
```

```java
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subarray(arr);
        sc.close();
 }
 public static void subarray(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + "\t");
                }
                System.out.println();
            }
        }
    }

}
```
