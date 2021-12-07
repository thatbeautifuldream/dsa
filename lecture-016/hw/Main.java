import java.util.Scanner;

public class Main {

    // Wave Array Homework :
    public static void waveArray2(int[][] arr, int row, int col) {
        for (int j = 0; j < col; j++) {
            if (j % 2 != 0) {
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

    // Spiral Display Homework:
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        waveArray2(arr, row, col);
        // spiralDisplay2(arr, row, col);
        sc.close();
    }
}
