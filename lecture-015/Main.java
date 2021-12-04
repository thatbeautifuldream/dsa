import java.util.Scanner;

public class Main {

    // Agenda for today :
    // Subset Problem
    // 2D Memory management
    // Demo Traversals of 2D Matrix
    // Matrix Multiplication
    // State of Wakanda

    // public static int decimalToBinary(int num) {
    // int binary = 0;
    // int rem;
    // int i = 1;
    // while (num != 0) {
    // rem = num % 2;
    // binary += rem * i;
    // num = num / 2;
    // i = i * 10;
    // }
    // return binary;
    // }

    // public static void printSubsets(int[] arr) {
    // for (int i = 0; i < (int) Math.pow(2, arr.length); i++) {
    // for (int j = arr.length - 1; j >= 0; j--) {
    // if ((i & (1 << j)) > 0) {
    // System.out.print(arr[j] + "\t");
    // } else {
    // System.out.print("-\t");
    // }
    // }
    // }
    // }

    // Total number of subsets : 2^n
    // Total subsets are found by binary combinations of 1 and 0 for n-digits for
    // n-element-array

    public static void printSubsets(int[] arr) {
        int n = arr.length;
        int total = (int) Math.pow(2, n);
        for (int i = 0; i < total; i++) { // loop runs from 0 to (2^n - 1)
            String str = "";
            int temp = i; // temp is used to store the value of i
            for (int j = n - 1; j >= 0; j--) {
                int r = temp % 2; // r is used to store the remainder
                temp /= 2; // temp is divided by 2
                if (r == 0) {
                    str = "-\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }

    // 2D Array : 2D Array is a collection of 1D arrays
    // [[1,2],[3,4],[5,6]] -> 2D Array of dimensions : 3x2
    /*
     * Memory Management :
     * 1D Array (contains base address of 1st element of each column)
     * | | ---> [][]
     * | | ---> [][]
     * | | ---> [][]
     * 
     * [0,0][0,1][0,2]
     * [1,0][1,1][1,2]
     * [2,0][2,1][2,2]
     */
    // arr.length -> number of rows
    // arr[i].length -> number of columns
    // arr[i][j] -> access element at row i and column j
    // arr[i][j] = value -> set element at row i and column j to value
    // arr[i][j] = null -> set element at row i and column j to null
    /*
     * Syntax
     * 1D array : int[] arr = new int[10];
     * 2D array : int[][] arr = new int[10][10];
     * Traverse 2D array :
     * for (int i = 0; i < arr.length; i++) {
     * for (int j = 0; j < arr[i].length; j++) {
     * System.out.println(arr[i][j]);
     * }
     * }
     */

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // printSubsets(arr);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        print2DArray(arr);
        sc.close();
    }
}