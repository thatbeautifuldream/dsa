# Reverse Array

> 1.  You are given a number n, representing the size of array a.
> 2.  You are given n numbers, representing elements of array a.
> 3.  You are required to reverse the contents of array a.

```java
import java.io.*;
import java.util.*;

public class Main{
  public static void reverseArray(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
```
