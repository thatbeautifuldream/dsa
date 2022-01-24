import java.util.Scanner;

public class Main {
    // Agenda Problems :
    // 1. State of Wakanda - 1
    // 2. Sprial Matrix
    // 3. Exit Point
    // 4. Rotation by 90 degrees

    public static void stateOfWakanda(int[][] arr, int row, int col) {
        for (int j = 0; j < col; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < row; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void spiralMatrix(int[][] arr, int row, int col) {
        int minrow = 0, maxrow = arr.length - 1, mincol = 0, maxcol = arr[0].length - 1; // each for 4 loops
        int count = 0, total = row * col; // total number of elements in a matrix is row * col
        while (count < total) { // loop till count is less than total
            for (int i = minrow; i <= maxrow && count < total; i++) { // check : count < total to assure that we don't
                                                                      // print more than total elements
                System.out.println(arr[i][mincol]);
                count++; // increment count for every element printed
            }
            mincol++; // change : increment mincol after printing this row
            for (int i = mincol; i <= maxcol && count < total; i++) { // check : count < total to assure that we don't
                                                                      // print more than total elements
                System.out.println(arr[maxrow][i]);
                count++;
            }
            maxrow--; // change : decrement maxrow after printing this column
            for (int i = maxrow; i >= minrow && count < total; i--) { // check : count < total to assure that we don't
                                                                      // print more than total elements
                System.out.println(arr[i][maxcol]);
                count++;
            }
            maxcol--; // change : decrement maxcol after printing this row
            for (int i = maxcol; i >= mincol && count < total; i--) { // check : count < total to assure that we don't
                                                                      // print more than total elements
                System.out.println(arr[minrow][i]);
                count++;
            }
            minrow++; // change : increment minrow after printing this column

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
        // stateOfWakanda(matrix, n, m);
        spiralMatrix(matrix, n, m);
        sc.close();
    }
}
