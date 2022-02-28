# Selection Sort

`Easy`

- 1. You are given an array(arr) of integers.
- 2. You have to sort the given array in increasing order using selection sort.

## Constraints

- 1 <= N <= 10000
- -10^9 <= arr[i] <= 10^9

## Format

## Input

- An Integer n
- arr1
- arr2..
- n integers

## Output

- sample ouput

## Example

## Sample Input

```
5
7
-2
4
1
3
```

## Sample Output

```
Comparing -2 and 7
Comparing 4 and -2
Comparing 1 and -2
Comparing 3 and -2
Swapping 7 and -2
Comparing 4 and 7
Comparing 1 and 4
Comparing 3 and 1
Swapping 7 and 1
Comparing 7 and 4
Comparing 3 and 4
Swapping 4 and 3
Comparing 4 and 7
Swapping 7 and 4
-2
1
3
4
7
```

## Solution

```java
import java.io.*;
import java.util.*;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int x = 0; x < n - 1; x++) {
            int minIdx = x;
            for (int i = x + 1; i < n; i++) {
                if (isSmaller(arr, i, minIdx) == true) {
                    minIdx = i;
                }
            }
            swap(arr, x, minIdx);

        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        selectionSort(arr);
        print(arr);
    }

}
```
