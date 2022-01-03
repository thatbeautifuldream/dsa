import java.util.*;

public class Main {
    // ! Agenda
    // Problem : Target Sum Subsets
    // asf is answer so far
    // sum is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        if (idx == arr.length) { // base case when we reach the end of the array
            if (tar == sum) { // if the sum of the subset is equal to the target
                System.out.println(asf + "."); // print the subset
            }
            return; // return out of the function
        }
        // picked
        printTargetSumSubsets(arr, idx + 1, asf + arr[idx] + ", ", sum + arr[idx], tar);
        // not picked
        printTargetSumSubsets(arr, idx + 1, asf, sum, tar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);
        sc.close();
    }
}