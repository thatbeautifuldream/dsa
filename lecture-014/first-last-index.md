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
