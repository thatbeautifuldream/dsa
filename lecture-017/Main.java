import java.util.Scanner;

public class Main {

    public static void exitPoint(int[][] arr, int row, int col) {
        // starting from top left corner
        int i = 0, j = 0, dir = 0;
        while (true) {
            dir += arr[i][j];
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

    public static void reverse1d(int[] arr) {
        int li = 0;
        int ri = arr.length - 1;
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void reverseCols(int[][] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // int li = 0;
        // int ri = arr[0].length - 1;
        // while (li < ri) {
        // int temp = arr[i][li];
        // arr[i][li] = arr[i][ri];
        // arr[i][ri] = temp;
        // li++;
        // ri--;
        // }
        // }

        // alternative appraoch : abstraction
        for (int[] d : arr) // for each loop : for each 1d array
            reverse1d(d);
    }

    public static void rotateBy90(int[][] arr, int n) {
        transpose(arr);
        reverseCols(arr);
        print2darray(arr, n, n);
    }

    public static void print2darray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] arr = new int[n][m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // exitPoint(arr, n, m);

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
