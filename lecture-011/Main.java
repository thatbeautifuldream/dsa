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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(spanOfArray(arr));
        sc.close();
    }

}
