import java.util.*;

public class Main {

    // All Indices of target in Array using top down approach
    public static int[] allIndices(int[] arr, int i, int target, int count) {
        if (i == arr.length) { // Base Case
            int[] indices = new int[count];
            return indices;
        }
        if (arr[i] == target) {
            count++;
        }
        int[] indices = allIndices(arr, i + 1, target, count);
        if (arr[i] == target) {
            indices[count - 1] = i;
        }
        return indices;
    }

    // Get Subsequence : to get all subsequences of the given string
    public static ArrayList<String> gss(String s) {
        if (s.length() == 0) {
            ArrayList<String> empty = new ArrayList<String>();
            empty.add("");
            return empty;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        ArrayList<String> rec = gss(ros);
        ArrayList<String> result = new ArrayList<String>();
        for (String str : rec) {
            result.add(str);
        }
        for (String str : rec) {
            result.add(ch + str);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[sc.nextInt()];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        // int[] indices = allIndices(arr, 0, target, 0);
        // for (int i = 0; i < indices.length; i++) {
        // System.out.print(indices[i] + " ");
        // }
        String s = sc.next();
        ArrayList<String> list = gss(s);
        System.out.println(list);
        sc.close();
    }
}