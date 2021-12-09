# State of Wakanda - 2 (Diagonal Traversal)


```java
import java.io.*;
import java.util.*;

public class Main {

    public static void diagonalTraversal(int[][] arr) {
        // Gap Strategy: gap = (j - i)
        // *. gap decides the number of diagonals to be printed
        // 1. Find the length of the array
        // 2. Iterate through the array, starting at the top left corner
        // 3. Print the value at each position
        // *. diagonal traversal logic is : i++ and j++
        // 4. Move to the next position in the array
        // 5. Repeat until the end of the array is reached
        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        diagonalTraversal(arr);
        sc.close();
    }
}
```