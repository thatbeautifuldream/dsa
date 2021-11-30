# Bar Chart

> 1.  You are given a number n, representing the size of array a.
> 2.  You are given n numbers, representing elements of array a.
> 3.  You are required to print a bar chart representing value of arr a.

```java
import java.io.*;
import java.util.*;

public class Main{

    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        // max = -(int)1e8;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void printBars(int[] arr, int n) {
        int height = maximum(arr);
        for (int h = height; h >= 1; h--) {
            for (int i = 0; i < n; i++) {
                if (arr[i] >= h) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printBars(arr, n);
    }

}
```
