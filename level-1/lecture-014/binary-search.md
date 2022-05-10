# Binary Search

> Binary search is a search algorithm that works by comparing the target value to the middle element of a sorted array. If the target value is greater than the middle element, the search continues on the right half of the array; if the target value is less than the middle element, the search continues on the left half of the array. If the value is found, the algorithm stops. If the array can’t be divided evenly into two halves, the value is not found.

```java
import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));
        sc.close();
    }
}

```
