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

    public static void printSubsets(int[] arr) {
        int n = arr.length;
        int total = (int) Math.pow(2, n);
        for (int i = 0; i < total; i++) {
            String str = "";
            int temp = i;
            for (int j = n - 1; j >= 0; j--) {
                int r = temp % 2;
                temp /= 2;
                if (r == 0) {
                    str = "-\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printSubsets(arr);
        sc.close();
    }
}