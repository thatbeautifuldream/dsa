import java.util.Scanner;

public class Main {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int k) {
        k = (k > 0) ? k % arr.length : (k % arr.length) + arr.length;
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static int[] inverse(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            ans[val] = i;
        }
        return ans;
    }

    /*
     * Common misconceptions : subarray, subsequence
     * Subarray : continious segment of an array
     * Its unidirectional
     * Total numbers of subarray : n * (n - 1) / 2
     * 
     * Subsequence : It may or may not be continious segment of an array
     * Its unidirectional
     * Can be analysed by writing binary numbers of length n
     * Total numbers of subsequence : 2 ^ n
     * 
     * 
     * NOTE : "All subarrays are subsequences!"
     */

    public static void subarray(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int k = sc.nextInt();
        // rotate(arr, k);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // int[] ans = inverse(arr);
        // for (int i = 0; i < n; i++) {
        // System.out.print(ans[i] + " ");
        // }
        subarray(arr);
        sc.close();
    }
}
