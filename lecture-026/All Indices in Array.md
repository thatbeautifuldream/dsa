# All Indices of Target in Array

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    // All Indices of target in Array using top down approach
    public static int[] allIndices(int[] arr, int target, int i, int count) {
        if (i == arr.length) { // Base Case
            int[] indices = new int[count];
            return indices;
        }
        if (arr[i] == target) {
            count++;
        }
        int[] indices = allIndices(arr, target, i + 1, count);
        if (arr[i] == target) {
            indices[count - 1] = i;
        }
        return indices;
    }

}
```
