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
        stateOfWakanda(matrix, n, m);
        sc.close();
    }
}
