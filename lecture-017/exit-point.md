# Exit Point

> 1.  You are given a number n, representing the number of rows.
> 2.  You are given a number m, representing the number of columns.
> 3.  You are given n\*m numbers (1's and 0's), representing elements of 2d array a.
> 4.  Consider this array a maze and a player enters from top-left corner in east direction.
> 5.  The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
> 6.  You are required to print the indices in (row, col) format of the point from where you exit the matrix.

```text
Constraints
1

Format

Input
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output
row
col (of the point of exit)

Example
Sample Input
4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0

Sample Output
1
3
```

## Solution

```java
import java.util.Scanner;

public class Main {

    public static void exitPoint(int[][] arr, int row, int col) {
        // starting from top left corner
        int i = 0, j = 0, dir = 0;
        while (true) {
            // let four directions denoted by : east(0), south(1), west(2), north(3)
            dir += arr[i][j]; // update direction value from the binary matrix
            dir %= 4;
            // let initial cell be (i,j)
            if (dir == 0) { // east (i,j+1)
                j++;
            } else if (dir == 1) { // south (i+1,j)
                i++;
            } else if (dir == 2) { // west (i,j-1)
                j--;
            } else if (dir == 3) { // north (i-1,j)
                i--;
            }
            if (i < 0 || j < 0 || i >= row || j >= col) { // exits the matrix : loop breaks
                break;
            }
        }
        // retrace the path
        if (i < 0) {
            i++;
        } else if (i >= row) {
            i--;
        } else if (j < 0) {
            j++;
        } else if (j >= col) {
            j--;
        }
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        exitPoint(arr, n, m);
        sc.close();
    }
}

```
