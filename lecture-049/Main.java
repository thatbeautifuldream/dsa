import java.util.*;

public class Main {

    public static void longestConsecutiveSequenceOfElements(int arr[]) {
        // Step 1: Create HashMap

        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int ele : arr)
            hm.put(ele, true);

        // Step 2: Potential Starting point
        for (int ele : arr) {
            if (hm.containsKey(ele - 1))
                hm.put(ele, false);
        }

        // Step 3: Check for Longest len
        int maxLen = 0;
        int maxStPt = 0;
        for (int ele : arr) {
            if (hm.get(ele) == true) {
                int tempLen = 1;
                int tempStPt = ele;
                while (hm.containsKey(tempStPt + tempLen)) {
                    tempLen++;
                }
                if (tempLen > maxLen) {
                    maxLen = tempLen;
                    maxStPt = tempStPt;
                }
            }
        }
        for (int i = maxStPt; i < maxStPt + maxLen; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        longestConsecutiveSequenceOfElements(arr);
        sc.close();
    }
}