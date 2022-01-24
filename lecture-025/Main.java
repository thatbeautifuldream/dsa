import java.util.*;

public class Main {

    // Max of Array using Recursion
    public static int maxOfArray(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int recAns = maxOfArray(arr, i + 1);
        int me = arr[i];
        if (me > recAns) {
            return me;
        }
        return recAns;
    }

    // First Index of Array using Recursion
    public static int firstIndexOfArray(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return firstIndexOfArray(arr, i + 1, target);
    }

    // Last Index of Array using Recursion
    // Bottom-up approach (simple)
    public static int lastIndexOfArray(int[] arr, int i, int target) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return lastIndexOfArray(arr, i - 1, target);
    }

    // Top-down approach (complex - just to show the idea of top down approach)
    public static int lastIndexOfArrayTopDown(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        // faith
        int li = lastIndexOfArrayTopDown(arr, i + 1, target);
        if (li == -1) {
            if (arr[i] == target) {
                return i;
            } else {
                return li;
            }
        } else { // li != -1 (li is the last index of target)
            // we got our last index of target
            return li;
        }
    }

    // All Indices of Array using Recursion (Home-work)
    // public static int[] allIndices(int[] arr, int i, int target) {
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(maxOfArray(arr, 0));
        int target = sc.nextInt();
        // System.out.println(firstIndexOfArray(arr, 0, target));
        // System.out.println(lastIndexOfArray(arr, n - 1, target)); // Bottom-up
        System.out.println(lastIndexOfArrayTopDown(arr, 0, target)); // Top-down
        sc.close();
    }
}