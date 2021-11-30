# Span of an array

> 1. You are given a number n, representing the count of elements.
> 2. You are given n numbers.
> 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

```java
import java.util.Scanner;

public class Main {
    // span of array : max - min
    // diffrence of max and min
    public static int spanOfArray(int[] arr, int n) {
        int max = Integer.MIN_VALUE; // -ve infinity
        int min = Integer.MAX_VALUE; // +ve infinity
        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return (max - min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(spanOfArray(arr, n));
        sc.close();
    }

}
```
