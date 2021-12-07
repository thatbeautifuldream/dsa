import java.util.Scanner;

public class Main {
    public static void exitPoint(int[][] arr, int row, int col) {
        // starting from top left corner
        int i = 0, j = 0, dir = 0;
        while (true) {
            dir += arr[i][j];
            dir %= 4;
            // let initial direction be (i,j)
            if (dir == 0) { // east (i+1,j)
                i++;
            }

            else if (dir == 1) { // south (i,j-1)
                j--;
            }

            else if (dir == 2) { // west (i-1,j)
                i--;
            }

            else if (dir == 3) { // north (i,j+1)
                j++;
            }

            if (i < 0 || j < 0 || i >= row || j >= col) {
                break;
            }
        }
        // retrace the path
        if (i < 0) {
            i++;
        } else if (j < 0) {
            j++;
        } else if (i >= row) {
            i--;
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
