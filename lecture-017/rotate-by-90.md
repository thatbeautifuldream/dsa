# Rotate By 90 Degree

>1. You are given a number n, representing the number of rows and number of columns.
>2. You are given n*n numbers, representing elements of 2d array a.
>3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
>*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .* 

```text
Constraints

1 

Format

Input

A number n
e11
e12..
e21
e22..
.. n * n number of elements

Output

output is taken care of by display function

Example

Sample Input

4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output

41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14

```

```java
import java.util.Scanner;

public class Main {

    
    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) { // only to traverse upper triangular region otherwise swap occurs
                                                      // twice and same matrix gets o/p
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseCols(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[0].length - 1;
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }

    public static void print2darray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateBy90(int[][] arr, int n) {
        transpose(arr);
        reverseCols(arr);
        print2darray(arr, n, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotateBy90(arr, n);
        sc.close();
    }
}

```