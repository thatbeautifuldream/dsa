# Spiral Display

```text
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9
Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
```

```java
import java.util.Scanner;

public class Main {
    public static void spiralMatrix(int[][] arr, int row, int col) {
        int minrow = 0, maxrow = arr.length - 1, mincol = 0, maxcol = arr[0].length - 1;
        int count = 0, total = row * col;
        while (count < total) {
            for (int i = minrow; i <= maxrow && count < total; i++) {
                System.out.println(arr[i][mincol]);
                count++;
            }
            mincol++;
            for (int i = mincol; i <= maxcol && count < total; i++) {
                System.out.println(arr[maxrow][i]);
                count++;
            }
            maxrow--;
            for (int i = maxrow; i >= minrow && count < total; i--) {
                System.out.println(arr[i][maxcol]);
                count++;
            }
            maxcol--;
            for (int i = maxcol; i >= mincol && count < total; i--) {
                System.out.println(arr[minrow][i]);
                count++;
            }
            minrow++;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralMatrix(matrix, n, m);
        sc.close();
    }
}
```
