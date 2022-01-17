# Last Index

> 1. You are given a number n, representing the count of elements.
> 2. You are given n numbers.
> 3. You are given a number x.
> 4. You are required to find the last index at which x occurs in array a.
> 5. If x exists in array, print the last index where it is found otherwise print -1.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
n1
n2
.. n number of elements
A number x
Output Format
A number representing last index of occurence of x in array a or -1 if not found at all.

Constraints
1 <= n <= 10^4
0 <= n1, n2, .. n elements <= 10 ^ 3
0 <= x <= 10 ^ 3
Sample Input
6
15
11
40
4
4
9
4
Sample Output
4
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    // Last Index of Array using Recursion
    public static int lastIndexOfArray(int[] arr, int i, int target) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return lastIndexOfArray(arr, i - 1, target);
    }

    // Top-down approach (complex - just to show the idea of top down approach)
    public static int lastIndexOfArrayTopDown(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        // faith
        int li = lastIndexOfArrayTopDown(arr, i + 1, target);
        if (li == -1) {
            if (arr[i] == target) {
                return i;
            } else {
                return li;
                //return -1; (both -1 and li is valid)
            }
        } else { // li != -1 (li is the last index of target)
            // we got our last index of target
            return li;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // System.out.println(lastIndexOfArray(arr, n - 1, target));
        System.out.println(lastIndexOfArrayTopDown(arr, 0, target));
        sc.close();
    }
}
```
