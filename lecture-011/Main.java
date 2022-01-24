import java.util.Scanner;

public class Main {

    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        // max = -(int)1e8;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        // min = (int)1e8;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // span of array : max - min
    // diffrence of max and min
    public static int spanOfArray(int[] arr) {
        int max = maximum(arr);
        int min = minimum(arr);
        return (max - min);
    }

    public static void printBars(int[] arr, int n) {
        int height = maximum(arr);
        for (int h = height; h >= 1; h--) {
            for (int i = 0; i < n; i++) {
                if (arr[i] >= h) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
