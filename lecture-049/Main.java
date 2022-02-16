import java.util.*;

// import java.util.PriorityQueue; // for PriorityQueue
public class Main {

    public static void sortKSortedArray() {
    }

    public static void kLargestElements(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        for (int i = 0; i < arr.length; i++) {
            if (i < k)
                pq.add(arr[i]); // add all elements to the heap at max k times
            else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }

    public static void pq() {
        int[] a = { 1, 21, 57, 92, 43, 22, 21, 6 };
        // Initialising a PriorityQueue of type int : by default min PQ
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i : a) {
            pq.add(a[i]); // adding elements to PQ
            // cost of add() is O(log n) where n is the size of PQ
            // for n elements is O(n log n)
        }
        // while (!pq.isEmpty()) {
        // System.out.println(pq.remove()); // removing elements from PQ
        // cost of remove() is O(log n) where n is the size of PQ
        // }
        // printing elements in sorted order
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }

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
        // longestConsecutiveSequenceOfElements(arr);
        int k = sc.nextInt();
        kLargestElements(arr, k);
        sc.close();
    }
}
