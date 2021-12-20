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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
        sc.close();
    }
}